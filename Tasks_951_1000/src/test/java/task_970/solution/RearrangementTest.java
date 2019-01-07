package task_970.solution;

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
public class RearrangementTest {

    @Test
    public void whenFirstCondition() throws IOException {
        Rearrangement rearrangement = new Rearrangement();
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_951_1000\\src\\main\\java\\task_970\\solution\\input.txt");
        input.write("3 5 2");
        input.close();
        String result = rearrangement.result(rearrangement.arr());
        String excepted = "YES";
        assertThat(result, is(excepted));
    }

    @Test
    public void whenSecondCondition() throws IOException {
        Rearrangement rearrangement = new Rearrangement();
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_951_1000\\src\\main\\java\\task_970\\solution\\input.txt");
        input.write("2 2 5");
        input.close();
        String result = rearrangement.result(rearrangement.arr());
        String excepted = "NO";
        assertThat(result, is(excepted));
    }

    @Test
    public void whenThirdCondition() throws IOException {
        Rearrangement rearrangement = new Rearrangement();
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_951_1000\\src\\main\\java\\task_970\\solution\\input.txt");
        input.write("2 2 4");
        input.close();
        String result = rearrangement.result(rearrangement.arr());
        String excepted = "YES";
        assertThat(result, is(excepted));
    }
}
