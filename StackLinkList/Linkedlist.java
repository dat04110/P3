package StackLinkList;

class Linkedlist {
    Node head;

    // Insert at the head O(1)
    public void addFirst(Student student) {
        Node newNode = new Node(student);
        newNode.next = head;
        head = newNode;
    }

    // Remove from the head O(1)
    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    // Display the list O(n)
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.student);
            temp = temp.next;
        }
    }
}
