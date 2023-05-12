package task3;

// ArrayListinizi for-dan istifade ederek alt-alta çapa verin.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Samsung");
        arrayList.add("Xiaomi");
        arrayList.add("Iphone");
        arrayList.add("Motorola");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}