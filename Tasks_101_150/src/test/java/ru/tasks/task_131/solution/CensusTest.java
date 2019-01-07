package ru.tasks.task_131.solution;

import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 18.04.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class CensusTest {

    @Test
    public void whenMostEldestMan () throws IOException {
        Census c = new Census();
        StringBuilder sb = new StringBuilder();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_101_150\\src\\main\\java\\ru\\tasks\\task_131\\solution\\input.txt");
        fwInput.write("4\n25 1\n70 1\n100 0\n3 1");
        fwInput.close();
        String expected = c.result(c.censuses(), c.item(c.censuses()));

        FileReader frOutput = new FileReader("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_101_150\\src\\main\\java\\ru\\tasks\\task_131\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String result = sc.next();

        assertThat(expected, is(result));
    }
}
