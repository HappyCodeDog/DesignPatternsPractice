package IteratorPattern;

import IteratorPattern.impl.NameIterator;
import IteratorPattern.impl.NameRepository;

import java.util.Arrays;
import java.util.List;

public class IteratorPatternDemo {
    // setup
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Mike", "Jessie", "White");
        NameRepository nameRepository = new NameRepository(names);


        for (Iterator nameIterator = nameRepository.getIterator();
             nameIterator.hasNext();) {
            System.out.println(nameIterator.next());
        }
    }
}
