package ru.tasks.task_002.solution;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

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
public class SumOfNumberTest {

    @Test
    public void sumOfNumberFromInput() throws IOException {
        FileReader frInput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_002\\solution\\input.txt");
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_002\\solution\\output.txt");
        Scanner scan = new Scanner(frInput);
        String input = scan.next();
        int numb = Integer.parseInt(input);

        int sum = 0;
        for (int i = 1; i <= numb; i++) {
            sum += i;
        }

        String expected = String.valueOf(sum);

        scan = new Scanner(frOutput);
        String output = scan.next();
        Assert.assertThat(output, Is.is(expected));
    }
}
