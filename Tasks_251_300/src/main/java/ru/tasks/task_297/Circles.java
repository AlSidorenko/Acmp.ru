package ru.tasks.task_297;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 21.11.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Circles {

    public String str() throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_251_300\\src\\main\\java\\ru\\tasks\\task_297\\input.txt"));
        return sc.nextLine();
    }

    String result(String str) {
        char[] arrCh = str.toCharArray();
        int eight = 0;
        int nine = 0;
        int zero = 0;
        int six = 0;
        for (char anArrCh : arrCh) {
            if (anArrCh == '8')  eight += 2;
        }
        for (char anArrCh : arrCh) {
            if (anArrCh == '9') nine += 1;
        }
        for (char anArrCh : arrCh) {
            if (anArrCh == '0') zero += 1;
        }
        for (char anArrCh : arrCh) {
            if (anArrCh == '6') six += 1;
        }
        int rsl = eight + nine + zero + six;
        return String.valueOf(rsl);
    }

    public void fileWrite(String result) throws IOException {
        FileWriter output = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_251_300\\src\\main\\java\\ru\\tasks\\task_297\\output.txt");
        output.write(result);
        output.close();
    }

    public void init() throws IOException {
        long timeStart = System.currentTimeMillis();
        Circles circles = new Circles();
        circles.fileWrite(circles.result(circles.str()));
        System.out.printf("Result = %s\n", circles.result(circles.str()));
        long timeFinish = System.currentTimeMillis();
        System.out.printf("%s ms.", timeFinish - timeStart);
    }

    public static void main(String[] args) throws IOException {
        new Circles().init();
    }
}
