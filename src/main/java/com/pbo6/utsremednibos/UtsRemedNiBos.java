/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pbo6.utsremednibos;

import classMenu.Uts1;
import classMenu.Uts2;
import classMenu.Uts3;
import classMenu.Uts4;
import classMenu.Uts5;
import classMenu.VendingMachine;
import java.util.Scanner;

/**
 *
 * @author cyber
 */
public class UtsRemedNiBos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;

        do {
          System.out.println("\nMenu:");
          System.out.println("1. Palindrome");
          System.out.println("2. Segitiga");
          System.out.println("3. Piramida");
          System.out.println("4. Lingkaran");
          System.out.println("5. Gaji Karyawan");
          System.out.println("6. Veding Machine (bonus)");
          System.out.println("0. Keluar");

          System.out.print("Masukkan pilihan Anda: ");
          menu = input.nextInt();

          input.nextLine();
          switch (menu) {
            case 1:
              System.out.print("\nMasukan kata atau frasa: ");
              String kata = input.nextLine();

              Uts1 uts1 = new Uts1(kata);
              System.out.print("Output: " + uts1.Palindrome());
              break;
            case 2:
              System.out.print("\nMasukan panjang sisi A: ");
              double a = input.nextDouble();

              System.out.print("Masukan panjang sisi B: ");
              double b = input.nextDouble();

              System.out.print("Masukan panjang sisi C: ");
              double c = input.nextDouble();

              Uts2 uts2 = new Uts2(a, b, c);
              System.out.print("Output: " + uts2.segitiga());
              break;
            case 3:
              System.out.print("\nMasukkan tinggi setengah piramida: ");
              int JumlahE = input.nextInt();

              Uts3 uts3 = new Uts3(JumlahE);
              System.out.println("Output: ");

              uts3.piramid();
              break;
            case 4:
              System.out.print("\nMasukkan jari-jari lingkaran: ");
              double r2 = input.nextDouble();

              Uts4 uts4 = new Uts4(r2);
              
              System.out.println("Luas lingkaran: " + uts4.hitungLuas());
              System.out.println("Keliling lingkaran: " + uts4.hitungKeliling());
              break;
            case 5:
              System.out.print("\nMasukkan jumlah jam kerja: ");
              double jamKerja = input.nextDouble();
              
              System.out.print("Masukkan tarif per jam: ");
              double jamTarif = input.nextDouble();

              Uts5 uts5 = new Uts5(jamKerja, jamTarif);
              
              System.out.println("Gaji karyawan: " + uts5.hitungGaji());
              break;
            case 6:
              VendingMachine vendingMachine = new VendingMachine();
              vendingMachine.main(args);
              break;
            case 0:
              System.out.println("\nend program ni boss.");
              break;
          }
          System.out.println();
        } while (menu != 0);

      }
}
