package ru.tasks.task_327.solution;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 07.06.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class LuckyTicketResultTest {

    @Test
    public void whenCheckTicket() throws Exception {
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_301_350\\src\\main\\java\\ru\\tasks\\task_327\\solution\\input.txt");
        StringBuilder sb = new StringBuilder();
        fwInput.write("3\n715068\n445219\n012200");
        fwInput.close();
        String result = new LuckyTicketResult().result(new LuckyTicket().arr());

        sb.append("Yes\nNo\nYes\n");
        String expected = sb.toString();

        assertThat(result, is(expected));
    }
}
