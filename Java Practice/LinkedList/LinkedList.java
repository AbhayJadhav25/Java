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

  public void addLast(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }
    tail.next = newNode;
    tail = newNode;
  }

  public void addMiddle(int index, int data) {
    Node newNode = new Node(data);
    Node temp = head;
    int i = 0;
    while (i < index - 1) {
      temp = temp.next;
      i++;
    }
    newNode.next = temp.next;
    temp.next = newNode;
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
    ll.addLast(40);
    ll.addLast(50);
    ll.addMiddle(2, 9);
    ll.print();
    /*
     * add()
     * remove()
     * print()
     * search()
     */

  }
}
