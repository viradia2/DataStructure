package com.stack;

public class MyQueue {
	private int[] array = new int[3];
	private int pushcounter = 0;
	private int popcounter = 0;
	
	public static void main(String[] args) {
		MyQueue mq = new MyQueue();
		mq.push(1);
		mq.push(2);
		mq.push(3);
		mq.printQueue();
		System.out.println();
		int value = mq.pop();
		System.out.println("Poped Value: " + value);	
		int value1 = mq.pop();
		System.out.println("Poped Value: " + value1);
		int value2 = mq.pop();
		System.out.println("Poped Value: " + value2);
		int value3 = mq.pop();
		System.out.println("Poped Value: " + value3);
		int value4 = mq.pop();
		System.out.println("Poped Value: " + value4);
		System.out.println();
		mq.push(4);
		mq.printQueue();
	}

	private int pop() {
		// TODO Auto-generated method stub
		int element = 0;
		if(popcounter != pushcounter){
			element = array[popcounter];
			array[popcounter] = 0;
			popcounter++;
		}else{
			System.out.println("Poping is Done.");
		}
		
		return element;
	}

	public void printQueue() {
		// TODO Auto-generated method stub
		System.out.println("Queue: ");
		for(int i=0; i<array.length; i++){
			System.out.print(array[i] + " ");
		}
	}

	public void push(int i) {
		// TODO Auto-generated method stub
		if(pushcounter != array.length){
			array[pushcounter] = i;
			pushcounter++;
		}else{
			System.out.println("Queue is Full");
		}
	}
	
	
	
}
