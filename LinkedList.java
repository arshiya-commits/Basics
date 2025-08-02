// without uisng the constructor we have have create and connect the each node
// everytime
// which leads to error and harder to maintain with large no of lines

// class Node {
// int data;
// Node next;
// }

// public class LinkedList {
// public static void main(String[] args) {
// Node first = new Node();
// first.data = 12;
// Node second = new Node();
// second.data = 34;
// Node third = new Node();
// third.data = 67;
// // connecting the nodes
// first.next = second;
// second.next = third;
// third.next = null;
// // traversing the nodes;
// Node Current = first;
// while (Current != null) {
// // printing the elemnts
// System.out.print(Current.data + "->");
// Current = Current.next;

// }
// System.out.println("null");
// }

// }
// using the constructor to create the linkedlist to make the initailize
// automatically and make the less code
// class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }

// }

// public class LinkedList {
// public static void main(String[] args) {
// Node first = new Node(3);
// Node second = new Node(4);
// Node third = new Node(5);
// first.next = second;
// second.next = third;
// Node current = first;
// while (current != null) {
// System.out.print(current.data + " -> ");
// current = current.next;
// }
// System.out.println("null");
// }
// }
