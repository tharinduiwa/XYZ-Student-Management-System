/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.sql.*;
import business.Student;
import java.util.ArrayList;
 

public class StudentDB {
    private Connection cn;
    
    public StudentDB(){
        try {
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/xyzdb","root","");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public int add(Student s){
        int result=0;
        String insert="insert into student(studentID,firstName,lastName,dob,gender) values(?,?,?,?,?)";
        try {
            PreparedStatement ps=cn.prepareStatement(insert);
            ps.setInt(1, s.getStudentID());
            ps.setString(2, s.getFirstName());
            ps.setString(3, s.getLastName());
            ps.setString(4, s.getDob());
            ps.setString(5, s.getGender());
            result=ps.executeUpdate();
            return result;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return result;
        }
    }
    
    public int delete(int studentID){
        int result=0;
        String delete="delete from student where studentID=?";
        try {
            PreparedStatement ps=cn.prepareStatement(delete);
            ps.setInt(1, studentID);
            result=ps.executeUpdate();
            return result;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return result;
        }
    }
    
    public int update(Student s){
        int result=0;
        String update="update student set firstName=?,lastName=?,dob=?,gender=? where studentID=?";
        try {
            PreparedStatement ps=cn.prepareStatement(update);
            ps.setString(1, s.getFirstName());
            ps.setString(2, s.getLastName());
            ps.setString(3, s.getDob());
            ps.setString(4, s.getGender());
            ps.setInt(5, s.getStudentID());
            result=ps.executeUpdate();
            return result;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return result;
        }
    }
    
    public Student get(int studentID){
        Student s=null;
        String select="select * from student where studentID=?";
        try {
            PreparedStatement ps=cn.prepareStatement(select);
            ps.setInt(1, studentID);
            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
                String firstName=rs.getString("firstName");
                String lastName=rs.getString("lastName");
                String dob=rs.getString("dob");
                String gender=rs.getString("gender");
                s=new Student(studentID,firstName,lastName,dob,gender);
            }
            rs.close();
            return s;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return s;
        }
    }
    
    public ArrayList<Student> getAll(){
        ArrayList<Student> sList=new ArrayList<>();
        String select="select * from student";
        try {
            PreparedStatement ps=cn.prepareStatement(select);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                int studentID=rs.getInt("studentID");
                String firstName=rs.getString("firstName");
                String lastName=rs.getString("lastName");
                String dob=rs.getString("dob");
                String gender=rs.getString("gender");
                Student s=new Student(studentID,firstName,lastName,dob,gender);
                sList.add(s);
            }
            rs.close();
            return sList;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
}
