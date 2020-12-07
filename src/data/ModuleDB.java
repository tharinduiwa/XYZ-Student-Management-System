/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.sql.*;
import business.Module;
import java.util.ArrayList;

public class ModuleDB {
    private Connection cn;
    
    public ModuleDB(){
        try {
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/xyzdb","root","");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public int add(Module m){
        int result=0;
        String insert="insert into module(moduleID,title,duration,credit) values(?,?,?,?)";
        try {
            PreparedStatement ps=cn.prepareStatement(insert);
            ps.setString(1, m.getModuleID());
            ps.setString(2, m.getTitle());
            ps.setInt(3, m.getDuration());
            ps.setInt(4, m.getCredit());
            result=ps.executeUpdate();
            return result;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return result;
        }
    }
    
    public int delete(String moduleID){
        int result=0;
        String delete="delete from module where moduleID=?";
        try {
            PreparedStatement ps=cn.prepareStatement(delete);
            ps.setString(1, moduleID);
            result=ps.executeUpdate();
            return result;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return result;
        }
    }
    
    public int update(Module m){
        int result=0;
        String update="update module set title=?,duration=?,credit=? where moduleID=?";
        try {
            PreparedStatement ps=cn.prepareStatement(update);
            ps.setString(1, m.getTitle());
            ps.setInt(2, m.getDuration());
            ps.setInt(3, m.getCredit());
            ps.setString(4, m.getModuleID());
            result=ps.executeUpdate();
            return result;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return result;
        }
    }
    
    public Module get(String moduleID){
        Module m=null;
        String select="select * from module where moduleID=?";
        try {
            PreparedStatement ps=cn.prepareStatement(select);
            ps.setString(1, moduleID);
            ResultSet rs=ps.executeQuery();
            if (rs.next()) {
                String title=rs.getString("title");
                int duration=rs.getInt("duration");
                int credit=rs.getInt("credit");
                m=new Module(moduleID,title,duration,credit);
            }
            rs.close();
            return m;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return m;
        }
    }
    
    public ArrayList<Module> getAll(){
        ArrayList<Module> mList=new ArrayList<>();
        String select="select * from module";
        try {
            PreparedStatement ps=cn.prepareStatement(select);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                String moduleID=rs.getString("moduleID");
                String title=rs.getString("title");
                int duration=rs.getInt("duration");
                int credit=rs.getInt("credit");
                Module m=new Module(moduleID,title,duration,credit);
                mList.add(m);
            }
            rs.close();
            return mList;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
}
