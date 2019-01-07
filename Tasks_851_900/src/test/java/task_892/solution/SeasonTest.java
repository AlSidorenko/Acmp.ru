package task_892.solution;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 16.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class SeasonTest {

    @Test
    public void whenNumber1ResultWinter() throws IOException {
        Season season = new Season();
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_851_900\\src\\main\\java\\task_892\\solution\\input.txt");
        input.write("1");
        input.close();
        String result = season.check(season.monthNumber());
        String expected = "Winter";
        assertThat(result, is(expected));
    }

    @Test
    public void whenNumber12ResultWinter() throws IOException {
        Season season = new Season();
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_851_900\\src\\main\\java\\task_892\\solution\\input.txt");
        input.write("12");
        input.close();
        String result = season.check(season.monthNumber());
        String expected = "Winter";
        assertThat(result, is(expected));
    }

    @Test
    public void whenNumber10ResultAutumn() throws IOException {
        Season season = new Season();
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_851_900\\src\\main\\java\\task_892\\solution\\input.txt");
        input.write("10");
        input.close();
        String result = season.check(season.monthNumber());
        String expected = "Autumn";
        assertThat(result, is(expected));
    }
}
