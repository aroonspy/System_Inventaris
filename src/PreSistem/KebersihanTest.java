/*
    Dibuat Oleh : 
    Nama    : Basri Basren
    Nim     : 201410370311030 
*/
package PreSistem;

import java.io.FileWriter;
import java.io.IOException;


public class KebersihanTest extends IndukClass{
    KebersihanRuangKelas KebersihanKelas = new KebersihanRuangKelas();
    public static double Kebersihan_Sesuai = 0.0;
    
    @Override
    public void Input() {
        System.out.println("1. Lancar");
        System.out.println("2. Tidak Lancar");
        System.out.print("Masukkan Kondisi Sirkulasi Udara = ");
        KebersihanKelas.setSirkulasiUdara(input.nextInt());

        System.out.print("Masukkan Nilai Pencahayaan ( 250 - 350 )= ");
        KebersihanKelas.setnilaiPencahayaan(input.nextInt());

        System.out.print("Masukkan Nilai Kelembapan ( 70 - 80 ) = ");
        KebersihanKelas.setKelembapan(input.nextInt());

        System.out.print("Masukkan Nilai Suhu ( 25 - 35 )= ");
        KebersihanKelas.setsuhu(input.nextInt());
    }
    
    @Override
    public double Analisis(){
        if(KebersihanKelas.getSirkulasiUdara() == 1){
            Kebersihan_Sesuai++;
        }
        if(KebersihanKelas.getnilaiPencahayaan() >= 250 && KebersihanKelas.getnilaiPencahayaan() <=350){
            Kebersihan_Sesuai++;
        }
        if(KebersihanKelas.getKelembapan() >= 70 && KebersihanKelas.getKelembapan()<= 80){
            Kebersihan_Sesuai++;
        }
        if(KebersihanKelas.getsuhu() >= 25 && KebersihanKelas.getsuhu()<= 35){
            Kebersihan_Sesuai++;
        }
        return Kebersihan_Sesuai;
    }
    
    @Override
    public void Tampil(){
        if(KebersihanKelas.getSirkulasiUdara() == 1){
            System.out.println("Sirkulasi Udara Di ruangan Lancar Sesuai");
        }else if(KebersihanKelas.getSirkulasiUdara() == 2){
            System.out.println("Sirkulasi Udara Di ruangan Tidak Lancar");
        }
        
        if(KebersihanKelas.getnilaiPencahayaan() >= 250 && KebersihanKelas.getnilaiPencahayaan() <=350){
            System.out.println("Nilai Pencahayaan Ruangan \t = "+KebersihanKelas.getnilaiPencahayaan()+" Sesuai");
        }else{
            System.out.println("Nilai Pencahayaan Ruangan \t = "+KebersihanKelas.getnilaiPencahayaan());
        }
        
        if(KebersihanKelas.getKelembapan() >= 70 && KebersihanKelas.getKelembapan()<= 80){
            System.out.println("Nilai Kelembapan Ruangan \t = "+KebersihanKelas.getKelembapan()+" Sesuai");
        }else{
            System.out.println("Nilai Kelembapan Ruangan \t = "+KebersihanKelas.getKelembapan());
        }
        
        if(KebersihanKelas.getsuhu() >= 25 && KebersihanKelas.getsuhu()<= 35){
            System.out.println("Nilai Suhu Ruangan \t\t = "+KebersihanKelas.getsuhu()+" Sesuai");
        }else{
            System.out.println("Nilai Suhu Ruangan \t\t = "+KebersihanKelas.getsuhu());
        }
    }
    
    @Override
    public void Save(){
        try{
           FileWriter Writer = new FileWriter("Kebersihan.txt");
           Writer.write("Sirkulasi Udara Ruangan = " + KebersihanKelas.getSirkulasiUdara()+"\t");
           Writer.write("Pencahayaan Ruangan = " + KebersihanKelas.getnilaiPencahayaan()+"\t");
           Writer.write("Kelembapan Ruangan= " + KebersihanKelas.getKelembapan()+"\t");
           Writer.write("Suhu Ruangan= " + KebersihanKelas.getsuhu()+"\t");
           Writer.close();
         }catch(IOException ex){
             ex.printStackTrace();
         }
    }
    
    @Override
    public void Pemanggilan() {
        System.out.println();
        Input();
        Analisis();
        System.out.println("============== Output Kebersihan Ruang ===============");
        Tampil();
        System.out.println("======================================================");
        System.out.println();
        Save();
    }

    
}
