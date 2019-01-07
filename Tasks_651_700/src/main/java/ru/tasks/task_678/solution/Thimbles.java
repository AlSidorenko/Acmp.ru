package ru.tasks.task_678.solution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 04.04.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Thimbles {

    public char[] arr() throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_651_700\\src\\main\\java\\ru\\tasks\\task_678\\solution\\input.txt"));
        String input = sc.next();
        return input.toCharArray();
    }

    public String result(char[] arr) throws IOException {
        int[] arrInt = new int[]{1, 0, 0};
        int temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'A') {
                temp = arrInt[0];
                arrInt[0] = arrInt[1];
                arrInt[1] = temp;
            } else if (arr[i] == 'B') {
                temp = arrInt[1];
                arrInt[1] = arrInt[2];
                arrInt[2] = temp;
            } else {
                temp = arrInt[2];
                arrInt[2] = arrInt[1];
                arrInt[1] = temp;
            }
        }
        for (int j = 0; j < arrInt.length; j++) {
            if (arrInt[j] == 1) {
                FileWriter fw = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                        "Acmp.ru\\Tasks_651_700\\src\\main\\java\\ru\\tasks\\task_678\\solution\\output.txt");
                fw.write(String.valueOf(j + 1));
                fw.close();
                return String.valueOf(j + 1);
            }
        }
        return "-1";
    }

    public static void main(String[] args) throws IOException {
        long timeStart = System.currentTimeMillis();
        Thimbles thimble = new Thimbles();
        System.out.println(thimble.arr());
        System.out.println(thimble.result(thimble.arr()));
        long timeFinish = System.currentTimeMillis();
        System.out.printf("%s ms.", timeFinish - timeStart);
    }
}
