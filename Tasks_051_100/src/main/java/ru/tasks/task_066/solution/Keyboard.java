package ru.tasks.task_066.solution;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created on 20.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Keyboard {

    //считывание данных из файла input.txt
    public String symbol() throws IOException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_066\\solution\\input.txt"));
        String input = sc.next();
        FileWriter fwOutput = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_066\\solution\\output.txt");
        String[] alphabetKeyboard = {"q","w","e","r","t","y","u","i","o","p",
                                     "a","s","d","f","g","h","j","k","l",
                                     "z","x","c","v","b","n","m"};
        for (int i = 0; i < alphabetKeyboard.length; i++) {
            if (alphabetKeyboard[i].equals(input)) {
                fwOutput.write(alphabetKeyboard[i + 1]);
                fwOutput.close();
                return alphabetKeyboard[i + 1];
            } else {
                fwOutput.write(alphabetKeyboard[0]);
                fwOutput.close();
                return alphabetKeyboard[0];
            }
        }
        return "-1";
    }
    public static void main(String[] args) throws IOException {
        long timeStart = System.currentTimeMillis();
        Keyboard keyboard = new Keyboard();
        System.out.println(keyboard.symbol());
        long timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart + " ms.");
    }
}