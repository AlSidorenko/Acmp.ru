package ru.tasks.task_005.solution;

import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created on 25.01.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class StatisticsTest {

    @Test
    public void whenStatisticsScoreFive() throws IOException {
        Statistics statistics = new Statistics();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_005\\solution\\input.txt");
        fwInput.write("5\r");
        fwInput.write("4 16 19 31 2");
        fwInput.close();
        boolean expected = statistics.init();
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_005\\solution\\output.txt");
        Scanner scanner = new Scanner(frOutput);
        boolean output = scanner.hasNextLine();
        assertThat(expected, is(output));
    }

    @Test
    public void whenStatisticsScoreEight() throws IOException {
        Statistics statistics = new Statistics();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_005\\solution\\input.txt");
        fwInput.write("8\r");
        fwInput.write("29 4 7 12 15 17 24 1");
        fwInput.close();
        boolean expected = statistics.init();
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_005\\solution\\output.txt");
        Scanner scanner = new Scanner(frOutput);
        boolean output = scanner.hasNextLine();
        assertThat(expected, is(output));
    }
}
