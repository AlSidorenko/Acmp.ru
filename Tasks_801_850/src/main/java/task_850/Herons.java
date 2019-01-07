package task_850;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static java.util.Arrays.sort;

/**
 * Created on 25.10.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Herons {

    public int[] arr() throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_801_850\\src\\main\\java\\task_850\\input.txt"));
        String[] arrStr = sc.nextLine().split(" ");
        int[] arrInt = new int[arrStr.length];
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = Integer.parseInt(arrStr[i]);
        }
        return arrInt;
    }

    public int min(int[] arr) {
        sort(arr);
        return arr[arr.length - 1] / 2;
    }

    public int max(int[] arr) {
        sort(arr);
        return arr[0];
    }

    public String result() throws IOException {
        Herons herons = new Herons();
        int min = herons.min(herons.arr());
        int max = herons.max(herons.arr());
        StringBuilder sb = new StringBuilder();
        sb.append(min);
        sb.append(" ");
        sb.append(max);
        return sb.toString();
    }

    public void writeResult() throws IOException {
        Herons herons = new Herons();
        FileWriter output = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_801_850\\src\\main\\java\\task_850\\output.txt");
        output.write(herons.result());
        output.close();
    }

    public void init() throws IOException {
        long timeStart = System.currentTimeMillis();
        Herons herons = new Herons();
        herons.writeResult();
        System.out.printf("Result: %s\n", herons.result());
        long timeFinish = System.currentTimeMillis();
        System.out.printf("%s ms.", timeFinish - timeStart);
    }

    public static void main(String[] args) throws IOException {
        new Herons().init();
    }
}
