/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classMenu;

import java.util.Scanner;

/**
 *
 * @author cyber
 */
public class VendingMachine {

    private final String[] items = {"Coca-Cola", "Sprite", "Fanta", "Mirinda", "Air Mineral"};
    private final int[] prices = {5000, 4000, 3000, 2000, 1000};
    private final int[] stocks = {10, 5, 9, 4, 7};

    public void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n- Vending Machine LB -:");
        System.out.println("Daftar menu:");
        for (int i = 0; i < items.length; i++) {
            System.out.println(i + 1 + ". " + items[i] + " - Rp" + prices[i]);
        }

        int totalHarga = 0;

        while (true) {
            System.out.println("Pilih menu (0 untuk selesai): ");
            int choice = input.nextInt();

            if (choice == 0) {
                break;
            }

            if (choice < 1 || choice > items.length) {
                System.out.println("Input tidak valid.");
                continue;
            }

            if (stocks[choice - 1] == 0) {
                System.out.println("Stok habis.");
                continue;
            }

            totalHarga += prices[choice - 1];
            stocks[choice - 1]--;

            System.out.println("Item ditambahkan ke keranjang.");
        }

        System.out.println("Total harga: Rp" + totalHarga);
        System.out.println("Masukkan uang: Rp");
        int payment = input.nextInt();

        if (payment < totalHarga) {
            System.out.println("Uang tidak cukup.");
        } else {
            int change = payment - totalHarga;
            System.out.println("Uang kembalian: Rp" + change);
        }
    }
}

