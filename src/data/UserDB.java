/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.sql.*;
import business.User;

public class UserDB {
    private Connection cn;
    
    public UserDB(){
        try {
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/xyzdb","admin","admin");
            System.out.println("successful"); 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public int add(User u){
        int result=0;
        String insert="insert into user(userID,password) values(?,?)";
        try{
            PreparedStatement ps=cn.prepareStatement(insert);
            ps.setString(1, u.getUserID());
            ps.setString(2, u.getPassword());
            result=ps.executeUpdate();
            return result;
        }catch(SQLException e){
            System.err.println(e.getMessage());
            return result;
        }
    }
    
    public int delete(String userID){
        int result=0;
        String delete="delete from user where userID=?";
        try{
           PreparedStatement ps=cn.prepareStatement(delete);
           ps.setString(1, userID); 
           result=ps.executeUpdate();
           return result;
        }catch(SQLException e){
            System.err.println(e.getMessage());
            return result;
        
        }
    }
    
    public int update(User u){
        int result=0;
        String update="update user set password=? where userID=?";
        try{
           PreparedStatement ps=cn.prepareStatement(update);
           ps.setString(1, u.getPassword()); 
           ps.setString(2, u.getUserID());
           result=ps.executeUpdate();
           return result;
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
            return result;
        
        }
    }
    
    public User get(String userID){
        User u=null;
        String select="select * from user where userID=?";
        try{
           PreparedStatement ps=cn.prepareStatement(select);           
           ps.setString(1, userID);
           ResultSet rs=ps.executeQuery();
           if(rs.next()){
               String password=rs.getString("password");
               u=new User(userID,password);
           }
           rs.close();
           return u;
        }catch(SQLException e){
            System.err.println(e.getMessage());
            return null;
        }
    }
}
