package ru.tasks.task_005.solution;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created on 25.01.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Statistics {

    public boolean init() throws IOException {

        FileReader fr = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_005\\solution\\input.txt");
        int[] arrTempInt = conversionToAnArrayOfNumbers(fr);
        ArrayList<Integer> oddValue  = new ArrayList<>();
        ArrayList<Integer> evenValue = new ArrayList<>();
        for (int i = 0; i < arrTempInt.length; i++) {
            if (arrTempInt[i] % 2 == 0) {
                evenValue.add(arrTempInt[i]);
            } else {
                oddValue.add(arrTempInt[i]);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(oddValue.toString() + "\r");
        stringBuilder.append(evenValue.toString() + "\r");
        stringBuilder.append(resultFromScore(oddValue, evenValue));
        FileWriter fw = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_005\\solution\\output.txt");
        fw.write(stringBuilder.toString());
        fw.close();
        return true;
    }

    public int[] conversionToAnArrayOfNumbers (FileReader fr) throws IOException {
        String[] arrTempStr = conversionToAnArrayOfStrings(fr);
        int[] arrTempInt = new int[arrTempStr.length];
        for (int i = 0; i < arrTempInt.length; i++) {
            arrTempInt[i] = Integer.valueOf(arrTempStr[i]);
        }
        return arrTempInt;
    }

    public String[] conversionToAnArrayOfStrings(FileReader fr) throws IOException {
        BufferedReader in = new BufferedReader(fr);
        String input;

        ArrayList<String> arrayListStr = new ArrayList<>();
        while ((input = in.readLine()) != null) {
            arrayListStr.add(input);
        }
        return arrayListStr.get(1).split(" ");
    }

    public String resultFromScore(ArrayList<Integer> oddValue, ArrayList<Integer> evenValue) {
        if (oddValue.size() > evenValue.size()) {
            return "NO";
        } else {
            return "YES";
        }
    }
}
