/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehicle;
import java.util.Scanner;
/**
 *
 * @author User
 */
class Vehicle {
    private String vehicleNumber;
    private String manufacturer;
    private String model;
    private double rentalRatePerDay;

    public Vehicle(String vehicleNumber, String manufacturer, String model, double rentalRatePerDay) {
        this.vehicleNumber = vehicleNumber;
        this.manufacturer = manufacturer;
        this.model = model;
        this.rentalRatePerDay = rentalRatePerDay;
    }

    // Getters and Setters for all attributes
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getRentalRatePerDay() {
        return rentalRatePerDay;
    }

    public void setRentalRatePerDay(double rentalRatePerDay) {
        this.rentalRatePerDay = rentalRatePerDay;
    }

    // Calculate and return the total rental cost for the specified number of days
    public double calculateRentalCost(int days) {
        return rentalRatePerDay * days;
    }

    @Override
    public String toString() {
        return "Vehicle Number: " + vehicleNumber + "\nManufacturer: " + manufacturer + "\nModel: " + model
                + "\nRental Rate per Day: RM " + rentalRatePerDay;
    }
}