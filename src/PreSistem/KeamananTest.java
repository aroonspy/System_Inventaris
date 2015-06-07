/*
    Dibuat Oleh : 
    Nama    : Basri Basren
    Nim     : 201410370311030 
*/

package PreSistem;

import java.io.FileWriter;
import java.io.IOException;

public class KeamananTest extends IndukClass{
    KeamananRuangKelas KeamananRuang = new KeamananRuangKelas();
    public static double Keamanan_Sesuai = 0.0; 
    public String Kekokohan, Kunci, Bahaya;
    
    public void Input(String Kekokohan, String Kunci, String Bahaya){ 
        this.Kekokohan = Kekokohan;
        this.Kunci = Kunci;
        this.Bahaya = Bahaya;
    }
    
    public double Analisis(){
        try{
            switch (Kekokohan) {
                case "Kokoh":
                    Keamanan_Sesuai++;
                    break;
                case "Tidak Kokoh":
                    break;
            }
            switch (Kunci) {
                case "Ada":
                    Keamanan_Sesuai++;
                    break;
                case "Tidak Ada":
                    break;
            }
            switch (Bahaya) {
                case "Aman":
                    Keamanan_Sesuai++;
                    break;
                case "Tidak Aman":
                    break;
            }
        }catch(Exception e){
            System.out.println("ERROR");
        }
        return Keamanan_Sesuai/3;
    }
    
    @Override
    public double Sesuai() {
        return Keamanan_Sesuai/3;
    } 

    @Override
    public void Save() {
        try{
           FileWriter Writer = new FileWriter("Keamanan.txt");
           Writer.write("Kekokohan Ruangan = " + this.Kekokohan+"\t");
           Writer.write("Kunci Pintu dan Jendela = " + this.Kunci+"\t");
           Writer.write("Keamanan Ruangan= " + this.Bahaya+"\t");
           Writer.close();
         }catch(IOException ex){
             ex.printStackTrace();
         }
    }
}
