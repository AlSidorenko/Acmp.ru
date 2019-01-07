package ru.tasks.task_131.solution;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created on 18.04.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Census {

    private int v;
    private int s;

    public Census() {
    }

    public Census(int v, int s) {
        this.v = v;
        this.s = s;
    }

    public Census[] censuses() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_101_150\\src\\main\\java\\ru\\tasks\\task_131\\solution\\input.txt"));
        int len = sc.nextInt();
        Census[] censuses = new Census[len];
        for (int i = 0; i < len; i++) {
            censuses[i] = new Census(sc.nextInt(), sc.nextInt());
        }
        return censuses;
    }

    public int item(Census[] censuses) {
        int maxItem = 0;
        for (int i = 0; i < censuses.length; i++) {
            if ((censuses[i].getS()) == 1) {
                maxItem = censuses[i].getV();
                break;
            }
        }
        return maxItem;
    }

    public String result(Census[] censuses, int item) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_101_150\\src\\main\\java\\ru\\tasks\\task_131\\solution\\output.txt");
        for (int i = 0; i < censuses.length; i++) {
            if ((censuses[i].getS() == 1) & (censuses[i].getV() > item)) {
                item = censuses[i].getV();
            }
        }

        for (int j = 0; j < censuses.length; j++) {
            if ((censuses[j].getS() == 1) & (censuses[j].getV() == item)) {
                fw.write(String.valueOf(j + 1));
                fw.close();
                return String.valueOf(j + 1);
            }
        }
        fw.write("-1");
        fw.close();
        return "-1";
    }

    public int getV() {
        return v;
    }

    public int getS() {
        return s;
    }

    @Override
    public String toString() {
        return "Census{" +
                "v=" + v +
                ", s=" + s +
                '}';
    }

    public static void main(String[] args) throws IOException {
        Census c = new Census();
        long timeStart = System.currentTimeMillis();
        System.out.println(Arrays.toString(c.censuses()));
        System.out.println(c.item(c.censuses()));
        System.out.println(c.result(c.censuses(), c.item(c.censuses())));
        long timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart + " ms.");
    }
}
