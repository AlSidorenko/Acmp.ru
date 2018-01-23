package ru.tasks.task_001.solution;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 23.01.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class SumElementsTest {

    @Test
    public void sumOfElementsFromInput() throws IOException {
        FileReader frInput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_001\\solution\\input.txt");
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_001\\solution\\output.txt");

        Scanner sc = new Scanner(frInput);
        String input = sc.nextLine();
        String[] parts = input.split(" ");
        int[] array = new int[parts.length];
        int sum = 0;
        for (int i = 0; i < parts.length; i++) {
            array[i] = Integer.parseInt(parts[i]);
            sum += array[i];
        }
        String expected = String.valueOf(sum);
        sc = new Scanner(frOutput);
        String output = sc.nextLine();

        Assert.assertThat(output, is(expected));
    }
}
