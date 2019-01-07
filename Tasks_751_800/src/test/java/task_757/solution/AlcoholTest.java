package task_757.solution;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 31.08.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class AlcoholTest {

    @Test
    public void whenNumberOfAtoms2x6x1() throws IOException {
        Alcohol alcohol = new Alcohol();
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_751_800\\src\\main\\java\\task_757\\solution\\input.txt");
        input.write("2 6 1");
        input.close();
        int c = alcohol.carbon(alcohol.arr());
        int h = alcohol.hydrogen(alcohol.arr());
        int o = alcohol.oxygen(alcohol.arr());
        String result = alcohol.result(c, h, o);
        String expected = "1";
        assertThat(result, is(expected));
    }

    @Test
    public void whenNumberOfAtoms10x5x12() throws IOException {
        Alcohol alcohol = new Alcohol();
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_751_800\\src\\main\\java\\task_757\\solution\\input.txt");
        input.write("10 5 12");
        input.close();
        int c = alcohol.carbon(alcohol.arr());
        int h = alcohol.hydrogen(alcohol.arr());
        int o = alcohol.oxygen(alcohol.arr());
        String result = alcohol.result(c, h, o);
        String expected = "0";
        assertThat(result, is(expected));
    }

    @Test
    public void whenNumberOfAtoms18x35x3() throws IOException {
        Alcohol alcohol = new Alcohol();
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_751_800\\src\\main\\java\\task_757\\solution\\input.txt");
        input.write("18 35 3");
        input.close();
        int c = alcohol.carbon(alcohol.arr());
        int h = alcohol.hydrogen(alcohol.arr());
        int o = alcohol.oxygen(alcohol.arr());
        String result = alcohol.result(c, h, o);
        String expected = "3";
        assertThat(result, is(expected));
    }
}
