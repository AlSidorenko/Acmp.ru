package task_948.solution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 13.09.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class LinesInBook {

    public double[] arr() throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_901_950\\src\\main\\java\\task_948\\solution\\input.txt"));
        String[] arrStr = sc.nextLine().split(" ");
        double[] arr = new double[arrStr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(arrStr[i]);
        }
        return arr;
    }

    public int numbOfPage(double[] arr) {
        int page = (int) Math.ceil(arr[1] / arr[0]);
        return page;
    }

    public int numbOfLine(double[] arr) throws IOException {
        LinesInBook linesInBook = new LinesInBook();
        int page = linesInBook.numbOfPage(linesInBook.arr());
        int rsl = (int) (arr[0] - ((arr[0] * page) - arr[1]));
        return rsl;
    }

    public String result(int page, int line) throws IOException {
        FileWriter fileWriter = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_901_950\\src\\main\\java\\task_948\\solution\\output.txt");
        String rsl = String.valueOf(page) + " " + String.valueOf(line);
        fileWriter.write(rsl);
        fileWriter.close();
        return rsl;
    }

    public static void main(String[] args) throws IOException {
        long timeStart = System.currentTimeMillis();
        LinesInBook linesInBook = new LinesInBook();
        int page = linesInBook.numbOfPage(linesInBook.arr());
        int line = linesInBook.numbOfLine(linesInBook.arr());
        System.out.printf("Result: %s\n", linesInBook.result(page, line));
        long timeFinish = System.currentTimeMillis();
        System.out.printf("%s ms.", timeFinish - timeStart);
    }
}
