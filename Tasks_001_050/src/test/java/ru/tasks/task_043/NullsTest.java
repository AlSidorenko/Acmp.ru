package ru.tasks.task_043;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 06.12.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class NullsTest {

    @Test
    public void whenCheckNulls() throws IOException {
        Nulls nulls = new Nulls();
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_043\\input.txt");
        input.write("00101110000110");
        input.close();
        String result = nulls.sumOfNulls(nulls.arrChar());
        String expected = "4";
        assertThat(result, is(expected));
    }
}
