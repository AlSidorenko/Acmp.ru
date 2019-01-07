package task_754.solution;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created on 18.07.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class FatMenTest {

    @Test
    public void whenFirstCondition() throws IOException {
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_751_800\\src\\main\\java\\task_754\\solution\\input.txt");
        input.write("98 106 214");
        input.close();
        String result = new FatMen().result(new FatMen().arr());
        String expected = "214";
        assertThat(result, is(expected));
    }

    @Test
    public void whenSecondCondition() throws IOException {
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_751_800\\src\\main\\java\\task_754\\solution\\input.txt");
        input.write("100 100 100");
        input.close();
        String result = new FatMen().result(new FatMen().arr());
        String expected = "100";
        assertThat(result, is(expected));
    }

    @Test
    public void whenThirdCondition() throws IOException {
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_751_800\\src\\main\\java\\task_754\\solution\\input.txt");
        input.write("93 500 1000");
        input.close();
        String result = new FatMen().result(new FatMen().arr());
        String expected = "Error";
        assertThat(result, is(expected));
    }
}
