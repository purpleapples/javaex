package jdbc;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.text.SimpleDateFormat;

public class GuestbookDaoImpl implements GuestbookDao {
	String dburl ="jdbc:mariadb://192.168.1.118:3307/mysite?useSSL=false";
	String dbuser = "mysite";
	String dbpass = "mysite";

	private Connection getConnection() throws SQLException {
		
		Connection conn = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);
		} catch (ClassNotFoundException e) {
			System.err.println("접속 실패");
			e.printStackTrace();
		}
		return conn;
		
	}
	// 공통 method : 접속
	@Override
	public List<GuestbookVo> searchAll() {
		// SELECT ... FROM guestbook ORDER BY reg_date DESC
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		List<GuestbookVo> list = new ArrayList<>();
		String sql ="SELECT no, name, password, context, register_ymdt" +
				    " FROM guestbook ORDER BY register_ymdt desc";				
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Long no = rs.getLong(1);
				String name = rs.getString(2);
				String password= rs.getString(3);
				String message= rs.getString(4);
				Date reg_date = rs.getDate(5);				
				
				GuestbookVo vo = new GuestbookVo(no, name, password, message, reg_date);
				list.add(vo);				
			}
					
		} catch (SQLException e) {
						
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		return list;
	}

	@Override
	public int insert(GuestbookVo vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;		
		int insertedCount = 0; // crud 결과 값
		
		try {
			conn =getConnection();
			String sql = "INSERT INTO guestbook(name, password, context) "+
						 "VALUES( ?, ?, ?) ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getPassword());
			pstmt.setString(3, vo.getMessage());
			
			// 실행: INSERT, UPDATE, DELETE -> executeUpdate()
			insertedCount = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return insertedCount;
	}

	@Override
	public int update(GuestbookVo vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;		
		int insertedCount = 0; // crud 결과 값
		
		try {
			conn =getConnection();
			String sql = "INSERT INTO guestbook(name, password, context) "+
						 "VALUES( ?, ?, ?) ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getPassword());
			pstmt.setString(3, vo.getMessage());
			
			// 실행: INSERT, UPDATE, DELETE -> executeUpdate()
			insertedCount = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return insertedCount;
	}

	@Override
	public int delete(Long no, String password) {
		Connection conn = null;
		PreparedStatement pstmt = null;		
		int insertedCount = 0; // crud 결과 값
		
		try {
			conn =getConnection();
			String sql = "INSERT INTO guestbook(name, password, context) "+
						 "VALUES( ?, ?, ?) ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, no);
			pstmt.setString(2, password);
		
			
			// 실행: INSERT, UPDATE, DELETE -> executeUpdate()
			insertedCount = pstmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return insertedCount;
	}

	@Override
	public List<GuestbookVo> searchByKeyword(String keyword) {
		List<GuestbookVo> list = new ArrayList<>();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT no, name, password, context, register_ymdt from guestbook " +
					  " WHERE 1=1 and name like ? OR context like ? " ;
				
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, "%" + keyword +"%");
			pstmt.setString(2, "%" + keyword +"%");
			System.out.println(pstmt.toString());
			pstmt.execute();
			
			rs = pstmt.getResultSet();
			System.out.println("=====================================");
			System.out.println(rs);
			while(rs.next()) {
				Long no = rs.getLong(1);
				String name = rs.getString(2);
				String password= rs.getString(3);
				String context = rs.getString(4);
				Date regDate = rs.getDate(5);
				
				GuestbookVo vo = new GuestbookVo(no, name, password, context, regDate);
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return list;
	}

}
