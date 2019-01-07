package task_818.solution;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 17.09.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class BoilingTeaTest {

    @Test
    public void whenTee_1Teapot_1() throws IOException {
        BoilingTea boilingTea = new BoilingTea();
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_801_850\\src\\main\\java\\task_818\\solution\\input.txt");
        input.write("1\n");
        input.write("1");
        input.close();
        String result = boilingTea.result(boilingTea.arr());
        String expected = "1";
        assertThat(result, is(expected));
    }

    @Test
    public void whenTee_3Teapot_9() throws IOException {
        BoilingTea boilingTea = new BoilingTea();
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_801_850\\src\\main\\java\\task_818\\solution\\input.txt");
        input.write("3\n");
        input.write("2 5 4");
        input.close();
        String result = boilingTea.result(boilingTea.arr());
        String expected = "9";
        assertThat(result, is(expected));
    }
}
