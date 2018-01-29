package ru.tasks.task_008.solution;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 29.01.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Arithmetic {

    public String[] arrInputStr() throws IOException {
        FileReader frInput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_008\\solution\\input.txt");
        Scanner sc = new Scanner(frInput);
        String inputStr = sc.nextLine();
        return inputStr.split(" ");
    }

    public int[] arrInputInt() throws IOException {
        int[] arrInputInt = new int [arrInputStr().length];
        for (int i = 0; i < arrInputInt.length; i++) {
            arrInputInt[i] = Integer.parseInt(arrInputStr()[i]);
        }
        return arrInputInt;
    }

    public String result() throws IOException {
        if ((arrInputInt()[0] * arrInputInt()[1]) == arrInputInt()[2]) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public void init() throws IOException {
        FileWriter fwOutput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_008\\solution\\output.txt");
        fwOutput.write(result());
        fwOutput.close();
    }
}
