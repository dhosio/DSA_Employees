package models;

// This is the class that will hold the components of a node in the circular double linked list
public class Node<T> {

    // The node will have data of type employee
    public T nodeValue;

    // A reference to the next node in the list
    public Node<T> nextNode;

    // A reference to the previous node in the list
    public Node<T> prevNode;

    // Constructor
    public Node(T newValue){
        this.nodeValue = newValue;
    }

    // To check if the node is valid
    public boolean isValid(){
        if ( nodeValue == null && (nextNode == null || prevNode == null) ) return false;

        return true;
    }
}
