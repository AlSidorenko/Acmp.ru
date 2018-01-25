package ru.tasks.task_004.solution;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 25.01.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class GameNumb {

    public String init() throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_004\\solution\\input.txt");
        Scanner sc = new Scanner(fr);
        String frInputStr = sc.next();
        String nine = "9";
        int inputInt = Integer.parseInt(frInputStr);
        int tempInt = Integer.parseInt(nine) - inputInt;
        String tempStr = String.valueOf(tempInt);
        StringBuilder stringBuilder = new StringBuilder(frInputStr);
        stringBuilder.append(nine);
        stringBuilder.append(tempStr);
        FileWriter fw = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_004\\solution\\output.txt");
        fw.write(stringBuilder.toString());
        fw.close();
        return stringBuilder.toString();
    }
}
