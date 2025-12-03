import java.util.*;

public class LinkedList {
  public static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;

  public void addFirst(int data) {
    // create new code
    Node newNode = new Node(data);

    if (head == null) {
      head = tail = newNode;
      return;
    }
    // step2 newNode -> next = head;
    newNode.next = head;

    // step3 head = newNode
    head = newNode;
  }

  public void print() {
    Node curr = head;
    while (curr != null) {
      System.out.print(curr.data + "-> ");
      curr = curr.next;
    }
    System.out.print(" null");
  }

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    ll.addFirst(10);
    ll.addFirst(20);
    ll.addFirst(30);
    ll.print();
    /*
     * add()
     * remove()
     * print()
     * search()
     */

  }
}
