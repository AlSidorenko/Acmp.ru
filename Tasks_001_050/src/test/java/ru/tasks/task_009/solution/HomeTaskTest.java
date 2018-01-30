package ru.tasks.task_009.solution;

import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created on 31.01.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class HomeTaskTest {

    @Test
    public void whenMinElemAndMaxElemLocatedAtBeginningAndAtEndOfArray() throws IOException {
        HomeTask homeTask = new HomeTask();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_009\\solution\\input.txt");
        fwInput.write("5\r");
        fwInput.write("-7 5 -1 3 9");
        fwInput.close();
        homeTask.init();
        String expected = homeTask.result();
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_009\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String output = sc.nextLine();
        assertThat(expected, is(output));
    }

    @Test
    public void whenMinElemAndMaxElemLocatedAtArrangedInReverseOrder() throws IOException {
        HomeTask homeTask = new HomeTask();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_009\\solution\\input.txt");
        fwInput.write("8\r");
        fwInput.write("3 14 -9 4 -5 1 -12 4");
        fwInput.close();
        homeTask.init();
        String expected = homeTask.result();
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_009\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String output = sc.nextLine();
        assertThat(expected, is(output));
    }

    @Test
    public void whenMinElemAndMaxElemLocatedInMiddleOfArray() throws IOException {
        HomeTask homeTask = new HomeTask();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_009\\solution\\input.txt");
        fwInput.write("10\r");
        fwInput.write("-5 1 2 3 4 5 6 7 8 -3");
        fwInput.close();
        homeTask.init();
        String expected = homeTask.result();
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_009\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String output = sc.nextLine();
        assertThat(expected, is(output));
    }
}
