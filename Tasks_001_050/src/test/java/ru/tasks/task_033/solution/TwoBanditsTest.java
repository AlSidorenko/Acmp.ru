package ru.tasks.task_033.solution;

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
public class TwoBanditsTest {

    @Test
    public void whenJointShooting() throws IOException {
        TwoBandits twoBandits = new TwoBandits();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_033\\solution\\input.txt");
        fwInput.write("4 7");
        fwInput.close();
        String expected = twoBandits.result(twoBandits.arrInt());
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_033\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String output = sc.nextLine();
        assertThat(expected, is(output));
    }
}
