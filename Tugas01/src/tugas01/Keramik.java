/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas01;

/**
 *
 * @author Lenovo
 */
public class Keramik {

    /* membuat methods */
    void hitungKeramik (int panjang, int lebar, int isi, int harga){
        int totalKeramik;
        int totalBox;
        int hargaAkhir;
        totalKeramik = panjang * lebar * isi;
        totalBox = 1000000 / totalKeramik;
        hargaAkhir = totalBox * harga;
        System.out.println ("total box keramik: " + totalBox + " box");
        System.out.println ("total harga keramik: " + hargaAkhir + " rupiah");
    }
    
}
