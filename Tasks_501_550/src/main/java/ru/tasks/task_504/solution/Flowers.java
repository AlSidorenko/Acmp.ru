package ru.tasks.task_504.solution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 28.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Flowers {

    public int num() throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_501_550\\src\\main\\java\\ru\\tasks\\task_504\\solution\\input.txt"));
        return sc.nextInt();
    }

    public String result(int n) throws IOException {
        String flwrs = "GCV";
        char[] flwsCh = flwrs.toCharArray();
        char temp;
        for (int i = 0; i < n; i++) {
            temp = flwsCh[0];
            flwsCh[0] = flwsCh[2];
            flwsCh[2] = flwsCh[1];
            flwsCh[1] = temp;
        }
        FileWriter fw = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_501_550\\src\\main\\java\\ru\\tasks\\task_504\\solution\\output.txt");
        String res = new String(flwsCh);
        fw.write(res);
        fw.close();
        return res;
    }

    public static void main(String[] args) throws IOException {
        long timeStart = System.currentTimeMillis();
        Flowers flowers = new Flowers();
        System.out.println(flowers.result(flowers.num()));
        long timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart + " ms.");
    }
}
