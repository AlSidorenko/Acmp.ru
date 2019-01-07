package task_903.solution;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 11.06.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class BeadsTest {

    @Test
    public void whenTestBeads() throws IOException {
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\Acmp.ru\\" +
                "Tasks_901_950\\src\\main\\java\\task_903\\solution\\input.txt");
        fwInput.write("3");
        fwInput.close();

        String result = new Beads().result();
        String expected = "4";

        assertThat(result, is(expected));
    }
}
