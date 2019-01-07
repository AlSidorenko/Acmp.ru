package task_844;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 07.01.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Fields {

    public int[] arr() throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_801_850\\src\\main\\java\\task_844\\input.txt"));
        String[] strArr = sc.nextLine().split(" ");
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        return intArr;
    }

    public String result(int[] arr) {
        String res;
        double multiplication = arr[0] * arr[1];
        int x = (int) Math.sqrt(multiplication);
        if (Math.pow(x, 2) == multiplication) {
            res = String.valueOf(x);
        } else {
            res = "0";
        }
        return res;
    }

    public void writeResult() throws IOException {
        Fields field = new Fields();
        FileWriter output = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_801_850\\src\\main\\java\\task_844\\output.txt");
        output.write(field.result(field.arr()));
        output.close();
    }

    public void init() throws IOException {
        long timeStart = System.currentTimeMillis();
        Fields field = new Fields();
        field.writeResult();
        System.out.printf("Result: %s\n", field.result(field.arr()));
        long timeFinish = System.currentTimeMillis();
        System.out.printf("%s ms.", timeFinish - timeStart);
    }

    public static void main(String[] args) throws IOException {
        new Fields().init();
    }
}
