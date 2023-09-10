package StructuralPattern.CompositePattern;

public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee sam = new Employee("Sam", "Tech", 40);
        Employee mike = new Employee("Mike", "Tech", 35);
        Employee mark = new Employee("Mark", "Tech", 32);
        Employee jake = new Employee("Jake", "Test", 28);

        sam.add(mike);
        sam.add(mark);
        mark.add(jake);

        System.out.println(sam.toString(1));

        mark.remove(jake);
        sam.add(jake);
        System.out.println(sam.toString(1));
    }
}
