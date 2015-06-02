/*
    Dibuat Oleh : 
    Nama    : Basri Basren
    Nim     : 201410370311030 
*/
package PreSistem;

import java.io.FileWriter;
import java.io.IOException;


public class KenyamananTest extends IndukClass{
    KenyamananRuangan Kenyamanan = new KenyamananRuangan();
    public static double Kenyamanan_Sesuai = 0.0;

    @Override
    public void Input() {
        System.out.println("1. Tidak Bising");
        System.out.println("2. Bising");
        System.out.print("Masukkan Nilai Kebisingan = ");
        Kenyamanan.setKebisingan(input.nextInt());
        System.out.println("1. Tidak Bau");
        System.out.println("2. Bau");
        System.out.print("Masukkan Nilai Bau = ");
        Kenyamanan.setBau(input.nextInt());
        System.out.println("1. Tidak Bocor");
        System.out.println("2. Bocor");
        System.out.print("Masukkan Nilai Kebocoran = ");
        Kenyamanan.setKebocoran(input.nextInt());
        System.out.println("1. Tidak Rusak");
        System.out.println("2. Rusak");
        System.out.print("Masukkan Nilai Kerusakan = ");
        Kenyamanan.setKerusakan(input.nextInt());
        System.out.println("1. Tidak Aus");
        System.out.println("2. Aus");
        System.out.print("Masukkan Nilai Keausan = ");
        Kenyamanan.setKeausan(input.nextInt());
    }

    @Override
    public double Analisis() {
         if(Kenyamanan.getKebisingan()== 1){
            Kenyamanan_Sesuai++;
        }
        if(Kenyamanan.getBau()== 1){
            Kenyamanan_Sesuai++;
        }
        if(Kenyamanan.getKebocoran()== 1){
            Kenyamanan_Sesuai++;
        }
        if(Kenyamanan.getKerusakan()== 1){
            Kenyamanan_Sesuai++;
        }
        if(Kenyamanan.getKeausan()== 1){
            Kenyamanan_Sesuai++;
        }
        return Kenyamanan_Sesuai;
    }
    
    @Override
    public void Tampil(){
        if(Kenyamanan.getKebisingan()== 1){
            System.out.println("Kebisingan Di ruangan Tidak Bising \t Sesuai");
        }else if(Kenyamanan.getKebisingan()== 2){
            System.out.println("Kebisingan Di ruangan Bising");
        }
        
        if(Kenyamanan.getBau()== 1){
            System.out.println("Bau Di ruangan Tidak Bau \t\t Sesuai");
        }else if(Kenyamanan.getBau()== 2){
            System.out.println("Bau Di ruangan Bau");
        }
        
        if(Kenyamanan.getKebocoran()== 1){
            System.out.println("Kebocoran Di ruangan Tidak Bocor \t Sesuai");
        }else if(Kenyamanan.getKebocoran()== 2){
            System.out.println("Kebocoran Di ruangan Bocor");
        }
        
        if(Kenyamanan.getKerusakan()== 1){
            System.out.println("Kerusakan Di ruangan Tidak Rusak \t Sesuai");
        }else if(Kenyamanan.getKerusakan()== 2){
            System.out.println("Kerusakan Di ruangan Rusak");
        }
        
        if(Kenyamanan.getKeausan()== 1){
            System.out.println("Keausan Di ruangan Tidak aus \t\t Sesuai");
        }else if(Kenyamanan.getKeausan()== 2){
            System.out.println("Keausan Di ruangan aus");
        }
    }
    
    @Override
    public void Save(){
        try{
           FileWriter Writer = new FileWriter("Kenyamanan.txt");
           Writer.write("Kebisingan Ruangan = " + Kenyamanan.getKebisingan()+"\t");
           Writer.write("Bau Ruangan = " + Kenyamanan.getBau()+"\t");
           Writer.write("Kebocoran Ruangan= " + Kenyamanan.getKebocoran()+"\t");
           Writer.write("Kerusakan Ruangan= " + Kenyamanan.getKerusakan()+"\t");
           Writer.write("Keausan Ruangan= " + Kenyamanan.getKeausan()+"\t");
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
        System.out.println("=============== Output Kenyamanan Ruang ===============");
        Tampil();
        System.out.println("=======================================================");
        System.out.println();
        Save();
    }

}
