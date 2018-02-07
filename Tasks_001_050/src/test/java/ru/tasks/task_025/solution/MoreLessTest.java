package ru.tasks.task_025.solution;

import org.junit.Test;

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created on 07.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class MoreLessTest {

    @Test
    public void firstCondition() throws IOException {
        MoreLess moreLess = new MoreLess();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_025\\solution\\input.txt");
        fwInput.write("5\r");
        fwInput.write("7");
        fwInput.close();
        String expected = moreLess.result(moreLess.arrayListInt());
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_025\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String output = sc.next();
        assertThat(expected, is(output));
    }

    @Test
    public void secondCondition() throws IOException {
        MoreLess moreLess = new MoreLess();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_025\\solution\\input.txt");
        fwInput.write("-7\r");
        fwInput.write("-12");
        fwInput.close();
        String expected = moreLess.result(moreLess.arrayListInt());
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_025\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String output = sc.next();
        assertThat(expected, is(output));
    }

    @Test
    public void thirdCondition() throws IOException {
        MoreLess moreLess = new MoreLess();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_025\\solution\\input.txt");
        fwInput.write("13\r");
        fwInput.write("13");
        fwInput.close();
        String expected = moreLess.result(moreLess.arrayListInt());
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_025\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String output = sc.next();
        assertThat(expected, is(output));
    }
}
