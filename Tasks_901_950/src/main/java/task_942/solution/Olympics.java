package task_942.solution;

/**
 * Created on 05.07.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Olympics {

    public int fifthYearStudent(Item[] items) {
        int sum = 0;
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items.length - i; j++) {
                sum += items[i].getN();
            }
        }
        return sum;
    }

    public int thirdYearStudent(Item[] items) {
        int sum = 0;
        int temp;
        for (int i = 0; i < items.length / 2; i++) {
            temp = items[i].getN();
            items[i].setN(items[items.length - 1 - i].getN());
            items[items.length - 1 - i].setN(temp);
        }
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items.length - i; j++) {
                sum += items[i].getN();
            }
        }
        return sum;
    }

    public int firstYearStudent(Item[] items) {
        for (int i = items.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (items[j].getN() > items[j + 1].getN()) {
                    int temp = items[j].getN();
                    items[j].setN(items[j + 1].getN());
                    items[j + 1].setN(temp);
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items.length - i; j++) {
                sum += items[i].getN();
            }
        }
        return sum;
    }
}
