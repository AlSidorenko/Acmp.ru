package ru.tasks.task_312.solution;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created on 16.03.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class ArithmeticProgressionTest {

    @Test
    public void whenSearchItemOfProgression() throws IOException {
        ArithmeticProgression ap = new ArithmeticProgression();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_301_350\\src\\main\\java\\ru\\tasks\\task_312\\solution\\input.txt");
        fwInput.write("1 5 3");
        fwInput.close();
        String expected = ap.result();

        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_301_350\\src\\main\\java\\ru\\tasks\\task_312\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String result = sc.next();
        assertThat(expected, is(result));
    }
}
