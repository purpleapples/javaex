package jdbc;

import java.util.List;

public interface GuestbookDao {
	public List<GuestbookVo> searchAll(); //  SELECT
	public int insert(GuestbookVo vo); // INSERT
	public int update(GuestbookVo vo); //UPDATE
	public int delete(Long no, String password); // DELETE
	public List<GuestbookVo> searchByKeyword(String keyword); // SELECT like 검색
	
}
