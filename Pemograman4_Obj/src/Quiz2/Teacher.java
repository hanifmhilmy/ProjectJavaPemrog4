/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz2;

/**
 *
 * @author calutak
 */
public class Teacher extends Person {
    private String FacultyId;
    
    public Teacher() {
        System.out.println("SubClass Teacher");
    }
    
    public void lecture() {
        System.out.println("Teacher lecture at faculty ID : "+getFacId());
    }
    
    public void setFacId(String fId) {
        FacultyId = fId;
    }
    public String getFacId() {
        return FacultyId;
    }
}
