/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasuts;

/**
 *
 * @author Lenovo
 */
import java.util.Random;
import java.util.Scanner;
  
public class Hitung {
    
    void Tebak(){
        Random x = new Random();
        int angkarandom = x.nextInt(101);
        Scanner input = new Scanner (System.in);
        int bilangan;
        do{
            System.out.print("\n Masukkan Angka : ");
            bilangan = input.nextInt();
            
            if(bilangan < angkarandom){
                System.out.println("Angka terlalu kecil, coba lagi!");
                }
            else if(bilangan > angkarandom){
                System.out.println("angka terlalu besar, coba lagi!");
                }
            else{
                System.out.println("selamat anda benar");
                }
            
        }while(bilangan != angkarandom);
    }


}
