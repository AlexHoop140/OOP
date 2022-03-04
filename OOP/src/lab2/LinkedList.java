package lab2;

public class LinkedList {
    class Node{
        String data;
        Node next;

        Node(){
            next = null;
        }
        Node(String d){
            data = d;
            next = null;
        }
    }

    private Node head;
    private Node curr = new Node();

    public LinkedList(){
        head = new Node();
    }

    public void reset(){
        curr = head;
    }

    public void advance(){
        curr = curr.next;
    }

    public boolean hasElement(){
        return curr.next == null;
    }

    public void moveToEnd(){
        while(curr.next != null)
            curr = curr.next;
    }

    public String current(){
        return curr.next.data;
    }

    public void insert(String s){
        Node t = new Node(s);
        t.next = curr.next;
        curr.next = t;
    }

    public void delete(){
        Node t = new Node();
        if(curr.next != null){
            t = curr.next;
            curr.next = t.next;
        }
    }
}
