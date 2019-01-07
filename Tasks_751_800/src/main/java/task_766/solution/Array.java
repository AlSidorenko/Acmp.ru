package task_766.solution;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created on 05.07.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Array {

    public int[] arr() throws IOException {
        FileReader frInput = new FileReader("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_751_800\\src\\main\\java\\task_766\\solution\\input.txt");
        Scanner sc = new Scanner(frInput);
        String strInput = sc.nextLine();
        String[] arrStrInput = strInput.split(" ");

        int[] arrIntInput = new int[arrStrInput.length];
        for (int i = 0; i < arrIntInput.length; i++) {
            arrIntInput[i] = Integer.parseInt(arrStrInput[i]);
        }
        return arrIntInput;
    }
}
