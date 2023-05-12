package task7;

// ArrayListde elementleri ters sira ile yazin.

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> countries = new LinkedList<>();
        countries.add("Rwanda");
        countries.add("Burundi");
        countries.add("Uganda");
        countries.add("Tansania");
        countries.add("Kenia");
        countries.add("Congo");
        countries.add("Zimbabwe");
        countries.add("Libya");
        Collections.reverse(countries);
        System.out.println(countries);
    }
}