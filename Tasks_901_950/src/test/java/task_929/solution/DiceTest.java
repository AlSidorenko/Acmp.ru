package task_929.solution;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 19.09.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class DiceTest {

    @Test
    public void whenOneDice() throws IOException {
        Dice dice = new Dice();
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_901_950\\src\\main\\java\\task_929\\solution\\input.txt");
        input.write("2");
        input.close();
        dice.fileWriter(dice.result(dice.numb()));
        String result = dice.result(dice.numb());
        String expected = "5 12";
        assertThat(result, is(expected));
    }

    @Test
    public void whenMoreOneDice() throws IOException {
        Dice dice = new Dice();
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_901_950\\src\\main\\java\\task_929\\solution\\input.txt");
        input.write("36");
        input.close();
        dice.fileWriter(dice.result(dice.numb()));
        String result = dice.result(dice.numb());
        String expected = "6 216";
        assertThat(result, is(expected));
    }
}
