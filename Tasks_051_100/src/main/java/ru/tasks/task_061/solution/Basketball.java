package ru.tasks.task_061.solution;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created on 08.02.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Basketball {

    // считывание данных из файла input.txt и преобразование в ArrayList<String>
    public ArrayList<String> arrInputStr() throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_061\\solution\\input.txt");

        BufferedReader br = new BufferedReader(fr);
        String input;
        ArrayList<String> arrInputStr = new ArrayList<>();
        while ((input = br.readLine()) != null) {
            arrInputStr.add(input);
        }
        return arrInputStr;
    }

    public String result(ArrayList<String> arrInput) throws IOException {
        ArrayList<String> arrTeamStr = new ArrayList<>();
        String[] arrTemp;

        arrTemp = arrInput.get(0).split(" ");
        arrTeamStr.add(arrTemp[0]);
        arrTeamStr.add(arrTemp[1]);

        arrTemp = arrInput.get(1).split(" ");
        arrTeamStr.add(arrTemp[0]);
        arrTeamStr.add(arrTemp[1]);

        arrTemp = arrInput.get(2).split(" ");
        arrTeamStr.add(arrTemp[0]);
        arrTeamStr.add(arrTemp[1]);

        arrTemp = arrInput.get(3).split(" ");
        arrTeamStr.add(arrTemp[0]);
        arrTeamStr.add(arrTemp[1]);

        // Преобразование в массив Int. и подсчет суммы елементов.

        ArrayList<Integer> arrTeamInt = new ArrayList<>();
        for (int i = 0; i < arrTeamStr.size(); i++) {
            arrTeamInt.add(Integer.parseInt(arrTeamStr.get(i)));
        }

        // подсчет суммы элементов.
        int sumFirstTeam = 0;
        int sumSecondTeam = 0;
        for (int j = 0; j < arrTeamInt.size(); j++) {
            if ((j % 2) == 0) {
                sumFirstTeam += arrTeamInt.get(j);
            } else {
                sumSecondTeam += arrTeamInt.get(j);
            }
        }

        // сравнение количества очков.
        String first = "1";
        String second = "2";
        String draw = "DRAW";
        if (sumFirstTeam > sumSecondTeam) {
            FileWriter fw = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                    "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_061\\solution\\output.txt");
            fw.write(first);
            fw.close();
            return first;
        } else if (sumFirstTeam < sumSecondTeam) {
            FileWriter fw = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                    "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_061\\solution\\output.txt");
            fw.write(second);
            fw.close();
            return second;
        } else {
            FileWriter fw = new FileWriter("C:\\Users\\Александр\\OneDrive\\Документы\\IdeaProject\\" +
                    "Acmp.ru\\Tasks_051_100\\src\\main\\java\\ru\\tasks\\task_061\\solution\\output.txt");
            fw.write(draw);
            fw.close();
            return draw;
        }
    }

    public static void main(String[] args) throws IOException {
        Basketball basketball = new Basketball();
        basketball.result(basketball.arrInputStr());
    }
}
