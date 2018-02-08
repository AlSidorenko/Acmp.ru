package ru.tasks.task_033.solution;

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
public class TwoBandits {

    // считываем данные из файла input.txt в массив
    public int[] arrInt() throws IOException {
        FileReader frInput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_033\\solution\\input.txt");
        Scanner sc = new Scanner(frInput);
        String input = sc.nextLine();
        String[] arrInputStr = input.split(" ");

        int[] arrInputInt = new int[arrInputStr.length];
        for (int i = 0; i < arrInputInt.length; i++) {
            arrInputInt[i] = Integer.parseInt(arrInputStr[i]);
        }
        return arrInputInt;
    }

    public String result(int[] arr) throws IOException {
        int num = 10;
        int[] arrTemp = new int[arr.length];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrTemp.length; i++) {
            arrTemp[i] = num - arr[i];
            sb.append(String.valueOf(arrTemp[i]) + " ");
        }

        FileWriter fw = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_033\\solution\\output.txt");
        fw.write(sb.toString());
        fw.close();
        return sb.toString();
    }
}
