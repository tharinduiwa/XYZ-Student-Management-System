/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.sql.*;
import business.Lecturer;
import java.util.ArrayList;

public class LecturerDB {
    private Connection cn;
    
    public LecturerDB(){
        try {
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/xyzdb","root","");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public int add(Lecturer l){
        int result=0;
        String insert="insert into lecturer(lecturerID,firstName,lastName,gender) values(?,?,?,?)";
        try {
            PreparedStatement ps=cn.prepareStatement(insert);
            ps.setInt(1, l.getLecturerID());
            ps.setString(2, l.getFirstName());
            ps.setString(3, l.getLastName());
            ps.setString(4, l.getGender());
            result=ps.executeUpdate();
            return result;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return result;
        }
    }
    
    public int delete(int lecturerID){
        int result=0;
        String delete="delete from lecturer where lecturerID=?";
        try {
            PreparedStatement ps=cn.prepareStatement(delete);
            ps.setInt(1, lecturerID);
            result=ps.executeUpdate();
            return result;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return result;
        }
    }
    
    public int update(Lecturer l){
        int result=0;
        String update="update lecturer set firstName=?,lastName=?,gender=? where lecturerID=?";
        try {
            PreparedStatement ps=cn.prepareStatement(update);
            ps.setString(1, l.getFirstName());
            ps.setString(2, l.getLastName());
            ps.setString(3, l.getGender());
            ps.setInt(4, l.getLecturerID());
            result=ps.executeUpdate();
            return result;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return result;
        }
    }
    
    public Lecturer get(int lecturerID){
        Lecturer l=null;
        String select="select * from lecturer where lecturerID=?";
        try {
            PreparedStatement ps=cn.prepareStatement(select);
            ps.setInt(1, lecturerID);
            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
                String firstName=rs.getString("firstName");
                String lastName=rs.getString("lastName");
                String gender=rs.getString("gender");
                l=new Lecturer(lecturerID,firstName,lastName,gender);
            }
            rs.close();
            return l;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return l;
        }
    }
    
    public ArrayList<Lecturer> getAll(){
        ArrayList<Lecturer> lList=new ArrayList<>();
        String select="select * from lecturer";
        try {
            PreparedStatement ps=cn.prepareStatement(select);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                int lecturerID=rs.getInt("lecturerID");
                String firstName=rs.getString("firstName");
                String lastName=rs.getString("lastName");
                String gender=rs.getString("gender");
                Lecturer l=new Lecturer(lecturerID,firstName,lastName,gender);
                lList.add(l);
            }
            rs.close();
            return lList;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
}
