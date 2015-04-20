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
public class Division extends Department {
    private String kepalaDivisi;
    
    public Division() {
        
    }
    
    public Division(String id) {
        super(id);
        System.out.println("ID : " + id);
    }
    
    public void tampilkanInfo() {
        System.out.println("   Nama Departmen : " + getNama_dept());
        System.out.println("   Kepala Divisi : " + getKepala_div());
    }
    
    public void hitungGaji(double gj) {
        System.out.println("   Gaji : " + gj);
    }
    
    public String setKepala_div(String kd) {
        kepalaDivisi = kd;
        return kepalaDivisi;
    }
    
    public String getKepala_div(){
        return kepalaDivisi;
    }
}
