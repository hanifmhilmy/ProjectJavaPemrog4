
package pegawai;

public class Pegawai {
        String nama;
        int umur;
        String alamat;
        double gaji;
        
    public Pegawai(){
            
        }
        public void setNama (String namaPgw) {
            nama = namaPgw;
           
        }
        public String getNama(){
            System.out.println("Nama Pegawai : " + nama);
            return nama;
        }
        public void setUmur(int umurPgw){
            umur = umurPgw;
        }
        public void getUmur(){
            System.out.println("Umur Pegawai : " + umur);
       
        }
        public void setAlamat (String alamatPgw) {
            alamat = alamatPgw;
           
        }
        public String getAlamat(){
            System.out.println("Alamat Pegawai : " + alamat);
            return alamat;
        }
        public void setGaji (double gajiPgw){
            gaji = gajiPgw;
         
        }
        public double getGaji (){
            System.out.println("Gaji Pegawai : " + gaji);
            return gaji;
        }
        public void cetakinfo (){
            System.out.println("Data Pegawai");
        }
    public static void main(String[] args) {
        // TODO code application logic here
        Pegawai udin = new Pegawai();
        udin.setNama("Komar");
        udin.getNama();
        udin.setUmur(37);
        udin.getUmur();
        udin.setAlamat("Jl cicaheum no 99");
        udin.getAlamat();
        udin.setGaji (3500000);
        udin.getGaji();
        udin.cetakinfo();
        
    }
}
