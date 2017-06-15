package com.stack;

public class PersonStack {
	
	private Person[] stack;
	private int top;
	private int size;
	
	public PersonStack(){
		top = -1;
		size = 50;
		stack = new Person[50];
	}
	
	public boolean push(Person item){
		if(!isFull()){
			top++;
			stack[top] = item;
			return true;
		}else{
			return false;
		}
	}

	public boolean isFull() {
		// TODO Auto-generated method stub
		return (top == stack.length - 1);
	}
	
	public Person pop(){
		return stack[top--];
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}
}
