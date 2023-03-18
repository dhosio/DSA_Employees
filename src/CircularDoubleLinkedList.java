import interfaces.ADTListInterface;
import models.Node;

public class CircularDoubleLinkedList<T> implements ADTListInterface<T> {

    // Class List variables
    static int length = 0;
    Node<T> head;
    Node<T> tail;

    @Override
    public void createList() {

    }

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean findNode(Object nodeToFind) {
        return false;
    }

    @Override
    public String printList() {
        return null;
    }

    @Override
    public void insertStart(Object newNode) {

    }

    @Override
    public void insertAtPosition(int position, Object newNode) {

    }

    @Override
    public void insertEnd(Object newNode) {

    }

    @Override
    public void deleteStart(Object toDelete) {

    }

    @Override
    public void deleteEnd(Object toDelete) {

    }
}
