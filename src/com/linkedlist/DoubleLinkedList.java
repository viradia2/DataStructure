package com.linkedlist;

import com.linkedlist.LinkedList.Node;

public class DoubleLinkedList {
	private Node head;
	
	public DoubleLinkedList(int item){
		head = new Node();
		head.value = item;
		head.next = null;
		head.prev = null;
	}
	
	public boolean insertItem(int item){
		Node n = new Node();
		n.value = item;
		n.prev = null;
		head.prev = n;
		n.next = head;
		head = n;
		return true;
	}
	
	public boolean insertItemLast(int item){
		Node n = new Node();
		Node tail;
		tail = head;
		while(tail.next != null){
			tail = tail.next;
		}
		n.value = item;
		n.next = null;
		n.prev = tail.next;
		tail.next = n;
		return true;
	}
	
	
	public void addValue(int data, int position){
		int count = 0;
		Node temp = head;
		
		while(count < position - 1){
			temp = temp.next;
			count++;
		}
		
		Node current = temp.next;
		Node n = new Node();
		n.value = data;
		temp.next = n;
		n.next =  current;
	}
	
	
	
	public void printItems(){
		Node x = head;
		while(x != null){
			System.out.println(x.value);
			x = x.next;
		}
	}
	
//	public void sortItem(){
//		int c = 0;
//		Node a = head.next;
//		while(a.next != null){
//			Node b = head.next;
//			while(b.next != null){
//				if(b.value < b.next.value){
//					c = b.value;
//					b.value = b.next.value;
//					b.next.value = c;
//				}
//				b = b.next;
//			}
//			a = a.next;
//		}
//	}
	
	public boolean deleteItem(int item){
		if(head.value == item){
			head = head.next;
			return true;
		}else{
			Node x = head;
			Node y = head.next;
			while(true){
				if(y == null || y.value == item)
					break;
				else{
					x = y;
					y = y.next;
				}
			}
			if(y != null){
				x.next = y.next;
				return true;
			}else{
				return false;
			}
		}
	}
	//Child Class
	class Node{
		private int value;
		private Node next;//because it's a object
		private Node prev;
	}
}
