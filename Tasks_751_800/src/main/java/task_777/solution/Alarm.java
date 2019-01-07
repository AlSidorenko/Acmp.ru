package task_777.solution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 02.09.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Alarm {

    public int[] arr() throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_751_800\\src\\main\\java\\task_777\\solution\\input.txt"));
        String[] arrStr = sc.nextLine().split(" ");
        int[] arrInt = new int[arrStr.length];
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = Integer.parseInt(arrStr[i]);
        }
        return arrInt;
    }

    public String result(int[] arr) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_751_800\\src\\main\\java\\task_777\\solution\\output.txt");
        int rsl;
        if (arr[0] < arr[1]) {
            rsl = arr[1] - arr[0];
        } else {
            rsl = 12 - arr[0] + arr[1];
        }
        fw.write(String.valueOf(rsl));
        fw.close();
        return String.valueOf(rsl);
    }
}
