/*
    Dibuat Oleh : 
    Nama    : Basri Basren
    Nim     : 201410370311030 
*/

package PreSistem;

import java.util.Scanner;

public class KeamananTest {
    Scanner input = new Scanner(System.in);
    KeamananRuangKelas KeamananRuang = new KeamananRuangKelas();
    public void inputKeamanan(){
        System.out.println("1. Kokoh");
        System.out.println("2. Tidak Kokoh");
        System.out.print("Masukkan Nilai Kekokohan = ");
        KeamananRuang.setkekokohan(input.nextInt());
        System.out.println("1. Ada");
        System.out.println("2. Tidak Ada");
        System.out.print("Masukkan Nilai Kunci Pintu dan Jendela = ");
        KeamananRuang.setkunci(input.nextInt());
        System.out.println("1. Aman");
        System.out.println("2. Tidak Aman");
        System.out.print("Masukkan Nilai Keamanan Ruangan = ");
        KeamananRuang.setbahaya(input.nextInt());
        
    }
    
    public void AnalisisKeamanan(){
        if(KeamananRuang.getkekokohan() == 1){
            System.out.println("Nilai Kekokohan = Kokoh Sesuai");
        }else if(KeamananRuang.getkekokohan() == 2){
            System.out.println("Nilai Kekokohan = Tidak Kokoh");
        }
        if(KeamananRuang.getkunci()== 1){
            System.out.println("Nilai Kunci Pintu dan Jendela = Ada Sesuai");
        }else if(KeamananRuang.getkunci() == 2){
            System.out.println("Nilai Kunci Pintu dan Jendela = Tidak Ada");
        }
        if(KeamananRuang.getbahaya()== 1){
            System.out.println("Nilai Kemanan = Aman Sesuai");
        }else if(KeamananRuang.getbahaya()== 2){
            System.out.println("Nilai Kemanan = Tidak Aman");
        }
    }
    
    public void Keamanantest(){
        inputKeamanan();
        System.out.println("======================================================");
        AnalisisKeamanan();
        System.out.println("======================================================");
        KeamananPilihan();
    }
        
    public void KeamananPilihan(){
        String edit;
       
        System.out.print("Apakah Anda Inngin Mengedit data (y/n) = ");
        edit = input.next();
        switch (edit) {
            case "y":
                System.out.println("silahkan Mengisi Ulang data");
                Keamanantest();
                break;
            case "n":
                System.out.println("Terimakasih telah Menggunakan Software kami");
                break;
            default:
                System.out.println("Anda Salah Memasukkan Inputan tekan y untuk Yes dan n untuk No");
                break;
        }
            
    }
    }
