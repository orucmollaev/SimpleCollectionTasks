package task6;

// ArrayListe elementleri elifba sirasina uygun siralayin.

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> myCars = new ArrayList<>();
        myCars.add("Ferrari");
        myCars.add("Acura");
        myCars.add("Rolls-Royce");
        myCars.add("Lamborghini");
        myCars.add("Bentley");
        Collections.sort(myCars);
        System.out.println(myCars);
    }
}