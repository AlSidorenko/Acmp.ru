package task_907.solution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

/**
 * Created on 30.07.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Mouse {

    public int[] arr() throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_901_950\\src\\main\\java\\task_907\\solution\\input.txt"));
        String[] arrStr = sc.nextLine().split(" ");

        int[] arrInt = new int[arrStr.length];
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = Integer.parseInt(arrStr[i]);
        }
        return arrInt;
    }

    public String result() throws IOException {
        Mouse mouse = new Mouse();
        FileWriter output = new  FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_901_950\\src\\main\\java\\task_907\\solution\\output.txt");
        if (areaOfTheRectangle(mouse.arr()) >= areaOfTheCircle(mouse.arr())) {
            output.write("YES");
            output.close();
            return "YES";
        } else {
            output.write("NO");
            output.close();
            return "NO";
        }
    }

    public double areaOfTheRectangle(int[] arr) {
        return arr[0] * arr[1];
    }

    public double areaOfTheCircle(int[] arr) {
        return PI * pow(arr[2], 2);
    }

    public static void main(String[] args) throws IOException {
        long timeStart = System.currentTimeMillis();
        Mouse mouse = new Mouse();
        System.out.println(mouse.areaOfTheCircle(mouse.arr()));
        System.out.println(mouse.areaOfTheRectangle(mouse.arr()));
        System.out.println(mouse.result());
        long timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart + " ms.");
    }
}
