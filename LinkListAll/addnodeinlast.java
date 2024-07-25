package LinkListAll;

public class addnodeinlast {

    Node head;

    class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addlast(String data) {
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

    public void printlist() {

        if (head == null) {
            System.out.print("node is empty");
            return;
        }

        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + "=>");
            currNode = currNode.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        addnodeinlast list = new addnodeinlast();

        list.addlast("a");
        list.addlast("b");
        list.printlist();

    }

}
