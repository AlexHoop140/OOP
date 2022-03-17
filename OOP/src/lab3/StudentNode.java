package lab3;

public class StudentNode {
    private Student data;
    public StudentNode next;
    private StudentNode sorted;

    public StudentNode(){
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

        if(n.data == s){
            return head.next;
        }

        while(n.next != null){
            if(n.next.data == s){
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        return head;
    }

    public void print(){
        StudentNode curr = this;
        while(curr.next != null){
            curr.next.data.show();
            curr = curr.next;
        }
    }

    public StudentNode mergeSort(StudentNode head)
    {
        if (head.next == null)
            return head;

        StudentNode mid = findMid(head);
        StudentNode head2 = mid.next;
        mid.next = null;
        StudentNode newHead1 = mergeSort(head);
        StudentNode newHead2 = mergeSort(head2);
        StudentNode finalHead = merge(newHead1, newHead2);

        return finalHead;
    }

    public StudentNode merge(StudentNode head1, StudentNode head2)
    {
        StudentNode merged = new StudentNode();
        StudentNode temp = merged;

        while (head1.next != null && head2 != null) {
            if (head1.next.data.getLName().compareTo(head2.data.getLName()) < 0) {
                temp.next = head1;
                head1 = head1.next;
            }
            else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return merged.next;
    }

    public StudentNode findMid(StudentNode head)
    {
        StudentNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Student getData() {
        return data;
    }
}
