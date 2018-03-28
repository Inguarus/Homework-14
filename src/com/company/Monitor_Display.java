package com.company;

public class Monitor_Display implements Sort_Range {

    private Manufacturer manufacturer;
    private int model;
    private double screenDiagonal;
    private int value;
    private int yearOfIssue;

    public Monitor_Display(Manufacturer manufacturer, int model, double screenDiagonal, int value, int yearOfIssue) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.screenDiagonal = screenDiagonal;
        this.value = value;
        this.yearOfIssue = yearOfIssue;
    }


    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
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
        return "Monitor_Display{" +
                "manufacturer = '" + manufacturer + '\'' +
                ", model = '" + model + '\'' +
                ", screenDiagonal = " + screenDiagonal +
                ", value = " + value +
                ", yearOfIssue = " + yearOfIssue +
                '}';
    }
}
