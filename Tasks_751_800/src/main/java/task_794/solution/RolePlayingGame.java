package task_794.solution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 18.10.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class RolePlayingGame {

    public int[] arr() throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_751_800\\src\\main\\java\\task_794\\solution\\input.txt"));
        String[] arrStr = sc.nextLine().split(" ");
        int[] arrInt = new int[arrStr.length];
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i] = Integer.parseInt(arrStr[i]);
        }
        return arrInt;
    }

    public String result(int[] arr) {
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return String.valueOf(result);
    }

    public void writeResult() throws IOException {
        RolePlayingGame game = new RolePlayingGame();
        FileWriter fw = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_751_800\\src\\main\\java\\task_794\\solution\\output.txt");
        fw.write(game.result(game.arr()));
        fw.close();
    }

    public void init() throws IOException {
        long timeStart = System.currentTimeMillis();
        RolePlayingGame game = new RolePlayingGame();
        game.writeResult();
        System.out.printf("Result: %s\n", game.result(game.arr()));
        long timeFinish = System.currentTimeMillis();
        System.out.printf("%s m.", timeFinish - timeStart);
    }

    public static void main(String[] args) throws IOException {
        new RolePlayingGame().init();
    }
}
