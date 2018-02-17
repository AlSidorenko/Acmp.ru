package ru.tasks.task_324.solution;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created on 18.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class PalindromeTest {

    @Test
    public void firstCondition() throws IOException {
        Palindrome palindrome = new Palindrome();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_301_350\\src\\main\\java\\ru\\tasks\\task_324\\solution\\input.txt");
        fwInput.write("6116");
        fwInput.close();
        String expected = palindrome.result(palindrome.checkPalindrome(palindrome.input()));
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_301_350\\src\\main\\java\\ru\\tasks\\task_324\\solution\\output.txt"));
        String output = sc.nextLine();
        assertThat(expected, is(output));
    }

    @Test
    public void secondCondition() throws IOException {
        Palindrome palindrome = new Palindrome();
        FileWriter fwInput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_301_350\\src\\main\\java\\ru\\tasks\\task_324\\solution\\input.txt");
        fwInput.write("1231");
        fwInput.close();
        String expected = palindrome.result(palindrome.checkPalindrome(palindrome.input()));
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_301_350\\src\\main\\java\\ru\\tasks\\task_324\\solution\\output.txt"));
        String output = sc.nextLine();
        assertThat(expected, is(output));
    }
}
