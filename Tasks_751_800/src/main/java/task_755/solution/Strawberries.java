package task_755.solution;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created on 18.07.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Strawberries {

    public int[] arr() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_751_800\\src\\main\\java\\task_755\\solution\\input.txt"));
        String[] strArr = sc.nextLine().split(" ");

        int[] arrInt = new int[strArr.length];
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = Integer.parseInt(strArr[i]);
        }
        return arrInt;
    }

    public String result(int[] arr) throws IOException {
        FileWriter output = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_751_800\\src\\main\\java\\task_755\\solution\\output.txt");
        int res = arr[0] + arr[1] - arr[2];
        if (res >= 0) {
            output.write(String.valueOf(res));
            output.close();
            return String.valueOf(res);
        } else {
            output.write("Impossible");
            output.close();
            return "Impossible";
        }
    }

    public static void main(String[] args) throws IOException {
        long timeStart = System.currentTimeMillis();
        System.out.println(Arrays.toString(new Strawberries().arr()));
        System.out.println(new Strawberries().result(new Strawberries().arr()));
        long timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart + " ms.");
    }
}
