package ru.tasks.task_147;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 10.01.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class FibonacciNumbersTest {

    @Test
    public void whenNumberFibonacci7() throws IOException {
        FibonacciNumbers fibonacci = new FibonacciNumbers();
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_101_150\\src\\main\\java\\ru\\tasks\\task_147\\input.txt");
        input.write("7");
        input.close();
        String result = fibonacci.result(fibonacci.numb());
        String exception = "13";
        assertThat(result, is(exception));
    }
}
