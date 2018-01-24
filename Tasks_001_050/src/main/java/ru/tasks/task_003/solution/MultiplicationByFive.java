package ru.tasks.task_003.solution;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created on 24.01.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class MultiplicationByFive {

    public String str() throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_003\\solution\\input.txt");
        Scanner sc = new Scanner(fr);
        String input = sc.next();
        return input;
    }

    public String result() throws IOException {
        char[] chStr = str().toCharArray();
        if (chStr.length == 1 & chStr[0] == '5') {
            FileWriter fw = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                    "Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_003\\solution\\output.txt");
            fw.write("25");
            fw.close();
            return "25";
        } else if ((chStr.length > 1) & (chStr[chStr.length - 1] == '5')) {
            int number = Integer.parseInt(new String(Arrays.copyOf(chStr, chStr.length - 1)));
            int multiplication = number * (number + 1);
            String num = String.valueOf(multiplication);
            String concat = num + "25";
            FileWriter fw = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                    "Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_003\\solution\\output.txt");
            fw.write(concat);
            fw.close();
            return concat;
        } else {
            FileWriter fw = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                    "Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_003\\solution\\output.txt");
            fw.write("-1");
            fw.close();
            return "-1";
        }
    }
}
