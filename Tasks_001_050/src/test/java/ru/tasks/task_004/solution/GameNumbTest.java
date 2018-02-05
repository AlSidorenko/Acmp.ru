package ru.tasks.task_004.solution;

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
public class GameNumbTest {

    @Test
    public void whenTryGuessNumbFive() throws IOException {
        GameNumb gameNumb = new GameNumb();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_004\\solution\\input.txt");
        fwInput.write("5");
        fwInput.close();
        String expected = gameNumb.init();
        FileReader fr = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_004\\solution\\output.txt");
        Scanner sc = new Scanner(fr);
        String output = sc.next();
        assertThat(expected, is(output));
    }

    @Test
    public void whenTryGuessNumbTwo() throws IOException {
        GameNumb gameNumb = new GameNumb();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_004\\solution\\input.txt");
        fwInput.write("2");
        fwInput.close();
        String expected = gameNumb.init();
        FileReader fr = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_004\\solution\\output.txt");
        Scanner sc = new Scanner(fr);
        String output = sc.next();
        assertThat(expected, is(output));
    }

    @Test
    public void whenTryGuessNumbSeven() throws IOException {
        GameNumb gameNumb = new GameNumb();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_004\\solution\\input.txt");
        fwInput.write("7");
        fwInput.close();
        String expected = gameNumb.init();
        FileReader fr = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_004\\solution\\output.txt");
        Scanner sc = new Scanner(fr);
        String output = sc.next();
        assertThat(expected, is(output));
    }
}
