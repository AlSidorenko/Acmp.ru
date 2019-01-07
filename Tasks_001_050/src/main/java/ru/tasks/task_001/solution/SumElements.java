package ru.tasks.task_001.solution;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 22.01.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class SumElements {

    public String sumElemFromFiles() throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Александр\\Documents\\IdeaProject\\Acmp.ru\\" +
                "Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_001\\solution\\input.txt");
        Scanner scan = new Scanner(fr);
        String input = scan.nextLine();
        String[] parts = input.split(" ");
        int[] array = new int[parts.length];
        int sum = 0;
        for (int i = 0; i < parts.length; i++) {
            array[i] = Integer.parseInt(parts[i]);
            sum += array[i];
        }
        String s = String.valueOf(sum);
        FileWriter fw = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\Acmp.ru\\" +
                "Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_001\\solution\\output.txt");
        fw.write(s);
        fw.close();
        return s;
    }
}
