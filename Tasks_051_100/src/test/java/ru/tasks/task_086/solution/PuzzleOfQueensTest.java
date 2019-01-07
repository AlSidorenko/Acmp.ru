package ru.tasks.task_086.solution;

import org.junit.Test;

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created on 21.03.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class PuzzleOfQueensTest {

    @Test
    public void whenThreeByThreeBoard() throws IOException {
        PuzzleOfQueens pq = new PuzzleOfQueens();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_086\\solution\\input.txt");
        fwInput.write("3");
        fwInput.close();
        String expected = pq.result();
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_086\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String result = sc.next();
        assertThat(expected, is(result));
    }

    @Test
    public void whenFiveByFiveBoard() throws IOException {
        PuzzleOfQueens pq = new PuzzleOfQueens();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_086\\solution\\input.txt");
        fwInput.write("5");
        fwInput.close();
        String expected = pq.result();
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_086\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String result = sc.next();
        assertThat(expected, is(result));
    }
}
