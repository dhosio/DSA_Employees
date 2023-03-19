package interfaces;

import models.Node;

import java.util.List;

//  The interface that will hold the methods to be inherited by the circular linked list class
public interface ADTListInterface<T> {

    // To get the number of all employees in the list
    int getLength();

    // To check if the list is empty
    boolean isEmpty();

    // Find a specific node in the list
    boolean findNode(Node<T> nodeToFind);

    // Print the content of the list
    void printList();

    // To add a new employee at the beginning
    void insert(T newNodeVal);

    // To remove an employee from the list
    Node<T> remove(Node<T> toRemove);

    // To find an employee by their Phone Number
    void findByPhoneNumber(int phoneNumber);

    // To find an employee by their last name
    void findByLastName(String lastName);

    // To find all employees with a specific qualification
    List<T> findAllByQualification(String qualification);

}