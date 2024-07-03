/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
    //member variables
    private double gpa;
    private String address;


    public Student() {
        super(null, (short) 0);
        this.gpa = 0;
    }

    /**
     * Returns gpa of current instance
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * Sets gpa of current instance
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    /**
     * Sets address of current instance
     */
    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Returns address of current instance
     */
    @Override
    public String getAddress() {
        return this.address;
    }

    /**
     * Parameterized Constructor, name and age
     */
    public Student(String name, short age) {
        super(name, age);
    }

    /**
     * Parameterized Constructor, name, age, and gpa
     */
    public Student(String name, short age, double gpa) {
        super(name,age);
        this.gpa = gpa;
    }

    /**
     * To string override provides a string representation of student object
     */
    @Override
    public String toString() {
        return "Student{" +
                "name=" + this.getName() + " " +
                "address=" + this.getAddress() + " " +
                "age" + this.getAge() + " " +
                "gpa=" + gpa +
                '}';
    }

    // ToDo 1: Make this class a child of Human (DONE)

	// ToDo 2: Fix the resulting errors (DONE)

	// ToDo 3: Add a field for GPA and create a setter and a getter (DONE)
	
	// ToDo 4: Add comments to your code (DONE)
}
