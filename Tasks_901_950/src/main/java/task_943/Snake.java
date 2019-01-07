package task_943;

/**
 * Created on 07.11.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Snake {

    public static void main(String[] args) {
        int[][] arr = new int[2][5];

        /*arr[0][0] = 0;
        arr[0][1] = 3;
        arr[0][2] = 4;
        arr[0][3] = 7;
        arr[0][4] = 8;

        arr[1][0] = 1;
        arr[1][1] = 2;
        arr[1][2] = 5;
        arr[1][3] = 6;
        arr[1][4] = 9;

        System.out.printf("Result: %s", arr[1 - 1][3 - 1]);*/

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 5; j++) {
                    for (int k = 0; k < 5 * 2; k++) {
                    arr[i][j] = k;
                }
            }
        }
        System.out.printf("Result: %s", arr[0][1]);
    }
}
