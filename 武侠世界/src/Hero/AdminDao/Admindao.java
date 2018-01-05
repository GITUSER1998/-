package Hero.AdminDao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Hero.domain.*;
import Hero.tools.*;
public class Admindao{
public ArrayList<People> peopleload() {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	ArrayList<People> list = new ArrayList<People>();
	try {
		conn = JDBC.getCon();
		stmt = conn.createStatement();
		String sql = "SELECT Name,level,sex,age FROM people";
		rs = stmt.executeQuery(sql);
		while (rs.next()) {
			People people= new People();
			people.setName(rs.getString("name"));
			people.setLevel(rs.getString("level"));
			people.setSex(rs.getString("sex"));
			people.setAge(rs.getString("age"));
			list.add(people);
		}
		return list;
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		JDBC.release(rs, stmt, conn);
	}
	return null;
}

public void delPeople(String delname) {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	try {
		conn = JDBC.getCon();
		stmt = conn.createStatement();
		String sql = "DELETE FROM people WHERE name ="+"'"+delname+"'";
		int num = stmt.executeUpdate(sql);
		if (num > 0) {
         System.out.println("删除往事成功！！！");
		}
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		JDBC.release(rs, stmt, conn);
	}
	
}
}
