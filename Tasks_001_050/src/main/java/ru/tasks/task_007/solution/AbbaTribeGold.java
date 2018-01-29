package ru.tasks.task_007.solution;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created on 29.01.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class AbbaTribeGold {

    public BigInteger[] arrBigInt() throws IOException {
        FileReader frInput = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_007\\solution\\input.txt");
        Scanner sc = new Scanner(frInput);
        String str = sc.nextLine();

        String[] inputStr = str.split(" ");

        BigInteger[] inputBigInt = new BigInteger[inputStr.length];
        for (int i = 0; i < inputBigInt.length; i++) {
            inputBigInt[i] = new BigInteger(inputStr[i]);
        }
        return inputBigInt;
    }

    public String maxInit() throws IOException {
        BigInteger res  = arrBigInt()[0].max(arrBigInt()[1]).max(arrBigInt()[2]);
        return res.toString();
    }

    public void init() throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_007\\solution\\output.txt");
        fw.write(maxInit());
        fw.close();
    }
}
