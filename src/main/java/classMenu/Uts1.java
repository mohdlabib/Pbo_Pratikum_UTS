/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classMenu;

/**
 *
 * @author cyber
 */
public class Uts1 {
    String kata;
    
    public Uts1(String kata){
        this.kata = kata;
    }
    
    public String Palindrome() {
        String balikKata = "";

        for (int i = kata.length() - 1; i >= 0; i--) {
            balikKata += kata.charAt(i);
        }

        if (kata.equalsIgnoreCase(balikKata)) {
            return kata + " adalah palindrome";
        } else {
            return kata + " bukan palindrome";
        }
    }
}
