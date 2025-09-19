class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head;

    public void beginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void end(int data){

        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null){
            current = current.next;

        }
        current.next = newNode;

    }

    public void print(){
        Node current = head;
        while (current != null){
            System.out.print(current.data+"->");
            current = current.next;
        }
    }
}

public class main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.beginning(10);
        list.beginning(20);
        list.beginning(30);
        list.end(12);
        list.print();
    }
}
