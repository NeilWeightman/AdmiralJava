package com.sparta.oop;

import java.io.Serializable;

public class Customer extends Person implements Comparable<Customer>, Serializable {
    private int customerId; // default zero

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        if(deliveryAddress == null)
            throw new IllegalArgumentException("deliveryAddress can't be null");
        this.deliveryAddress = deliveryAddress;
    }

    private String deliveryAddress;

    // methods should generally be public, but protected or private are fine

    public Customer(String firstName, String lastName, int customerId) {
        super(firstName, lastName);
        this.customerId = customerId;
    }
    // DRY don't repeat yourself
    public Customer(String lastName, int customerId) {
        this("no-name", lastName, customerId);
    }

    public Customer() {
        this("no-name", "no-name", -1);
    }

    @Override
    public final void delete() {
        System.out.println("This customer has closed their account");
    }

    public String toString(){
        return "Customer #" + this.customerId + " : "
                + getFirstName() + " " + getLastName();
    }

    public int getCustomerId() {
        return customerId;
    }

    public int compareTo(Customer other){
        return getLastName().compareTo(other.getLastName());
    }

}
