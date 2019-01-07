package task_854.solution;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on 06.09.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class AirConditioner {

    public List<String> read() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_851_900\\src\\main\\java\\task_854\\solution\\input.txt"));
        List<String> arrLines = new ArrayList<>(lines);
        return arrLines;
    }

    public String result(List<String> txt) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\Александр\\Documents\\IdeaProject\\" +
                "Acmp.ru\\Tasks_851_900\\src\\main\\java\\task_854\\solution\\output.txt");
        String rsl = null;
        String[] arrTxt = txt.get(0).split(" ");
        switch (txt.get(1)) {
            case "heat":
                rsl = arrTxt[1];
                break;
            case "freeze":
                rsl = arrTxt[0];
                break;
            default:
                break;
        }
        fw.write(rsl);
        fw.close();
        return rsl;
    }

    public static void main(String[] args) throws IOException {
        long timeStart = System.currentTimeMillis();
        AirConditioner airConditioner = new AirConditioner();
        System.out.printf("String[] result: %s\n", airConditioner.result(airConditioner.read()));
        long timeFinish = System.currentTimeMillis();
        System.out.printf("%s ms.", timeFinish - timeStart);
    }
}
