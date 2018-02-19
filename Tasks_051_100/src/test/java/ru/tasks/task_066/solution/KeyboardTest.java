package ru.tasks.task_066.solution;

import org.junit.Test;

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created on 20.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class KeyboardTest {

    @Test
    public void firstCondition() throws IOException {
        Keyboard keyboard = new Keyboard();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_066\\solution\\input.txt");
        fwInput.write("q");
        fwInput.close();
        String expected = keyboard.symbol();

        Scanner sc = new Scanner(new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_066\\solution\\output.txt"));
        String result = sc.next();
        assertThat(expected, is(result));
    }

    @Test
    public void secondCondition() throws IOException {
        Keyboard keyboard = new Keyboard();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_066\\solution\\input.txt");
        fwInput.write("t");
        fwInput.close();
        String expected = keyboard.symbol();

        Scanner sc = new Scanner(new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_066\\solution\\output.txt"));
        String result = sc.next();
        assertThat(expected, is(result));
    }

    @Test
    public void thirdCondition() throws IOException {
        Keyboard keyboard = new Keyboard();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_066\\solution\\input.txt");
        fwInput.write("p");
        fwInput.close();
        String expected = keyboard.symbol();

        Scanner sc = new Scanner(new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_066\\solution\\output.txt"));
        String result = sc.next();
        assertThat(expected, is(result));
    }

    @Test
    public void forthCondition() throws IOException {
        Keyboard keyboard = new Keyboard();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_066\\solution\\input.txt");
        fwInput.write("l");
        fwInput.close();
        String expected = keyboard.symbol();

        Scanner sc = new Scanner(new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_066\\solution\\output.txt"));
        String result = sc.next();
        assertThat(expected, is(result));
    }

    @Test
    public void fifthCondition() throws IOException {
        Keyboard keyboard = new Keyboard();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_066\\solution\\input.txt");
        fwInput.write("m");
        fwInput.close();
        String expected = keyboard.symbol();

        Scanner sc = new Scanner(new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_066\\solution\\output.txt"));
        String result = sc.next();
        assertThat(expected, is(result));
    }
}
