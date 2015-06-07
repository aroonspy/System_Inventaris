/*
    Dibuat Oleh : 
    Nama    : Basri Basren
    Nim     : 201410370311030 
*/
package PreSistem;

import java.io.FileWriter;
import java.io.IOException;


public class LingkunganTest extends IndukClass{
    LingkunganRuangKelas LingkunganKelas =new LingkunganRuangKelas();
    public static double Lingkungan_Sesuai = 0.0;
    public String KondisiLantai, KondisiDinding, KondisiAtap, KondisiPintu, KondisiJendela;
    
    public void Input(String KondisiLantai, String KondisiDinding, String KondisiAtap, String KondisiPintu, String KondisiJendela) {
        this.KondisiLantai = KondisiLantai;
        this.KondisiDinding = KondisiDinding;
        this.KondisiAtap = KondisiAtap;
        this.KondisiPintu = KondisiPintu;
        this.KondisiJendela = KondisiJendela;
    }

    @Override
    public double Analisis() {
        try{
            if("Bersih".equals(KondisiLantai)){
                Lingkungan_Sesuai++;
            }
            if("Bersih".equals(KondisiDinding)){
                Lingkungan_Sesuai++;
            }
            if("Bersih".equals(KondisiAtap)){
                Lingkungan_Sesuai++;
            }
            if("Bersih".equals(KondisiPintu)){
                Lingkungan_Sesuai++;
            }
            if("Bersih".equals(KondisiJendela)){
                Lingkungan_Sesuai++;
            }
        }catch(Exception e){
            System.out.println("ERROR");
        }
        return Lingkungan_Sesuai;
    }

    @Override
    public double Sesuai() {
       return Lingkungan_Sesuai/5;
    }

    @Override
    public void Save() {
        try{
           FileWriter Writer = new FileWriter("Lingkungan.txt");
           Writer.write("Kondisi Lantai Ruangan = " + KondisiLantai+"\t");
           Writer.write("Kondisi Dinding Ruangan = " + KondisiDinding+"\t");
           Writer.write("Kondisi Atap Ruangan = " + KondisiAtap+"\t");
           Writer.write("Kondisi Pintu Ruangan = " + KondisiPintu+"\t");
           Writer.write("Kondisi Jendela Ruangan = " + KondisiJendela+"\t");
           Writer.close();
         }catch(IOException ex){
             ex.printStackTrace();
         }
    }

}
