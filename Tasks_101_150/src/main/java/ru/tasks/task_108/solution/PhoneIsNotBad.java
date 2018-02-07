package ru.tasks.task_108.solution;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 07.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class PhoneIsNotBad {

    public String message() throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_101_150\\src\\main\\java\\ru\\tasks\\task_108\\solution\\input.txt");
        Scanner sc = new Scanner(fr);
        String input = sc.nextLine();
        FileWriter fw = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_101_150\\src\\main\\java\\ru\\tasks\\task_108\\solution\\output.txt");
        fw.write(input);
        fw.close();
        return input;
    }
}
