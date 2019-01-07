package ru.tasks.task_678.solution;

import org.junit.Test;

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created on 04.04.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class ThimblesTest {

    @Test
    public void whenFirstCondition() throws IOException {
        Thimbles thimble = new Thimbles();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_651_700\\src\\main\\java\\ru\\tasks\\task_678\\solution\\input.txt");
        fwInput.write("CBABCACCC");
        fwInput.close();
        String expected = thimble.result(thimble.arr());

        FileReader frOutput = new FileReader("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_651_700\\src\\main\\java\\ru\\tasks\\task_678\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String result = sc.next();

        assertThat(expected, is(result));
    }
}
