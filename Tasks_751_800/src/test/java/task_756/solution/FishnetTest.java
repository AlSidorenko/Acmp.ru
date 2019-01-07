package task_756.solution;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 27.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class FishnetTest {

    @Test
    public void whenFishnet2x2() throws IOException {
        Fishnet fishnet = new Fishnet();
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_751_800\\src\\main\\java\\task_756\\solution\\input.txt");
        input.write("2 2");
        input.close();
        String result = fishnet.result(fishnet.arr());
        String expected = "1";
        assertThat(result, is(expected));
    }

    @Test
    public void whenFishnet2x3() throws IOException {
        Fishnet fishnet = new Fishnet();
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_751_800\\src\\main\\java\\task_756\\solution\\input.txt");
        input.write("2 3");
        input.close();
        String result = fishnet.result(fishnet.arr());
        String expected = "2";
        assertThat(result, is(expected));
    }
}
