package ru.tasks.task_021.solution;

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
public class SalaryTest {

    @Test
    public void firstCondition() throws IOException {
        Salary salary = new Salary();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_021\\solution\\input.txt");
        fwInput.write("100 500 1000");
        fwInput.close();
        String expected = salary.result(salary.arrInt());
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_021\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String output = sc.next();
        assertThat(expected, is(output));
    }

    @Test
    public void secondCondition() throws IOException {
        Salary salary = new Salary();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_021\\solution\\input.txt");
        fwInput.write("36 11 20");
        fwInput.close();
        String expected = salary.result(salary.arrInt());
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_021\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String output = sc.next();
        assertThat(expected, is(output));
    }
}
