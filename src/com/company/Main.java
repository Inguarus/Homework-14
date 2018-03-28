package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {

        List<Phone> phoneList = new ArrayList<>();

        phoneList.add(new Phone(Manufacturer.SAMSUNG, 5700, 5.5, 4100, 7800, 2017));
        phoneList.add(new Phone(Manufacturer.LG, 45, 5.0, 5000, 6200, 2015));
        phoneList.add(new Phone(Manufacturer.LENOVO, 850, 6.0, 3800, 5800, 2014));
        phoneList.add(new Phone(Manufacturer.APPLE, 5, 4.7, 4650, 10200, 2018));

        Collections.sort(phoneList, new Comparator<Phone>() {
            @Override
            public int compare(Phone o1, Phone o2) {
                return Integer.compare(o1.getBatteryCapacity(), o2.getBatteryCapacity());
            }
        });

        File file = new File("commonList.txt");
        if (!file.exists()) {
            file.createNewFile();
        }

        PrintWriter printWriter = new PrintWriter(file);

        for (int i = 0; i < phoneList.size(); i++) {
            System.out.println(phoneList.get(i).toString());
            printWriter.println(phoneList.get(i).toString());
        }
        System.out.println("___________________________________________");
        printWriter.println("___________________________________________");


        List<Laptop> laptopList = new ArrayList<>();

        laptopList.add(new Laptop(Manufacturer.SAMSUNG, 852, 16.5, 3, 7500, 2014));
        laptopList.add(new Laptop(Manufacturer.ACER, 7800, 18, 4, 8200, 2011));
        laptopList.add(new Laptop(Manufacturer.APPLE, 450, 17, 2, 13500, 2016));
        laptopList.add(new Laptop(Manufacturer.LENOVO, 3000, 19, 1, 9900, 2018));

        Collections.sort(laptopList, new Comparator<Laptop>() {
            @Override
            public int compare(Laptop o1, Laptop o2) {
                return Integer.compare(o1.getRam(), o2.getRam());
            }
        });

        for (int i = 0; i < laptopList.size(); i++) {
            System.out.println(laptopList.get(i).toString());
            printWriter.println(laptopList.get(i).toString());
        }
        System.out.println("___________________________________________");
        printWriter.println("___________________________________________");


        List<Monitor_Display> monitor_displayList = new ArrayList<>();

        monitor_displayList.add(new Monitor_Display(Manufacturer.VAIO, 4000, 24, 7000, 2012));
        monitor_displayList.add(new Monitor_Display(Manufacturer.SONY, 5522, 22, 7600, 2010));
        monitor_displayList.add(new Monitor_Display(Manufacturer.SAMSUNG, 9000, 26, 8300, 2014));
        monitor_displayList.add(new Monitor_Display(Manufacturer.LG, 3350, 18, 6400, 2017));

        Collections.sort(monitor_displayList, new Comparator<Monitor_Display>() {
            @Override
            public int compare(Monitor_Display o1, Monitor_Display o2) {
                return Double.compare(o1.getScreenDiagonal(), o2.getScreenDiagonal());
            }
        });

        for (int i = 0; i < monitor_displayList.size(); i++) {
            System.out.println(monitor_displayList.get(i).toString());
            printWriter.println(monitor_displayList.get(i).toString());
        }
        System.out.println("___________________________________________");
        printWriter.println("___________________________________________");


        List<Sort_Range> commonList = new ArrayList<>();
        commonList.addAll(phoneList);
        commonList.addAll(laptopList);
        commonList.addAll(monitor_displayList);

        System.out.println("The range of online store:");
        printWriter.println("The range of online store:");
        System.out.println();
        printWriter.println();
        for (int i = 0; i < commonList.size(); i++) {
            System.out.println(commonList.get(i).toString());
            printWriter.println(commonList.get(i).toString());
        }
        printWriter.println();

        System.out.println();
        System.out.println("If you want to sort the range by value in ascending order, press 1");
        System.out.println("If you want to sort the range by value in descending order, press 2");
        System.out.println("If you want to sort the range by year of issue, press 3");
        System.out.println("If you want to sort the range by manufacturer, press 4");

        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            String inputString = input.readLine();

            if (Integer.parseInt(inputString) == 1) {
                Collections.sort(commonList, new Comparator<Sort_Range>() {
                    @Override
                    public int compare(Sort_Range o1, Sort_Range o2) {
                        return Double.compare(o1.getValue(), o2.getValue());
                    }
                });
                System.out.println("SORT BY VALUE IN ASCENDING ORDER");
                printWriter.println("SORT BY VALUE IN ASCENDING ORDER");
                for (int i = 0; i < commonList.size(); i++) {
                    System.out.println(commonList.get(i).toString());
                    printWriter.println(commonList.get(i).toString());
                }
            } else if (Integer.parseInt(inputString) == 2) {
                Collections.sort(commonList, new Comparator<Sort_Range>() {
                    @Override
                    public int compare(Sort_Range o1, Sort_Range o2) {
                        return Double.compare(o2.getValue(), o1.getValue());
                    }
                });
                System.out.println("SORT BY VALUE IN DESCENDING ORDER");
                printWriter.println("SORT BY VALUE IN DESCENDING ORDER");
                for (int i = 0; i < commonList.size(); i++) {
                    System.out.println(commonList.get(i).toString());
                    printWriter.println(commonList.get(i).toString());
                }
            } else if (Integer.parseInt(inputString) == 3) {
                Collections.sort(commonList, new Comparator<Sort_Range>() {
                    @Override
                    public int compare(Sort_Range o1, Sort_Range o2) {
                        return Integer.compare(o1.getYearOfIssue(), o2.getYearOfIssue());
                    }
                });
                System.out.println("SORT BY YEAR OF ISSUE");
                printWriter.println("SORT BY YEAR OF ISSUE");
                for (int i = 0; i < commonList.size(); i++) {
                    System.out.println(commonList.get(i).toString());
                    printWriter.println(commonList.get(i).toString());
                }
            } else if (Integer.parseInt(inputString) == 4) {
                System.out.println("Choose the manufacturer:");
                System.out.println("SAMSUNG: press 1");
                System.out.println("LG: press 2");
                System.out.println("LENOVO: press 3");
                System.out.println("APPLE: press 4");
                System.out.println("SONY: press 5");
                System.out.println("VAIO: press 6");
                System.out.println("ACER: press 7");
                String inputStringChoose = input.readLine();
                System.out.println("SORT BY MANUFACTURER");
                printWriter.println("SORT BY MANUFACTURER");
                if (Integer.parseInt(inputStringChoose) == 1) {
                    for (int i = 0; i < commonList.size(); i++) {
                        if (commonList.get(i).getManufacturer() == Manufacturer.SAMSUNG) {
                            System.out.println(commonList.get(i));
                            printWriter.println(commonList.get(i));
                        }
                    }
                } else if (Integer.parseInt(inputStringChoose) == 2) {
                    for (int i = 0; i < commonList.size(); i++) {
                        if (commonList.get(i).getManufacturer() == Manufacturer.LG) {
                            System.out.println(commonList.get(i));
                            printWriter.println(commonList.get(i));
                        }
                    }
                } else if (Integer.parseInt(inputStringChoose) == 3) {
                    for (int i = 0; i < commonList.size(); i++) {
                        if (commonList.get(i).getManufacturer() == Manufacturer.LENOVO) {
                            System.out.println(commonList.get(i));
                            printWriter.println(commonList.get(i));
                        }
                    }
                } else if (Integer.parseInt(inputStringChoose) == 4) {
                    for (int i = 0; i < commonList.size(); i++) {
                        if (commonList.get(i).getManufacturer() == Manufacturer.APPLE) {
                            System.out.println(commonList.get(i));
                            printWriter.println(commonList.get(i));
                        }
                    }
                } else if (Integer.parseInt(inputStringChoose) == 5) {
                    for (int i = 0; i < commonList.size(); i++) {
                        if (commonList.get(i).getManufacturer() == Manufacturer.SONY) {
                            System.out.println(commonList.get(i));
                            printWriter.println(commonList.get(i));
                        }
                    }
                } else if (Integer.parseInt(inputStringChoose) == 5) {
                    for (int i = 0; i < commonList.size(); i++) {
                        if (commonList.get(i).getManufacturer() == Manufacturer.VAIO) {
                            System.out.println(commonList.get(i));
                            printWriter.println(commonList.get(i));
                        }
                    }
                } else if (Integer.parseInt(inputStringChoose) == 5) {
                    for (int i = 0; i < commonList.size(); i++) {
                        if (commonList.get(i).getManufacturer() == Manufacturer.ACER) {
                            System.out.println(commonList.get(i));
                            printWriter.println(commonList.get(i));
                        }
                    }
                } else {
                    System.out.println("There is no such option.");
                }
            } else {
                System.out.println("There is no such option.");
            }
            printWriter.flush();
            printWriter.close();
            System.out.println();
        } catch (NumberFormatException e) {
        }
    }
}








