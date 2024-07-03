package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student {

    //Member Variable
    private int credits;

    /**
     * Returns credits of current instance
     */
    public int getCredits() {
        return credits;
    }

    /**
     * Sets credits of current instance
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }

    /**
     * Parameterized Constructor, name, age, credits
     */
    public Freshman(String name, short age, int credits) {
        super(name,age);
        this.credits = credits;
    }

    /**
     * To string override provides a string representation of freshman object
     */
    @Override
    public String toString() {
        return "Freshman{" +
                "name=" + this.getName() + " " +
                "address=" + this.getAddress() + " " +
                "age=" + this.getAge() + " " +
                "gpa=" + this.getGpa() + " " +
                "credits=" + credits +
                '}';
    }
}
