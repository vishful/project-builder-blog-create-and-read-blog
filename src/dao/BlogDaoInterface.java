package dao;

import java.sql.SQLException;
import java.util.List;

import model.Blog;

public interface BlogDaoInterface {
	void insertBlog(Blog blog) throws SQLException, Exception, Throwable;
	List selectAllBlogs() throws Exception, Throwable;
}
