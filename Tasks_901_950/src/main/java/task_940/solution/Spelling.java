package task_940.solution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 10.09.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Spelling {

    public String[] arr() throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_901_950\\src\\main\\java\\task_940\\solution\\input.txt"));
        return sc.nextLine().split(" ");
    }

    public String removeCharAt(String text, int pos) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_901_950\\src\\main\\java\\task_940\\solution\\output.txt");
        String rsl = text.substring(0, pos - 1) + text.substring(pos);
        fw.write(rsl);
        fw.close();
        return rsl;
    }

    public void init() throws IOException {
        Spelling spelling = new Spelling();
        String text = spelling.arr()[1];
        int pos = Integer.parseInt(spelling.arr()[0]);
        System.out.printf("Result: %s\n", spelling.removeCharAt(text, pos));
    }

    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
        new Spelling().init();
        long finishTime = System.currentTimeMillis();
        System.out.printf("%s ms.", finishTime - startTime);
    }
}
