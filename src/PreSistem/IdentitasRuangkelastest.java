//di buat oleh:
//Nama  : Khopsawati khotimah
// NIM  :201410370311025
package PreSistem;

import java.util.Scanner;

public class IdentitasRuangkelastest {
    Scanner input = new Scanner(System.in);
    IdentitasRuangkelas  IDKelas = new IdentitasRuangkelas  ();
    private String lokasi;
    private String prodi;
  
    public void IDKelas (){
        System.out.print("Masukkan Namma Ruangan : ");
        IDKelas.setNamaruang(input.next());
        System.out.println("1. GKB 1");
        System.out.println("2. GKB 2");
        System.out.print("Masukkan lokasi ruangan ");
        IDKelas.setLokasiruang(input.nextInt());
        if(IDKelas.getLokasiruang()==1){ 
            lokasi="GKB 1";
        }
            else if(IDKelas.getLokasiruang()==2){
             lokasi= "GKB 2";
        }
         System.out.println("1.Sipil");
         System.out.println("2.Informatika");
         System.out.print("Pilih Program Studi ");
         IDKelas.setProgramstudi(input.nextInt());
            if(IDKelas.getProgramstudi()==1){
             prodi = "Sipil";
         }
         else if(IDKelas.getProgramstudi()==2){
             prodi = "Informatika";
         }  
         System.out.println("===================================================");
         System.out.println("Nama Ruangan = " + IDKelas.getNamaruang());
         System.out.println("Lokasi Ruangan = " + lokasi);
         System.out.println("Program Studi = " + prodi);
         System.out.println("===================================================");
         System.out.println();
    }
}   