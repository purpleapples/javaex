package com.javaex.api.collection.hash;

public class ClassRoom {
	
	private String subject;
	private String roomName;
	
	public ClassRoom(String subject) {
		this.subject = subject;
		
	}
	
	public ClassRoom(String subject, String roomName) {
		this(subject);
		this.roomName=roomName;
	}
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	
	
	@Override
	public String toString() {
		return "ClassRoom("+ this.hashCode() + ") [subject=" + subject + ", roomName=" + roomName + "]";
	}

	@Override
	public int hashCode() {
		return this.subject.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof ClassRoom) {
			ClassRoom other = (ClassRoom)obj;
			result = other.roomName == this.roomName && other.subject == this.subject;
		}
		
		return result;
	}
}
