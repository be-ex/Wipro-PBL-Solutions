package Three.com.automobile.twowheeler;

import Three.com.automobile.Vehicle;

public class Hero extends Vehicle {
    protected int currentSpeed;
    protected String modelName;
    protected String registrationNumber;
    protected String ownerName;

    public Hero(int currentSpeed, String modelNumber, String registrationNumber, String ownerName) {
        this.currentSpeed = currentSpeed;
        this.modelName = modelNumber;
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
    }

    public int getSpeed() {
        return currentSpeed;
    }

    public void radio() {
        System.out.println("Accessing radio devices.");
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
}
