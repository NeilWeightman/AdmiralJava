package com.sparta.oop;

public class Customer {
    // ALL instance variables should be private, never public **possibly** protected
    // default or package access - avoid using this
    private String firstName = "dummy"; // default null unless assigned like this
    private String lastName; // default null
    private int customerId; // default zero

    // methods should generally be public, but protected or private are fine

    public Customer(String firstName, String lastName, int customerId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerId = customerId;
    }
    // DRY don't repeat yourself
    public Customer(String lastName, int customerId) {
        this("no-name", lastName, customerId);
    }

    public Customer() {
        this("no-name", "no-name", -1);
    }

    public String toString(){
        return "Customer #" + this.customerId + " : "
                + firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCustomerId() {
        return customerId;
    }

}
