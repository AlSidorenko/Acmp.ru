package ru.tasks.task_043;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 06.12.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Nulls {

    public char[] arrChar() throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_043\\input.txt"));
        return sc.nextLine().toCharArray();
    }

    public String sumOfNulls(char[] ch) {
        int count = 0;
        for (int i = ch.length - 1; i > 0; i--)
            if ((ch[i] == '0') & (ch[i] == ch[i - 1])) {
                count++;
            }
        return String.valueOf(count);
    }

    public void fileWrite() throws IOException {
        Nulls nulls = new Nulls();
        FileWriter output = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_043\\output.txt");
        output.write(nulls.sumOfNulls(nulls.arrChar()));
        output.close();
    }

    public static void main(String[] args) throws IOException {
        long timeStart = System.currentTimeMillis();
        Nulls nulls = new Nulls();
        System.out.printf("Sum of nulls: %s\n", nulls.sumOfNulls(nulls.arrChar()));
        nulls.fileWrite();
        long timeFinish = System.currentTimeMillis();
        System.out.printf("%s ms.", timeFinish - timeStart);
    }
}
