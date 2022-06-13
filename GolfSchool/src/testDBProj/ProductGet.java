package testDBProj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductGet {

    public static void main(String[] args) {

	try {
	       Class.forName("com.mysql.jdbc.Driver");
	       Connection conn = DriverManager.getConnection(
	          // "jdbc:mysql://localhost:3306/productdb?characterEncoding=UTF-8&serverTimezone=JST","root","Nzzm6464-LC");
	    		  "jdbc:mysql://localhost:3306/productdb?serverTimezone=JST","root","Nzzm6464-LC");
	       Statement st = conn.createStatement();
	       ResultSet rs = st.executeQuery("select * from product;");

	       while(rs.next()) {
	           int id = rs.getInt(1);
	           String name = rs.getString(2);
	           String price = rs.getString(3);
	           System.out.println("ID："+id+" name:"+name+" price:"+price);
	       }
	           rs.close();
	           st.close();
	           conn.close();
	           System.exit(0);
	   } catch (ClassNotFoundException e) {
	       System.out.println("ドライバを読み込めませんでした "+ e);
	   } catch (SQLException e) {
	       System.out.println("データベース接続エラー"+ e);
	   }

    }
}