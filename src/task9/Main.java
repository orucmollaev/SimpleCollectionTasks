package task9;

// Listin boş olub olmadigini yoxlayin.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> myPcComponents = new ArrayList<>();
        myPcComponents.add("Graphic card");
        myPcComponents.add("Processor");
        myPcComponents.add("Fans");
        myPcComponents.add("Motherboard");
        myPcComponents.add("Power suply");
        System.out.println(myPcComponents.isEmpty());
    }
}