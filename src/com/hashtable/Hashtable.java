package com.hashtable;

public class Hashtable {

	private StudentList[] arr;
	private int size;
	private int totalstudents;
	
	public Hashtable(){
		size = 1000;
		arr = new StudentList[size];
	}
	
	public int toHashCode(String rollno){
		int ascii = 0;
		int codevalue = 0;
		for(int i=0; i<rollno.length(); i++){
			ascii = ascii + (int)rollno.charAt(i);
		}
		codevalue = ascii % arr.length;
		return codevalue;
	}
	
	public boolean insert(int key, Student data){
		if(arr[key] == null){
			arr[key] = new StudentList();
		}
		arr[key].insertStd(data);
		totalstudents++;
		return true;
	}
	
	public Student getData(String rollno){
		int key = toHashCode(rollno);
		if(arr[key] == null){
			return null;
		}else{
			Student data = arr[key].getData(rollno);
			if(data != null)
				return data;
			else
				return  null;
		}
	}
	
	public boolean deleteData(String rollno){
		int key = toHashCode(rollno);
		boolean have = arr[key].haveRollNo(rollno);
		if(have){
			arr[key].deleteStudent(rollno);
			totalstudents--;
			return true;
		}
		return false;
	}
	
	public void showAllData(){
		for(int i=0; i<arr.length; i++){
			if(arr[i] != null){
				arr[i].showALL();
			}
		}
	}
	
	public int getTotalStdents(){
		return totalstudents;
	}
}
