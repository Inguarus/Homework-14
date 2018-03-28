package com.company;


public class Phone implements Sort_Range {

    private Manufacturer manufacturer;
    private int model;
    private double screenDiagonal;
    private int batteryCapacity;
    private double value;
    private int yearOfIssue;

    public Phone(Manufacturer manufacturer, int model, double screenDiagonal, int batteryCapacity, double value, int yearOfIssue) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.screenDiagonal = screenDiagonal;
        this.batteryCapacity = batteryCapacity;
        this.value = value;
        this.yearOfIssue = yearOfIssue;
    }


    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }


    @Override
    public int getYearOfIssue() {
        return yearOfIssue;
    }

    @Override
    public double getValue() {
        return value;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "manufacturer = '" + manufacturer + '\'' +
                ", model = '" + model + '\'' +
                ", screenDiagonal = " + screenDiagonal +
                ", batteryCapacity = " + batteryCapacity +
                ", value = " + value +
                ", yearOfIssue = " + yearOfIssue +
                '}';
    }
}
