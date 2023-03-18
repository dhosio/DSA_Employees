package interfaces;

//  The interface that will hold the methods to be inherited by the circular linked list class
public interface ADTListInterface<T> {

    // To create the circular double linked list
    void createList();

    // To get the number of all employees in the list
    int getLength();

    // To check if the list is empty
    boolean isEmpty();

    // Find a specific node in the list
    boolean findNode(T nodeToFind);

    // Print the content of the list
    String printList();

    // To add a new employee at the beginning
    void insertStart(T newNode);

    // To insert at a specific position in the list
    void insertAtPosition(int position, T newNode);

    // To insert at the end
    void insertEnd(T newNode);

    // To remove a new employee at the beginning
    void deleteStart(T toDelete);

    // To remove at the end
    void deleteEnd(T toDelete);

}