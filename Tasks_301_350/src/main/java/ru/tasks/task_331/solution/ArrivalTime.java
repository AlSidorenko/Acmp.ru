package ru.tasks.task_331.solution;

import java.io.File;
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
public class ArrivalTime {

    public String result() throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner scInput = new Scanner(new File("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_301_350\\src\\main\\java\\ru\\tasks\\task_331\\solution\\input.txt"));
        String firstLine = scInput.nextLine();
        String secondLine = scInput.nextLine();

        String[] arrFirsLine = firstLine.split(":");
        String[] arrSecondLine = secondLine.split(" ");


        int resFirst = Integer.parseInt(arrFirsLine[0]) + Integer.parseInt(arrSecondLine[0]);
        if (resFirst >= 24) {
            int tempFirst = resFirst - 24;
            sb.append(tempFirst);
            sb.append(":");
        } else {
            sb.append(resFirst);
            sb.append(":");
        }

        int resSecond = Integer.parseInt(arrFirsLine[1]) + Integer.parseInt(arrSecondLine[1]);
        if (resSecond >= 24) {
            int tempSecond = resSecond - 24;
            sb.append(tempSecond);
        } else {
            sb.append(resSecond);
        }

        FileWriter fwOutput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_301_350\\src\\main\\java\\ru\\tasks\\task_331\\solution\\output.txt");
        fwOutput.write(sb.toString());
        fwOutput.close();
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        ArrivalTime at = new ArrivalTime();
        System.out.println(at.result());
    }
}
