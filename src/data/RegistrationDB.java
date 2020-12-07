/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.sql.*;
import business.Registration;
import java.util.ArrayList;

public class RegistrationDB {
   private Connection cn;
    
    public RegistrationDB(){
        try {
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/xyzdb","root","");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    } 
    
    public int add(Registration r){
        int result=0;
        String insert="insert into registration(registrationID,studentID,moduleID,registrationDate) values(?,?,?,?)";
        try {
            PreparedStatement ps=cn.prepareStatement(insert);
            ps.setString(1, r.getRegistrationID());
            ps.setInt(2, r.getStudentID());
            ps.setString(3, r.getModuleID());
            ps.setString(4, r.getRegistrationDate());
            result=ps.executeUpdate();
            return result;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return result;
        }
    }
    public int delete(String registrationID){
        int result=0;
        String delete="delete from registration where registrationID=?";
        try {
            PreparedStatement ps=cn.prepareStatement(delete);
            ps.setString(1, registrationID);
            result=ps.executeUpdate();
            return result;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return result;
        }
    }
    
    public int update(Registration r){
        int result=0;
        String update="update registration set studentID=?,moduleID=?,registrationDate=? where registrationID=?";
        try {
            PreparedStatement ps=cn.prepareStatement(update);
            ps.setInt(1, r.getStudentID());
            ps.setString(2, r.getModuleID());
            ps.setString(3, r.getRegistrationDate());
            ps.setString(4, r.getRegistrationID());
            result=ps.executeUpdate();
            return result;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return result;
        }
    }
    
    public Registration get(String registrationID){
        Registration r=null;
        String select="select * from registration where registrationID=?";
        try {
            PreparedStatement ps=cn.prepareStatement(select);
            ps.setString(1, registrationID);
            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
                int studentID=rs.getInt("studentID");
                String moduleID=rs.getString("moduleID");
                String registrationDate=rs.getString("registrationDate");
                r=new Registration(registrationID,studentID,moduleID,registrationDate);
            }
            rs.close();
            return r;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return r;
        }
    }
    
    public ArrayList<Registration> getAll(){
        ArrayList<Registration> rList=new ArrayList<>();
        String select="select * from registration";
        try {
            PreparedStatement ps=cn.prepareStatement(select);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                String registrationID=rs.getString("registrationID");
                int studentID=rs.getInt("studentID");
                String moduleID=rs.getString("moduleID");
                String registrationDate=rs.getString("registrationDate");
                Registration r=new Registration(registrationID,studentID,moduleID,registrationDate);
                rList.add(r);
            }
            rs.close();
            return rList;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
}
