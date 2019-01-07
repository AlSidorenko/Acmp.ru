package task_839.solution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 14.09.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class EverybodyKnows {

    public String result() throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_801_850\\src\\main\\java\\task_839\\solution\\input.txt"));
        char[] arrChar = sc.nextLine().toCharArray();
        String result = null;
        for (int i = 0; i < arrChar.length; i++) {
            //result = arrChar[i] == '0' ? "NO" : "YES";
            if (arrChar[i] == '0') {
                result = "NO";
                break;
            } else {
                result = "YES";
            }
        }
        return result;
    }

    public void writeResult(String rsl) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_801_850\\src\\main\\java\\task_839\\solution\\output.txt");
        fw.write(rsl);
        fw.close();
    }

    public void init() throws IOException {
        long timeStart = System.currentTimeMillis();
        EverybodyKnows everybodyKnows = new EverybodyKnows();
        everybodyKnows.writeResult(everybodyKnows.result());
        System.out.printf("Result: %s\n", everybodyKnows.result());
        long timeFinish = System.currentTimeMillis();
        System.out.printf("%s ms.", timeFinish - timeStart);
    }

    public static void main(String[] args) throws IOException {
        new EverybodyKnows().init();
    }
}
