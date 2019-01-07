package ru.tasks.task_062.solution.version_001;

import org.junit.Test;

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created on 04.04.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class CellsTest {

    @Test
    public void whenFirstCondition() throws IOException {
        Cells cell = new Cells();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_062\\solution\\input.txt");
        fwInput.write("C3");
        fwInput.close();
        String expected = cell.result(cell.item());

        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_062\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String result = sc.next();

        assertThat(expected, is(result));
    }

    @Test
    public void whenSecondCondition() throws IOException {
        Cells cell = new Cells();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_062\\solution\\input.txt");
        fwInput.write("G8");
        fwInput.close();
        String expected = cell.result(cell.item());

        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_062\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String result = sc.next();

        assertThat(expected, is(result));
    }
}
