package ru.tasks.task_312.solution;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 16.03.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class ArithmeticProgression {

    public String result() throws IOException {
        Scanner scInput = new Scanner(new File("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_301_350\\src\\main\\java\\ru\\tasks\\task_312\\solution\\input.txt"));
        int firstItem = scInput.nextInt();
        int secondItem = scInput.nextInt();
        int numbSearchItem = scInput.nextInt();
        int d = secondItem - firstItem;

        int searchItem = firstItem + ((numbSearchItem - 1) * d);
        FileWriter fw = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_301_350\\src\\main\\java\\ru\\tasks\\task_312\\solution\\output.txt");
        fw.write(String.valueOf(searchItem));
        fw.close();
        return String.valueOf(searchItem);
    }

    public static void main(String[] args) throws IOException {
        ArithmeticProgression ap = new ArithmeticProgression();
        System.out.println(ap.result());
    }
}
