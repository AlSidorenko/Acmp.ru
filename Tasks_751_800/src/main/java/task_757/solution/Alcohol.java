package task_757.solution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 31.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Alcohol {

    public int[] arr() throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_751_800\\src\\main\\java\\task_757\\solution\\input.txt"));
        String[] arrStr = sc.nextLine().split(" ");

        int[] arr = new int[arrStr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(arrStr[i]);
        }
        return arr;
    }

    public int carbon(int[] arr) {
        int c;
        if (arr[0] < 2) {
            c = 0;
        } else {
            c = arr[0] / 2;
        }
        return c;
    }

    public int hydrogen(int[] arr) {
        int h;
        if (arr[1] < 6) {
            h = 0;
        } else {
            h = arr[1] / 6;
        }
        return h;
    }

    public int oxygen(int[] arr) {
        int o;
        if (arr[2] < 1) {
            o = 0;
        } else {
            o = arr[2] / 1;
        }
        return o;
    }

    public String result(int carbon, int hydrogen, int oxygen) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_751_800\\src\\main\\java\\task_757\\solution\\output.txt");
        int rsl;
        int[] arrRsl = {carbon, hydrogen, oxygen};
        if (carbon == 0 | hydrogen == 0 | oxygen == 0) {
            rsl = 0;
        }
        rsl = arrRsl[0];
        for (int i = 0; i < arrRsl.length; i++) {
            if (arrRsl[i] < rsl) {
                rsl = arrRsl[i];
            }
        }
        fw.write(String.valueOf(rsl));
        fw.close();
        return String.valueOf(rsl);
    }

    public static void main(String[] args) throws IOException {
        long timeStart = System.currentTimeMillis();
        Alcohol alcohol = new Alcohol();
        int c = alcohol.carbon(alcohol.arr());
        int h = alcohol.hydrogen(alcohol.arr());
        int o = alcohol.oxygen(alcohol.arr());
        System.out.printf("Result: %s\n", alcohol.result(c, h, o));
        long timeFinish = System.currentTimeMillis();
        System.out.printf("%s ms.", timeFinish - timeStart);
    }
}
