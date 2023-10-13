/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classMenu;

/**
 *
 * @author cyber
 */
public class Uts4 {
    double jari2;
    
    public Uts4(double jari3) {
        this.jari2 = jari3;
    }

    public double hitungLuas() {
        double luas = Math.PI * jari2 * jari2;
        return Math.round(luas * 100.0) / 100.0;
    }

    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jari2;
        return Math.round(keliling * 100.0) / 100.0;
    }
    
}
