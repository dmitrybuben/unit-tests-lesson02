package seminars.second.hw;

public class Car extends Vehicle {
    private String company;
    private String model;
    private int yearRelease;
    private int numWheels;
    private int speed;
    public Car(String company, String model, int year) {
        this.company = company;
        this.model = model;
        this.yearRelease = year;
        this.numWheels = 4;
        this.speed = 0;
    }

    public int testDrive() {
        this.speed = 60;
        return this.speed;
    }
    public int park() {
        this.speed = 0;
        return this.speed;
    }
    public String getCompany() { return company; }
    public String getModel() { return model; }
    public int getYearRelease() { return yearRelease; }
    public int getNumWheels() { return numWheels; }
    public int getSpeed() { return speed; }
    public String toString() { return "This car is a “ + year + “ “ + make + “ “ + model + ";}
}