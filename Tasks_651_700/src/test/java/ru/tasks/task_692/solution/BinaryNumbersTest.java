package ru.tasks.task_692.solution;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created on 19.07.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class BinaryNumbersTest {

    @Test
    public void whenFirstTest() throws IOException {
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_651_700\\src\\main\\java\\ru\\tasks\\task_692\\solution\\input.txt");
        input.write("1024");
        input.close();
        String result = new BinaryNumbers().result(new BinaryNumbers().number());
        String expected = "YES";

        assertThat(result, is(expected));
    }

    @Test
    public void whenSecondTest() throws IOException {
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_651_700\\src\\main\\java\\ru\\tasks\\task_692\\solution\\input.txt");
        input.write("23");
        input.close();
        String result = new BinaryNumbers().result(new BinaryNumbers().number());
        String expected = "NO";

        assertThat(result, is(expected));
    }
}
