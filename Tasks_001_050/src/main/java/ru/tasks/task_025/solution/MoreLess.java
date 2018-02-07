package ru.tasks.task_025.solution;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created on 07.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class MoreLess {

    // считывание данных из файла input.txt в динамический массив ArrayList<Integer>
    public ArrayList<Integer> arrayListInt() throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_025\\solution\\input.txt");
        BufferedReader br = new BufferedReader(fr);
        String input;

        ArrayList<String> arrInputStr = new ArrayList<>();
        while ((input = br.readLine()) != null) {
            arrInputStr.add(input);
        }

        ArrayList<Integer> arrInputInt = new ArrayList<>();
        for (int i = 0; i < arrInputStr.size(); i++) {
            arrInputInt.add(Integer.parseInt(arrInputStr.get(i)));
        }
        return arrInputInt;
    }

    // выведение результата
    public String result(ArrayList<Integer> arrInput) throws IOException {
        if (arrInput.get(0) < arrInput.get(1)) {
            FileWriter fwOutput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                    "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_025\\solution\\output.txt");
            fwOutput.write("<");
            fwOutput.close();
            return "<";
        } else if (arrInput.get(0) > arrInput.get(1)) {
            FileWriter fwOutput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                    "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_025\\solution\\output.txt");
            fwOutput.write(">");
            fwOutput.close();
            return ">";
        } else {
            FileWriter fwOutput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                    "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_025\\solution\\output.txt");
            fwOutput.write("=");
            fwOutput.close();
            return "=";
        }
    }

    public static void main(String[] args) throws IOException {
        MoreLess moreLess = new MoreLess();
        System.out.println(moreLess.result(moreLess.arrayListInt()));
    }
}
