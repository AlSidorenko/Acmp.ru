package ru.tasks.task_092.solution;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 11.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Cranes {

    // считывание информации из файда input.txt
    public int numb() throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_092\\solution\\input.txt");
        Scanner sc = new Scanner(fr);
        return sc.nextInt();
    }

    public String result(int numb) throws IOException {
        StringBuilder sb = new StringBuilder();
        int guys = numb / 6;
        int girl = numb / 6 * 4;
        sb.append(guys);
        sb.append(" ");
        sb.append(girl);
        sb.append(" ");
        sb.append(guys);
        FileWriter fw = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_092\\solution\\output.txt");
        fw.write(sb.toString());
        fw.close();
        return sb.toString();
    }
}
