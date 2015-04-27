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
public class Student extends Person {
    private String StudentId;
    
    public Student() {
        System.out.println("SubClass Student");
    }
    
    public void learn() {
        System.out.println("Student with ID "+getStudentId()+" is learning");
    }
    
    public void sleep() {
        System.out.println("Student with ID "+getStudentId()+" sleep 6 hours");
    }
    public void setStudentId(String st) {
        StudentId = st;
    }
    public String getStudentId() {
        return StudentId;
    }
}
