package ru.tasks.task_597.solution;

import org.junit.Test;

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created on 15.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class AliensTest {

    @Test
    public void firstCondition() throws IOException {
        Aliens aliens = new Aliens();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_551_600\\src\\main\\java\\ru\\tasks\\task_597\\solution\\input.txt");
        fwInput.write("10 10 10");
        fwInput.close();
        String expected = aliens.result(aliens.arrInputInt());
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_551_600\\src\\main\\java\\ru\\tasks\\task_597\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String output = sc.next();
        assertThat(expected, is(output));
    }

    @Test
    public void secondCondition() throws IOException {
        Aliens aliens = new Aliens();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_551_600\\src\\main\\java\\ru\\tasks\\task_597\\solution\\input.txt");
        fwInput.write("10 3 4");
        fwInput.close();
        String expected = aliens.result(aliens.arrInputInt());
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_551_600\\src\\main\\java\\ru\\tasks\\task_597\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String output = sc.next();
        assertThat(expected, is(output));
    }
}
