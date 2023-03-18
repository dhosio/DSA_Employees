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
        return length == 0 ? true : false;
    }

    @Override
    public boolean findNode(Node<T> nodeToFind) {
        // Counter to keep track of the list elements
        int counter = 0;

        // Create a temp node
        Node<T> temp = head;

        while (temp.nextNode != null){

            // Check if the data matches
            if (nodeToFind.nodeValue.equals(temp.nodeValue)){
                return true;
            }

            // If not matched, move to the next node
            temp = temp.nextNode;
            counter++;
            if (counter == getLength()) return false;

        }
        return false;
    }

    @Override
    public String printList() {
        return null;
    }

    @Override
    public void insert(Node<T> newNode) {

    }

    @Override
    public void remove(Node<T> toRemove) {

    }

    @Override
    public void findByPhoneNumber(int phoneNumber) {

    }

    @Override
    public void findByLastName(String lastName) {

    }

    @Override
    public List<T> findAllByQualification(String qualification) {
        return null;
    }
}
