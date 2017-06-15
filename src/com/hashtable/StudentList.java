package com.hashtable;

public class StudentList {

	private Node head;
	
	public StudentList(){
		head = new Node();
		head.next = null;
		head.data = null;
	}
	
	public boolean insertStd(Student std){
		Node n = new Node();
		n.data = std;
		n.next = head.next;
		head.next = n;
		return true;
	}
	
	public boolean haveRollNo(String rollno){
		Node n = head.next;
		boolean have = false;
		while(n != null){
			if(rollno.equals(n.data.getRoll_no())){
				have = true;
			}
			n = n.next;
		}
		return have;
	}
	
	public Student getData(String rollno){
		Student data = null;
		Node temp = head.next;
		while(temp != null){
			if(temp.data.getRoll_no().equals(rollno)){
				data = temp.data;
				break;
			}
			temp = temp.next;
		}
		return data;
	}
	
	public void deleteStudent(String rollno){
		Node tempA = head;
		Node tempB = head.next;
		while(tempB != null && !(tempB.data.getRoll_no().equals(rollno))){
			tempA = tempB;
			tempB = tempB.next;
		}
		if(tempB != null){
			tempA.next = tempB.next;
		}else{
			System.out.println("Data Not Found...!!!");
		}
	}
	
	public void showALL(){
		Node x = head.next;
		while(x != null){
			System.out.println(x.data);
			x = x.next;
		}
	}
	
	class Node{
		private Student data;
		private Node next;
	}
}
