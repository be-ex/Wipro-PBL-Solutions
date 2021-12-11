import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Instrument[] ins = new Instrument[10];

        for (int i = 0; i < 10; i++) {
            int med = new Random().nextInt((3 - 1) + 1) + 1;

            if (med == 1)
                ins[i] = new Piano();
            else if (med == 2)
                ins[i] = new Flute();
            else if (med == 3)
                ins[i] = new Guitar();
        }

        for (int i = 0; i < ins.length; i++) {
            if (ins[i] instanceof Piano)
                System.out.print("Instrument " + i + " is of type Piano, ");
            if (ins[i] instanceof Flute)
                System.out.print("Instrument " + i + " is of type Flute, ");
            if (ins[i] instanceof Guitar)
                System.out.print("Instrument " + i + " is of type Guitar, ");
            ins[i].play();
        }

    }
}
