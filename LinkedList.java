class LinkedList
{
    Node head;
    private int size;
    LinkedList(){
        size =0;
    }
    public class Node {
        String data;
        Node next;
        Node(String data)
        {
            this.data=data;
            this.next=null;
            size++;
        }
        
    }
    public void addFirst(String data)
    {
        Node newNode =new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data)
    {
        Node newNode =new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node lastNode=head;
        while(lastNode.next!=null)
        {
            lastNode=lastNode.next;
        }
        lastNode.next=newNode;
    }
    public void printList()
    {
        Node currNode=head;
        while (currNode!=null) {
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("null");
    }
    public void removeFirst()
    {
        if(head==null)
        {
            System.out.println("Empty List, nothing to delete");
            return;
        }
        head=this.head.next;
        size--;
    }
    public void removeLast()
    {
        if (head==null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }
        size--;
        if(head.next==null)
        {
            head=null;
            return;
        }
        Node currNode= head;
        Node lastNode=head.next;
        while (lastNode.next!=null) { 
            currNode=currNode.next;
            lastNode=lastNode.next;
        }
        currNode.next=null;
    }
    public int getSize()
    {
        return size;
    }
    public void reverseList()
    {
        if(head==null||head.next==null)
        {
            return;
        }
        Node prevNode=head;
        Node currNode = head.next;
        while (currNode!=null) 
        {
            Node nextNode =currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;    
        }
        head.next=null;
        head=prevNode;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("a");
        list.addLast("b");
        list.addLast("c");
        list.addLast("d");
        list.printList();
        list.removeFirst();
        list.removeLast();
        list.printList();
    }
}