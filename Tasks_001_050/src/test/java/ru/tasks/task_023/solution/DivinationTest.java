package ru.tasks.task_023.solution;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created on 01.03.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class DivinationTest {

    @Test
    public void whenFirstCondition() throws IOException {
        Divination divination = new Divination();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_023\\solution\\input.txt");
        fwInput.write("6");
        fwInput.close();
        String expected = divination.result();
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_023\\solution\\output.txt"));
        String result = sc.next();
        assertThat(expected, is(result));
    }

    @Test
    public void whenSecondCondition() throws IOException {
        Divination divination = new Divination();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_023\\solution\\input.txt");
        fwInput.write("10");
        fwInput.close();
        String expected = divination.result();
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_023\\solution\\output.txt"));
        String result = sc.next();
        assertThat(expected, is(result));
    }
}
