package task_754.solution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created on 18.07.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class FatMen {

    public int[] arr() throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_751_800\\src\\main\\java\\task_754\\solution\\input.txt"));
        String[] arrStr = sc.nextLine().split(" ");

        int[] arrInt = new int[arrStr.length];
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = Integer.parseInt(arrStr[i]);
        }
        return arrInt;
    }

    public String result(int[] arr) throws IOException {
        int max, min;
        max = min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        FileWriter output = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_751_800\\src\\main\\java\\task_754\\solution\\output.txt");
        if ((min >= 94) & (max <= 727)) {
            output.write(String.valueOf(max));
            output.close();
            return String.valueOf(max);
        } else {
            output.write("Error");
            output.close();
            return "Error";
        }
    }

    public static void main(String[] args) throws IOException {
        long timeStart = System.currentTimeMillis();
        System.out.println(Arrays.toString(new FatMen().arr()));
        System.out.println(new FatMen().result(new FatMen().arr()));
        long timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart + " ms.");
    }
}
