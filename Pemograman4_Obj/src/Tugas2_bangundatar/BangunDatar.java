/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2_bangundatar;

/**
 *
 * @author calutak
 */
public class BangunDatar {
    private double sisi, a, b, c;
    private String stat;
    
    public BangunDatar() {
        System.out.println("Bangun Datar \n");
    }
    
    public BangunDatar(double s) {
        stat = "P";
        System.out.println("Persegi");
        sisi = s;
    }
    
    public BangunDatar(double p,double l) {
        stat = "PP";
        System.out.println("Persegi Panjang");
        a = p;
        b = l;
    }
    
    public BangunDatar(double ab, double ac, double bc) {
        stat = "S";
        System.out.println("Segitiga");
        a = ab;
        b = ac;
        c = bc;
    }
    
    public void setValue(double s){
        sisi = s;
    }
    public void setValue(double f, double g){
        a = f;
        b = g;
    }
    public void setValue(double f, double g, double h){
        a = f;
        b = g;
        c = h;
    }
    
    public double luas() {
        if (stat.equals("P")) {
            return(sisi * sisi);
        }
        else if (stat.equals("PP")) {
            return(a * b);
        }
        else if (stat.equals("S")) {
            return(0.5 * a * b);
        }
        else {
            return 0;
        }
    }
    
    public double luas(double s) {
        this.setValue(s);
        
        return(sisi*sisi);
    }
    public double luas(double p, double l) {
        this.setValue(p, l);
        
        return(a * b);
    }
    
    public void keliling() {
        if (stat.equals("P")) {
            System.out.println("Keliling Persegi : " +  4*sisi + "\n");
        }
        else if (stat.equals("PP")) {
            System.out.println("Keliling Persegi Panjang : " +  (2*a + 2*b) + "\n");
        }
        else if (stat.equals("S")) {
            System.out.println("Keliling Segitiga : " +  (a + b + c) + "\n");
        }
    }
    
    public void keliling(double s) {
        this.setValue(s);
        
        System.out.println("Keliling Persegi : " + 4*sisi);
    }
    public void keliling(double p, double l) {
        this.setValue(p, l);
        
        System.out.println("Keliling Persegi Panjang : " + (2*a + 2*b));
    }
    public void keliling(double at, double t, double sm) {
        this.setValue(at, t, sm);
        System.out.println("Keliling Segitiga : " +  (at + t + sm));
    }
}