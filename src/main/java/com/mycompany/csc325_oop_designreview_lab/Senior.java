package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student {
    //Member Variable
    private int credits;

    /**
     * Parameterized Constructor, name, age, credits. If student has less than 85 credits error is thrown. Must have 85 credits to be a senior.
     */
    public Senior(String name, short age, int credits) {
        super(name,age);
        this.credits = credits;

        if(this.credits < 85) {
            throw new RuntimeException();
        }
    }

    /**
     * To string override provides a string representation of senior object
     */
    @Override
    public String toString() {
        return "Senior{" +
                "name=" + this.getName() + " " +
                "address=" + this.getAddress() + " " +
                "age=" + this.getAge() + " " +
                "gpa=" + this.getGpa() + " " +
                "credits=" + credits +
                '}';
    }
}
