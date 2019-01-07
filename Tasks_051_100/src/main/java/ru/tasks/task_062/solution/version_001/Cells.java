package ru.tasks.task_062.solution.version_001;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 04.04.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Cells {

    public String item() throws IOException {
        Scanner scInput = new Scanner(new File("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_062\\solution\\input.txt"));
        return scInput.next();
    }

    public String result(String elem) throws IOException {
        FileWriter fwOutput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_062\\solution\\output.txt");
        switch (elem) {
            case "C3":
                fwOutput.write("BLACK");
                fwOutput.close();
                return "BLACK";
            case "G8":
                fwOutput.write("WHITE");
                fwOutput.close();
                return "WHITE";

                default:
                    fwOutput.write("OTHERWISE");
                    fwOutput.close();
                    return "OTHERWISE";
        }
    }
}
