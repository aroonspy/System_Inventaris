//di buat oleh:
//Nama  : Khopsawati khotimah
// NIM  :201410370311025
package PreSistem;

import java.io.FileWriter;

public class IdentitasRuangkelastest extends IndukClass{
    IdentitasRuangkelas  IDKelas = new IdentitasRuangkelas();
    public String Namaruang, Lokasiruang, Programstudi;
  
    public void Input(String Namaruang,String Lokasiruang, String Programstudi){
        this.Namaruang = Namaruang;
        this.Lokasiruang = Lokasiruang;
        this.Programstudi = Programstudi; 
    }
   
    @Override
    public double Sesuai() {
       return 0; 
    }

    @Override
    public double Analisis() {
       return 0; 
    }

    @Override
    public void Save() {
         try{
            FileWriter Writer = new FileWriter("ID.txt");
            Writer.write("Nama Ruangan ="+this.Namaruang);
            Writer.write("Lokasi Ruangan="+this.Lokasiruang);
            Writer.write("Program Studi="+this.Programstudi);
            
            
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
}   