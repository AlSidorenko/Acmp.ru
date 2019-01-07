package task_933.solution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 08.09.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class PhoneBill {

    public int[] arr() throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_901_950\\src\\main\\java\\task_933\\solution\\input.txt"));
        String[] arrStr = sc.nextLine().split(" ");
        int[] arr = new int[arrStr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(arrStr[i]);
        }
        return arr;
    }

    public String result(int[] arr) throws IOException {
        FileWriter output = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_901_950\\src\\main\\java\\task_933\\solution\\output.txt");
        String rsl = null;
        if (arr[3] <= arr[0]) {
            rsl = String.valueOf(arr[0] * arr[1]);
        } else {
            rsl = String.valueOf((arr[0] * arr[1] + ((arr[3] - arr[0]) * arr[2])));
        }
        output.write(rsl);
        output.close();
        return rsl;
    }
}
