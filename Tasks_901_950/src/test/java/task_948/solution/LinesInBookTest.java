package task_948.solution;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 13.09.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class LinesInBookTest {

    @Test
    public void whenAmount50NumberLine1() throws IOException {
        LinesInBook linesInBook = new LinesInBook();
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_901_950\\src\\main\\java\\task_948\\solution\\input.txt");
        input.write("50 1");
        input.close();
        int page = linesInBook.numbOfPage(linesInBook.arr());
        int line = linesInBook.numbOfLine(linesInBook.arr());
        String result = linesInBook.result(page, line);
        String expected = "1 1";
        assertThat(result, is(expected));
    }

    @Test
    public void whenAmount20NumberLine25() throws IOException {
        LinesInBook linesInBook = new LinesInBook();
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_901_950\\src\\main\\java\\task_948\\solution\\input.txt");
        input.write("20 25");
        input.close();
        int page = linesInBook.numbOfPage(linesInBook.arr());
        int line = linesInBook.numbOfLine(linesInBook.arr());
        String result = linesInBook.result(page, line);
        String expected = "2 5";
        assertThat(result, is(expected));
    }

    @Test
    public void whenAmount15NumberLine43() throws IOException {
        LinesInBook linesInBook = new LinesInBook();
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_901_950\\src\\main\\java\\task_948\\solution\\input.txt");
        input.write("15 43");
        input.close();
        int page = linesInBook.numbOfPage(linesInBook.arr());
        int line = linesInBook.numbOfLine(linesInBook.arr());
        String result = linesInBook.result(page, line);
        String expected = "3 13";
        assertThat(result, is(expected));
    }
}
