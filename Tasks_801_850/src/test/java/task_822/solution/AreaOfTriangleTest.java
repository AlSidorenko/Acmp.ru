package task_822.solution;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 24.09.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class AreaOfTriangleTest {

    @Test
    public void whenAreaOfTriangleFirstCondition() throws IOException {
        AreaOfTriangle areaOfTriangle = new AreaOfTriangle();
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_801_850\\src\\main\\java\\task_822\\solution\\input.txt");
        input.write("2 1 2 4 6 1");
        input.close();
        String result = areaOfTriangle.result(areaOfTriangle.arr());
        String expected = "6.0";
        assertThat(result, is(expected));
    }

    @Test
    public void whenAreaOfTriangleSecondCondition() throws IOException {
        AreaOfTriangle areaOfTriangle = new AreaOfTriangle();
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_801_850\\src\\main\\java\\task_822\\solution\\input.txt");
        input.write("0 0 0 3 3 0");
        input.close();
        String result = areaOfTriangle.result(areaOfTriangle.arr());
        String expected = "4.5";
        assertThat(result, is(expected));
    }
}
