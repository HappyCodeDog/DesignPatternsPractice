package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<>();
    }

    public void add(Employee subordinate) {
        subordinates.add(subordinate);
    }

    public void remove(Employee subordinate) {
        subordinates.remove(subordinate);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public String toString(int level) {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: "+name).append(" Dept: "+dept).append(" Salary: "+salary);
        for (Employee subordinate : subordinates) {
            sb.append("\n");
            for (int i = 0; i < level; i++) {
                sb.append("-- ");
            }
            sb.append(subordinate.toString(level+1));
        }
        return sb.toString();
    }
}
