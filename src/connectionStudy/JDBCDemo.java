package connectionStudy;

import org.junit.Test;

import java.sql.*;

/**
 * @Auther:pikaqiu
 * @Date:2021-09-09-09-09-11:01
 * @Description:connectionStudy
 * @version:1.0
 */
public class JDBCDemo {
    @Test
    public void testFn1() throws ClassNotFoundException, SQLException {
        Connection conn =null;
        Statement st=null;
        ResultSet rs =null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/churin", "root", "123456");
            st = conn.createStatement();
            String sql="select * from study";
            rs = st.executeQuery(sql);
            while (rs.next()){
                System.out.println("id:"+rs.getString("id")+",num:"+rs.getString(2)+",time:"+rs.getString(3)+",text:"+rs.getString("text"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(rs!=null){
                rs.close();
            }
            if(st!=null){
                rs.close();
            }
            if(conn!=null){
                rs.close();
            }

        }
    }
}
