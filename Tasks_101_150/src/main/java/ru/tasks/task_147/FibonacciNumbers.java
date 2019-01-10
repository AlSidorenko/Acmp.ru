package ru.tasks.task_147;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created on 10.01.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class FibonacciNumbers {

    public int numb() throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_101_150\\src\\main\\java\\ru\\tasks\\task_147\\input.txt"));
        return sc.nextInt();
    }

    public String result(int numb) {
        int[] arr = new int[30];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return String.valueOf(arr[numb]);
    }

    public void fileWrite(String rsl) throws IOException {
        FileWriter output = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_101_150\\src\\main\\java\\ru\\tasks\\task_147\\output.txt");
        output.write(rsl);
        output.close();
    }

    public void init() throws IOException {
        long timeStart = System.currentTimeMillis();
        FibonacciNumbers fibonacci = new FibonacciNumbers();
        fibonacci.fileWrite(fibonacci.result(fibonacci.numb()));
        System.out.printf("Result: %s\n", fibonacci.result(fibonacci.numb()));
        long timeFinish = System.currentTimeMillis();
        System.out.printf("%s ms.", timeFinish - timeStart);
    }

    public static void main(String[] args) throws IOException {
        new FibonacciNumbers().init();
    }
}
