package vehicle;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
class Car extends Vehicle {
    private int numDoors;

    public Car(String vehicleNumber, String manufacturer, String model, double rentalRatePerDay, int numDoors) {
        super(vehicleNumber, manufacturer, model, rentalRatePerDay);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    @Override
    public double calculateRentalCost(int days) {
        // Additional RM35 per day for cars with more than two doors
        return super.calculateRentalCost(days) + ((numDoors > 2) ? (35 * days) : 0);
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumber of Doors: " + numDoors;
    }
}