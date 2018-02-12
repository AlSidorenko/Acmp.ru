package ru.tasks.task_106.solution;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created on 12.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Coins {

    //считыание данных из файла input.txt и преобразование их в массив.
    public ArrayList<String> arrStr() throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_101_150\\src\\main\\java\\ru\\tasks\\task_106\\solution\\input.txt");
        BufferedReader br = new BufferedReader(fr);
        String input;
        ArrayList<String> arrInputStr = new ArrayList<>();
        while ((input = br.readLine()) != null) {
            arrInputStr.add(input);
        }
        return arrInputStr;
    }

    public String result(ArrayList<String> arrStr) throws IOException {
        int count = 0;
        for (String s : arrStr) {
            if (s.equals("0")) {
                count++;
            }
        }
        FileWriter fw = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_101_150\\src\\main\\java\\ru\\tasks\\task_106\\solution\\output.txt");
        fw.write(String.valueOf(count));
        fw.close();
        return String.valueOf(count);
    }

    public static void main(String[] args) throws IOException {
        Coins coins = new Coins();
        coins.result(coins.arrStr());
    }
}
