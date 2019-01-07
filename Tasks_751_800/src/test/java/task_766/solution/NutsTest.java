package task_766.solution;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 06.07.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class NutsTest {

    @Test
    public void whenFirstVersion() throws IOException {
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_751_800\\src\\main\\java\\task_766\\solution\\input.txt");
        fwInput.write("4 5 20");
        fwInput.close();
        String result = new Nuts().result(new Array().arr());
        assertThat(result, is("YES"));
    }

    @Test
    public void whenSecondVersion() throws IOException {
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_751_800\\src\\main\\java\\task_766\\solution\\input.txt");
        fwInput.write("4 5 21");
        fwInput.close();
        String result = new Nuts().result(new Array().arr());
        assertThat(result, is("NO"));
    }

    @Test
    public void whenThirdVersion() throws IOException {
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_751_800\\src\\main\\java\\task_766\\solution\\input.txt");
        fwInput.write("3 2 1");
        fwInput.close();
        String result = new Nuts().result(new Array().arr());
        assertThat(result, is("YES"));
    }
}
