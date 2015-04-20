/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package April2015;

/**
 *
 * @author calutak
 */
public class DepartMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("a. ");
        Department dept1 = new Department();
        
        System.out.print("b. ");
        Department dept2 = new Department("A41");
        dept2.setNama_dept("Keuangan");
        dept2.tampilkanInfo();
        
        System.out.print("c. ");
        Division div1 = new Division("A51");
        div1.setKepala_div("Bapak Suwarno");
        div1.setNama_dept("Teknologi Informasi");
        div1.tampilkanInfo();
        div1.hitungGaji(2000000);
    }
    
}
