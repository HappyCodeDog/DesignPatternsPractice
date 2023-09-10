package BehavioralPatterns.IteratorPattern.impl;

import BehavioralPatterns.IteratorPattern.Container;
import BehavioralPatterns.IteratorPattern.Iterator;

import java.util.List;

public class NameRepository implements Container {
    private List<String> names;

    public NameRepository(List<String> names) {
        this.names = names;
    }

    @Override
    public Iterator getIterator() {
        return new NameIterator(names);
    }
}
