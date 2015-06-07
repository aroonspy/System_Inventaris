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
    public String SirkulasiUdara;
    public int Pencahayaan, Kelembapan, Suhu;
    
    public void Input(String SirkulasiUdara, int Pencahayaan,int Kelembapan, int Suhu) {
        this.SirkulasiUdara = SirkulasiUdara;
        this.Pencahayaan = Pencahayaan;
        this.Kelembapan = Kelembapan;
        this.Suhu = Suhu;
    }
    
    @Override
    public double Analisis(){
        try{
            if(SirkulasiUdara.equals("Lancar")){
                Kebersihan_Sesuai++;
            }
            if(Pencahayaan >= 250 && Pencahayaan <=350){
                Kebersihan_Sesuai++;
            }
            if(Kelembapan >= 70 && Kelembapan<= 80){
                Kebersihan_Sesuai++;
            }
            if(Suhu >= 25 && Suhu <= 35){
                Kebersihan_Sesuai++;
            }
        }catch(Exception e){
            System.out.println("ERROR");
        }
        return Kebersihan_Sesuai;
    }
  
    @Override
    public double Sesuai() {
        return Kebersihan_Sesuai/4;
    }

    @Override
    public void Save() {
        try{
           FileWriter Writer = new FileWriter("Kebersihan.txt");
           Writer.write("Sirkulasi Udara Ruangan = " + SirkulasiUdara+"\t");
           Writer.write("Pencahayaan Ruangan = " + Pencahayaan+"\t");
           Writer.write("Kelembapan Ruangan= " + Kelembapan+"\t");
           Writer.write("Suhu Ruangan= " + Suhu+"\t");
           Writer.close();
         }catch(IOException ex){
             ex.printStackTrace();
         }
    }

    
}
