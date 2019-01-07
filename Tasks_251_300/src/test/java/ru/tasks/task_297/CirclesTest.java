package ru.tasks.task_297;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 21.11.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class CirclesTest {

    private Circles circles = new Circles();
    private String result, expected;
    private FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
            "Acmp.ru\\Tasks_251_300\\src\\main\\java\\ru\\tasks\\task_297\\input.txt");

    public CirclesTest() throws IOException {
    }

    @Test
    public void whenCheckResult157892() throws IOException {
        input.write("157892");
        input.close();
        result = circles.result(circles.str());
        expected = "3";
        assertThat(result, is(expected));
    }

    @Test
    public void whenCheckResult203516() throws IOException {
        input.write("203516");
        input.close();
        result = circles.result(circles.str());
        expected = "2";
        assertThat(result, is(expected));
    }

    @Test
    public void whenCheckResult409578() throws IOException {
        input.write("409578");
        input.close();
        result = circles.result(circles.str());
        expected = "4";
        assertThat(result, is(expected));
    }

    @Test
    public void whenCheckResult236271() throws IOException {
        input.write("236271");
        input.close();
        result = circles.result(circles.str());
        expected = "1";
        assertThat(result, is(expected));
    }
}
