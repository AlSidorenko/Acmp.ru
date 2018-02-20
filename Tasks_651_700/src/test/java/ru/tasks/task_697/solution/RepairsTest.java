package ru.tasks.task_697.solution;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created on 20.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class RepairsTest {

    @Test
    public void firstCondition() throws IOException {
        Repairs repairs = new Repairs();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_651_700\\src\\main\\java\\ru\\tasks\\task_697\\solution\\input.txt");
        fwInput.write("8 8 2");
        fwInput.close();
        String expected = repairs.result(repairs.arrInt());
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_651_700\\src\\main\\java\\ru\\tasks\\task_697\\solution\\output.txt"));
        String result = sc.next();
        assertThat(expected, is(result));
    }

    @Test
    public void secondCondition() throws IOException {
        Repairs repairs = new Repairs();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_651_700\\src\\main\\java\\ru\\tasks\\task_697\\solution\\input.txt");
        fwInput.write("1 1 3");
        fwInput.close();
        String expected = repairs.result(repairs.arrInt());
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_651_700\\src\\main\\java\\ru\\tasks\\task_697\\solution\\output.txt"));
        String result = sc.next();
        assertThat(expected, is(result));
    }
}
