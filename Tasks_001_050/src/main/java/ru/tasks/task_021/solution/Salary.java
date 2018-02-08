package ru.tasks.task_021.solution;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 08.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Salary {

    // считывание данных из файла input.txt и преобразование их в массив int
    public int[] arrInt() throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_021\\solution\\input.txt");
        Scanner sc = new Scanner(fr);
        String input = sc.nextLine();
        String[] arrInputStr = input.split(" ");

        int[] arrInputInt = new int[arrInputStr.length];
        for (int i = 0; i < arrInputInt.length; i++) {
            arrInputInt[i] = Integer.parseInt(arrInputStr[i]);
        }
        return arrInputInt;
    }

    public String result(int[] arr) throws IOException {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            } else {
                continue;
            }
        }
        FileWriter fw = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_021\\solution\\output.txt");
        fw.write(String.valueOf(max - min));
        fw.close();
        return String.valueOf(max - min);
    }
}
