package ru.tasks.task_052.solution;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created on 22.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class LuckyTicketTest {

    @Test
    public void whenFirstCondition() throws IOException {
        LuckyTicket luckyTicket = new LuckyTicket();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_052\\solution\\input.txt");
        fwInput.write("385916");
        fwInput.close();
        String expected = luckyTicket.result(luckyTicket.arrInputInt());

        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_052\\solution\\output.txt"));
        String result = sc.next();
        assertThat(expected, is(result));
    }

    @Test
    public void whenSecondCondition() throws IOException {
        LuckyTicket luckyTicket = new LuckyTicket();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_052\\solution\\input.txt");
        fwInput.write("123456");
        fwInput.close();
        String expected = luckyTicket.result(luckyTicket.arrInputInt());

        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_052\\solution\\output.txt"));
        String result = sc.next();
        assertThat(expected, is(result));
    }
}
