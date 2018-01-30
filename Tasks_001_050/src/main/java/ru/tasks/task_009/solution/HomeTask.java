package ru.tasks.task_009.solution;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created on 30.01.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class HomeTask {

    // Преобразование содержимого файла input.txt в ArrayList<String>.
    public ArrayList<String> arrInputStr() throws IOException {
        //FileReader frInput = new FileReader("C:\\Users\\zalman\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
        //        "Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_009\\solution\\input.txt");
        FileReader frInput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_009\\solution\\input.txt");
        BufferedReader bufferedReader = new BufferedReader(frInput);
        String input;
        ArrayList<String> arrInputStr = new ArrayList<>();
        while ((input = bufferedReader.readLine()) != null) {
            arrInputStr.add(input);
        }
        return arrInputStr;
    }

    //Пребразование ArrayList<String> в массив int[].
    public int[] arrInputInt() throws IOException {
        int n = Integer.parseInt(arrInputStr().get(0));
        int[] arrInputInt = new int[n];
        String[] arrStr = arrInputStr().get(1).split(" ");
        for (int i = 0; i < arrInputInt.length; i++) {
            arrInputInt[i] = Integer.parseInt(arrStr[i]);
        }
        return arrInputInt;
    }

    // Поиск положительных элементов массива и родсчет их суммы.
    public int sumPositiveElem() throws IOException {
        int sum = 0;
        for (int i = 0; i < arrInputInt().length; i++) {
            if (arrInputInt()[i] > 0) {
                sum += arrInputInt()[i];
            }
        }
        return sum;
    }

    // Поиск индекса максимального элемента массива.
    public int indexMaxElem() throws IOException {
        int indexOfMaxElem = 0;
        int i;
        for (i = 0; i < arrInputInt().length; i++) {
            if (arrInputInt()[i] > arrInputInt()[indexOfMaxElem]) {
                indexOfMaxElem = i;
            }
        }
        return indexOfMaxElem;
    }

    // Поиск индекса минимального элемента массива.
    public int indexMinElem() throws IOException {
        int indexOfMinElem = 0;
        for (int i = 0; i < arrInputInt().length; i++) {
            if (arrInputInt()[i] < arrInputInt()[indexOfMinElem]) {
                indexOfMinElem = i;
            }
        }
        return indexOfMinElem;
    }

    // Расчет произведения между между элементами с минимальным и максимальным индексами массива.
    public int multiplicationBetweenMaxAndMinElem() throws IOException {
        int mult = 1;
        if (indexMinElem() < indexMaxElem()) {
            int[] tempArrInputInt = Arrays.copyOfRange(arrInputInt(), indexMinElem() + 1, indexMaxElem());
            for (int i = 0; i < tempArrInputInt.length; i++) {
                mult *= tempArrInputInt[i];
            }
            return mult;
        } else {
            int[] tempArrInputInt = Arrays.copyOfRange(arrInputInt(), indexMaxElem() + 1, indexMinElem());
            for (int i = 0; i < tempArrInputInt.length; i++) {
                mult *= tempArrInputInt[i];
            }
            return mult;
        }
    }

    // Пребразование результата в строку.
    public String result() throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.valueOf(sumPositiveElem()));
        stringBuilder.append(" ");
        stringBuilder.append(String.valueOf(multiplicationBetweenMaxAndMinElem()));
        return stringBuilder.toString();
    }

    // Запись в файл.
    public void init() throws IOException {
        FileWriter fwOutput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_009\\solution\\output.txt");
        fwOutput.write(result());
        fwOutput.close();
    }
}
