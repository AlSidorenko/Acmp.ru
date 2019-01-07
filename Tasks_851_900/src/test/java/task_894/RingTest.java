package task_894;

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
public class RingTest {

    @Test
    public void whenCheckResultRadiusInnerCircle() throws IOException {
        Ring ring = new Ring();
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\Acmp.ru\\" +
                "Tasks_851_900\\src\\main\\java\\task_894\\input.txt");
        input.write("50.265482 5.0");
        input.close();
        String result = ring.result(ring.arr());
        String expected = "3,000";
        assertThat(result, is(expected));
    }
}
