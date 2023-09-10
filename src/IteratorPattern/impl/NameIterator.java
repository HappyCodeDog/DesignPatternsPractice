package IteratorPattern.impl;

import IteratorPattern.Iterator;

import java.util.List;

public class NameIterator implements Iterator {
    private List<String> list;
    private int index;

    public NameIterator(List<String> list) {
        this.list = list;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public Object next() {
        return hasNext() ? list.get(index++) : null;
    }
}
