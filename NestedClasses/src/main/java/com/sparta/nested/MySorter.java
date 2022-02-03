package com.sparta.nested;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MySorter<Zed> {
    private class CustomerComparator implements Comparator<Customer> {
        @Override
        public int compare(Customer o1, Customer o2) {
            return o1.getLastName().compareTo(o2.getLastName());
        }
    }
    public <Zed extends Comparable<Zed>> void sort(List<Zed> theList){
        Collections.sort(theList);
    }
    public void sortCustomers(List<Customer> theList){
        CustomerComparator c = new CustomerComparator();
        Collections.sort(theList, c);
    }
}
