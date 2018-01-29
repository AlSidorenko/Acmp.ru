package ru.tasks.task_007.solution;

import org.junit.Test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created on 29.01.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class AbbaTribeGoldTest {

    @Test
    public void whenElemIsSmall() throws IOException {
        AbbaTribeGold abbaTribeGold = new AbbaTribeGold();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_007\\solution\\input.txt");
        fwInput.write("5 7 3");
        fwInput.close();
        abbaTribeGold.init();
        String expected = abbaTribeGold.maxInit();
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\" +
                "IdeaProject\\Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_007\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String output = sc.nextLine();
        assertThat(expected, is(output));
    }

    @Test
    public void whenElemIsMiddle() throws IOException {
        AbbaTribeGold abbaTribeGold = new AbbaTribeGold();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_007\\solution\\input.txt");
        fwInput.write("987531 234 86364");
        fwInput.close();
        abbaTribeGold.init();
        String expected = abbaTribeGold.maxInit();
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\" +
                "IdeaProject\\Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_007\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String output = sc.nextLine();
        assertThat(expected, is(output));
    }

    @Test
    public void whenElemIsBig() throws IOException {
        AbbaTribeGold abbaTribeGold = new AbbaTribeGold();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_007\\solution\\input.txt");
        fwInput.write("189285 283 4958439238923098349024");
        fwInput.close();
        abbaTribeGold.init();
        String expected = abbaTribeGold.maxInit();
        FileReader frOutput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\" +
                "IdeaProject\\Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_007\\solution\\output.txt");
        Scanner sc = new Scanner(frOutput);
        String output = sc.nextLine();
        assertThat(expected, is(output));
    }
}
