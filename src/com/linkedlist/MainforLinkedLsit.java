package com.linkedlist;

public class MainforLinkedLsit {
	public static void main(String[] args) {
		LinkedList ls = new LinkedList();
		LinkedList mergels = new LinkedList();
		LinkedList nls = new LinkedList();
		ls.insertItem(1);
		ls.insertItem(3);
		ls.insertItem(6);
		ls.insertItem(5);
		ls.insertItem(4);
		ls.insertItem(7);
		mergels.insertItem(1);
		mergels.insertItem(3);
		mergels.insertItem(6);
		mergels.insertItem(5);
		mergels.insertItem(4);
		mergels.insertItem(7);
//		mergels.printItems();
		System.out.println();
		nls.addTwoLinkedList(ls.head, mergels.head);
//		ls.deleteItem(6);
//		ls.rotateList(ls.head, 2);
//		ls.sortItem();
		nls.printItems();
//		ls.head.next.next.next.next = ls.head;
//		int i = ls.detecLoop(ls.head);
//		if(i == 0){
//			System.out.println("No Loop...!!" + i);
//		}else{
//			System.out.println("Loop Detected...!!!" + i);
//		}
//		ls.deleteDuplicate(ls.head);
//		ls.printItems();
//		LinkedList ls2 = new LinkedList();
//		ls2.insertItem(2);
//		ls2.insertItem(4);
//		ls2.insertItem(7);
//		ls2.insertItem(8);
//		ls2.printItems();
////		ls.compareList(ls, ls2);
//		System.out.println();
//		int value = ls.returnValueFromLast(ls.head, 2);
//		System.out.println("Return value: " + value);
//		ls.mergeList(ls.head, ls2.head);
//		ls.printItems();
//		System.out.println();
//		ls.reverseList(ls.head);
//		ls.listLength();
//		System.out.println();
//		ls.returnValue(2);
//		System.out.println();
////		ls.deleteNthNode(2);
//		ls.addValue(10, 2);
//		ls.listLength();
//		ls.printItems();
//		System.out.println();
//		ls.deleteNthNode(2);
//		ls.printItems();
		
//		ls.sortItem();
//		ls.printItems();
//		System.out.println();
//		DoubleLinkedList dl = new DoubleLinkedList(1);
//		dl.insertItem(2);
//		dl.insertItem(21);
//		dl.insertItem(5);
//		dl.printItems();
//		System.out.println();
//		dl.insertItemLast(50);
//		dl.insertItemLast(52);
//		dl.insertItemLast(55);
////		dl.deleteItem(2);
//		System.out.println();
//		dl.printItems();
//		dl.addValue(54, 2);
//		System.out.println();
//		dl.printItems();
		
	}
}
