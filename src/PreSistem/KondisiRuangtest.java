//di buat oleh :
//Nama  : Khopsawati khotimah
// NIM  :201410370311025

package PreSistem;

import java.util.Scanner;

public class KondisiRuangtest {
    
        KondisiRuang KondisiKelas = new KondisiRuang();
        public double KondisiRuang_Sesuai = 0.0;
        Scanner input = new Scanner(System.in);
        private String bentuk;
        private double Rasio;
        private String analisis;
  
    public  void kondisi(){
           System.out.print("Masukkan Panjang Ruangan = ");
           KondisiKelas.setPanjang(input.nextInt());
           System.out.print("Masukkan Lebar Ruangan = ");
           KondisiKelas.setLebar(input.nextInt());
           System.out.print("Masukkan jumlah kursi = ");
           KondisiKelas.setJumlahkursi(input.nextInt());
           System.out.print("Masukkan jumlah pintu = ");
           KondisiKelas.setJumlahpintu(input.nextInt());
           System.out.print("Masukkan jumlah jendela = ");
           KondisiKelas.setJumlahjendela(input.nextInt());
    }   
    public   int luas(){
        return KondisiKelas.getPanjang()*KondisiKelas.getLebar();
    }
    public double bentuk(){
        if(KondisiKelas.getPanjang()!=luas()){
            System.out.println("Bentuk Ruangan Persegi Panjang sesuai");
           KondisiRuang_Sesuai ++;
        }else{
            System.out.println("Bentuk Ruangan Tidak Persegi Panjang");
        }
            return KondisiRuang_Sesuai;
    }
    
    public double analisis(){   
        Rasio = luas()/ KondisiKelas.getJumlahkursi();
        if (Rasio >= 0){
            System.out.print("Rasio ruangan = "+Rasio);
            if(Rasio >= 0.5){
                System.out.println(" Sesuai");
                KondisiRuang_Sesuai++;
            }else{
                System.out.println();
           }
        }
        if(KondisiKelas.getJumlahpintu()>= 0){
            System.out.print("jumlah pintu "+KondisiKelas.getJumlahpintu());
            if(KondisiKelas.getJumlahpintu()>=2){
                System.out.println(" Sesuai"); 
                KondisiRuang_Sesuai++;
            }else{
                System.out.println();
            }   
        }
        if(KondisiKelas.getJumlahjendela()>=0){
            System.out.print("jumlah jendela "+KondisiKelas.getJumlahjendela());
            if(KondisiKelas.getJumlahjendela()>=1){
                System.out.println(" Sesuai");
                KondisiRuang_Sesuai ++;      
            }else{
                System.out.println();
            }
        }
            return KondisiRuang_Sesuai;
    }
    
    public   void kondisitest(){
        kondisi();
        luas();
        System.out.println("===================================================");
        bentuk();
        analisis();
        System.out.println("===================================================");
    }
}
