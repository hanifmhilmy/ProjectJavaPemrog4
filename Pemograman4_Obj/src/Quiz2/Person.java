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
public class Person {

    /**
     * @param args the command line arguments
     */
    private String Name;
    
    public Person() {
        System.out.println("Person as SuperClass");
    }
    
    public void eat() {
        System.out.println("Person "+getName()+" eat");
    }
    
    public void sleep() {
        System.out.println("Person "+getName()+" sleep 8 hours");
    }
    
    public void sleep(String nm) {
        System.out.println("Person "+nm+" sleep 8 hours");
    }
    
    public void setName(String nm) {
        Name = nm;
    }
    
    public String getName() {
        return Name;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Person pr = new Person(); 
        pr.setName("Asep");
        pr.eat();
        pr.sleep();
        pr.sleep("Agus");
        
        System.out.println(""); //separator
        
        Teacher tc = new Teacher();
        tc.setFacId("06T");
        tc.setName("Eka");
        System.out.println("Faculty ID : "+tc.getFacId());
        System.out.println("Teacher Name : "+tc.getName());
        tc.lecture();
        
        System.out.println(""); //separator
        
        Student st = new Student();
        st.setStudentId("0613U050");
        st.setName("Hanif");
        System.out.println("Student ID : "+st.getStudentId());
        System.out.println("Student Name : "+st.getName());
        st.learn();
        st.sleep();
    }
    
}
