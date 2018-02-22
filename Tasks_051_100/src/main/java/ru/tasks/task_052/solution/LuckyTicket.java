package ru.tasks.task_052.solution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created on 22.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class LuckyTicket {

    public List<Integer> arrInputInt() throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_052\\solution\\input.txt"));
        String input = sc.nextLine();
        List<Integer> arrInt = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            arrInt.add(Integer.parseInt(input.substring(i, i + 1)));
        }
        return arrInt;
    }

    public String result(List<Integer> arrList) throws IOException {
        int sumFirst = 0;
        int sumSecond = 0;
        String y = "YES";
        String n = "NO";

        for (int i = 0; i < arrList.size() / 2; i++) {
            sumFirst += arrList.get(i);
        }

        for (int i = arrList.size() / 2; i < arrList.size(); i++) {
            sumSecond += arrList.get(i);
        }

        FileWriter fw = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_052\\solution\\output.txt");
        if (sumFirst == sumSecond) {
            fw.write(y);
            fw.close();
            return y;
        } else {
            fw.write(n);
            fw.close();
            return n;
        }
    }

    public static void main(String[] args) throws IOException {
        LuckyTicket luckyTicket = new LuckyTicket();
        System.out.println(luckyTicket.result(luckyTicket.arrInputInt()));
    }
}
