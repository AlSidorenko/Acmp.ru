package ru.tasks.task_092.solution;

import org.junit.Test;

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created on 11.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class CranesTest {

    @Test
    public void whenFirstCondition() throws IOException {
        Cranes cranes = new Cranes();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_092\\solution\\input.txt");
        fwInput.write("6");
        fwInput.close();
        String exception = cranes.result(cranes.numb());
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_092\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String output = sc.nextLine();
        assertThat(exception, is(output));
    }

    @Test
    public void whenSecondCondition() throws IOException {
        Cranes cranes = new Cranes();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_092\\solution\\input.txt");
        fwInput.write("24");
        fwInput.close();
        String exception = cranes.result(cranes.numb());
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_092\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String output = sc.nextLine();
        assertThat(exception, is(output));
    }

    @Test
    public void whenThirdCondition() throws IOException {
        Cranes cranes = new Cranes();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_092\\solution\\input.txt");
        fwInput.write("60");
        fwInput.close();
        String exception = cranes.result(cranes.numb());
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_092\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String output = sc.nextLine();
        assertThat(exception, is(output));
    }
}
