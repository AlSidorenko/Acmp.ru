package ru.tasks.task_550.solution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 12.03.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class DayOfProgrammer {

    public int year () throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_501_550\\src\\main\\java\\ru\\tasks\\task_550\\solution\\input.txt"));
        return sc.nextInt();
    }

    public String check(int year) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_501_550\\src\\main\\java\\ru\\tasks\\task_550\\solution\\output.txt");
        StringBuilder sb = new StringBuilder();
        if (((year % 400) == 0) || ((year % 4) == 0) && (year % 100) != 0) {
            sb.append("12/09/");
            sb.append(year);
            fw.write(sb.toString());
            fw.close();
            return sb.toString();
        } else {
            sb.append("13/09/");
            sb.append(year);
            fw.write(sb.toString());
            fw.close();
            return sb.toString();
        }
    }
}
