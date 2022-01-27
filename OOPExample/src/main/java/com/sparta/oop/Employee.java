package com.sparta.oop;

public class Employee extends Person
      //  , CostCentre // can't have multiple superclasses in Java
{
    private String departmentName;
    private double salary;

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Employee(){
        super();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "departmentName='" + departmentName + '\'' +
                ", salary=" + salary +
                "} " + super.toString();
    }

    @Override
    public void delete() {
        System.out.println("This person has left the company");
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
