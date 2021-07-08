package com.Teta.July8;

import java.time.LocalDate;

/**
 * This class is responsible for accessing data and parsing it to {@link Company} where the data is stored.
 * @author Branimir
 */
public class Employee {

    private String name;
    private LocalDate yearOfJoining;
    private String address;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setYearOfJoining(LocalDate yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public LocalDate getYearOfJoining() {
        return yearOfJoining;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String name, LocalDate yearOfJoining, String address, double salary) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
        this.salary = salary;
    }

    /**
     * This method gets the time the employee had spent in the company.
     * @return Years spent in the company
     */
    public int getYearsInComp() {
        return LocalDate.now().getYear() - this.yearOfJoining.getYear();
    }
}

