/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamahasiswa;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class FileArray {
    
    private final ArrayList<String> nim = new ArrayList();
    private final ArrayList<String> nama = new ArrayList();
    private final ArrayList<String> lahir = new ArrayList();
    private final ArrayList<Integer> gender = new ArrayList();
    int pilih;
    
    //Menu    
    void Menu(){

       Scanner input = new Scanner(System.in);
       
        // tampilan awal
        System.out.println("--------------------");
        System.out.println("Menu || Data Mahasiswa");
        System.out.println("--------------------");
        System.out.print("Daftar Menu:\n 1. Tambah Data\n 2. Hapus Data\n 3. Cari Data\n 4. Tampil Data\n 5. Keluar\n");
        System.out.println ("Pilihan no menu : ");
        this.pilih = input.nextInt();
                if (pilih==1){
                    FileArray A = new FileArray ();
                    A.Satu();  
                } else if (pilih==2){
                    FileArray B = new FileArray ();
                    B.Dua(); 
                } else if (pilih==3){
                    FileArray C = new FileArray ();
                    C.Tiga(); 
                }else if (pilih==4){
                    FileArray D = new FileArray ();
                    D.Empat(); 
                }else {
                    Menu();   
                }
    }
    
    //NO.1
    void Satu (){
        
        Scanner in = new Scanner(System.in);
        
        // tampilan awal
        System.out.println("------------------------------");
        System.out.println("Data Mahasiswa || Tambah Data");
        System.out.println("------------------------------");
                    
        System.out.println("Masukkan Data berikut");
        System.out.print("Nama : ");
        String name = in.next();
        
        System.out.print("NIM  : ");
        String nomor = in.next();
        
        System.out.print("Tanggal lahir (DD/MM/YYYY): ");
        String tgl = in.next();
        
        System.out.print("Gender (0: Laki-laki / 1: Perempuan)  : ");
        int gnd = in.nextInt();
        
        nama.add(name);
        nim.add(nomor);
        lahir.add(tgl);
        gender.add(gnd);
        System.out.println("\nData telah ditambahkan");
        System.out.println("\n"); 
        
        Menu();
        
    }
        
    //NO.2
    void Dua (){
        
        Scanner in = new Scanner(System.in);
        
        // tampilan awal
        System.out.println("------------------------------");
        System.out.println("Data Mahasiswa || Hapus Data");
        System.out.println("------------------------------");
                    
        System.out.println("Masukkan NIM yang akan dihapus");
        System.out.print("NIM : ");
        String nomor = in.next();
        
        int index = Collections.binarySearch(nim, nomor);
        nama.remove(index);
        nim.remove(index);
        lahir.remove(index);
        gender.remove(index);
        System.out.println("\nData telah dihapus");
        System.out.println("\n");       
        
        Menu();
    }
            
    //NO.3
    void Tiga (){
        
        Scanner in = new Scanner(System.in);
        
        // tampilan awal
        System.out.println("-----------------------------------");
        System.out.println("Data Mahasiswa || Cari Data");
        System.out.println("-----------------------------------");
        
        //pilih pencarian
        System.out.println("1. Gender");
        System.out.println("2. NIM");
        System.out.print("Pilihan anda : ");
        int cari = in.nextInt();
        
        //Cari Gender
        if (cari == 1) {
        System.out.println("---------------");
        System.out.println("Cari Menurut Gender");
        System.out.println("---------------");
        System.out.print("Pilih Gender (0 / 1) : ");
        int gen = in.nextInt();

        for (int i = 0; i < nama.size(); i++) {
            if (gender.get(i) == 0) {
                System.out.println("\nNama : " + nama.get(i));
                System.out.println("NIM : " + nim.get(i));                        
                System.out.println("Tanggal Lahir : " + lahir.get(i));                        
                System.out.println("Jenis Kelamin : " + gender.get(i));                                               
            } else if (gender.get(i) == 1) {
                System.out.println("\nNama : " + nama.get(i));
                System.out.println("NIM : " + nim.get(i));
                System.out.println("Tanggal Lahir : " + lahir.get(i));
                System.out.println("Jenis Kelamin : " + gender.get(i));
            }else{
                System.out.println("maaf, data tidak Terdeteksi");
            }
        }
        } else if (cari == 2) {
            System.out.println("---------------");
            System.out.println("Cari menurut NIM");
            System.out.println("---------------");
            System.out.print("Masukkan NIM : ");
            String nomor = in.next();

            int index = Collections.binarySearch(nim, nomor);
            String cariNama = nama.get(index);
            String cariNIM = nim.get(index);
            String caritanggal = lahir.get(index);
            int cariJenisKelamin = gender.get(index);

            System.out.println("Nama : " + cariNama);
            System.out.println("NIM : " + cariNIM);
            System.out.println("Tanggal Lahir : " + caritanggal);
            System.out.println("Jenis Kelamin : " + cariJenisKelamin);

            }       
        Menu();
    }
        
    //NO.4
    void Empat (){
        
        Scanner in = new Scanner(System.in);
        
        // tampilan awal
        System.out.println("----------------------------------------");
        System.out.println("Data Mahasiswa || Tampilkan Data");
        System.out.println("----------------------------------------");
                    
        for (int i = 0; i < nama.size(); i++) {
            System.out.println("Nama : " + nama.get(i));
            System.out.println("NIM : " + nim.get(i));
            System.out.println("Tanggal Lahir : " + lahir.get(i));
            System.out.println("Jenis Kelamin : " + gender.get(i));
            System.out.println("****************");
        }
        System.out.println("---------------------------");
        System.out.println("Jumlah Total Mahasiswa : " + nama.size());
        System.out.println("\n");    
        
       Menu (); 
    }
            
}

