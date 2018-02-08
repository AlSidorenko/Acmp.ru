package ru.tasks.task_195.solution;

import org.junit.Test;

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created on 08.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class EniaTest {

    @Test
    public void firstCondition() throws IOException {
        Enia enia = new Enia();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_151_200\\src\\main\\java\\ru\\tasks\\task_195\\solution\\input.txt");
        fwInput.write("5 2 3");
        fwInput.close();
        String expected = enia.result(enia.arrInt());
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_151_200\\src\\main\\java\\ru\\tasks\\task_195\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String output = sc.next();
        assertThat(expected, is(output));
    }

    @Test
    public void secondCondition() throws IOException {
        Enia enia = new Enia();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_151_200\\src\\main\\java\\ru\\tasks\\task_195\\solution\\input.txt");
        fwInput.write("14 23 5");
        fwInput.close();
        String expected = enia.result(enia.arrInt());
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_151_200\\src\\main\\java\\ru\\tasks\\task_195\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String output = sc.next();
        assertThat(expected, is(output));
    }
}
