package task_933.solution;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created on 08.09.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class PhoneBillTest {

    @Test
    public void whenPhoneBillLessThanOrEqualToNorm() throws IOException {
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_901_950\\src\\main\\java\\task_933\\solution\\input.txt");
        input.write("30 2 3 30");
        input.close();
        PhoneBill phoneBill = new PhoneBill();
        String result = phoneBill.result(phoneBill.arr());
        String expected = "60";
        assertThat(result, is(expected));
    }

    @Test
    public void whenPhoneBillMoreThanNorm() throws IOException {
        FileWriter input = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_901_950\\src\\main\\java\\task_933\\solution\\input.txt");
        input.write("20 1 3 30");
        input.close();
        PhoneBill phoneBill = new PhoneBill();
        String result = phoneBill.result(phoneBill.arr());
        String expected = "50";
        assertThat(result, is(expected));
    }
}
