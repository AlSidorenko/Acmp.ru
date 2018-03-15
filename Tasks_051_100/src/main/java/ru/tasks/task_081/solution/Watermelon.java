package ru.tasks.task_081.solution;

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
public class Watermelon {

    private int numb;

    public Watermelon() {
    }

    public Watermelon(int numb) {
        this.numb = numb;
    }

    public Watermelon[] watermelons() throws FileNotFoundException {
        Scanner scInput = new Scanner(new File("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_081\\solution\\input.txt"));
        int n = scInput.nextInt();
        Watermelon[] items = new Watermelon[n];
        for (int i = 0; i < items.length; i++) {
            items[i] = new Watermelon(scInput.nextInt());
        }
        return items;
    }

    public String result(Watermelon[] watermelons) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_081\\solution\\output.txt");
        StringBuilder sb = new StringBuilder();
        for (int i = watermelons.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (watermelons[j].getNumb() > watermelons[j + 1].getNumb()) {
                    int temp = watermelons[j].getNumb();
                    watermelons[j].numb = watermelons[j + 1].getNumb();
                    watermelons[j + 1].numb = temp;
                }
            }
        }
        sb.append(watermelons[0].getNumb() + " " + watermelons[watermelons.length - 1].getNumb());
        fw.write(sb.toString());
        fw.close();
        return sb.toString();
    }

    public int getNumb() {
        return numb;
    }

    @Override
    public String toString() {
        return "Watermelon{" +
                "numb = " + numb +
                '}';
    }

    public static void main(String[] args) throws IOException {
        Watermelon wmln = new Watermelon();
        System.out.println(Arrays.toString(wmln.watermelons()));
        System.out.println(wmln.result(wmln.watermelons()));
    }
}
