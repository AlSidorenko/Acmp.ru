package task_850;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 25.10.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class HeronsTest {

    @Test
    public void whenCheckHerons() throws IOException {
        Herons herons = new Herons();
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_801_850\\src\\main\\java\\task_850\\input.txt");
        input.write("3 4");
        input.close();
        String result = herons.result();
        String expected = "2 3";
        assertThat(result, is(expected));
    }
}
