/*
    Dibuat Oleh : 
    Nama    : Basri Basren
    Nim     : 201410370311030 
*/
package PreSistem;

import java.util.Scanner;

public class LingkunganTest {
    Scanner input = new Scanner(System.in);
    LingkunganRuangKelas LingkunganKelas =new LingkunganRuangKelas();
    public void inputLingkungan(){
        System.out.println("1. Kondisi Bersih");
        System.out.println("2. Kondisi Tidak Bersih");
        System.out.print("Masukkan Kondisi Lantai = ");
        LingkunganKelas.setKondisiLantai(input.nextInt());
        System.out.print("Masukkan Kondisi Dinding = ");
        LingkunganKelas.setKondisiDinding(input.nextInt());
        System.out.print("Masukkan Kondisi Atap = ");
        LingkunganKelas.setKondisiAtap(input.nextInt());
        System.out.print("Masukkan Kondisi Pintu = ");
        LingkunganKelas.setKondisiPintu(input.nextInt());
        System.out.print("Masukkan Kondisi Jendela = ");
        LingkunganKelas.setKondisiJendela(input.nextInt());
    }
    public void AnalisisKondisi(){
        if(LingkunganKelas.getKondisiLantai()== 1){
            System.out.println("Kondisi Lantai ruangan Bersih Sesuai");
        }else if(LingkunganKelas.getKondisiLantai()== 2){
            System.out.println("Kondisi Lantai ruangan Tidak Bersih");
        }
        
        if(LingkunganKelas.getKondisiDinding()== 1){
            System.out.println("Kondisi Dinding ruangan Bersih Sesuai");
        }else if(LingkunganKelas.getKondisiDinding()== 2){
            System.out.println("Kondisi Dinding ruangan Tidak Bersih");
        }
        
        if(LingkunganKelas.getKondisiAtap()== 1){
            System.out.println("Kondisi Atap ruangan Bersih Sesuai");
        }else if(LingkunganKelas.getKondisiAtap()== 2){
            System.out.println("Kondisi Atap ruangan Tidak Bersih");
        }
        
        if(LingkunganKelas.getKondisiPintu()== 1){
            System.out.println("Kondisi Pintu ruangan Bersih Sesuai");
        }else if(LingkunganKelas.getKondisiPintu()== 2){
            System.out.println("Kondisi Pintu ruangan Tidak Bersih");
        }
        
        if(LingkunganKelas.getKondisiJendela()== 1){
            System.out.println("Kondisi Jendela ruangan Bersih Sesuai");
        }else if(LingkunganKelas.getKondisiJendela()== 2){
            System.out.println("Kondisi Jendela ruangan Tidak Bersih");
        }
        
        if(LingkunganKelas.getKondisiLantai() == 1 && LingkunganKelas.getKondisiDinding() == 1 &&LingkunganKelas.getKondisiAtap() == 1
              &&LingkunganKelas.getKondisiPintu() == 1 &&LingkunganKelas.getKondisiJendela() == 1){
            System.out.println("Kondisi Lingkungan Ruang Kelas Bersih Sesuai");
        }
    }
    public void Lingkungan(){
        inputLingkungan();
        System.out.println("====================================================");
        AnalisisKondisi();
        System.out.println("====================================================");
    }
}
