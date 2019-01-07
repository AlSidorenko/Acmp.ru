package task_756.solution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 27.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Fishnet {

    public int[] arr() throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_751_800\\src\\main\\java\\task_756\\solution\\input.txt"));
        String[] arrTemp = sc.nextLine().split(" ");

        int[] input = new int[arrTemp.length];
        for (int i = 0; i < input.length; i++) {
            input[i] = Integer.parseInt(arrTemp[i]);
        }
        return input;
    }

    public String result(int[] arr) throws IOException {
        FileWriter output = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_751_800\\src\\main\\java\\task_756\\solution\\output.txt");
        double t = (double) arr[0] * arr[1];
        if (((double) arr[0] * arr[1] / 4) <= 1) {
            output.write("1");
            output.close();
            return "1";
        } else {
            output.write("2");
            output.close();
            return "2";
        }
    }

    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
        Fishnet fishnet = new Fishnet();
        System.out.printf("Result: %s\n", fishnet.result(fishnet.arr()));
        long finishTime = System.currentTimeMillis();
        System.out.printf("%s ms.", finishTime - startTime);
    }
}
