
package PreSistem;

import java.util.Scanner;


public class KondisiRuangtest {
     Scanner input = new Scanner(System.in);
 KondisiRuang KondisiKelas = new KondisiRuang();

 private int luas;
        private String bentuk;
       private double Rasio;
        private String analisis;
  
       public  void kondisi(){
           System.out.print("Masukkan Panjang Ruangan = ");
           KondisiKelas.setPanjang(input.nextInt());
           System.out.print("Masukkan Lebar Ruangan = ");
           KondisiKelas.setLebar(input.nextInt());}
       
       public   int luas(){
           return KondisiKelas.getPanjang()*KondisiKelas.getLebar();
       }
    public  void bentuk(){
        if(KondisiKelas.getPanjang()!=luas){
            System.out.println("Bentuk Ruangan Persegi Panjang sesuai");
        }else{
            System.out.println("Bentuk Ruangan Tidak Persegi Panjang");
        }
    }
    
    public   void analisis(){
        System.out.print("Masukkan jumlah kursi = ");
        KondisiKelas.setJumlahkursi(input.nextInt());
        Rasio = luas()/KondisiKelas.getJumlahkursi();
        if(Rasio >= 0.5){
            System.out.println("Rasio Ruangan Sesuai");
        }
        System.out.print("Masukkan jumlah pintu = ");
        KondisiKelas.setJumlahpintu(input.nextInt());
        if(KondisiKelas.getJumlahpintu()>=2){
            System.out.println("Sesuai"); 
        }
        System.out.print("Masukkan jumlah jendela = ");
        KondisiKelas.setJumlahjendela(input.nextInt());
        if(KondisiKelas.getJumlahjendela()>=1){
                System.out.println("Sesuai");
        }
    }
    
    public   void kondisitest(){
        kondisi();
        luas();
        bentuk();
        analisis();
                
        
    }
    
}
