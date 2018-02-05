package ru.tasks.task_002.solution;

import static org.hamcrest.core.Is.is;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 23.01.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class SumOfNumberTest {

    @Test
    public void sumOfNumberFromInput() throws IOException {
        SumOfNumber sumOfNumber = new SumOfNumber();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject" +
                "\\Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_002\\solution\\input.txt");
        fwInput.write("5");
        fwInput.close();
        String expected = sumOfNumber.sumOfNumbFromFile();
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_002\\solution\\output.txt");
        Scanner scan = new Scanner(frOutput);
        String output = scan.next();
        Assert.assertThat(output, is(expected));
    }
}
