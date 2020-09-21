package jdbc;

import java.util.Date;

public class GuestbookVo {
	private Long no;  // VO에서는 primitive type 사용하지 않는다.
	private String name; 
	private String password;
	private String message;
	private Date regDate;
	// 생성자 : VO 객체에서는 반드시 기본 생성자가 있어야 한다.
	
	public GuestbookVo(){
		
	}	
	
	public GuestbookVo(Long no, String name, String password, String message, Date regDate) {
		super();
		this.no = no;
		this.name = name;
		this.password = password;
		this.message = message;
		this.regDate = regDate;
	}

	public Long getNo() {
		return no;
	}
	
	public void setNo(Long no) {
		this.no = no;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public Date getRegDate() {
		return regDate;
	}
	
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	public String toString() {
		return "GuestbookVo("+ this.hashCode() +")[no=" + no + ", name=" + name + ", password=" + password + ", message=" + message
				+ ", regDate=" + regDate + "]";
	}

	
}
