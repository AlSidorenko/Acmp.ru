package ru.tasks.task_284.solution;

/**
 * Created on 01.06.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Item {

    int elem;
    int firstElem;
    int secondElem;

    public Item(int len) {
        this.elem = len;
    }

    public Item(int first, int second) {
        this.firstElem = first;
        this.secondElem = second;
    }

    @Override
    public String toString() {
        return String.format("%s ", String.valueOf(elem));
    }
}
