package task_854.solution;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 06.09.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class AirConditionerTest {

    @Test
    public void whenConditionHeat() throws IOException {
        AirConditioner airConditioner = new AirConditioner();
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_851_900\\src\\main\\java\\task_854\\solution\\input.txt");
        input.write("10 20\n");
        input.write("heat");
        input.close();
        String result = airConditioner.result(airConditioner.read());
        String expected = "20";
        assertThat(result, is(expected));
    }

    @Test
    public void whenConditionFreeze() throws IOException {
        AirConditioner airConditioner = new AirConditioner();
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_851_900\\src\\main\\java\\task_854\\solution\\input.txt");
        input.write("10 20\n");
        input.write("freeze");
        input.close();
        String result = airConditioner.result(airConditioner.read());
        String expected = "10";
        assertThat(result, is(expected));
    }
}
