

package PreSistem;

import java.util.Scanner;


public class IdentitasRuangkelastest {
    Scanner input = new Scanner (System.in);
    IdentitasRuangkelas  IDKelas = new IdentitasRuangkelas  ();
    private String lokasi;
    private String prodi;
  
    public void IDKelas (){
        System.out.println("masukkan ruangan : ");
        IDKelas.setNamaruang(input.next());
        System.out.println("1= GKB 1");
        System.out.println("2= GKB 2");
        IDKelas.setLokasiruang(input.nextInt());
        if(IDKelas.getLokasiruang()==1){
            lokasi="gkb1";
        }
            else if(IDKelas.getLokasiruang()==2){
             lokasi= "gkb2";
        }
        System.out.println("1.Sipil");
         System.out.println("2.Informatika");
         System.out.println("pilih programstudi");
         IDKelas.setProgramstudi(input.nextInt());
         if(IDKelas.getProgramstudi()==1){
             prodi = "Sipil";
         }
         else if(IDKelas.getProgramstudi()==2){
             prodi = "Informatika";
        
         }  
         System.out.println("nama ruang" + IDKelas.getNamaruang());
         System.out.println("lokasi ruang" + lokasi);
         System.out.println("program studi" + prodi);
 
         
    }
}   