package tests;

import interfaces.IEmpView;

// Class that inherits from the IEmpView Interface
public class IEmpViewTest implements IEmpView {

    @Override
    public void display() {
        // Method to show relevant information about the class

        String className = IEmpViewTest.class.getName();

        System.out.format("You are currently using the %s class", className);

    }
}
