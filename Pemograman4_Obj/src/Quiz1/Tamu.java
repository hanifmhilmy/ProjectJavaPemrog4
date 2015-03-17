/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz1;

/**
 *
 * @author calutak
 */
public class Tamu {
    private String nama_ruangan;
    private int id_ruangan, lama_menginap, harga;
    
    public Tamu() {
        
    }
    
    public int setId_ruangan(int id_ruang) {
        id_ruangan = id_ruang;
        return id_ruangan;
    }
    
    public String setNama_ruangan(String nm_ruang) {
        nama_ruangan = nm_ruang;
        return nama_ruangan;
    }
    
    public int setLama_menginap(int lm_nginap) {
        lama_menginap = lm_nginap;
        return lama_menginap;
    }
    
    public int getId_ruangan() {
        return id_ruangan;
    }
    
    public String getNama_ruangan() {
        return nama_ruangan;
    }
    
    public int getLama_menginap() {
        return lama_menginap;
    }
    
    public int jumlah_biaya() {
        return lama_menginap * 120000;
    }
    
    public int jumlah_biaya(int lm_nginap) {
        lama_menginap = lm_nginap;
        return lama_menginap * 360000;
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tamu tm = new Tamu();
        Tamu tm2 = new Tamu();
        
        tm.setId_ruangan(402);
        System.out.println("Id Ruangan : " + tm.getId_ruangan());
        tm.setNama_ruangan("Luxville 2");
        System.out.println("Nama Ruangan : " + tm.getNama_ruangan());
        tm.setLama_menginap(3);
        System.out.println("Lama Menginap : " + tm.getLama_menginap());
        System.out.println("Nama Ruangan : " + tm.jumlah_biaya());
        
        tm2.setId_ruangan(203);
        System.out.println("Id Ruangan : " + tm2.getId_ruangan());
        tm2.setNama_ruangan("Rockbottom 3");
        System.out.println("Nama Ruangan : " + tm2.getNama_ruangan());
        tm2.setLama_menginap(2);
        System.out.println("Lama Menginap : " + tm2.getLama_menginap());
        System.out.println("Nama Ruangan : " + tm2.jumlah_biaya(tm2.getLama_menginap()));
        
    }
    
}
