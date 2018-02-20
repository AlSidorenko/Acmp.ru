package ru.tasks.task_035.solution;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.ArrayList;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created on 20.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class FiniteStateMachineTest {

    @Test
    public void firstCondition() throws IOException {
        FiniteStateMachines finiteMachines = new FiniteStateMachines();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_035\\solution\\input.txt");
        fwInput.write("4\r\n");
        fwInput.write("2 0\r\n");
        fwInput.write("13 20\r\n");
        fwInput.write("5 23\r\n");
        fwInput.write("18 6\r\n");
        fwInput.close();
        String expected = finiteMachines.result(finiteMachines.fsm());

        String output;
        BufferedReader brOutput = new BufferedReader(new FileReader("C:\\Users\\Александр\\OneDrive\\" +
                "Документы\\IdeaProject\\Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\" +
                "task_035\\solution\\output.txt"));
        ArrayList<String> arrayList = new ArrayList<>();
        while ((output = brOutput.readLine()) != null) {
            arrayList.add(output);
        }
        StringBuilder sbOutput = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            sbOutput.append(arrayList.get(i) + "\r\n");
        }
        String result = sbOutput.toString();
        assertThat(expected, is(result));
    }

    @Test
    public void secondCondition() throws IOException {
        FiniteStateMachines finiteMachines = new FiniteStateMachines();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_035\\solution\\input.txt");
        fwInput.write("2\r\n");
        fwInput.write("15 20\r\n");
        fwInput.write("1000 26000\r\n");
        fwInput.close();
        String expected = finiteMachines.result(finiteMachines.fsm());

        String output;
        BufferedReader brOutput = new BufferedReader(new FileReader("C:\\Users\\Александр\\OneDrive\\" +
                "Документы\\IdeaProject\\Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\" +
                "task_035\\solution\\output.txt"));
        ArrayList<String> arrayList = new ArrayList<>();
        while ((output = brOutput.readLine()) != null) {
            arrayList.add(output);
        }
        StringBuilder sbOutput = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            sbOutput.append(arrayList.get(i) + "\r\n");
        }
        String result = sbOutput.toString();
        assertThat(expected, is(result));
    }
}
