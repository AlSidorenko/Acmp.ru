package ru.tasks.task_539.solution;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 09.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Pie {

    public String result() throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_501_550\\src\\main\\java\\ru\\tasks\\task_539\\solution\\input.txt");
        Scanner sc = new Scanner(fr);
        String frInput = sc.next();

        int input = Integer.parseInt(frInput);
        if ((input % 2) == 0) {
            FileWriter fw = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                    "Tasks_501_550\\src\\main\\java\\ru\\tasks\\task_539\\solution\\output.txt");
            fw.write(String.valueOf(input / 2));
            fw.close();
            return String.valueOf(input / 2);
        } else {
            FileWriter fw = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                    "Tasks_501_550\\src\\main\\java\\ru\\tasks\\task_539\\solution\\output.txt");
            fw.write(frInput);
            fw.close();
            return frInput;
        }
    }
}
