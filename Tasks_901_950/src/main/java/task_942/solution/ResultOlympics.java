package task_942.solution;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created on 05.07.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class ResultOlympics {

    private int firstYearStudent = 1;
    private int thirdYearStudent = 3;
    private int fifthYearStudent = 5;

    public int comparison(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public String init() throws IOException {
        FileWriter fwOutput = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_901_950\\src\\main\\java\\task_942\\solution\\output.txt");
        if (new Olympics().fifthYearStudent(new Array().arr()) <
                comparison(new Olympics().thirdYearStudent(new Array().arr()),
                        new Olympics().firstYearStudent(new Array().arr()))) {
            fwOutput.write(String.valueOf(fifthYearStudent));
            fwOutput.close();
            return String.valueOf(fifthYearStudent);
        } else if (new Olympics().thirdYearStudent(new Array().arr()) <
                comparison(new Olympics().fifthYearStudent(new Array().arr()),
                        new Olympics().firstYearStudent(new Array().arr()))) {
            fwOutput.write(String.valueOf(thirdYearStudent));
            fwOutput.close();
            return String.valueOf(thirdYearStudent);
        } else {
            fwOutput.write(String.valueOf(firstYearStudent));
            fwOutput.close();
            return String.valueOf(firstYearStudent);
        }
    }

    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
        System.out.println(new ResultOlympics().init());
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime + " ms.");
    }
}
