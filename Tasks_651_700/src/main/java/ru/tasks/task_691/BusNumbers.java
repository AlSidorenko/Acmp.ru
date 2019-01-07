package ru.tasks.task_691;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created on 05.12.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class BusNumbers {

    public String[] arr() throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_651_700\\src\\main\\java\\ru\\tasks\\task_691\\input.txt"));
        int len = sc.nextInt();
        String[] arr = new String[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
        return arr;
    }

    public String result(String[] arr) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            char[] temp = arr[i].toCharArray();
            // A, B, C, E, H, K, M, O, P, T, X, Y.
            if ((temp[0] == 'A' | temp[0] == 'B' | temp[0] == 'C' | temp[0] == 'E' | temp[0] == 'H' |
                    temp[0] == 'K' | temp[0] == 'M' | temp[0] == 'O' | temp[0] == 'P' | temp[0] == 'T' |
                    temp[0] == 'X' | temp[0] == 'Y')
                    & (temp[1] <= '9')
                    & (temp[4] == 'A' | temp[4] == 'B' | temp[4] == 'C' | temp[4] == 'E' | temp[4] == 'H' |
                    temp[4] == 'K' | temp[4] == 'M' | temp[0] == 'O' | temp[4] == 'P' | temp[4] == 'T' |
                    temp[4] == 'X' | temp[4] == 'Y')
                    & (temp[5] == 'A' | temp[5] == 'B' | temp[5] == 'C' | temp[5] == 'E' | temp[5] == 'H' |
                    temp[5] == 'K' | temp[5] == 'M' | temp[5] == 'O' | temp[5] == 'P' | temp[5] == 'T' |
                    temp[5] == 'X' | temp[5] == 'Y')) {
                res.append("Yes\n");
            } else {
                res.append("No\n");
            }
        }
        return res.toString();
    }

    public void fileWrite() throws IOException {
        BusNumbers busNumbers = new BusNumbers();
        FileWriter output = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_651_700\\src\\main\\java\\ru\\tasks\\task_691\\output.txt");
        output.write(busNumbers.result(busNumbers.arr()));
        output.close();
    }

    public static void main(String[] args) throws IOException {
        long timeStart = System.currentTimeMillis();
        BusNumbers busNumbers = new BusNumbers();
        System.out.printf("Array: %s\n", Arrays.toString(busNumbers.arr()));
        System.out.printf("Result: \n%s", busNumbers.result(busNumbers.arr()));
        busNumbers.fileWrite();
        long timeFinish = System.currentTimeMillis();
        System.out.printf("%s ms.", timeFinish - timeStart);
    }
}
