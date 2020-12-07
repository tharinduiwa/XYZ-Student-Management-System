/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.sql.*;
import business.Admin;

public class AdminDB {
    private Connection cn;
    
    public AdminDB(){
        try {
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/xyzdb","root","");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public int add(Admin a){
        int result=0;
        String insert="insert into admin(adminID,adminPassword) values(?,?)";
        try{
            PreparedStatement ps=cn.prepareStatement(insert);
            ps.setString(1, a.getAdminID());
            ps.setString(2, a.getAdminPassword());
            result=ps.executeUpdate();
            return result;
        }catch(SQLException e){
            System.err.println(e.getMessage());
            return result;
        }
    }
    
    public int delete(String adminID){
        int result=0;
        String delete="delete from admin where adminID=?";
        try{
           PreparedStatement ps=cn.prepareStatement(delete);
           ps.setString(1, adminID); 
           result=ps.executeUpdate();
           return result;
        }catch(SQLException e){
            System.err.println(e.getMessage());
            return result;
        
        }
    }
    
    public int update(Admin a){
        int result=0;
        String update="update admin set password=? where adminID=?";
        try{
           PreparedStatement ps=cn.prepareStatement(update);
           ps.setString(1, a.getAdminPassword()); 
           ps.setString(2, a.getAdminID());
           result=ps.executeUpdate();
           return result;
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
            return result;
        
        }
    }
    
    public Admin get(String adminID){
        Admin a=null;
        String select="select * from admin where adminID=?";
        try{
           PreparedStatement ps=cn.prepareStatement(select);           
           ps.setString(1, adminID);
           ResultSet rs=ps.executeQuery();
           if(rs.next()){
               String adminPassword=rs.getString("adminPassword");
               a=new Admin(adminID,adminPassword);
           }
           rs.close();
           return a;
        }catch(SQLException e){
            System.err.println(e.getMessage());
            return null;
        }
    }
}
