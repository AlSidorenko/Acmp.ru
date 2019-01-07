package task_818.solution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created on 17.09.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class BoilingTea {

    public int[] arr() throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_801_850\\src\\main\\java\\task_818\\solution\\input.txt"));
        int len = Integer.parseInt(sc.nextLine());
        String[] arrStr = sc.nextLine().split(" ");
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(arrStr[i]);
        }
        return arr;
    }

    public String result(int[] arr) {
        int len = arr.length;
        return (len == 1 ? String.valueOf(arr[0]) : String.valueOf(arr[len - 1] + arr[len - 2]));
    }

    public void writeResultInFile(String result) throws IOException {
        FileWriter fileWriter = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_801_850\\src\\main\\java\\task_818\\solution\\output.txt");
        fileWriter.write(result);
        fileWriter.close();
    }

    public void init() throws IOException {
        long timeStart = System.currentTimeMillis();
        BoilingTea boilingTea = new BoilingTea();
        boilingTea.writeResultInFile(boilingTea.result(boilingTea.arr()));
        System.out.printf("Array: %s\n", Arrays.toString(boilingTea.arr()));
        System.out.printf("Result: %s\n", boilingTea.result(boilingTea.arr()));
        long timeFinish = System.currentTimeMillis();
        System.out.printf("%s ms.", timeFinish - timeStart);
    }

    public static void main(String[] args) throws IOException {
        new BoilingTea().init();
    }
}
