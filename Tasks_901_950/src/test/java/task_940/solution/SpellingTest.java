package task_940.solution;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 10.09.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class SpellingTest {

    @Test
    public void whenDeleteFourthLetter() throws IOException {
        Spelling spelling = new Spelling();
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_901_950\\src\\main\\java\\task_940\\solution\\input.txt");
        input.write("4 MISTSPELL");
        input.close();
        String text = spelling.arr()[1];
        int pos = Integer.parseInt(spelling.arr()[0]);
        String result = spelling.removeCharAt(text, pos);
        String expected = "MISSPELL";
        assertThat(result, is(expected));
    }

    @Test
    public void whenDeleteSecondLetter() throws IOException {
        Spelling spelling = new Spelling();
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_901_950\\src\\main\\java\\task_940\\solution\\input.txt");
        input.write("2 ABC");
        input.close();
        String text = spelling.arr()[1];
        int pos = Integer.parseInt(spelling.arr()[0]);
        String result = spelling.removeCharAt(text, pos);
        String expected = "AC";
        assertThat(result, is(expected));
    }
}
