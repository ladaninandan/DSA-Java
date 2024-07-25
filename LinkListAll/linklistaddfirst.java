package LinkListAll;

class linklistaddfirst {

    public Node head;

    class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }

    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void printlist() {

        if (head == null) {
            System.out.println("node is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data+"=>");
            currNode = currNode.next;
        }
        System.out.println("null");

    }

    public static void main(String args[]) {
        linklistaddfirst list = new linklistaddfirst();
        list.addFirst("hi");
        list.addFirst("ko");
        list.printlist();
    }
}
