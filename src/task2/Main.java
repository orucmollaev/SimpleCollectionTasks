package task2;

// ArrayListin elementlerinin sayini tapin.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Mozilla Firefox");
        arrayList.add("Opera");
        arrayList.add("Google Chrome");
        arrayList.add("Internet Explorer");
        System.out.println(arrayList.size());
    }
}