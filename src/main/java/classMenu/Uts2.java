/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classMenu;

/**
 *
 * @author cyber
 */
public class Uts2 {
    double a, b, c;
    
    public Uts2(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public String segitiga(){
       if ((a + b) > c && (a + c) > b && (b + c) > a) {
            return "Dapat membentuk segitiga.";
       } else {
            return "Tidak dapat membentuk segitiga.";
       } 
    }
}
