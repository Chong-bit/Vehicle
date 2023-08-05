/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehicle;

/**
 *
 * @author User
 */
class Motorcycle extends Vehicle {
    private int engineCapacity;

    public Motorcycle(String vehicleNumber, String manufacturer, String model, double rentalRatePerDay,
                      int engineCapacity) {
        super(vehicleNumber, manufacturer, model, rentalRatePerDay);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int calculateTopSpeed() {
        // Top speed calculated by multiplying engine capacity by 50
        return engineCapacity * 50;
    }

    @Override
    public double calculateRentalCost(int days) {
        // Additional RM150 for motorcycles with top speed of at least 300
        return super.calculateRentalCost(days) + ((calculateTopSpeed() >= 30000) ? 150 : 0);
    }

    @Override
    public String toString() {
        return super.toString() + "\nEngine Capacity: " + engineCapacity + " cc";
    }
}