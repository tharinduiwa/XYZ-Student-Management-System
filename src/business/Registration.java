/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;


public class Registration {
    private String RegistrationID;
    private int StudentID;
    private String ModuleID;
    private String RegistrationDate;

    public Registration() {
    }

    public Registration(String RegistrationID, int StudentID, String ModuleID, String RegistrationDate) {
        this.RegistrationID = RegistrationID;
        this.StudentID = StudentID;
        this.ModuleID = ModuleID;
        this.RegistrationDate = RegistrationDate;
    }

    public String getRegistrationID() {
        return RegistrationID;
    }

    public void setRegistrationID(String RegistrationID) {
        this.RegistrationID = RegistrationID;
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int StudentID) {
        this.StudentID = StudentID;
    }

    public String getModuleID() {
        return ModuleID;
    }

    public void setModuleID(String ModuleID) {
        this.ModuleID = ModuleID;
    }

    public String getRegistrationDate() {
        return RegistrationDate;
    }

    public void setRegistrationDate(String RegistrationDate) {
        this.RegistrationDate = RegistrationDate;
    }
    
}
