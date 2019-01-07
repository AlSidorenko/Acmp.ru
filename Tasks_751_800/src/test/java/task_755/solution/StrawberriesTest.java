package task_755.solution;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 18.07.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class StrawberriesTest {

    @Test
    public void whenFirstCondition() throws IOException {
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_751_800\\src\\main\\java\\task_755\\solution\\input.txt");
        fwInput.write("3 2 1");
        fwInput.close();
        String result = new Strawberries().result(new Strawberries().arr());
        String expected = "4";

        assertThat(result, is(expected));
    }

    @Test
    public void whenSecondCondition() throws IOException {
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_751_800\\src\\main\\java\\task_755\\solution\\input.txt");
        fwInput.write("12 13 5");
        fwInput.close();
        String result = new Strawberries().result(new Strawberries().arr());
        String expected = "20";

        assertThat(result, is(expected));
    }

    @Test
    public void whenThirdCondition() throws IOException {
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_751_800\\src\\main\\java\\task_755\\solution\\input.txt");
        fwInput.write("2 5 9");
        fwInput.close();
        String result = new Strawberries().result(new Strawberries().arr());
        String expected = "Impossible";

        assertThat(result, is(expected));
    }
}
