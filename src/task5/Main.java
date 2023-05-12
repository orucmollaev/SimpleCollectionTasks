package task5;

// Arraylist-in 5-ci elementini silin.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> galactica = new ArrayList<>();
        galactica.add("Jupiter");
        galactica.add("Mars");
        galactica.add("Earth");
        galactica.add("Mercury");
        galactica.add("Uran");
        galactica.add("Saturn");
        galactica.remove(4);
        System.out.println(galactica);
    }
}