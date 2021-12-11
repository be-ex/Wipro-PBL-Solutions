import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Compartment[] comp = new Compartment[10];

        for (int i = 0; i < 10; i++) {
            int med = new Random().nextInt((4 - 1) + 1) + 1;

            if (med == 1)
                comp[i] = new FirstClass();
            else if (med == 2)
                comp[i] = new General();
            else if (med == 3)
                comp[i] = new Ladies();
            else if (med == 4)
                comp[i] = new Luggage();
        }

        for (int i = 0; i < comp.length; i++) {

            System.out.println(comp[i].notice());
        }

    }
}
