package models;

import interfaces.IEmpView;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;

public class Employee implements IEmpView {

    // models.Employee class variables
    static int numberOfEmployees = 1;

    // models.Employee Instance Variables
    int employeeID;
    String firstName;
    String lastName;
    String address;
    int telephoneNumber;
    String email;
    Date dateJoined;
    String highestQualification;

    public Employee(String firstName, String lastName, String address, int telephoneNumber, String email, Date dateJoined, String highestQualification) {
        this.employeeID = numberOfEmployees++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.dateJoined = dateJoined;
        this.highestQualification = highestQualification;
    }

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

        int fCounter = 1, mCounter = 1;

        System.out.format("\nYou are currently using the %s class. \nIt has the following variables: \n", className);
        for (Field field : variables){
            System.out.println(fCounter + ". " + field.getName());
            fCounter ++;
        }
        System.out.println("\nAnd the following methods: ");
        for (Method method : methods){
            System.out.println(mCounter + ". " + method.getName() + "()");
            mCounter ++;
        }
    }
}