package ru.tasks.task_022;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 30.10.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class UnitsTest {

    Units unit = new Units();

    FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
            "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_022\\input.txt");

    public UnitsTest() throws IOException {
    }

    @Test
    public void whenCheckUnitsNumb5() throws IOException {
        input.write("5");
        input.close();
        String result = unit.result(unit.numb());
        String expected = "2";
        assertThat(result, is(expected));
    }

    @Test
    public void whenCheckUnitsNumb7() throws IOException {
        input.write("7");
        input.close();
        String result = unit.result(unit.numb());
        String expected = "3";
        assertThat(result, is(expected));
    }
}
