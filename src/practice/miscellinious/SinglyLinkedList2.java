package practice.miscellinious;

class Node{
    int data;
    Node next;

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

}

public class SinglyLinkedList2 {

    private  Node head;

    public void insert(int data){
        Node newNode = new Node(data);

        if(head == null)
        {
            head = newNode;
        }
        else {
            Node temp = head;
            while(temp.next != null){
                temp= temp.next;
            }
            temp.next = newNode;
        }
    }

    public  void dispaly(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
        System.out.println(temp);


    }

    public static void main(String[] args) {
        SinglyLinkedList2 list = new SinglyLinkedList2();
        list.insert(10);
        list.insert(67);
        list.insert(55);
        list.insert(77);

        list.dispaly();

    }


}
