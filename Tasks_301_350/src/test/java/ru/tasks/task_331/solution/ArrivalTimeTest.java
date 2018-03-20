package ru.tasks.task_331.solution;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created on 17.03.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class ArrivalTimeTest {

    @Test
    public void whenFirstCondition() throws IOException {
        ArrivalTime at = new ArrivalTime();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_301_350\\src\\main\\java\\ru\\tasks\\task_331\\solution\\input.txt");
        fwInput.write("00:00\r\n");
        fwInput.write("10 10");
        fwInput.close();
        String expected = at.result();

        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_301_350\\src\\main\\java\\ru\\tasks\\task_331\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String result = sc.nextLine();

        assertThat(expected, is(result));
    }

    @Test
    public void whenSecondCondition() throws IOException {
        ArrivalTime at = new ArrivalTime();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_301_350\\src\\main\\java\\ru\\tasks\\task_331\\solution\\input.txt");
        fwInput.write("01:02\r\n");
        fwInput.write("4 6");
        fwInput.close();
        String expected = at.result();

        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_301_350\\src\\main\\java\\ru\\tasks\\task_331\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String result = sc.nextLine();

        assertThat(expected, is(result));
    }

    @Test
    public void whenThirdCondition() throws IOException {
        ArrivalTime at = new ArrivalTime();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_301_350\\src\\main\\java\\ru\\tasks\\task_331\\solution\\input.txt");
        fwInput.write("11:00\r\n");
        fwInput.write("22 0");
        fwInput.close();
        String expected = at.result();

        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_301_350\\src\\main\\java\\ru\\tasks\\task_331\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String result = sc.nextLine();

        assertThat(expected, is(result));
    }
}
