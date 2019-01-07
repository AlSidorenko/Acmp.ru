package task_892.solution;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 16.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Season {

    public int monthNumber() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_851_900\\src\\main\\java\\task_892\\solution\\input.txt"));
        int input = sc.nextInt();
        return input;
    }

    public String check(int monthNumb) throws IOException {
        FileWriter output = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_851_900\\src\\main\\java\\task_892\\solution\\output.txt");
        String result;
        if (monthNumb > 12 | monthNumb < 1) {
            result = "Error";
        } else {
            if (monthNumb >= 1 & monthNumb <= 2) {
                result = "Winter";
            } else if (monthNumb >= 3 & monthNumb <= 5) {
                result = "Spring";
            } else if (monthNumb >=6 & monthNumb <= 8) {
                result = "Summer";
            } else if (monthNumb == 12) {
                result = "Winter";
            } else {
                result = "Autumn";
            }
        }
        output.write(result);
        output.close();
        return result;
    }

    public static void main(String[] args) throws IOException {
        long timeStart = System.currentTimeMillis();
        Season season = new Season();
        System.out.println(season.check(season.monthNumber()));
        long timeFinish = System.currentTimeMillis();
        System.out.printf("%s ms.", timeFinish - timeStart);

        Integer a = null;
        int b = a;
    }
}
