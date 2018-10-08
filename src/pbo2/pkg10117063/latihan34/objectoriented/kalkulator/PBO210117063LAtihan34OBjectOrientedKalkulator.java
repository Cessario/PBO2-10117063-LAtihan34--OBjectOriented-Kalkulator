/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan34.objectoriented.kalkulator;

import java.util.Scanner;

/*Nama : Cessario Sheva Lakita Purwa Adidjaya
Nim : 1017063
Kelas : IF-2
Deskripsi Program : Menampiilkan hasil dari berhitung
 */
public class PBO210117063LAtihan34OBjectOrientedKalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner (System.in);
        Kalkulator klk = new Kalkulator();
        System.out.println("=====Aplikasi Kalkulator Bilangan=====");
        System.out.print("Masukkan Angka ke -1 :");
         klk.value1= sc.nextInt();
         System.out.print("Masukkan Angka ke -2 :");
         klk.value2= sc.nextInt();
         
         System.out.println("\nHasil Pertambahan" +klk.tambahBilangan(klk.value1, klk.value2));
         System.out.println("Hasil Pengurangan" +klk.kurangBilangan(klk.value1, klk.value2));
         System.out.println("Hasil Perkalian" +klk.kaliBilangan(klk.value1, klk.value2));
         System.out.println("Hasil Pembagian" +klk.bagiBilangan(klk.value1, klk.value2));
         System.out.println("Hasil Pembagian" +klk.sisaBilangan(klk.value1, klk.value2));
                 
         
         
    }
    
}
