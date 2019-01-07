package ru.tasks.task_284.solution;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created on 01.06.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class SubArrayResult {

    public String result(Item[] subArray, Item[] arr) throws IOException {
        FileWriter output = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\Acmp.ru\\" +
                "Tasks_251_300\\src\\main\\java\\ru\\tasks\\task_284\\solution\\output.txt");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < subArray.length; i++) {
            Item[] temp = Arrays.copyOfRange(arr, subArray[i].firstElem - 1, subArray[i].secondElem);
            for (int j = 0; j < temp.length; j++) {
                sb.append(temp[j]);
            }
            sb.append("\n");
        }
        output.write(sb.toString());
        output.close();
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new SubArrayResult().result(new Array().subArray(), new Array().arr()));
    }
}
