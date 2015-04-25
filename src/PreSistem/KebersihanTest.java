/*
    Dibuat Oleh : 
    Nama    : Basri Basren
    Nim     : 201410370311030 
*/
package PreSistem;

import java.util.Scanner;

public class KebersihanTest {
    Scanner input = new Scanner(System.in);
    KebersihanRuangKelas KebersihanKelas = new KebersihanRuangKelas();
    public void inputKebersihan(){
        System.out.println("1. Lancar");
        System.out.println("2. Tidak Lancar");
        System.out.print("Masukkan Kondisi Sirkulasi Udara = ");
        KebersihanKelas.setSirkulasiUdara(input.nextInt());

        System.out.print("Masukkan Nilai Pencahayaan = ");
        KebersihanKelas.setnilaiPencahayaan(input.nextInt());

        System.out.print("Masukkan Nilai Kelembapan = ");
        KebersihanKelas.setKelembapan(input.nextInt());

        System.out.print("Masukkan Nilai Suhu = ");
        KebersihanKelas.setsuhu(input.nextInt());
    }
    
    public void AnalisisKebersihan(){
        if(KebersihanKelas.getSirkulasiUdara() == 1){
            System.out.println("Sirkulasi Udara Di ruangan Lancar Sesuai");
        }else if(KebersihanKelas.getSirkulasiUdara() == 2){
            System.out.println("Sirkulasi Udara Di ruangan Tidak Lancar");
        }
        
        if(KebersihanKelas.getnilaiPencahayaan() >= 250 && KebersihanKelas.getnilaiPencahayaan() <=350){
            System.out.println("Nilai Pencahayaan Ruangan = "+KebersihanKelas.getnilaiPencahayaan()+" Sesuai");
        }else{
            System.out.println("Nilai Pencahayaan Ruangan = "+KebersihanKelas.getnilaiPencahayaan());
        }
        
        if(KebersihanKelas.getKelembapan() >= 70 && KebersihanKelas.getKelembapan()<= 80){
            System.out.println("Nilai Kelembapan Ruangan = "+KebersihanKelas.getKelembapan()+" Sesuai");
        }else{
            System.out.println("Nilai Kelembapan Ruangan = "+KebersihanKelas.getKelembapan());
        }
        
        if(KebersihanKelas.getsuhu() >= 25 && KebersihanKelas.getsuhu()<= 35){
            System.out.println("Nilai Suhu Ruangan = "+KebersihanKelas.getsuhu()+" Sesuai");
        }else{
            System.out.println("Nilai Suhu Ruangan = "+KebersihanKelas.getsuhu());
        }
    }
    public void Kebersihantest(){
        inputKebersihan();
        System.out.println();
        System.out.println("======================================================");
        AnalisisKebersihan();
        System.out.println("======================================================");
    }
        
        
}
