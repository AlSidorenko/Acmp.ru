package ru.tasks.task_597.solution;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 15.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Aliens {

    //считываем данные из файла input.txt и преобразовываем в массив.
    public int[] arrInputInt() throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_551_600\\src\\main\\java\\ru\\tasks\\task_597\\solution\\input.txt");
        Scanner sc = new Scanner(fr);
        String input = sc.nextLine();
        String[] arrInputStr = input.split(" ");

        int[] arrInputInt = new int[arrInputStr.length];
        for (int i = 0; i < arrInputStr.length; i++) {
            arrInputInt[i] = Integer.parseInt(arrInputStr[i]);
        }
        return arrInputInt;
    }

    public int areaOfCircle(int r) throws IOException {
        return (int) (Math.PI * r * r);
    }

    public String result(int[] arr) throws IOException {
        int s1 = areaOfCircle(arr[0]);
        int s2 = areaOfCircle(arr[1]);
        int s3 = areaOfCircle(arr[2]);

        String y = "YES";
        String n = "NO";
        if (s1 >= (s2 + s3)) {
            FileWriter fw = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                    "Acmp.ru\\Tasks_551_600\\src\\main\\java\\ru\\tasks\\task_597\\solution\\output.txt");
            fw.write(y);
            fw.close();
            return y;
        } else {
            FileWriter fw = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                    "Acmp.ru\\Tasks_551_600\\src\\main\\java\\ru\\tasks\\task_597\\solution\\output.txt");
            fw.write(n);
            fw.close();
            return n;
        }
    }

    public static void main(String[] args) throws IOException {
        Aliens aliens = new Aliens();
        aliens.result(aliens.arrInputInt());
    }
}
