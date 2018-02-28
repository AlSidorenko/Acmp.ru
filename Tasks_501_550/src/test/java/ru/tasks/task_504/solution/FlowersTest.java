package ru.tasks.task_504.solution;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created on 28.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class FlowersTest {

    @Test
    public void whenFirstCondition() throws IOException {
        Flowers flowers = new Flowers();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_501_550\\src\\main\\java\\ru\\tasks\\task_504\\solution\\input.txt");
        fwInput.write("1");
        fwInput.close();
        String expected = flowers.result(flowers.num());
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_501_550\\src\\main\\java\\ru\\tasks\\task_504\\solution\\output.txt"));
        String result = sc.next();
        assertThat(expected, is(result));
    }

    @Test
    public void whenSecondCondition() throws IOException {
        Flowers flowers = new Flowers();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_501_550\\src\\main\\java\\ru\\tasks\\task_504\\solution\\input.txt");
        fwInput.write("5");
        fwInput.close();
        String expected = flowers.result(flowers.num());
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_501_550\\src\\main\\java\\ru\\tasks\\task_504\\solution\\output.txt"));
        String result = sc.next();
        assertThat(expected, is(result));
    }
}
