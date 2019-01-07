package task_819.solution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 22.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Parallelepiped {

    public int[] array() throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_801_850\\src\\main\\java\\task_819\\solution\\input.txt"));
        String[] temp = sc.nextLine().split(" ");

        int[] input = new int[temp.length];
        for (int i = 0; i < input.length; i++) {
            input[i] = Integer.parseInt(temp[i]);
        }
        return input;
    }

    public String result(int[] array) throws IOException {
        FileWriter output = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_801_850\\src\\main\\java\\task_819\\solution\\output.txt");
        StringBuilder sb = new StringBuilder();
        int square = (array[0] * array[2] * 2) + (array[0] * array[1] * 2) + (array[1] * array[2] *2);
        int volume = array[0] * array[1] * array[2];
        output.write(square + " " + volume);
        output.close();
        return String.valueOf(square + " " + volume);
    }

    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
        System.out.println(new Parallelepiped().result(new Parallelepiped().array()));
        long finishTime = System.currentTimeMillis();
        System.out.printf("%s ms.", finishTime - startTime);
    }
}
