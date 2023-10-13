/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classMenu;

/**
 *
 * @author cyber
 */
public class Uts5 {
    double jamKerja, jamTarif;
    
    public Uts5(double jamKerja, double jamTarif){
        this.jamKerja = jamKerja;
        this.jamTarif = jamTarif;
    }
    
    public double hitungGaji() {
        double gajiPokok = 0;
        if (jamKerja <= 40) {
            gajiPokok = jamKerja * jamTarif;
        } else {
            gajiPokok = 40 * jamTarif;

            double jamLembur = jamKerja - 40;
            double tarifLembur = jamTarif * 1.5;
            gajiPokok += jamLembur * tarifLembur;
        }

        return gajiPokok;
    }
    
}
