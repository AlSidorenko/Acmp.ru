package ru.tasks.task_010.solution;

import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created on 01.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class EquationTest {

    @Test
    public void theFirstCondition() throws IOException {
        Equation equation = new Equation();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_010\\solution\\input.txt");
        fwInput.write("1 -3 0 0");
        fwInput.close();
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_010\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String expected = equation.solutionEquation(equation.divisor(equation.maxElem()));
        String output = sc.nextLine();
        assertThat(expected, is(output));
    }

    @Test
    public void theSecondCondition() throws IOException {
        Equation equation = new Equation();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_010\\solution\\input.txt");
        fwInput.write("3 -15 18 0");
        fwInput.close();
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_010\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String expected = equation.solutionEquation(equation.divisor(equation.maxElem()));
        String output = sc.nextLine();
        assertThat(expected, is(output));
    }

    @Test
    public void theThirdCondition() throws IOException {
        Equation equation = new Equation();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_010\\solution\\input.txt");
        fwInput.write("1 -7 -33 135");
        fwInput.close();
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_010\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String expected = equation.solutionEquation(equation.divisor(equation.maxElem()));
        String output = sc.nextLine();
        assertThat(expected, is(output));
    }
}
