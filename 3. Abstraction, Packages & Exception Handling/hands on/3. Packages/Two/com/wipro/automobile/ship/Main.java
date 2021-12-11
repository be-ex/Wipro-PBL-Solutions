package Two.com.wipro.automobile.ship;

import Two.com.wipro.automobile.ship.Compartment;

public class Main {
    public static void main(String[] args) {

        Compartment com = new Compartment(144, 28, 10);
        System.out.println("Height is " + com.height);
        System.out.println("Width is " + com.width);
        System.out.println("Breadth is " + com.breadth);
    }
}
