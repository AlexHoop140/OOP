package lab2;

public class LinkedList2 {
        public class Node {
            public String item = null;
            public Node next = null;

            Node (String s, Node n) {
                item = s;
                next = n;
            }

            void insertAfter (String s) {
                next = new Node(s, next);
            }

            void deleteAfter () {
                next = next.next;
            }
        }

        private Node head = null;
        private Node p = null;

        public LinkedList2() {
            head = new Node("", null);
            p = head;
        }

        public void reset() {
            p = head;
        }

        public String current() {
            return p.next.item;
        }

        public boolean hasElements() {
            return (p.next != null);
        }

        public void advance() {
            p = p.next;
        }

        public void moveToEnd() {
            p = head;
            while (p.next != null)
                p = p.next;
        }

        public void insert(String s) {
            p.insertAfter(s);
        }

        public void delete() {
            p.deleteAfter();
        }
}

