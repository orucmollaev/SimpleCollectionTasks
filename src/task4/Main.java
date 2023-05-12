package task4;

// ArrayListde birinci indexe element elave edin.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myQueue = new ArrayList<>();
        myQueue.add(115);
        myQueue.add(125);
        myQueue.add(129);
        myQueue.add(135);
        myQueue.add(156);
        myQueue.set(0, 108);
        System.out.println(myQueue);
    }
}