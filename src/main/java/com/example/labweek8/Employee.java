package com.example.labweek8;

import java.sql.Date;

public class Employee {
    private int id;
    private String name;
    private Date birthday;
    private String department;
    private String email;
    private double salary;

    // Default constructor
    public Employee() {}

    // Parametrized constructor
    public Employee(int id, String name, Date birthday, String department, String email, double salary) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.department = department;
        this.email = email;
        this.salary = salary;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}