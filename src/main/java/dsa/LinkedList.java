package dsa;

public class LinkedList {
    Node head;
    Node next;
    public void insert(int data){
        Node node=new Node();
        node.data=data;
        node.next=null;
        if(head==null){
            head=node;
        }
        else{
            Node n=head;
            while(n.next!=null){
                n=n.next;
            }
            n.next=node;
        }
    }

    public void show(){
        Node n=head;
        while(n.next!=null){
            System.out.print(n.data+"--->");
            n=n.next;
        }
        System.out.print(n.data);
    }

    public void insertAtStart(int data){
        Node node=new Node();
        node.data=data;
        node.next=null;
        Node n=head;
        if(n!=null){
            node.next=head;
            head=node;
        }
        else{
            head=node;
        }
    }
    public void insertAt(int index,int data){
        Node node=new Node();
        node.data=data;
        node.next=null;
        if(index==0){
            insertAtStart(data);
        }
        else{
            Node n=head;
            for(int i=0;i<index;i++){
                n=n.next;
            }
            node.next=n.next;
            n.next=node;
        }
    }
    public void deleteAt(int index) {
        Node n = head;
        if (index == 0) {
            head = head.next;
        } else {
            for (int i = 0; i < index; i++) {
                n = n.next;
            }
            n.next=n.next.next;
        }
    }

    public void deleteElement(int data) {
        Node n = head;
        while (n.next != null) {
            if (n.next.data == data) {

                n.next = n.next.next;
            }

            n = n.next;

        }
    }
}
