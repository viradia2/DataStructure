package com.stack;

public class Circularqueue {
	private int[] array = new int[3];
	private int pushcounter = 0;
	private int popcounter = 0;
	private int size = 0;
	
	public static void main(String[] args) {
		Circularqueue cq = new Circularqueue();
		cq.push(1);
		cq.push(2);
		cq.pop();
		cq.push(3);
		cq.push(4);
		cq.pop();
		cq.pop();
		cq.pop();
		cq.printQueue();
		cq.push(1);
		cq.push(2);
		cq.push(3);
		cq.pop();
		cq.pop();
		cq.push(2);
		cq.push(3);
		cq.push(2);
		cq.push(3);
		cq.pop();
		cq.pop();
		cq.pop();
		cq.pop();
		cq.printQueue();
	
	}

	public void printQueue() {
		// TODO Auto-generated method stub
		System.out.println("Queue: ");
		for(int i=0; i<array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public int pop(){
		int element = 0;
		if(!isEmpty()){
			element = array[popcounter];
			array[popcounter] = 0;
			popcounter = (popcounter + 1) % array.length;
			size--;
		}else{
			System.out.println("Queue is Empty.");
		}
		return element;
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return (size == 0);
	}

	public void push(int i) {
		// TODO Auto-generated method stub
		
			if(!isFull()){
				array[pushcounter] = i;
				pushcounter = (pushcounter + 1) % array.length;
				size++;
			}else{
				System.out.println("Queue is Full");
			}
	}

	private boolean isFull() {
		// TODO Auto-generated method stub
		return (size == array.length);
	}
}
