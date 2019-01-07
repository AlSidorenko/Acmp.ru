package ru.tasks.task_284.solution;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 01.06.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class SubArrayResultTest {

    @Test
    public void whenSubArray() throws IOException {
        SubArrayResult subArrayResult = new SubArrayResult();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_251_300\\src\\main\\java\\ru\\tasks\\task_284\\solution\\input.txt");
        fwInput.write("6\n1 2 3 4 5 6\n5\n1 1\n2 6\n3 4\n5 6\n2 4");
        fwInput.close();
        String result = new SubArrayResult().result(new Array().subArray(), new Array().arr());
        String expected = "1 \n2 3 4 5 6 \n3 4 \n5 6 \n2 3 4 \n";
        assertThat(result, is(expected));
    }
}
