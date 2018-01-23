package ru.tasks.task_002.solution;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 23.01.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class SumOfNumber {

    public String sumOfNumbFromFile() throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_002\\solution\\input.txt");
        Scanner scan = new Scanner(fr);
        String input = scan.next();
        int numb = Integer.parseInt(input);
        int sum = 0;
        for (int i = 1; i <= numb; i++) {
            sum += i;
        }
        String s = String.valueOf(sum);
        FileWriter fw = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_002\\solution\\output.txt");
        fw.write(s);
        fw.close();
        return s;
    }
}
