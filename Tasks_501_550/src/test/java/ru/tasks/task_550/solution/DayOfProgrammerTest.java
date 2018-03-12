package ru.tasks.task_550.solution;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created on 12.03.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class DayOfProgrammerTest {

    @Test
    public void whenNotLeapYear () throws IOException {
        DayOfProgrammer day = new DayOfProgrammer();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_501_550\\src\\main\\java\\ru\\tasks\\task_550\\solution\\input.txt");
        fwInput.write("2000");
        fwInput.close();
        String expected = day.check(day.year());
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_501_550\\src\\main\\java\\ru\\tasks\\task_550\\solution\\output.txt"));
        String result = sc.nextLine();
        assertThat(expected, is(result));
    }

    @Test
    public void whenLeapYear () throws IOException {
        DayOfProgrammer day = new DayOfProgrammer();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_501_550\\src\\main\\java\\ru\\tasks\\task_550\\solution\\input.txt");
        fwInput.write("2009");
        fwInput.close();
        String expected = day.check(day.year());
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_501_550\\src\\main\\java\\ru\\tasks\\task_550\\solution\\output.txt"));
        String result = sc.nextLine();
        assertThat(expected, is(result));
    }
}
