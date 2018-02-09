package ru.tasks.task_061.solution;

import org.junit.Test;

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created on 09.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class BasketballTest {

    @Test
    public void firstCondition() throws IOException {
        Basketball basketball = new Basketball();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_061\\solution\\input.txt");
        fwInput.write("26 17\r");
        fwInput.write("13 15\r");
        fwInput.write("19 11\r");
        fwInput.write("14 16");
        fwInput.close();
        String expected = basketball.result(basketball.arrInputStr());
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_061\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String output = sc.next();
        assertThat(expected, is(output));
    }

    @Test
    public void secondCondition() throws IOException {
        Basketball basketball = new Basketball();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_061\\solution\\input.txt");
        fwInput.write("14 15\r");
        fwInput.write("17 18\r");
        fwInput.write("20 20\r");
        fwInput.write("15 17");
        fwInput.close();
        String expected = basketball.result(basketball.arrInputStr());
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_061\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String output = sc.next();
        assertThat(expected, is(output));
    }

    @Test
    public void thirdCondition() throws IOException {
        Basketball basketball = new Basketball();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_061\\solution\\input.txt");
        fwInput.write("15 16\r");
        fwInput.write("18 17\r");
        fwInput.write("10 12\r");
        fwInput.write("14 12");
        fwInput.close();
        String expected = basketball.result(basketball.arrInputStr());
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_061\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String output = sc.next();
        assertThat(expected, is(output));
    }
}
