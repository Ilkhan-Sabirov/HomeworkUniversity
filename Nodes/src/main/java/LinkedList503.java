public class LinkedList503 {

    public void printNodes(Node current, Node head) {
        current = head;
        while (current.next != null) {
            System.out.println(current.value);
            current = current.next;
        }
        System.out.println(current.value);
    }

    public Node head;
    public Node current;
    public Node node0, node1, node2, node3, node4;

    public LinkedList503() {
        node0 = new Node(0);
        node1 = new Node(1);
        node2 = new Node(2);
        node3 = new Node(3);
        node4 = new Node(4);

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;

        head = node0;
        current = head;
    }

    public Node getNode0() { return node0; }
    public Node getNode1() { return node1; }
    public Node getNode2() { return node2; }
    public Node getNode3() { return node3; }
    public Node getNode4() { return node4; }
    public Node getHead() { return head; }
    public Node getCurrent() { return current; }

    public static Node add(int value) {
        return new Node(value);
    }

    public Node add(int value, int n, Node current) {
        Node newNode = new Node(value);

        for (int i = 0; i < n-1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        return newNode;
    }

    public int pop(Node current) {
        int deletedNode;
        while (current.next.next != null) {
            current = current.next;
        }
        deletedNode = current.next.value;
        current.next = null;
        return deletedNode;
    }

    public int remove(int n, Node current) {
        int deletedNode;
        for (int i = 0; i < n - 1; i++) {
            current = current.next;
        }
        deletedNode = current.next.value;
        current.next = current.next.next;

        return deletedNode;
    }

    public int size(Node curent) {
        int countEl = 0;

        while (current.next != null) {
            countEl++;
            current = current.next;
        }

        return countEl + 1;
    }
}
