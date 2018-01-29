package ru.tasks.task_008.solution;

import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created on 29.01.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class ArithmeticTest {

    @Test
    public void whenDataIsSame() throws IOException {
        Arithmetic arithmetic = new Arithmetic();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_008\\solution\\input.txt");
        fwInput.write("8 54 432");
        fwInput.close();
        arithmetic.init();
        String expected = arithmetic.result();
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_008\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String output = sc.nextLine();
        assertThat(expected, is(output));
    }

    @Test
    public void whenDataIsDifferent() throws IOException {
        Arithmetic arithmetic = new Arithmetic();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_008\\solution\\input.txt");
        fwInput.write("16 19 777");
        fwInput.close();
        arithmetic.init();
        String expected = arithmetic.result();
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_008\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String output = sc.nextLine();
        assertThat(expected, is(output));
    }
}
