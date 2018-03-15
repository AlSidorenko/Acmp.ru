package ru.tasks.task_081.solution;

import org.junit.Test;

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created on 15.03.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class WatermelonTest {

    @Test
    public void whenSortArray() throws IOException {
        Watermelon wmln = new Watermelon();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_081\\solution\\input.txt");
        fwInput.write("5\r\n");
        fwInput.write("5 1 6 5 9");
        fwInput.close();
        String expected = wmln.result(wmln.watermelons());
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_081\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String result = sc.nextLine();
        assertThat(expected, is(result));
    }
}
