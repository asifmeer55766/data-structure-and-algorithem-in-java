
class Node {

    // node for data and reference part 
    int data;// the actual data part 
    Node next; // here it is reference part 

    Node(int data) {//constructur to store values , when objects create
        this.data = data;
        this.next = null;// null , because we assume at first that it is last node 
    }
}

public class LinkedList {

    Node head;

    public void addNode(int data) {// add a new node on linkedlist 
        Node newNode = new Node(data);//objects creations

        if (head == null) {// if head equals to null then it means it is the first node 
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) { // current is temporary variable use to traverse the loop
            current = current.next;
        }
        current.next = newNode;

    }

    public void printList() {// function to print the value of linkedlist 
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        LinkedList link = new LinkedList(); // actual object creation at main function 
        link.addNode(10);
        link.addNode(20);
        link.addNode(30);
        link.printList();

    }
}
