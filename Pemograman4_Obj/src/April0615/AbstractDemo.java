/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package April0615;

/**
 *
 * @author calutak
 */
public class AbstractDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Salary s = new Salary("Mohd Mohtasim", "Ambehta, UP", 3, 3600.00);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
        
        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();
        
        System.out.println("\nCall mailCheck using Employee reference --");
        e.mailCheck();
    }
    
}
