package task10;

// Linkedlistde mueyyən elementin olub-olmadigini yoxlayin

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> myEmployee = new LinkedList<>();
        myEmployee.add("John");
        myEmployee.add("Bernard");
        myEmployee.add("Harry");
        myEmployee.add("Donna");
        System.out.println(myEmployee.contains("Santa"));
    }
}