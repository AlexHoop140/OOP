package lab3;

public class StudentNode {
    private Student data;
    public StudentNode next;
    private StudentNode sorted;

    public StudentNode(){
        data = new Student();
        next = null;
    }

    public StudentNode(Student s){
        data = new Student(s);
        next = null;
    }

    public void appendToTail(Student s){
        StudentNode end = new StudentNode(s);
        StudentNode n = this;
        while (n.next != null){
            n = n.next;
        }
        n.next = end;
    }

    public StudentNode deleteNode(StudentNode head, Student s){
        if(head == null) return null;
        StudentNode n = head;

        if(n.data.getId().equals(s.getId())){
            return head.next;
        }

        while(n.next != null){
            if(n.next.data.getId().equals(s.getId())){
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        return head;
    }

    public void print(){
        StudentNode curr = this;
        if(curr.next == null)
            System.out.println("Empty list!");
        else
            while(curr.next != null){
                curr.next.data.show();
                curr = curr.next;
            }
    }

    void insertionSort(StudentNode head)
    {
        sorted = null;
        StudentNode current = head;

        while (current != null)
        {
            StudentNode next = current.next;
            sortedInsert(current);
            current = next;
        }
        head = sorted;
    }

    public StudentNode sortedInsert(StudentNode newnode)
    {
        if ((sorted == null) || (sorted.data.getName().compareTo(newnode.data.getName()) >= 0))
        {
            newnode.next = sorted;
            sorted = newnode;
        }
        else
        {
            StudentNode current = sorted;
            while (current.next != null && current.next.data.getName().compareTo(newnode.data.getName()) < 0)
            {
                current = current.next;
            }
            newnode.next = current.next;
            current.next = newnode;
        }

        return newnode;

    }

    public Student getData() {
        return data;
    }
}
