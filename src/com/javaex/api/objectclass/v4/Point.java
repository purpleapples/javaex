package com.javaex.api.objectclass.v4;



// Object 클래스
// v3. clone overriding
public class Point implements Cloneable{
	// clone method를 활성화하기 위해서는 Cloneable interface 구현
	
	//field
	protected int x;	
	protected int y;

	public Point(int x, int y) {
		System.out.println(this.getClass().getSimpleName() + "의 생성자");
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다.\n", this.x, this.y);
	}
	
	public void draw(boolean bDraw) {
		// method overloading
		String message = String.format("점[x=%d, y=%d]을 ", this.x, this.y);
		message +=  bDraw ? "그렸습니다." : "지웠습니다.";
		System.out.println(message);
		
	}
	
	@Override
	public String toString(){
		
		return String.format("Point(%d,%d)",this.x, this.y); 
	}
	
	@Override
	public boolean equals(Object obj) {
		
		boolean result = false;
		if(obj instanceof Point) {			
			Point other = (Point)obj;
			result = this.x == other.x && this.y == other.y; 			
		}
		
		return result;
	}
	// clone method 구현
	
	public Point getClone() {
		Point clone = null;
		try {
			clone = (Point)clone();
		} catch (CloneNotSupportedException e) {
			System.err.println("복제 실패! " + e.getMessage());
			
		}
		
		return clone;
	}
	
	
}
