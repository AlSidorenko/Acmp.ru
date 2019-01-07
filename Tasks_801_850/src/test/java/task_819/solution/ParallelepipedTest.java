package task_819.solution;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 22.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class ParallelepipedTest {

    @Test
    public void firstCondition() throws IOException {
        Parallelepiped parallelepiped = new Parallelepiped();
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_801_850\\src\\main\\java\\task_819\\solution\\input.txt");
        input.write("1 1 1");
        input.close();

        String result = parallelepiped.result(parallelepiped.array());
        String exception = "6 1";
        assertThat(result, is(exception));
    }

    @Test
    public void secondCondition() throws IOException {
        Parallelepiped parallelepiped = new Parallelepiped();
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_801_850\\src\\main\\java\\task_819\\solution\\input.txt");
        input.write("2 3 4");
        input.close();

        String result = parallelepiped.result(parallelepiped.array());
        String exception = "52 24";
        assertThat(result, is(exception));
    }
}
