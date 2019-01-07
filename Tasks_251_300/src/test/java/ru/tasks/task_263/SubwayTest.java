package ru.tasks.task_263;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 30.11.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class SubwayTest {

    private Subway subway = new Subway();
    private FileWriter input;

    {
        try {
            input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                    "Acmp.ru\\Tasks_251_300\\src\\main\\java\\ru\\tasks\\task_263\\input.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void whenCountStationsOfSubway10056() throws IOException {
        input.write("100 5 6");
        input.close();
        int first = subway.firstItem(subway.arr());
        int second = subway.secondItem(subway.arr());
        String result = subway.result(first, second);
        subway.fileWrite(result);
        assertThat(result, is("0"));
    }

    @Test
    public void whenCountStationsOfSubway1019() throws IOException {
        input.write("10 1 9");
        input.close();
        int first = subway.firstItem(subway.arr());
        int second = subway.secondItem(subway.arr());
        String result = subway.result(first, second);
        subway.fileWrite(result);
        assertThat(result, is("1"));
    }
}
