package ru.tasks.task_263;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created on 29.11.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Subway {

    public int[] arr() throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_251_300\\src\\main\\java\\ru\\tasks\\task_263\\input.txt"));
        String[] temp = sc.nextLine().split(" ");
        int[] arr = new int[temp.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(temp[i]);
        }
        return arr;
    }

    public int firstItem(int[] arr) {
        return (arr[2] - arr[1] - 1);
    }

    public int secondItem(int[] arr) {
        return (arr[0] - arr[2] - 1 + arr[1]);
    }

    public String result(int firstItem, int secondItem) {
        int res;
        if (firstItem < secondItem) {
            res = firstItem;
        } else if (firstItem > secondItem) {
            res = secondItem;
        } else {
            res = firstItem;
        }
        return String.valueOf(res);
    }

    public void fileWrite(String result) throws IOException {
        FileWriter output = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_251_300\\src\\main\\java\\ru\\tasks\\task_263\\output.txt");
        output.write(result);
        output.close();
    }

    public void init() throws IOException {
        long timeStart = System.currentTimeMillis();
        Subway subway = new Subway();
        int first = subway.firstItem(subway.arr());
        int second = subway.secondItem(subway.arr());
        String res = subway.result(first, second);
        System.out.printf("Array: %s\n", Arrays.toString(subway.arr()));
        System.out.printf("First Item: %s\n", first);
        System.out.printf("Second Item: %s\n", second);
        System.out.printf("Result: %s\n", res);
        subway.fileWrite(res);
        long timeFinish = System.currentTimeMillis();
        System.out.printf("%s ms.", timeFinish - timeStart);
    }

    public static void main(String[] args) throws IOException {
        new Subway().init();
    }
}
