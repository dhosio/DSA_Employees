import interfaces.IEmpView;
import tests.IEmpViewTest;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;

public class Employee implements IEmpView {

    // Employee Class Variables
    int employeeID;
    String firstName;
    String lastName;
    String address;
    int telephoneNumber;
    String email;
    Date dateJoined;
    String highestQualification;

    // Getter and Setter Methods
    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(Date dateJoined) {
        this.dateJoined = dateJoined;
    }

    public String getHighestQualification() {
        return highestQualification;
    }

    public void setHighestQualification(String highestQualification) {
        this.highestQualification = highestQualification;
    }

    // Inherited method from the IEmpView interface
    @Override
    public void display() {
        // Method to show relevant information about the class
        String className = this.getClass().getName();
        Field[] variables = this.getClass().getDeclaredFields();
        Method[] methods = this.getClass().getDeclaredMethods();

        System.out.format("You are currently using the %s class. It has the following variables: \n", className);
        for (Field field : variables){
            System.out.println(field.getName());
        }
        System.out.println("And the following methods: ");
        for (Method method : methods){
            System.out.println(method.getName() + "()");
        }
    }
}
