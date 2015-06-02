//di buat oleh:
//Nama  : Khopsawati khotimah
// NIM  :201410370311025
package PreSistem;

import java.io.FileWriter;

public class IdentitasRuangkelastest extends IndukClass{
    IdentitasRuangkelas  IDKelas = new IdentitasRuangkelas  ();
    private String lokasi;
    private String prodi;
  
    @Override
    public void Input(){
        System.out.print("Masukkan Namma Ruangan : ");
        IDKelas.setNamaruang(input.next());
        
        System.out.println("1. GKB 1");
        System.out.println("2. GKB 2");
        System.out.print("Masukkan lokasi ruangan ");
        IDKelas.setLokasiruang(input.nextInt());
        
        System.out.println("1.Sipil");
        System.out.println("2.Informatika");
        System.out.print("Pilih Program Studi ");
        IDKelas.setProgramstudi(input.nextInt());   
    }
    
    @Override
    public double Analisis() {
        if(IDKelas.getLokasiruang()==1){ 
            lokasi ="GKB 1";
        }
        else if(IDKelas.getLokasiruang()==2){
            lokasi = "GKB 2";
        }
        if(IDKelas.getProgramstudi()==1){
            prodi = "Sipil";
        }
        else if(IDKelas.getProgramstudi()==2){
            prodi = "Informatika";
        }  
        return 0;
    }
    
    @Override
    public void Tampil(){
        System.out.println("===================================================");
        System.out.println("Nama Ruangan = " + IDKelas.getNamaruang());
        System.out.println("Lokasi Ruangan = " + lokasi);
        System.out.println("Program Studi = " + prodi);
        System.out.println("===================================================");
        System.out.println();
    }
    
    @Override
    public void Save(){
         try{
            FileWriter Writer = new FileWriter("ID.txt");
            Writer.write("Nama Ruangan ="+IDKelas.getNamaruang());
            Writer.write("Lokasi Ruangan="+IDKelas.getLokasiruang());
            Writer.write("Program Studi="+IDKelas.getProgramstudi());
            
            
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
    @Override
    public void Pemanggilan(){
        System.out.println();
        Input();
        Analisis();
        System.out.println("================ Output Identitas Ruang ==============");
        Tampil();
        System.out.println("======================================================");
        System.out.println();
        Save();
    }    

    public double Sesuai() {
       return 0; 
    }
}   