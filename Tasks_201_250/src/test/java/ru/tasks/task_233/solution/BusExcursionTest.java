package ru.tasks.task_233.solution;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created on 13.03.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class BusExcursionTest {

    @Test
    public void firstCondition() throws IOException {
        BusExcursion busExcursion = new BusExcursion();

        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_201_250\\src\\main\\java\\ru\\tasks\\task_233\\solution\\input.txt");
        fwInput.write("1\r\n763");
        fwInput.close();
        String expected = busExcursion.result(busExcursion.be());

        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_201_250\\src\\main\\java\\ru\\tasks\\task_233\\solution\\output.txt"));
        String result = sc.nextLine();

        assertThat(result, is(expected));
    }

    @Test
    public void secondCondition() throws IOException {
        BusExcursion busExcursion = new BusExcursion();

        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_201_250\\src\\main\\java\\ru\\tasks\\task_233\\solution\\input.txt");
        fwInput.write("3\r\n763\r\n245\r\n113");
        fwInput.close();
        String expected = busExcursion.result(busExcursion.be());

        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_201_250\\src\\main\\java\\ru\\tasks\\task_233\\solution\\output.txt"));
        String result = sc.nextLine();

        assertThat(result, is(expected));
    }

    @Test
    public void thirdCondition() throws IOException {
        BusExcursion busExcursion = new BusExcursion();

        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_201_250\\src\\main\\java\\ru\\tasks\\task_233\\solution\\input.txt");
        fwInput.write("1\r\n437");
        fwInput.close();
        String expected = busExcursion.result(busExcursion.be());

        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_201_250\\src\\main\\java\\ru\\tasks\\task_233\\solution\\output.txt"));
        String result = sc.nextLine();

        assertThat(result, is(expected));
    }
}
