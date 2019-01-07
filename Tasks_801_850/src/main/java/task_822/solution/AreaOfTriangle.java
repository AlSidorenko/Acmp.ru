package task_822.solution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 24.09.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class AreaOfTriangle {

    public int[] arr() throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_801_850\\src\\main\\java\\task_822\\solution\\input.txt"));
        String[] arrStr = sc.nextLine().split(" ");
        int[] arr = new int[arrStr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(arrStr[i]);
        }
        return arr;
    }

    public String result(int[] arr) {
        double areaOfTriangle = (Math.abs(((arr[2] - arr[0]) * (arr[5] - arr[1]))
                                                    - ((arr[4] - arr[0]) * (arr[3] - arr[1]))) / 2.0);
        return String.valueOf(areaOfTriangle);
    }

    public void fileWriteOfOutput() throws IOException {
        AreaOfTriangle areaOfTriangle = new AreaOfTriangle();
        FileWriter fw = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_801_850\\src\\main\\java\\task_822\\solution\\output.txt");
        fw.write(areaOfTriangle.result(areaOfTriangle.arr()));
        fw.close();
    }

    public void init() throws IOException {
        long timeStart = System.currentTimeMillis();
        AreaOfTriangle areaOfTriangle = new AreaOfTriangle();
        areaOfTriangle.fileWriteOfOutput();
        System.out.printf("Result: %s\n", areaOfTriangle.result(areaOfTriangle.arr()));
        long timeFinish = System.currentTimeMillis();
        System.out.printf("%s ms.", timeFinish - timeStart);
    }

    public static void main(String[] args) throws IOException {
        new AreaOfTriangle().init();
    }
}
