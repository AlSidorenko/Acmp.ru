package ru.tasks.task_539.solution;

import org.junit.Test;

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created on 09.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class PieTest {

    @Test
    public void firstCondition() throws IOException {
        Pie pie = new Pie();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_501_550\\src\\main\\java\\ru\\tasks\\task_539\\solution\\input.txt");
        fwInput.write("2");
        fwInput.close();
        String expected = pie.result();
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_501_550\\src\\main\\java\\ru\\tasks\\task_539\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String output = sc.next();
        assertThat(expected, is(output));
    }

    @Test
    public void secondCondition() throws IOException {
        Pie pie = new Pie();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_501_550\\src\\main\\java\\ru\\tasks\\task_539\\solution\\input.txt");
        fwInput.write("3");
        fwInput.close();
        String expected = pie.result();
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_501_550\\src\\main\\java\\ru\\tasks\\task_539\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String output = sc.next();
        assertThat(expected, is(output));
    }
}
