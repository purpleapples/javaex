package jdbc;

import java.sql.Connection;

import java.util.List;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class JdbcEx {

	public static void main(String[] args) {
		//selectText();
		//guestbookSelectAll();
		//guestbookInsert();
		guestbookSearch();
		//guestbookUpdate();
		//guestbookDelete();
	}

	private static void guestbookDelete() {
		// 연습문제 : 방명록 번호와 비밀번호, 입력받아서 delete
		
	}

	private static void guestbookUpdate() {
		// 연습문제: 방명록 번호와 비밀번호, 내용을 입력받아 update		
		
	}

	private static void guestbookSearch() {
		guestbookSelectAll();
		GuestbookDao dao = new GuestbookDaoImpl();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("검색어");
		String keyword = scanner.next();
		
		List<GuestbookVo> list = dao.searchByKeyword(keyword);
		
		System.out.println("[검색 결과]");
		for (GuestbookVo vo : list) {
			System.out.println("\t" + vo);
		}
		System.out.println("========================");
		scanner.close();
	}

	private static void guestbookInsert() {
		guestbookSelectAll();
		GuestbookDao dao = new GuestbookDaoImpl();
		
		Scanner scanner =  new Scanner(System.in);
		System.out.println("이름:");
		String name = scanner.next();
		System.out.print("비밀번호:");
		String password = scanner.next();
		System.out.println("message(word):");
		String message = scanner.next();
		
		// DTO 객체 생성
		GuestbookVo vo = new GuestbookVo(null, // no field -> PK
										 name,
										 password,
										 message,
										 null);
		int insertedCount = dao.insert(vo);
		
		System.out.println(insertedCount + "개의 recode have been inserted...");
		
		guestbookSelectAll();			
		scanner.close();
	}

	private static void guestbookSelectAll() {
		// DAO 생성
		// business logic 과 save logic을 분리
		GuestbookDao dao = new GuestbookDaoImpl();
		List<GuestbookVo> list = dao.searchAll();
		
		System.out.println("[방명록]");
		for (GuestbookVo guestbookVo : list) {
			System.out.println("\t" + guestbookVo);
		}
		System.out.println("===================");
	}

	private static void selectText() {		

		String dburl ="jdbc:mariadb://192.168.1.118:3307/employees";
		String dbuser = "employee";
		String dbpass = "employee";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			//1. driver load
			Class.forName("org.mariadb.jdbc.Driver");
//			2. connection
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);			
//			3. statement
			String sql = "SELECT emp_no, first_name, last_name, birth_date FROM employees";
			stmt = conn.createStatement();
//			4. query execute
			rs = stmt.executeQuery(sql);
//			5. result management
			while(rs.next()) {
				// 컬럼 데이터 받아오기
				Long emp_no= rs.getLong(1);
				String first_name = rs.getString(2);
				String last_name= rs.getString(3);
				Date birth_date = rs.getDate(4); // java.util.Date
				
				SimpleDateFormat sdf = new SimpleDateFormat("YYYY-mm-dd");
				System.out.printf("%d -%s %s (생일: %s)%n", emp_no, first_name, last_name, sdf.format(birth_date));
			}
//			6. resource management

		} catch (ClassNotFoundException e) {
			 e.printStackTrace();
		}
		catch (Exception e) {
			 e.printStackTrace();
		}finally {
			
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	

	
}
