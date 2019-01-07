package task_766.solution;

import java.io.FileWriter;
import java.io.IOException;

import static java.lang.String.format;

/**
 * Created on 05.07.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Nuts {

    private String y = "YES";
    private String n = "NO";

    public String result(int[] a) throws IOException {
        FileWriter fwOutput = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_751_800\\src\\main\\java\\task_766\\solution\\output.txt");
        if ((a[0] * a[1]) >= a[2]) {
            fwOutput.write(y);
            fwOutput.close();
            return y;
        } else {
            fwOutput.write(n);
            fwOutput.close();
            return n;
        }
    }

    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
        System.out.println(new Nuts().result(new Array().arr()));
        long finishTime = System.currentTimeMillis();
        //System.out.println(finishTime - startTime + " ms.");
        //System.out.println(format("%s ms.", finishTime - startTime));
        System.out.printf("%s ms.", finishTime - startTime);
    }
}
