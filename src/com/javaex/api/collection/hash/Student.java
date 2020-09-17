package com.javaex.api.collection.hash;

public class Student {
	private int id;
	private String name;
	
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
				
	}	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Student("+ this.hashCode() +") [name="+this.name + "id="+this.id+"] ";
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	
	@Override 
	public boolean equals (Object obj) {
		boolean result = false;

		if (obj instanceof Student) {
			Student other = (Student)obj;
			result = other.name == this.name && other.id == this.id;
		}
		
		return result;
	}
}
