package ru.tasks.task_106.solution;

import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created on 12.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class CoinsTest {

    @Test
    public void whenCoinsTurn() throws IOException {
        Coins coins = new Coins();
        StringBuilder sb = new StringBuilder();
        sb.append("5\r");
        sb.append("1\r");
        sb.append("0\r");
        sb.append("1\r");
        sb.append("1\r");
        sb.append("0");
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_101_150\\src\\main\\java\\ru\\tasks\\task_106\\solution\\input.txt");
        fwInput.write(sb.toString());
        fwInput.close();
        String expected = coins.result(coins.arrStr());

        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_101_150\\src\\main\\java\\ru\\tasks\\task_106\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String output = sc.next();

        assertThat(expected, is(output));
    }
}
