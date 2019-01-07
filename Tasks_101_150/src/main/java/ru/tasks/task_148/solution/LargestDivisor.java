package ru.tasks.task_148.solution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created on 06.04.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class LargestDivisor {

    public String largestDiv() throws IOException {

        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_101_150\\src\\main\\java\\ru\\tasks\\task_148\\solution\\input.txt"));
        int a = sc.nextInt();
        int b = sc.nextInt();
        List<Integer> list_1 = new ArrayList<>();
        for (int i = 1; i < a; i++) {
            if ((a % i) == 0) {
                list_1.add(i);
            }
        }

        List<Integer> list_2 = new ArrayList<>();
        for (int i = 1; i < b; i++) {
            if ((a % i) == 0) {
                list_2.add(i);
            }
        }

        List<Integer> listRes = new ArrayList<>();
        for (int i = 0; i < list_1.size(); i++) {
            for (int j = 0; j < list_2.size(); j++) {
                if (list_1.get(i).equals(list_2.get(j))) {
                    listRes.add(list_1.get(i));
                } else {
                    continue;
                }
            }
        }
        FileWriter fw = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_101_150\\src\\main\\java\\ru\\tasks\\task_148\\solution\\output.txt");
        fw.write(String.valueOf(listRes.get(listRes.size() - 1)));
        fw.close();
        return String.valueOf(listRes.get(listRes.size() - 1));
    }

    public static void main(String[] args) throws IOException {
        long timeStart = System.currentTimeMillis();
        LargestDivisor largestDivisor = new LargestDivisor();
        System.out.println(largestDivisor.largestDiv());
        long timeFinish = System.currentTimeMillis();
        System.out.printf("%s ms.", timeFinish - timeStart);
    }
}
