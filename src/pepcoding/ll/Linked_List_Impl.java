package pepcoding.ll;

public class Linked_List_Impl {

    //Node class for Node Structure
    public static class Node {
        int data;
        Node next;
    }

    //Linked List class for data and method related to Linked List
    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        /*Function to add value at the end of linked list*/
        void addLast(int val) {
            System.out.println("Inserted Value : " + val);
            Node newNode = new Node();
            newNode.data = val;
            newNode.next = null;

            if(size == 0) {
                head = tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        /* Function to display all the Linked List Data */
        public void display() {
            Node temp = head;
            System.out.println("Displaying all Data : ");
            while(temp != tail) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.addLast(5);
        l1.addLast(10);
        l1.addLast(15);
        l1.addLast(20);

        l1.display();
    }

}
