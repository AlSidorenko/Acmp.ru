package ru.tasks.task_685.solution;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created on 17.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class GoldenSandTest {

    @Test
    public void whenConditionPalindrome() throws IOException {
        GoldenSand goldenSand = new GoldenSand();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_651_700\\src\\main\\java\\ru\\tasks\\task_685\\solution\\input.txt");
        fwInput.write("1 2 3 3 2 1");
        fwInput.close();
        String expected = goldenSand.result(goldenSand.arr());
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_651_700\\src\\main\\java\\ru\\tasks\\task_685\\solution\\output.txt"));
        String output = sc.nextLine();
        assertThat(expected, is(output));
    }
}
