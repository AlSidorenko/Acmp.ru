package task_794.solution;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 18.10.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class RolePlayingGameTest {

    @Test
    public void whenCheckResultGame() throws IOException {
        RolePlayingGame game = new RolePlayingGame();
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_751_800\\src\\main\\java\\task_794\\solution\\input.txt");
        input.write("3 4 2");
        input.close();
        game.writeResult();
        String result = game.result(game.arr());
        String expected = "9";
        assertThat(result, is(expected));
    }
}
