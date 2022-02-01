package com.sparta.oop;

import java.util.ArrayList;

/**
 * @since 2.0
 */
public class RetailStore {
    // single line comment
    /*
      multi-line comment
     */

    /**
     * JavaDoc comment
     *
     * @param args
     * The array of Strings which contains the program arguments
     *
     * @since 9.0
     */
    public static void main(String[] args) {
        Customer jyoti = new Customer("Jyoti", "Suresh", 1234);
        System.out.println(jyoti);

        Customer sami = new Customer();
        sami.setFirstName("Sami");
        try {
            sami.setDeliveryAddress(null);
        } catch(IllegalArgumentException e){
            System.err.println(e);
        }
        sami.setFirstName("Sami2");
        System.out.println(sami);
        System.out.println(sami.getDeliveryAddress());
        sami.delete();

        Employee e = new Employee("Brandon", "Johnson");
        e.setDepartmentName("Java Engineering");
        e.setSalary(100000.00);
        System.out.println(e);
        e.delete();

//        Person antony = new Person();
//        antony.setFirstName("Antony");
//        antony.setLastName("Ademefun");
//        System.out.println(antony);

        Person thePerson = new Customer(); // why does this work? a customer IS A person
        // Person testVariable = new ArrayList(); // an arraylist IS NOT A person
        // thePerson = new Person();
        System.out.println(thePerson.getLastName());
        System.out.println(thePerson); // polymorphism in action
    }
}
