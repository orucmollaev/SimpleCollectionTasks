package task8;

// ArrayListden birici ve axrinci elementi getirin.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> myBook = new ArrayList<>();
        myBook.add("Effective Java");
        myBook.add("Harry Potter");
        myBook.add("Lord of the Rings");
        myBook.add("Pinocchio");
        System.out.println("My first index is: " + myBook.get(0));
        System.out.println("My Last index is: " + myBook.get(3));
    }
}