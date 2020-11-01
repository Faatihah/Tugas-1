/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasuts2;

/**
 *
 * @author Lenovo
 */

import java.util.Random;
import java.util.Scanner;

public class Hitung2 {
        
    void Tebak(){
        Random x = new Random();
        int angkarandom = x.nextInt(101);
        Scanner input = new Scanner (System.in);
        int score = 100;
        int coba = 1;
        int bilangan;
        do{
            System.out.print("\nMasukkan Angka : ");
            bilangan = input.nextInt();
            
            if(bilangan < angkarandom){
                score-=2;
                System.out.println("Angka terlalu kecil, coba lagi!");
                System.out.println("-----Score Anda= " + score + "-----");
                }
            else if(bilangan > angkarandom){
                score-=2;
                System.out.println("angka terlalu besar, coba lagi!");
                System.out.println("-----Score Anda= " + score + "-----");
                }
            else{
                System.out.println("selamat anda benar");
                if (coba <= 5){
                    score += 50;
                    System.out.println("\nkarna benar kurang dari 5 percobaan, score kamu +50");
                }
                System.out.println("Score Akhir kamu: " + score );
                }
            coba+=1;
            if (score == 0){
                System.out.println("GAME OVERRRR!!!!");
                break;
                
            }
        }while(bilangan != angkarandom);
    }


}
