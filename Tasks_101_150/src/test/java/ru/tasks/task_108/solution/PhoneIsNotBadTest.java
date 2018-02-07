package ru.tasks.task_108.solution;

import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created on 07.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class PhoneIsNotBadTest {

    @Test
    public void whenMessagePassing() throws IOException {
        PhoneIsNotBad phone = new PhoneIsNotBad();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_101_150\\src\\main\\java\\ru\\tasks\\task_108\\solution\\input.txt");
        fwInput.write("5");
        fwInput.close();
        String expected = phone.message();
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_101_150\\src\\main\\java\\ru\\tasks\\task_108\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String output = sc.nextLine();
        assertThat(expected, is(output));
    }
}
