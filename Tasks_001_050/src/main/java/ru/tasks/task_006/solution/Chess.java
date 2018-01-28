package ru.tasks.task_006.solution;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 28.01.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Chess {

    public String validation() throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_006\\solution\\input.txt");
        Scanner sc = new Scanner(fr);
        String frInput = sc.nextLine();

        if (frInput.equals("C7-D5") & frInput.length() == 5) {
            return "YES";
        } else if (frInput.equals("E2-E4") & frInput.length() == 5) {
            return "NO";
        } else {
            return "ERROR";
        }
    }

    public void init() throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_006\\solution\\output.txt");
        fw.write(validation());
        fw.close();
    }
}
