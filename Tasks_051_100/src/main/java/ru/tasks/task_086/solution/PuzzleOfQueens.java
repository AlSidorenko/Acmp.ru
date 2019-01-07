package ru.tasks.task_086.solution;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 21.03.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class PuzzleOfQueens {

    public String result() throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_086\\solution\\input.txt"));
        int input = sc.nextInt();
        String res = String.valueOf(input - 1);
        FileWriter fw = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_086\\solution\\output.txt");
        fw.write(res);
        fw.close();
        return res;
    }

    public static void main(String[] args) throws IOException {
        PuzzleOfQueens pq = new PuzzleOfQueens();
        long timeStart = System.currentTimeMillis();
        System.out.println(pq.result());
        long timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart + " ml.");
    }
}
