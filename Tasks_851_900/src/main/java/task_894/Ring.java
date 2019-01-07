package task_894;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.String.format;

/**
 * Created on 21.11.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Ring {

    public double[] arr() throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_851_900\\src\\main\\java\\task_894\\input.txt"));
        String[] arrStr = sc.nextLine().split(" ");
        double[] arr = new double[arrStr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Double.valueOf(arrStr[i]);
        }
        return arr;
    }

    public String result(double[] arr) {
        return format("%.4g", Math.sqrt(((PI * arr[1] * arr[1]) - arr[0]) / PI));
    }

    public void fileWrite(String result) throws IOException {
        FileWriter output = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_851_900\\src\\main\\java\\task_894\\output.txt");
        output.write(result);
        output.close();
    }

    public void init() throws IOException {
        long timeStart = System.currentTimeMillis();
        Ring ring = new Ring();
        ring.fileWrite(ring.result(ring.arr()));
        System.out.printf("Radius = %s\n", ring.result(ring.arr()));
        long timeFinish = System.currentTimeMillis();
        System.out.printf("%s ms.", timeFinish - timeStart);
    }

    public static void main(String[] args) throws IOException {
        new Ring().init();
    }
}
