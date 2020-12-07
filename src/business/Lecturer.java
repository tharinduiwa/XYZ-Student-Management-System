/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;


public class Lecturer {
    private int lecturerID;
    private String firstName;
    private String lastName;
    private String gender;

    public Lecturer() {
    }

    public Lecturer(int lecturerID, String firstName, String lastName, String gender) {
        this.lecturerID = lecturerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public int getLecturerID() {
        return lecturerID;
    }

    public void setLecturerID(int lecturerID) {
        this.lecturerID = lecturerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
}
