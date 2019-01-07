package ru.tasks.task_691;

/**
 * Created on 05.12.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class TempDemo {

    public boolean check(String str) {
        boolean res = false;
        char[] charStr = str.toCharArray();
        for (int i = 0; i < charStr.length; i++) {
            // A, B, C, E, H, K, M, O, P, T, X, Y.
            if (charStr[0] == 'P' & charStr[1] <= '9') {
                res = true;
            } else {
                res = false;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.printf("Result: %s", new TempDemo().check("P204BT"));
    }
}
