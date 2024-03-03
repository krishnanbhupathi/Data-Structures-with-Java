
public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        if (tail == null)
            tail = head;
        size += 1;
    }

    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        tail.next = newNode;
        tail = newNode;
        if (head == null)
            head = tail;
        size += 1;
    }

    public void insertAtPos(int pos,int data) {
        if (pos == 0) {
            insertAtFirst(data);
            return;
        }
        if (pos == size) {
            insertAtLast(data);
            return;
        }

        Node previous = head;
        for (int i = 1 ; i < pos ; i++ )
            previous = previous.next;

        Node newNode = new Node(data, previous.next);
        previous.next = newNode;
        size++;
    }

    public int deleteFirst() {

        int data = head.value;
        head = head.next;

        if (head == null)
            tail = null;
        size -= 1;
        return data;
    }

    public int deleteLast() {

        Node previous = head;
        for (int i = 0; i < size-2 ; i++)
            previous = previous.next;
        int data = tail.value;
        tail = previous;
        tail.next = null;
        return data;
    }

    public int deleteAtPos(int pos) {
        if (pos == 0)
            return deleteFirst();
        if (pos == size-1)
            return deleteLast();

        Node previous = head;
        for(int i = 0 ; i < pos -1 ; i++)
            previous = previous.next;

        int data = previous.next.value;
        previous.next = previous.next.next;

        return data;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public int getSize() {
        return size;
    }

    class Node {
        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {

        LL list = new LL();
        list.insertAtFirst(11);
        list.insertAtFirst(22);
        list.insertAtFirst(33);
        list.display();

        list.insertAtLast(44);
        list.display();
        list.insertAtLast(99);
        list.display();

        System.out.println("Inserting at 2 pos with value 23");
        list.insertAtPos(2,23);
        list.display();

        int size = list.getSize();
        list.insertAtPos(size,101);
        list.display();

        list.insertAtPos(0,1);
        list.display();

        System.out.println(list.deleteFirst());
        list.display();

        System.out.println(list.deleteLast());
        list.display();

        System.out.println(list.deleteAtPos(3));
        list.display();
    }
}

