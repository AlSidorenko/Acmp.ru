package ru.tasks.task_324.solution;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 17.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Palindrome {

    //считываем данные из файла input.txt
    public String input() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_301_350\\src\\main\\java\\ru\\tasks\\task_324\\solution\\input.txt"));
        return sc.nextLine();
    }

    public boolean checkPalindrome(String s) {
        s = s.replaceAll("\\W","");//удаляем все ненужное
        StringBuilder strBuilder = new StringBuilder(s);
        strBuilder.reverse(); //переворачиваем строку
        String invertedText = strBuilder.toString();//присваиваем перевернутую строку

        return s.equalsIgnoreCase(invertedText) ;//возвращаем сравнение двух строк вне зависимости от регистра
    }

    public String result (boolean check) throws IOException {
        String y = "YES";
        String n =  "NO";
        FileWriter fw = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_301_350\\src\\main\\java\\ru\\tasks\\task_324\\solution\\output.txt");
        if (check == true) {
            fw.write(y);
            fw.close();
            return y;
        } else {
            fw.write(n);
            fw.close();
            return n;
        }
    }

    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();

        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.result(palindrome.checkPalindrome(palindrome.input())));

        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime + " ms.");
    }
}
