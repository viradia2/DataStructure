package com.stack;

//import com.linkedlist.LinkedList.Node;

public class StackLinkedList {
	private Node head;
	
	public StackLinkedList(){
		head = new Node();
		head.data = 0;
		head.next = null;
	}
	
	public static void main(String[] args) {
		StackLinkedList stl = new StackLinkedList();
		stl.push(1);
		stl.push(2);
		stl.push(3);
		stl.push(4);
		stl.push(5);
		stl.pop();
		stl.pop();
		stl.pop();
		stl.pop();
		stl.pop();
		stl.pop();
		stl.push(1);
		stl.push(2);
		stl.push(3);
		stl.push(4);
		stl.push(5);
		stl.printItems();
	}
	
	public void pop() {
		// TODO Auto-generated method stub
		Node node = head;
		if(head.next == null){
			System.out.println("Stack is Empty..!!");
		}else{
			while(node.next.next != null){
				node = node.next;
			}
			node.next = null;
		}
		
	}

	public void push(int i) {
		// TODO Auto-generated method stub
		Node n = new Node();
		Node new_node = head;
		while(new_node.next != null){
			new_node = new_node.next;
		}
		n.data = i;
		new_node.next = n;
		n.next = null;
	}
	
	public void printItems(){
		Node x = head.next;
		while(x != null){
			System.out.print(x.data + " ");
			x = x.next;
		}
	}

	class Node{
		int data;
		Node next;
	}
}
