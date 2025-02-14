package practice.miscellinious;

public class SinglyLinkedList {

    private Node head;

    public void insert(int data){
        Node newNode = new Node(data);

        if(head == null)
        {
            head = newNode;
        }else {
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public  void  display(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data+" ");
            temp= temp.next;

        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Inserting nodes into the linked list
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Singly Linked List:");
        list.display();

    }


}
