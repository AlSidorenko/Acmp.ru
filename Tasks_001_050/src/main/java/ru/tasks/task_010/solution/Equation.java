package ru.tasks.task_010.solution;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created on 01.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Equation {

    // считывание данных из файла и преобразования данных в массив строк.
    public String[] arrayInputOfStr() throws IOException {
        FileReader frInput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_010\\solution\\input.txt");
        Scanner sc = new Scanner(frInput);
        String input = sc.nextLine();
        return input.split(" ");
    }

    // преобразование массива строк в числовой массив.
    public int[] arrayInputOfInt() throws IOException {
        int[] arrInputInt = new int[arrayInputOfStr().length];
        for (int i = 0; i < arrayInputOfStr().length; i++) {
            arrInputInt[i] = (Integer.parseInt(arrayInputOfStr()[i]));
        }
        return arrInputInt;
    }

    //поиск и возврат максимального элемента массива по модулю.
    public int maxElem() throws IOException {
        int max = 0;
        int min = 0;
        for (int i = 0; i < arrayInputOfInt().length; i++) {
            if (arrayInputOfInt()[i] > max) {
                max = arrayInputOfInt()[i];
            } else if (arrayInputOfInt()[i] < min){
                min = arrayInputOfInt()[i];
            } else {
                continue;
            }
        }

        if (Math.abs(max) > Math.abs(min)) {
            return Math.abs(max);
        } else {
            return Math.abs(min);
        }
    }

    // расчет делителей максимального числа массива, прюс "0".
    public ArrayList<Integer> divisor(int element) {
        ArrayList<Integer> div = new ArrayList<>();
        div.add(0);
        for (int i = -element; i <= element; i++) {
            if (i == 0) {
                continue;
            } else if ((element % i) == 0) {
                div.add(i);
            }
        }
        return div;
    }

    //решение кубического уравнения и запись в файл output.txt
    public String solutionEquation(ArrayList<Integer> maxElem) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<Integer> solution = new ArrayList<>();
        for (int i = 0; i < maxElem.size(); i++) {
            if (((arrayInputOfInt()[0] * maxElem.get(i) * maxElem.get(i) * maxElem.get(i)) +
                 (arrayInputOfInt()[1] * maxElem.get(i) * maxElem.get(i)) +
                 (arrayInputOfInt()[2] * maxElem.get(i)) +
                  arrayInputOfInt()[3]) == 0) {
                solution.add(maxElem.get(i));
            }
        }
        for (int i = 0; i < solution.size(); i++) {
            stringBuilder.append((String.valueOf(solution.get(i))) + " ");
        }
        FileWriter fwOutput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_010\\solution\\output.txt");
        fwOutput.write(stringBuilder.toString());
        fwOutput.close();
        return stringBuilder.toString();
    }
}