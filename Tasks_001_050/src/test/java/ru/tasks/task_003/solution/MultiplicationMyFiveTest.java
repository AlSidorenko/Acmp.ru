package ru.tasks.task_003.solution;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 24.01.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class MultiplicationMyFiveTest {

    @Test
    public void whenSquaringNumbersWithLastDigitFive() throws IOException {
        MultiplicationByFive mult = new MultiplicationByFive();
        String expected = mult.result();
        FileReader flOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_003\\solution\\output.txt");
        Scanner sc = new Scanner(flOutput);
        String output = sc.next();
        assertThat(expected, is(output));
    }
}
