package ru.tasks.task_149.solution;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created on 13.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Rotate {

    //считывание данных из файла input.txt и пребразование их в массив.
    public int[] arrInt() throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_101_150\\src\\main\\java\\ru\\tasks\\task_149\\solution\\input.txt");
        BufferedReader br = new BufferedReader(fr);
        String input;
        ArrayList<String> arrInputStr = new ArrayList<>();
        while ((input = br.readLine()) != null) {
            arrInputStr.add(input);
        }

        //преобразование в массив строк.
        String[] arrInputTempStr = arrInputStr.get(1).split(" ");

        //преобразование в массив int.
        int[] arrInputInt = new int[Integer.parseInt(arrInputStr.get(0))];
        for (int i = 0; i < arrInputInt.length; i++) {
            arrInputInt[i] = Integer.parseInt(arrInputTempStr[i]);
        }
        return arrInputInt;
    }

    //вывод массива в обратном порядке.
    public int[] rotateOfArray(int[] arr) throws IOException {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    public String result(int[] arrInt) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrInt.length; i++) {
            sb.append(arrInt[i] + " ");
        }
        FileWriter fw = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_101_150\\src\\main\\java\\ru\\tasks\\task_149\\solution\\output.txt");
        fw.write(sb.toString());
        fw.close();
        return sb.toString();
    }
}
