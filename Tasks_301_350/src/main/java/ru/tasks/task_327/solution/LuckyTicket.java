package ru.tasks.task_327.solution;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created on 06.06.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class LuckyTicket {

    // считывание данных в массив.
    public Item[] arr() throws Exception {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_301_350\\src\\main\\java\\ru\\tasks\\task_327\\solution\\input.txt"));
        int len = sc.nextInt();

        Item[] items = new Item[len];
        for (int i = 0; i < items.length; i++) {
            items[i] = new Item(sc.next());
        }
        return items;
    }

    private int[] createArrayFromNumber(String number) {
        //String str = (new Integer(number)).toString();
        char[] chArr = number.toCharArray();
        int[] arr = new int[chArr.length];
        for (int i = 0; i< chArr.length; i++) {
            arr[i] = Character.getNumericValue(chArr[i]);
        }
        return arr;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(new LuckyTicket().arr()));

        System.out.println(Arrays.toString(new LuckyTicket().createArrayFromNumber("012200")));
    }
}
