package Hero.tools;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
	    public static Connection getCon()throws SQLException,
			ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/hero";
		String username = "root";
		String password = "123";
		Connection conn = DriverManager.getConnection(url, username, password);
		return conn;
			}

// 关闭数据库连接，释放资源
public static void release(Statement stmt, Connection conn) {
	if (stmt != null) {
		try {
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		stmt = null;
	}
	if (conn != null) {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		conn = null;
	}
}
public static void release(ResultSet rs, Statement stmt, Connection conn) {
	if (rs != null) {
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		rs = null;
	}
	release(stmt, conn);
}
}
