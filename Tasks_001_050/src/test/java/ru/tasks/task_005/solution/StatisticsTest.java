package ru.tasks.task_005.solution;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
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
    public void whenStatisticsScore() throws IOException {
        Statistics statistics = new Statistics();
        boolean expected = statistics.init();
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_005\\solution\\output.txt");
        Scanner scanner = new Scanner(frOutput);
        boolean output = scanner.hasNextLine();
        assertThat(expected, is(output));
    }
}
