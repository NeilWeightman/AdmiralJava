package com.sparta.basics;

import java.util.Objects;

public class Customer {
    private String firstName; // default null
    private String lastName; // default null

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age; // default 0
    // for primitive types, the default is 0 (integer types), 0.0 (floating point), false, '\0'

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String email; // default null

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer() {
    }

    @Override
    // overriding the equals method inherited from Object
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o; // typecast cast from Object to Customer
        return Objects.equals(firstName, customer.firstName) && Objects.equals(lastName, customer.lastName)
                && Objects.equals(email, customer.email);
    }

    @Override
    // for 2 objects which are equal (according to .equals()) the hashCode values should be the same
    public int hashCode() {
        return Objects.hash(firstName, lastName, email);
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
}
