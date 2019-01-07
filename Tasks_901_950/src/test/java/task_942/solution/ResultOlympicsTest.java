package task_942.solution;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 05.07.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class ResultOlympicsTest {

    @Test
    public void whenWinnerOfOlympicFirst() throws IOException {
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_901_950\\src\\main\\java\\task_942\\solution\\input.txt");
        fwInput.write("3\n40 30 60");
        fwInput.close();
        String result = new ResultOlympics().init();
        assertThat(result, is("1"));
    }

    @Test
    public void whenWinnerOfOlympicSecond() throws IOException {
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_901_950\\src\\main\\java\\task_942\\solution\\input.txt");
        fwInput.write("4\n10 20 30 40");
        fwInput.close();
        String result = new ResultOlympics().init();
        assertThat(result, is("1"));
    }
}
