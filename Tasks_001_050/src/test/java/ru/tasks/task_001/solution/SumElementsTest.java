package ru.tasks.task_001.solution;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 23.01.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class SumElementsTest {

    @Test
    public void sumOfElementsFromInput() throws IOException {
        SumElements sumElements = new SumElements();
        String expected = sumElements.sumElemFromFiles();
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_001\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String output = sc.nextLine();
        Assert.assertThat(expected, is(output));
    }
}
