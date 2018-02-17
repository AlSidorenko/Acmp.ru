package ru.tasks.task_685.solution;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 17.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class GoldenSand {

    //считываем данные из файла input.txt
    public int[] arr() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_651_700\\src\\main\\java\\ru\\tasks\\task_685\\solution\\input.txt"));
        String input = sc.nextLine();
        String[] arrInputStr = input.split(" ");

        //преобразование массива в int.
        int[] arrInputInt = new int[arrInputStr.length];
        for (int i = 0; i < arrInputInt.length; i++) {
            arrInputInt[i] = Integer.parseInt(arrInputStr[i]);
        }
        return arrInputInt;
    }

    public String result(int[] arr) throws IOException {
        int sum = 0, mult;
        for (int i = 0; i < arr.length / 2; i++) {
            mult = arr[i] * arr[arr.length - 1 - i];
            sum += mult;
        }
        FileWriter fw = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_651_700\\src\\main\\java\\ru\\tasks\\task_685\\solution\\output.txt");
        fw.write(String.valueOf(sum));
        fw.close();
        return String.valueOf(sum);
    }

    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
        GoldenSand goldenSand = new GoldenSand();
        System.out.println(goldenSand.result(goldenSand.arr()));
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime + " ms.");
    }
}
