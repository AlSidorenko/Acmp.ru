package ru.tasks.task_529.solution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 21.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class LineSegment {

    //считываем данные из файла и преобразуем их в массив int.
    public int[] arrInt() throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_501_550\\src\\main\\java\\ru\\tasks\\task_529\\solution\\input.txt"));
        String input = sc.nextLine();
        String[] arrInputStr = input.split(" ");
        int[] arrInputInt = new int[arrInputStr.length];
        for (int i = 0; i < arrInputInt.length; i++) {
            arrInputInt[i] = Integer.parseInt(arrInputStr[i]);
        }
        return arrInputInt;
    }

    public String result(int[] arr) throws IOException {
        int res = (int) Math.sqrt(Math.pow((arr[2] - arr[0]), 2) + Math.pow((arr[3] - arr[1]), 2));
        FileWriter fw = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_501_550\\src\\main\\java\\ru\\tasks\\task_529\\solution\\output.txt");
        fw.write(String.valueOf(res));
        fw.close();
        return String.valueOf(res);
    }

    public static void main(String[] args) throws IOException {
        LineSegment lineSegment = new LineSegment();
        System.out.println(lineSegment.result(lineSegment.arrInt()));
    }
}
