package ru.tasks.task_148.solution;

import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 06.04.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class LargestDivisorTest {

    @Test
    public void whenLargestDiv() throws IOException {
        LargestDivisor largestDivisor = new LargestDivisor();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_101_150\\src\\main\\java\\ru\\tasks\\task_148\\solution\\input.txt");
        fwInput.write("12 42");
        fwInput.close();
        String expected = largestDivisor.largestDiv();

        FileReader frOutput = new FileReader("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_101_150\\src\\main\\java\\ru\\tasks\\task_148\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String result = sc.next();

        assertThat(expected, is(result));
    }
}
