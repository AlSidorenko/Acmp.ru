package ru.tasks.task_035.solution;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created on 20.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class FiniteStateMachines {

    private int n;
    private int m;

    public FiniteStateMachines() {
    }

    public FiniteStateMachines(int n, int m) {
        this.n = n;
        this.m = m;
    }

    public FiniteStateMachines[] fsm() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_035\\solution\\input.txt"));
        int numb = sc.nextInt();
        FiniteStateMachines[] finiteStateMachines = new FiniteStateMachines[numb];
        for (int i = 0; i < numb; i++) {
            finiteStateMachines[i] = new FiniteStateMachines(sc.nextInt(), sc.nextInt());
        }
        return finiteStateMachines;
    }

    public String result(FiniteStateMachines[] fsm) throws IOException {
        StringBuilder sb = new StringBuilder();
        int tempResult;
        for (int i = 0; i < fsm.length; i++) {
            tempResult = ((19 * fsm[i].getM()) + (((fsm[i].getN() + 239) * (fsm[i].getN() + 366)) / 2));
            sb.append(tempResult + "\r\n");
        }
        FileWriter fw = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\Acmp.ru\\" +
                "Tasks_001_050\\src\\main\\java\\ru\\tasks\\task_035\\solution\\output.txt");
        fw.write(sb.toString());
        fw.close();
        return sb.toString();
    }

    @Override
    public String toString() {
        return "FiniteStateMachines{" +
                "n = " + n +
                ", m = " + m +
                '}';
    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    public static void main(String[] args) throws IOException {
        long timeStart = System.currentTimeMillis();
        FiniteStateMachines finiteMachines = new FiniteStateMachines();
        //System.out.println(Arrays.toString(finiteMachines.fsm()));
        String s = finiteMachines.result(finiteMachines.fsm());
        System.out.println(s);
        long timeFinish = System.currentTimeMillis();
        System.out.println(timeFinish - timeStart + " ms.");
    }
}
