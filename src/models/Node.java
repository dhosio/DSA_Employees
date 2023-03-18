package models;

// This is the class that will hold the components of a node in the circular double linked list
public class Node<T> {

    // The node will have data of type employee
    T nodeValue;

    // A reference to the next node in the list
    Node<T> nextNode;

    // A reference to the previous node in the list
    Node<T> prevNode;

    // Constructor
    public Node(T newValue){
        this.nodeValue = newValue;
    }
}
