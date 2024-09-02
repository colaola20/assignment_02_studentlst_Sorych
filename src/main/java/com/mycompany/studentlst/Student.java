package com.mycompany.studentlst;

/**
 *
 * @author MoaathAlrajab
 */
public class Student {

    private String name;

    //To Do 01: add a constructor to this class
    /**
     * Student class's constructor which takes a String name as a parameter and assigns this.name with name.
     * @param name
     */
    public Student(String name) {
        this.name = name;
    }
    // To Do 02: Add setters and getters

    /**
     * Set method for the private field name which accepts a String name as a parameter and has void return type
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get method for the private field name which takes no parameters and returns the String name
     * @return String name
     */
    public String getName() {
        return name;
    }



}
