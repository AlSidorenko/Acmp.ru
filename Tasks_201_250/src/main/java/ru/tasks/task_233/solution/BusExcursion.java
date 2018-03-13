package ru.tasks.task_233.solution;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created on 13.03.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class BusExcursion {

    int height;

    public BusExcursion(int height) {
        this.height = height;
    }

    public BusExcursion() {
    }

    public int getHeight() {
        return height;
    }

    // считываем данные и преобразуем в массив.
    public BusExcursion[] be() throws FileNotFoundException {
        Scanner input = new Scanner(new File("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_201_250\\src\\main\\java\\ru\\tasks\\task_233\\solution\\input.txt"));
        int n = input.nextInt();
        BusExcursion[] items = new BusExcursion[n];
        for (int i = 0; i < n; i++) {
            items[i] = new BusExcursion(input.nextInt());
        }
        return items;
    }

    public String result(BusExcursion[] be) throws IOException {
        StringBuilder sb = new StringBuilder();
        FileWriter fw = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_201_250\\src\\main\\java\\ru\\tasks\\task_233\\solution\\output.txt");
        int h = 437;
        int count = 0;
        for (int i = 0; i < be.length; i++) {
            if ((be[i].getHeight() > h) && (be.length == 1)) {
                sb.append("No Crash.");
                fw.write(sb.toString());
                fw.close();
                return sb.toString();
            } else if (be[i].getHeight() <= h) {
                count++;
            } else {
                continue;
            }
        }
        sb.append("Crash " + count);
        fw.write(sb.toString());
        fw.close();
        return sb.toString();
    }

    @Override
    public String toString() {
        return "BusExcursion{" +
                "height = " + height +
                '}';
    }

    public static void main(String[] args) throws IOException {
        BusExcursion busExcursion = new BusExcursion();
        long timeStart = System.currentTimeMillis();
        System.out.println(busExcursion.result(busExcursion.be()));
        System.out.println(Arrays.toString(busExcursion.be()));
        long timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart + " ms.");
    }
}
