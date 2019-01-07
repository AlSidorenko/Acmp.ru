package task_844;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 07.01.2019.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class FieldsTest {

    public FieldsTest() throws IOException { }

    Fields field = new Fields();
    FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
            "Acmp.ru\\Tasks_801_850\\src\\main\\java\\task_844\\input.txt");

    @Test
    public void whenCheckField1x4() throws IOException {
        input.write("1 4");
        input.close();
        String result = field.result(field.arr());
        String expected = "2";
        assertThat(result, is(expected));
    }

    @Test
    public void whenCheckField2x8() throws IOException {
        input.write("2 8");
        input.close();
        String result = field.result(field.arr());
        String expected = "4";
        assertThat(result, is(expected));
    }

    @Test
    public void whenCheckField15x42() throws IOException {
        input.write("15 42");
        input.close();
        String result = field.result(field.arr());
        String expected = "0";
        assertThat(result, is(expected));
    }
}
