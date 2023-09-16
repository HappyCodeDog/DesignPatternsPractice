package BehavioralPatterns.MementoPattern;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento) {
        mementoList.add(memento);
    }

    public Memento get(int index) {
        if (index < mementoList.size()) {
            return mementoList.get(index);
        }
        return null;
    }
}
