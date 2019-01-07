package ru.tasks.task_327.solution;

/**
 * Created on 06.06.2018.
 *
 * @author Aleks Sidorenko (alek.sidorenko1979@gmail.com).
 * @version $Id$.
 * @since 0.1.
 */
public class Item {

    private String elem;

    public Item(String elem) {
        this.elem = elem;
    }

    public String getElem() {
        return elem;
    }

    /*
    @Override
    public String toString() {
        return String.format("%s ", String.valueOf(elem));
    }*/

    @Override
    public String toString() {
        return "Item{" +
                "elem=" + elem +
                '}';
    }
}
