package com.company;

public class Laptop implements Sort_Range {


    private Manufacturer manufacturer;
    private int model;
    private double screenDiagonal;
    private int ram;
    private int value;
    private int yearOfIssue;

    public Laptop(Manufacturer manufacturer, int model, double screenDiagonal, int ram, int value, int yearOfIssue) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.screenDiagonal = screenDiagonal;
        this.ram = ram;
        this.value = value;
        this.yearOfIssue = yearOfIssue;
    }


    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public int getRam() {
        return ram;
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
        return "Laptop{" +
                "manufacturer = '" + manufacturer + '\'' +
                ", model = '" + model + '\'' +
                ", screenDiagonal = " + screenDiagonal +
                ", ram = " + ram +
                ", value = " + value +
                ", yearOfIssue = " + yearOfIssue +
                '}';
    }

}
