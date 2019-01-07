package ru.tasks.task_691;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 05.12.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class BusNumbersTest {

    @Test
    public void whenCheckBusNumber() throws IOException {
        BusNumbers busNumbers = new BusNumbers();
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_651_700\\src\\main\\java\\ru\\tasks\\task_691\\input.txt");
        input.write("5\nP204BT\nX182YZ\na216bc\nA216BC\nABC216");
        input.close();
        String result = busNumbers.result(busNumbers.arr());
        String expected = "Yes\nNo\nNo\nYes\nNo\n";
        assertThat(result, is(expected));
    }
}
