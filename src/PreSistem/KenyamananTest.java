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
    public String Kebisingan,Bau,Kebocoran,Kerusakan,Keausan;
    
    public void Input(String Kebisingan,String Bau,String Kebocoran,String Kerusakan,String Keausan) {
        this.Kebisingan = Kebisingan;
        this.Bau = Bau;
        this.Kebocoran = Kebocoran;
        this.Kerusakan = Kerusakan;
        this.Keausan = Keausan;
    }

    @Override
    public double Analisis() {
        try{
           if("Tidak Bising".equals(Kebisingan)){
               Kenyamanan_Sesuai++;
           }
           if("Tidak Bau".equals(Bau)){
               Kenyamanan_Sesuai++;
           }
           if("Tidak Bocor".equals(Kebocoran)){
               Kenyamanan_Sesuai++;
           }
           if("Tidak Rusak".equals(Kerusakan)){
               Kenyamanan_Sesuai++;
           }
           if("Tidak Aus".equals(Keausan)){
               Kenyamanan_Sesuai++;
           }
        }catch(Exception e){
            System.out.println("ERROR");
        }
        return Kenyamanan_Sesuai;
    }

    @Override
    public double Sesuai() {
        return Kenyamanan_Sesuai/5;
    }

    @Override
    public void Save() {
        try{
           FileWriter Writer = new FileWriter("Kenyamanan.txt");
           Writer.write("Kebisingan Ruangan = " + Kebisingan+"\t");
           Writer.write("Bau Ruangan = " + Bau+"\t");
           Writer.write("Kebocoran Ruangan= " + Kebocoran+"\t");
           Writer.write("Kerusakan Ruangan= " + Kerusakan+"\t");
           Writer.write("Keausan Ruangan= " + Keausan+"\t");
           Writer.close();
         }catch(IOException ex){
             ex.printStackTrace();
         }
    }

}
