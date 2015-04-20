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
public class Department {
    private String id;
    private String nama_dept;
    
    public Department() {
        id = "A31";
        System.out.println("ID : " + id);
    }
    
    public Department(String id) {
        this.id = id;
    }
    
    public void tampilkanInfo() {
        System.out.println("ID : "+ id);
        System.out.println("   Nama Departmen : " + getNama_dept());
    }
    
    public String setNama_dept(String nm_dp) {
        nama_dept = nm_dp;
        return nama_dept;
    }
    
    public String getNama_dept() {
        return nama_dept;
    }
}
