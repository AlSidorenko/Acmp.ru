package ru.tasks.task_023.solution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created on 28.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Divination {

    public String result() throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_023\\solution\\input.txt"));
        int numb = sc.nextInt();
        int sum = 0;

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= numb; i++) {
            if ((numb % i) == 0) {
                list.add(i);
            } else {
                continue;
            }
        }
        for (Integer integer : list) {
            sum += integer;
        }
        FileWriter fw = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_023\\solution\\output.txt");
        fw.write(String.valueOf(sum));
        fw.close();
        return String.valueOf(sum);
    }

    public static void main(String[] args) throws IOException {
        Divination divination = new Divination();
        System.out.println(divination.result());
    }
}
