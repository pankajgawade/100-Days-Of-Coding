public class LL{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Node head = null;
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void display(){
        Node currNode = head;
        if(head==null){
            System.out.println("Linked list is empty");
        }
        while(currNode!=null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst(15);
        list.addFirst(20);
        list.addFirst(40);
        list.display();
    }
}