/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas02;

/**
 *
 * @author Lenovo
 */
public class Keramik01 {
    //atribut
    
    int panjang;
    int lebar;
    int isi;
    int harga;
    
    //constructor
    Keramik01(int p,int l, int isi, int harga){
        this.panjang = p;
        this.lebar = l;
        this.isi = isi;
        this.harga = harga;
    }
    
    //methods
    int hitungKeramik(){
        int keramik = this.panjang*this.lebar*this.isi;
        return keramik;
         
    }
    
    int hitungBox(){
        int box = 1000000/ this.hitungKeramik();
        return box;
        
    }
    
    int hitungHarga(){
        int harga = this.hitungBox()*this.harga;
        return harga;
    }
    
    void output(){
        System.out.println ("total box keramik: " + this.hitungBox() + " box");
        System.out.println ("total harga keramik: " + this.hitungHarga() + " rupiah");
    }
}
