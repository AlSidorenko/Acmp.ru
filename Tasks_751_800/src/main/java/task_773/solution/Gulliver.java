package task_773.solution;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.String.format;

/**
 * Created on 10.07.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Gulliver {

    public int[] arr() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_751_800\\src\\main\\java\\task_773\\solution\\input.txt"));
        String[] arrStr = sc.nextLine().split(" ");

        int[] arrInt = new int[arrStr.length];
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = Integer.parseInt(arrStr[i]);
        }
        return arrInt;
    }

    public String result(int[] arr) throws IOException {
        FileWriter fwOutput = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_751_800\\src\\main\\java\\task_773\\solution\\output.txt");
        fwOutput.write(String.valueOf(arr[0] * arr[0] * arr[1]));
        fwOutput.close();
        return String.valueOf(arr[0] * arr[0] * arr[1]);
    }

    public static void main(String[] args) throws IOException {
        long timeStart = System.currentTimeMillis();
        System.out.println(Arrays.toString(new Gulliver().arr()));
        System.out.println(format("Result = %s", new Gulliver().result(new Gulliver().arr())));
        long timeFinish = System.currentTimeMillis();
        System.out.printf("%s ms.", timeFinish - timeStart);
    }
}
