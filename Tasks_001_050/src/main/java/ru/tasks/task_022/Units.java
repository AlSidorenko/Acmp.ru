package ru.tasks.task_022;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 30.10.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Units {

    public int numb() throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_022\\input.txt"));
        return sc.nextInt();
    }

    public String result(int numb) {
        String temp = String.valueOf(Integer.toBinaryString(numb));
        char[] chTemp = temp.toCharArray();
        int count =0;
        for (char c : chTemp) {
            if (c == '1') {
                count++;
            } else {
                continue;
            }
        }
        return String.valueOf(count);
    }

    public void fileWriter() throws IOException {
        Units unit = new Units();
        String rsl = unit.result(unit.numb());
        FileWriter output = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_022\\output.txt");
        output.write(rsl);
        output.close();
    }

    public void init() throws IOException {
        long timeStart = System.currentTimeMillis();
        Units unit = new Units();
        unit.fileWriter();
        System.out.printf("Result: %s\n", unit.result(unit.numb()));
        long timeFinish = System.currentTimeMillis();
        System.out.printf("%s ms.", timeFinish - timeStart);
    }

    public static void main(String[] args) throws IOException {
        new Units().init();
    }
}
