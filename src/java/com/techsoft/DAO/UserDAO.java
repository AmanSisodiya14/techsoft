
package com.techsoft.DAO;
import com.techsoft.DB.getConnection;
import com.techsoft.DTO.UserDTO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
public class UserDAO {
    public UserDTO loginCheck(String name,String email,String password){
        UserDTO user = new UserDTO();
        
        try{
            
            Connection con = getConnection.getConnect();
                        
	PreparedStatement ps = con.prepareStatement("select * from techsoftdata where name=? and email=? and password=?");
        ps.setString(1, name);
        ps.setString(2, email);
        ps.setString(3, password);
          ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
           
            user.setName(rs.getString("name"));
            user.setId(1);
            user.setEmail(rs.getString("email"));
            user.setPassword(rs.getString("password"));
            
        }
        }catch(Exception e){
            e.printStackTrace();
        }
        return user;
    }
     public int UserRegister(UserDTO user) {
		int i=0;
		try {
			Connection con = getConnection.getConnect();
                        
			PreparedStatement ps = con.prepareStatement("insert into techsoftdata(name,address,email,qualification,phone,gender,domain,registration_date,password) values(?,?,?,?,?,?,?,?,?)");
			
			ps.setString(1, user.getName());
                        ps.setString(2, user.getAddress());
                        ps.setString(3, user.getEmail());
                         ps.setString(4, user.getQualification());
                        ps.setString(5, user.getPhone());
                        ps.setString(6, user.getGender());
                        ps.setString(7,user.getDomain());
                        ps.setString(8, user.getDate());
			ps.setString(9, user.getPassword());
			
			i = ps.executeUpdate();
                }
                catch(Exception e)
                {
			e.printStackTrace();
		}	
		return i;
	}
}



