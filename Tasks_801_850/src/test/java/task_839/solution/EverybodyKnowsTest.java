package task_839.solution;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 14.09.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class EverybodyKnowsTest {

    @Test
    public void whenPollCompiledResult_11111101010011() throws IOException {
        EverybodyKnows everybodyKnows = new EverybodyKnows();
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_801_850\\src\\main\\java\\task_839\\solution\\input.txt");
        input.write("11111101010011");
        input.close();
        everybodyKnows.writeResult(everybodyKnows.result());
        String result = everybodyKnows.result();
        String expected = "NO";
        assertThat(result, is(expected));
    }

    @Test
    public void whenPollCompiledResult_11() throws IOException {
        EverybodyKnows everybodyKnows = new EverybodyKnows();
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_801_850\\src\\main\\java\\task_839\\solution\\input.txt");
        input.write("11");
        input.close();
        everybodyKnows.writeResult(everybodyKnows.result());
        String result = everybodyKnows.result();
        String expected = "YES";
        assertThat(result, is(expected));
    }
}
