/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba;

/**
 *
 * @author asus
 */
public class Coba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Nilai = 86;
        boolean Cantik = true;
        String Kota = "Malang";
        char Grade;

        if (Nilai > 85) {
            Grade = 'A';
        } else if (Nilai > 75) {
            Grade = 'B';
        } else if (Nilai > 65) {
            Grade = 'C';
        } else if (Nilai > 55) {
            Grade = 'D';
        } else {
            Grade = 'E';
        }
        
        if (Grade == 'A' && Cantik == true && Kota == "Malang") {
            System.out.println("Saya Mau Banget Menikah!!");
        } else if (Grade == 'B' || Grade == 'C' && Cantik == true && Kota == "Malang") {
            System.out.println("Boleh Lah !!");
        } else if (Kota == "Malang") {
            System.out.println("Saya Pikir !!");
        } else {
            System.out.println("Absolutly No !!");
        }
    }
}
