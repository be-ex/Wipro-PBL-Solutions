package Three;

public class Patient {
    String patientName;
    double height;
    double weight;

    Patient(String name, double height, double weight) {
        this.patientName = name;
        this.height = height;
        this.weight = weight;
    }

    public double computeBMI() {
        return weight / (height * height);
    }
}
