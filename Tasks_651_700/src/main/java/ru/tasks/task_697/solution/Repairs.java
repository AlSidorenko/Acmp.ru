package ru.tasks.task_697.solution;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created on 20.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Repairs {

    //считываем данных из файла input.txt и преобразование в массив
    public double[] arrInt() throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_651_700\\src\\main\\java\\ru\\tasks\\task_697\\solution\\input.txt"));
        String input = sc.nextLine();
        String[] arrInputStr = input.split(" ");
        double[] arrInputDoub = new double[arrInputStr.length];
        for (int i = 0; i < arrInputDoub.length; i++) {
            arrInputDoub[i] = Double.parseDouble(arrInputStr[i]);
        }
        return arrInputDoub;
    }

    public String result(double[] arr) throws IOException {
        int norm = 16;
        int res = (int)Math.round(((arr[0] * arr[2]) + (arr[1] * arr[2])) * 2 / norm);
        FileWriter fw = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_651_700\\src\\main\\java\\ru\\tasks\\task_697\\solution\\output.txt");
        fw.write(String.valueOf(res));
        fw.close();
        return String.valueOf(res);
    }

    public static void main(String[] args) throws IOException {
        Repairs repairs = new Repairs();
        System.out.println(repairs.result(repairs.arrInt()));
    }
}