package task_929.solution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 19.09.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Dice {

    public int numb() throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_901_950\\src\\main\\java\\task_929\\solution\\input.txt"));
        return sc.nextInt();
    }

    public String resultOfOneDice(int numb) {
        StringBuilder sb = new StringBuilder();
        double div;
        int tempRes = 0;
        int minResult;
        for (int i = 1; i <= 6; i++) {
            div = (double) (numb / i);
            if (div == 1.0) {
                tempRes = i;
            }
        }
        if (tempRes == 1) {
            minResult = 6;
        } else if (tempRes == 2) {
            minResult = 5;
        } else if (tempRes == 3) {
            minResult = 4;
        } else if (tempRes == 4) {
            minResult = 3;
        } else if (tempRes == 5) {
            minResult = 2;
        } else {
            minResult = 1;
        }

        int maxResult = 0;
        int[] arr = new int[tempRes];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 6;
            maxResult += arr[i];
        }
        sb.append(minResult + " " + maxResult);
        return sb.toString();
    }

    public String resultIsMoreThanOneDice(int numb) {
        StringBuilder sb = new StringBuilder();
        int len = numb / 6;
        int minResult = 0;
        int maxResult;
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
            minResult += arr[i];
        }
        maxResult = numb * minResult;
        sb.append(minResult + " " + maxResult);
        return sb.toString();
    }

    public String result(int numb) {
        Dice dice = new Dice();
        String rsl;
        if (numb <= 6) {
            rsl = dice.resultOfOneDice(numb);
        } else {
            rsl = dice.resultIsMoreThanOneDice(numb);
        }
        return rsl;
    }

    public void fileWriter(String result) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_901_950\\src\\main\\java\\task_929\\solution\\output.txt");
        fw.write(result);
        fw.close();
    }

    public void init() throws IOException {
        long timeStart = System.currentTimeMillis();
        Dice dice = new Dice();
        dice.fileWriter(dice.result(dice.numb()));
        System.out.printf("Numb: %s\n", dice.numb());
        System.out.printf("Result: %s\n", dice.result(dice.numb()));
        long timeFinish = System.currentTimeMillis();
        System.out.printf("%s ms.", timeFinish - timeStart);
    }

    public static void main(String[] args) throws IOException {
        new Dice().init();
    }
}
