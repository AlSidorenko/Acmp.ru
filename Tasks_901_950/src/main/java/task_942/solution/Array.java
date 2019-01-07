package task_942.solution;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created on 04.07.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Array {

    //считывание данных из файла в массив.
    public Item[] arr() throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_901_950\\src\\main\\java\\task_942\\solution\\input.txt"));
        int len = sc.nextInt();

        Item[] items = new Item[len];
        for (int i = 0; i < len; i++) {
            items[i] = new Item(sc.nextInt());
        }
        return items;
    }
}
