package task_970.solution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created on 30.07.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Rearrangement {

    public int[] arr() throws IOException {
        Scanner input = new Scanner(new File("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_951_1000\\src\\main\\java\\task_970\\solution\\input.txt"));
        String[] arrStr = input.nextLine().split(" ");

        int[] arrInt = new int[arrStr.length];
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = Integer.parseInt(arrStr[i]);
        }
        Arrays.sort(arrInt);
        return arrInt;
    }

    public String result(int[] arr) throws IOException {
        Rearrangement rearrangement = new Rearrangement();
        FileWriter output = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_951_1000\\src\\main\\java\\task_970\\solution\\output.txt");
        if ((arr[0] + arr[1]) == arr[2]) {
            output.write("YES");
            output.close();
            return "YES";
        } else {
            output.write("NO");
            output.close();
            return "NO";
        }
    }

    public static void main(String[] args) throws IOException {
        long timeStart = System.currentTimeMillis();
        Rearrangement rearrangement = new Rearrangement();
        System.out.println(Arrays.toString(rearrangement.arr()));
        System.out.println(rearrangement.result(rearrangement.arr()));
        long timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart + " ms.");
    }
}
