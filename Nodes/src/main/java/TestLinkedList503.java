public class TestLinkedList503 {
    public static void main(String[] args) {

        LinkedList503 linkedList503 = new LinkedList503();

        Node node0 = linkedList503.getNode0();
        Node node1 = linkedList503.getNode1();
        Node node2 = linkedList503.getNode2();
        Node node3 = linkedList503.getNode3();
        Node node4 = linkedList503.getNode4();
        Node head = linkedList503.getHead();
        Node current = linkedList503.getCurrent();

        System.out.println("Текущий список");
        linkedList503.printNodes(current,head);

        System.out.println("------------------------------------------------------------------------");

        System.out.println("Добавление нового элемента со значением value в конец списка");
        Node node5 = LinkedList503.add(5);
        node4.next = node5;

        linkedList503.printNodes(current,head);

        System.out.println("------------------------------------------------------------------------");

        System.out.println("Добавление нового элемента со значением value в позицию n списка");

        current = head;
        int n = 3;
        Node node6 = linkedList503.add(6,n,current);
        node2.next = node6;

        linkedList503.printNodes(current,head);

        System.out.println("------------------------------------------------------------------------");
        System.out.println("Удалить последний элемент и вернуть его значение");

        current = head;
        int deletedNumber = linkedList503.pop(current);
        linkedList503.printNodes(current,head);
        System.out.println("Удалённый элемент: " + deletedNumber);

        System.out.println("------------------------------------------------------------------------");
        System.out.println("Удалить элемент в позиции n и вернуть его значение");

        int n1 = 2;
        current = head;
        int deletedElement = linkedList503.remove(n1,current);
        linkedList503.printNodes(current,head);

        System.out.println("Удалённый элемент: " + deletedElement);

        System.out.println("------------------------------------------------------------------------");
        System.out.println("Вернуть количество элементов");

        current = head;
        System.out.println("Количество элементов: " + linkedList503.size(current));
    }
}
