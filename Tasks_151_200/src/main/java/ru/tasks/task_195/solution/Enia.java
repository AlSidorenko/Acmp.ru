package ru.tasks.task_195.solution;

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
public class Enia extends Object {

    // считывание данных из файла input.txt и пребразование в массив int.
    public int[] arrInt() throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_151_200\\src\\main\\java\\ru\\tasks\\task_195\\solution\\input.txt");
        Scanner sc = new Scanner(fr);
        String input = sc.nextLine();
        String[] arrInputStr = input.split(" ");

        int[] arrInputInt = new int[arrInputStr.length];
        for (int i = 0; i < arrInputInt.length; i++) {
            arrInputInt[i] = Integer.parseInt(arrInputStr[i]);
        }
        return arrInputInt;
    }

    public String result(int[] arrInt) throws IOException {
        int mult = 1;
        for (int i = 0; i < arrInt.length; i++) {
            mult *= arrInt[i];
        }
        int resTemp = mult * 2;
        String result = String.valueOf(resTemp);
        FileWriter fw = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_151_200\\src\\main\\java\\ru\\tasks\\task_195\\solution\\output.txt");
        fw.write(result);
        fw.close();
        return result;
    }
}
