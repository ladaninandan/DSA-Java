package LinkListAll;

class singleLinkList {

    int Size;

    singleLinkList() {
        this.Size = 0;
    }

    Node head;

    class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            Size++;
        }
    }

    // add  - first ,last 
    public void addFirst(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;

        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // delete first
    public void Deletefirst() {
        if (head == null) {
            System.out.println("this list is empty");
            return;
        }

        head = head.next;
        Size--;
    }

    // delete last
    public void Deletelast() {
        if (head == null) {
            System.out.println("this list is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node LastNode = head.next;
        while (LastNode.next != null) {
            LastNode = LastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
        Size--;
    }

    public int getsize() {
        return Size;
    }

    // print list
    public void printList() {
        if (head == null) {
            System.out.println("list is empty ");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "=>");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public static void main(String arg[]) {
        singleLinkList list = new singleLinkList();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();

        list.Deletefirst();
        list.printList();

        list.Deletelast();

        System.out.println(list.getsize());
        list.printList();
        list.addFirst("1");
        list.printList();
        System.out.println(list.getsize());

    }
}
