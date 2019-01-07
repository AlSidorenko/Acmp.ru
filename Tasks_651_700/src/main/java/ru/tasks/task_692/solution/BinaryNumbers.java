package ru.tasks.task_692.solution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 19.07.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class BinaryNumbers {

    public int number() throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_651_700\\src\\main\\java\\ru\\tasks\\task_692\\solution\\input.txt"));
        return sc.nextInt();
    }

    public String result(int number) throws IOException {
        FileWriter output = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_651_700\\src\\main\\java\\ru\\tasks\\task_692\\solution\\output.txt");
        if (number % 2 == 0) {
            output.write("YES");
            output.close();
            return "YES";
        } else {
            output.write("NO");
            output.close();
            return "NO";
        }
    }
}
