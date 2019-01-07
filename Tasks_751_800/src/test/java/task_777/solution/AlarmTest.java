package task_777.solution;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 02.09.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class AlarmTest {

    @Test
    public void whenSleep10Wake12() throws IOException {
        Alarm alarm = new Alarm();
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_751_800\\src\\main\\java\\task_777\\solution\\input.txt");
        input.write("10 12");
        input.close();
        String result = alarm.result(alarm.arr());
        String expected = "2";
        assertThat(result, is(expected));
    }

    @Test
    public void whenSleep9Wake6() throws IOException {
        Alarm alarm = new Alarm();
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_751_800\\src\\main\\java\\task_777\\solution\\input.txt");
        input.write("9 6");
        input.close();
        String result = alarm.result(alarm.arr());
        String expected = "9";
        assertThat(result, is(expected));
    }
}
