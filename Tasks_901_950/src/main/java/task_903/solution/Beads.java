package task_903.solution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 11.06.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Beads {

    public String result() throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_901_950\\src\\main\\java\\task_903\\solution\\input.txt"));
        int numb = sc.nextInt() + 1;
        String res = String.valueOf(numb);
        FileWriter fwOutput = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_901_950\\src\\main\\java\\task_903\\solution\\output.txt");
        fwOutput.write(res);
        fwOutput.close();
        return res;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new Beads().result());
    }
}
