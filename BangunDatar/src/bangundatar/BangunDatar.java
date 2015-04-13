
package bangundatar;

public class BangunDatar {
    private String nama;
    private float Luas;
    private int Keliling;
    
    public BangunDatar(){
        
    }
    public BangunDatar(String nma){
        nama = nma;
    }
    
    
    public void setNama(String nma){
       nama = nma;
   }
    public String getNama(){
       System.out.println(nama);
       return nama;
    } 
    
    public float Luas(int sisi){
        float L = sisi*sisi;
        System.out.println("Luas Persegi = " + L);
        return Luas;
    }
    public float Luas(int panjang, int luas){
        float L = panjang*luas;
        System.out.println("Luas Peregi Panjang = " + L);
        return Luas;
    }
    public float Luas(float alas,float tinggi, float bagi){
        float L = alas*tinggi/bagi;
        System.out.println("Luas Segitiga = " + L);
        return Luas;
    }
    public int Keliling(int sisi){
        int K = 4*sisi;
        System.out.println("Keliling Persegi = " + K);
        return Keliling;
    }
    public int Keliling(int panjang, int luas){
        int K = (panjang+luas)*2;
        System.out.println("Keliling Peregi Panjang = " + K);
        return Keliling;
    }
    public int Keliling(int sisiA, int sisiB, int sisiC){
        int K = sisiA+sisiB+sisiC;
        System.out.println("Keliling Segitiga = " + K);
        return Keliling;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        BangunDatar persegi=new BangunDatar();
        persegi.setNama("Persegi");
        persegi.getNama();
        persegi.Luas(5);
        persegi.Keliling(5);
        
        BangunDatar pPanjang =new BangunDatar("Persegi Panjang");
        pPanjang.getNama();
        pPanjang.Luas(10, 5);
        pPanjang.Keliling(10, 5);
        
        BangunDatar segitiga =new BangunDatar("Segitiga");
        segitiga.getNama();
        segitiga.Luas(5, 3, 2);
        segitiga.Keliling(5, 3, 3);
        
    }
    
    
}
