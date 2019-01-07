package task_773.solution;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 10.07.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class GulliverTest {

    @Test
    public void whenTestFirstVersion() throws IOException {
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_751_800\\src\\main\\java\\task_773\\solution\\input.txt");
        fwInput.write("2 2");
        fwInput.close();

        String result = new Gulliver().result(new Gulliver().arr());
        assertThat(result, is("8"));
    }

    @Test
    public void whenTestSecondVersion() throws IOException {
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_751_800\\src\\main\\java\\task_773\\solution\\input.txt");
        fwInput.write("12 4");
        fwInput.close();

        String result = new Gulliver().result(new Gulliver().arr());
        assertThat(result, is("576"));
    }
}
