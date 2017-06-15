package com.linkedlist;

//Parent Class
public class LinkedList {
	Node head;
	
	public LinkedList(){
		head = new Node();
		head.value = 0;
		head.next = null;
	}
	
	public LinkedList(int value){
		head = new Node(value);
		head.value = value;
		head.next = null;
	}
	
	public void rotateList(Node head, int k){
		int data = 0;
		Node tempA = head;
		for(int i=0; i<k; i++){
			while(tempA.next != null){
				tempA = tempA.next;
				data = tempA.value;
			}
				Node temp = head;
				Node n = new Node();
				n.next = temp;
				n.value = data;
				head = n;
				tempA = head;
		}
		Node x = head.next;
		while(x != null){
			System.out.println(x.value);
			x = x.next;
		}
		System.out.println();
	}
	
	public void listLength(){
		int temp=0;
		Node x = head.next;
		while(x != null){
			temp++;
			x = x.next;
		}
		System.out.println("Length: " + temp);
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
	
	public void deleteNthNode(int position){
		Node temp = head;
		int count = 0;
		Node prev = null;
		if(position == 0){
			Node n = temp.next;
			head = n;
		}
		while(count < position -1){
			temp = temp.next;
			count++;
		}
		Node current = temp.next;
		temp.next = current.next;
	}
	
	public void returnValue(int value){
		int temp=1;
		Node x = head.next;
		while(x != null){
			if(temp == value){
				System.out.println("Value is: " + x.value);
				break;
			}else{
				x = x.next;
				temp++;
			}
		}
	}
	
	public void compareList(LinkedList ls1, LinkedList ls2){
		Node headA = ls1.head;
		Node headB = ls2.head;
		boolean flag = false;;
		System.out.println();
		System.out.println("Hello");
		
		while(headA != null && headB != null){
			if(headA.value != headB.value){
				flag = false;
				break;
			}else{
				headA = headA.next;
				headB = headB.next;
				flag = true;
			}
		}
		
		if(headA != null || headB != null)
			flag = false;
		
		if(flag == true){
			System.out.println("Both are same");
		}else{
			System.out.println("Both are not same");
		}
		
	}
	
	public Node mergeList(Node headA, Node headB){
		if(headA == null)
			return headB;
		if(headB == null)
			return headA;
		
		if(headA.value < headB.value){
			headA.next = mergeList(headA.next, headB);
			return headA;
		}else{
			headB.next = mergeList(headA, headB.next);
			return headB;
		}
	}
	
	public boolean insertItemAtBegining(int item){
		Node n = new Node();
		n.value = item;
		n.next = head;
		head = n;
		return true;
	}
	
	public void reverseList(Node head){
		
		Node headA = head.next;
		 
		int position = 0;
		while(headA != null){
			if(position == 0){
				Node n = new Node();
				n.value = headA.value;
				n.next = null;
				head = n;
			}else{
				Node n = new Node();
				n.value = headA.value;
				n.next = head;
				head = n;
			}
			position++;
			headA = headA.next;
		}
		
		Node x = head;
		while(x != null){
			System.out.println(x.value);
			x = x.next;
		}
	}
	
	public int returnValueFromLast(Node head, int position){
		int pointer = 1;
	    Node headA = head.next;
	    Node headB = head;
	    
	    while(headA != null){
	        if(pointer == position){
	        	headA = headA.next;
	            headB = headB.next;
	        }else{
	            headA = headA.next;
	            pointer++;
	        }
	    }
	    return headB.value;
	}
	
	public boolean insertItem(int item){
		Node n = new Node();
		Node new_node;
		new_node = head;
		while(new_node.next != null){
			new_node = new_node.next;
		}
		n.value = item;
		n.next = null;
		new_node.next = n;
		return true;
	}
	
	public void printItems(){
		Node x = head.next;
		while(x != null){
			System.out.println(x.value);
			x = x.next;
		}
	}
	
	public void deleteDuplicate(Node head){
//		Node headA = head.next;
		while(head.next != null){
			if(head.value == head.next.value)
				head.next = head.next.next;
			else
				head = head.next;
		}
	}
	
	public int detecLoop(Node head){
		Node pointerA = head;
	    Node pointerB = head;
	    int count = 0;
	    boolean counter = false;
	    
	    while(pointerA != null && pointerB != null && pointerB.next != null){
	        pointerA = pointerA.next;
	        pointerB = pointerB.next.next;
	        
	        if(pointerA == pointerB){
	        	/******************************
	        	 * For counting length of loop
	        	 * 
	        	 ******************************/
	        	if(count == 0)
	        		counter = true;
	        	else
	        		return count;
	        	/**************************************************
	        	 * For just returning 0 or 1 for detection of cycle
	        	 * 
	        	 * return 0;
	        	 **************************************************/
	        }
	        
	        if(counter){
	        	count++;
	        }
	    }
	    return 0;
	}
	
	public void addTwoLinkedList(Node headA, Node headB){
		Node n = new Node(0);
		int carry = 0;
		Node tempheadA = headA.next;
		Node tempheadB = headB.next;
//		while(tempheadA != null && tempheadB != null){
//			if(head == null){
//				n.value = tempheadA.value + tempheadB.value;
//				n.next = null;
//			}else{
//				insertItem(tempheadA.value + tempheadB.value);
//			}
//			tempheadA = tempheadA.next;
//			tempheadB = tempheadB.next;
//		}
		
		while(tempheadA != null && tempheadB != null){
			if(tempheadA != null){
				carry += tempheadA.value;
				tempheadA = tempheadA.next;
			}
			if(tempheadB != null){
				carry += tempheadB.value;
				tempheadB = tempheadB.next;
			}
			insertItem(carry%10);
			carry /= 10;
		}
		
		if(carry == 1){
			insertItem(1);
		}
	}
	
	public int getAddition(int value1, int value2, int key){
		int sum = value1 + value2;
		if(sum/10 != 0){
			key = sum % 10;
		}
		return sum;
	}
	
	public void sortItem(){
		int c = 0;
		Node a = head;
		
		while(a.next != null){
			Node b = head;
			while(b.next != null){
				if(b.value > b.next.value){
					c = b.value;
					b.value = b.next.value;
					b.next.value = c;
				}
				b = b.next;
			}
			a = a.next;
		}
	}
	
	public boolean deleteItem(int item){
		if(head.next.value == item){
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
		public Node(int value2) {
			// TODO Auto-generated constructor stub
		}
		public Node() {
			// TODO Auto-generated constructor stub
		}
		private int value;
		Node next;//because it's a object
	}
}



