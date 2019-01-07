package task_907.solution;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 30.07.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class MouseTest {

    @Test
    public void whenFirstCondition() throws IOException {
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_901_950\\src\\main\\java\\task_907\\solution\\input.txt");
        input.write("4 7 2");
        input.close();
        String result = new Mouse().result();
        String expected = "YES";
        assertThat(result, is(expected));
    }

    @Test
    public void whenSecondCondition() throws IOException {
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_901_950\\src\\main\\java\\task_907\\solution\\input.txt");
        input.write("4 7 3");
        input.close();
        String result = new Mouse().result();
        String expected = "NO";
        assertThat(result, is(expected));
    }
}
