//public class LinkedList503 {
//
//    public void toString(Node current, Node head) {
//        current = head;
//        while (current.next != null) {
//            System.out.println(current.value);
//            current = current.next;
//        }
//        System.out.println(current.value);
//    }
//
//    private Node head;
//
//    public void add(int value) {
//        Node node = new Node(value);
//        if (head == null) {
//            head = node;
//        }
//
//        else {
//            Node current = head;
//            while (current.next != null) {
//                current = current.next;
//            }
//        }
//    }
//
//    public int pop(Node current) {
//        int deletedNode;
//        while (current.next.next != null) {
//            current = current.next;
//        }
//        deletedNode = current.next.value;
//        current.next = null;
//        return deletedNode;
//    }
//
//    public int remove(int n, Node current) {
//        int deletedNode;
//        for (int i = 0; i < n - 1; i++) {
//            current = current.next;
//        }
//        deletedNode = current.next.value;
//        current.next = current.next.next;
//
//        return deletedNode;
//    }
//
//    public int size(Node curent) {
//        int countEl = 0;
//
//        while (current.next != null) {
//            countEl++;
//            current = current.next;
//        }
//
//        return countEl + 1;
//    }
//}
