/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classMenu;

/**
 *
 * @author cyber
 */
public class Uts3 {
    int jumlahE;
    
    public Uts3(int jumlahE){
        this.jumlahE = jumlahE;
    }
    
    public void piramid() {
        for (int i = 1; i <= jumlahE; i++) {
          for (int e = 0; e < i; e++) {
            System.out.print(i);
          }
          System.out.println();
        }
    }
}
