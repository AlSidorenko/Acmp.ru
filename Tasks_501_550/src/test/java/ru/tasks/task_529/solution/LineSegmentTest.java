package ru.tasks.task_529.solution;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created on 21.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class LineSegmentTest {

    @Test
    public void condition() throws IOException {
        LineSegment lineSegment = new  LineSegment();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_501_550\\src\\main\\java\\ru\\tasks\\task_529\\solution\\input.txt");
        fwInput.write("3 4 8 4");
        fwInput.close();
        String expected = lineSegment.result(lineSegment.arrInt());
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_501_550\\src\\main\\java\\ru\\tasks\\task_529\\solution\\output.txt"));
        String result = sc.next();

        assertThat(expected, is(result));
    }
}
