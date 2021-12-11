package Three.com.automobile.twowheeler;

import Three.com.automobile.Vehicle;

public class Honda extends Vehicle {

    protected int currentSpeed;
    protected String modelName;
    protected String registrationNumber;
    protected String ownerName;

    public Honda(int currentSpeed, String modelName, String registrationNumber, String ownerName) {
        this.currentSpeed = currentSpeed;
        this.modelName = modelName;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
    }

    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getOwnerName() {
        return ownerName;
    }

    public void cdplayer() {
        System.out.println("Accessing the CD Player.");
    }

}
