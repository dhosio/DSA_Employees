import interfaces.ADTListInterface;
import models.Node;

import java.util.List;

public class CircularDoubleLinkedList<T> implements ADTListInterface<T> {

    // Class List variables
    static int length;
    Node<T> head;
    Node<T> tail;


    // Class constructor
    public CircularDoubleLinkedList() {
        length = 0;
        head = null;
        tail = null;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public boolean isEmpty() {
        return head == null || length == 0;
    }

    @Override
    public boolean findNode(Node<T> nodeToFind) {
        // Counter to keep track of the list elements
        int counter = 0;

        if (isEmpty()) {

            // Create a temp node
            Node<T> current = head;

            while (current.nextNode != null) {

                // Check if the data matches
                if (nodeToFind.nodeValue.equals(current.nodeValue)) {
                    return true;
                }

                // If not matched, move to the next node
                current = current.nextNode;
                counter++;

                if (counter == getLength()) return false;

            }
        }
        return false;
    }

    @Override
    public void printList() {
        Node current = head;

        if (isEmpty()) System.out.println("\n\n--- The list is empty ---\n\n");

        // Traverse the list
        while (current != null){
            System.out.println(current);
            current = current.nextNode;
        }

        // End of the list
        System.out.println("\n\n--- End of the list ---\n\n");
    }

    @Override
    public void insert(T newNodeVal) {
        // Create the new node
        Node<T> createdNode = new Node<T>(newNodeVal);

        // Check if the list is empty
        if (isEmpty()){
            // Then new node is the head node
            head = createdNode;
            // Because it is also the last node
            tail = head;
            length++;
            return;
        }
        // If there are other elements
        createdNode.nextNode = head;
        head = createdNode;
        length++;
    }

    @Override
    public Node<T> remove(Node<T> toRemove) {
        // To remove the fist element in the list
        if (isEmpty()) System.out.println("Cannot remove from an empty list");

        Node<T> currentNode = head;
        head = head.nextNode;
        currentNode.nextNode = null;
        length--;

        // Check if list is empty
        if (isEmpty()) {
            head = null;
            tail  = null;
            length = 0; // Reset length to 0
        }

        return currentNode;
    }

    @Override
    public void findByPhoneNumber(int phoneNumber) {

    }

    @Override
    public void findByLastName(String lastName) {
        // Traverse the list
        if (isEmpty()) System.out.println("There are no node in the list");





    }

    @Override
    public List<T> findAllByQualification(String qualification) {
        return null;
    }
}
