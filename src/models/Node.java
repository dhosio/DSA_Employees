package models;

// This is the class that will hold the components of a node in the circular double linked list
public class Node<Employee> {

    // The node will have data of type employee
    public Employee nodeValue;

    // A reference to the next node in the list
    public Node<Employee> nextNode;

    // A reference to the previous node in the list
    public Node<Employee> prevNode;

    // Constructor
    public Node(Employee newValue){
        this.nodeValue = newValue;
    }

    // To check if the node is valid
    public boolean isValid(){
        if ( nodeValue == null && (nextNode == null || prevNode == null) ) return false;

        return true;
    }
}
