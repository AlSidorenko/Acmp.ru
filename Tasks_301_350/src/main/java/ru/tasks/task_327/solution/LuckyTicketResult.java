package ru.tasks.task_327.solution;

import java.io.FileWriter;

/**
 * Created on 07.06.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class LuckyTicketResult {

    public String init(String numb) throws Exception {
        //String str = (new Integer(numb)).toString();
        char[] chArr = numb.toCharArray();
        int[] arr = new int[chArr.length];
        for (int i = 0; i < chArr.length; i++) {
            arr[i] = Character.getNumericValue(chArr[i]);
        }

        int sumLeft = arr[0] + arr[1] + arr[2];

        StringBuilder sb1 = new StringBuilder();
        sb1.append(arr[3]);
        sb1.append(arr[4]);
        sb1.append(arr[5]);
        String numbRight = sb1.toString();

        int numbRightFirst = Integer.parseInt(numbRight) + 1;
        char[] chArrFirst = String.valueOf(numbRightFirst).toCharArray();
        int[] arrFirst = new int[chArrFirst.length];
        int sumArrFirst = 0;
        for (int i = 0; i < arrFirst.length; i++) {
            arrFirst[i] = Character.getNumericValue(chArrFirst[i]);
            sumArrFirst += arrFirst[i];
        }


        int numbRightSecond = Integer.parseInt(numbRight) - 1;
        char[] chArrSecond = String.valueOf(numbRightSecond).toCharArray();
        int[] arrSecond = new int[chArrSecond.length];
        int sumArrSecond = 0;
        for (int i = 0; i < arrFirst.length; i++) {
            arrSecond[i] = Character.getNumericValue(chArrSecond[i]);
            sumArrSecond += arrSecond[i];
        }

        StringBuilder sb = new StringBuilder();
        if ((sumLeft == sumArrFirst) | (sumLeft == sumArrSecond)) {
            sb.append("Yes");
        } else {
            sb.append("No");
        }
        return  sb.toString();
    }

    public String result(Item[] items) throws Exception {
        FileWriter fwOutput = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_301_350\\src\\main\\java\\ru\\tasks\\task_327\\solution\\output.txt");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < items.length; i++) {
            sb.append(init(items[i].getElem()) + "\n");
        }
        fwOutput.write(sb.toString());
        fwOutput.close();
        return sb.toString();
    }


    public static void main(String[] args) throws Exception {
        System.out.println(new LuckyTicketResult().result(new LuckyTicket().arr()));
    }
}
