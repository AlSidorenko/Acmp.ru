package ru.tasks.task_284.solution;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created on 01.06.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Array {

    Scanner input;

    // Считываем данные и преобразуем в массив.
    public Item[] arr() throws FileNotFoundException {
        input = new Scanner(new File("C:\\Users\\Александр\\Documents\\IdeaProject\\Acmp.ru\\" +
                "Tasks_251_300\\src\\main\\java\\ru\\tasks\\task_284\\solution\\input.txt"));
        int n = input.nextInt();
        Item[] arr1 = new Item[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = new Item(input.nextInt());
        }
        return arr1;
    }

    public Item[] subArray() throws IOException {
        String line3 = Files.readAllLines(Paths.get("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_251_300\\src\\main\\java\\ru\\tasks\\task_284\\solution\\input.txt")).get(2);
        int len = Integer.valueOf(line3);
        Item[] arr2 = new Item[len];

        for (int i = 0; i < len; i++) {
            String line = Files.readAllLines(Paths.get("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                    "Acmp.ru\\Tasks_251_300\\src\\main\\java\\ru\\tasks\\task_284\\solution\\input.txt")).get(3 + i);
            String[] temp = line.split(" ");
            arr2[i] = new Item(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
        }
        return arr2;
    }
}
