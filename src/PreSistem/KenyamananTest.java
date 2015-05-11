/*
    Dibuat Oleh : 
    Nama    : Basri Basren
    Nim     : 201410370311030 
*/
package PreSistem;


public class KenyamananTest extends IndukClass{
    KenyamananRuangan Kenyamanan = new KenyamananRuangan();
    public double Kenyamanan_Sesuai = 0.0;
    
    public void inputKenyamanan(){
        System.out.println("1. Tidak Bising");
        System.out.println("2. Bising");
        System.out.print("Masukkan Nilai Kebisingan = ");
        Kenyamanan.setKebisingan(input.nextInt());
        System.out.println("1. Tidak Bau");
        System.out.println("2. Bau");
        System.out.print("Masukkan Nilai Bau = ");
        Kenyamanan.setBau(input.nextInt());
        System.out.println("1. Tidak Bocor");
        System.out.println("2. Bocor");
        System.out.print("Masukkan Nilai Kebocoran = ");
        Kenyamanan.setKebocoran(input.nextInt());
        System.out.println("1. Tidak Rusak");
        System.out.println("2. Rusak");
        System.out.print("Masukkan Nilai Kerusakan = ");
        Kenyamanan.setKerusakan(input.nextInt());
        System.out.println("1. Tidak Aus");
        System.out.println("2. Aus");
        System.out.print("Masukkan Nilai Keausan = ");
        Kenyamanan.setKeausan(input.nextInt());
    }
    
    public double AnalisisKenyamanan(){
        if(Kenyamanan.getKebisingan()== 1){
            System.out.println("Kebisingan Di ruangan Tidak Bising \t Sesuai");
            Kenyamanan_Sesuai++;
        }else if(Kenyamanan.getKebisingan()== 2){
            System.out.println("Kebisingan Di ruangan Bising");
        }
        
        if(Kenyamanan.getBau()== 1){
            System.out.println("Bau Di ruangan Tidak Bau \t\t Sesuai");
            Kenyamanan_Sesuai++;
        }else if(Kenyamanan.getBau()== 2){
            System.out.println("Bau Di ruangan Bau");
        }
        
        if(Kenyamanan.getKebocoran()== 1){
            System.out.println("Kebocoran Di ruangan Tidak Bocor \t Sesuai");
            Kenyamanan_Sesuai++;
        }else if(Kenyamanan.getKebocoran()== 2){
            System.out.println("Kebocoran Di ruangan Bocor");
        }
        
        if(Kenyamanan.getKerusakan()== 1){
            System.out.println("Kerusakan Di ruangan Tidak Rusak \t Sesuai");
            Kenyamanan_Sesuai++;
        }else if(Kenyamanan.getKerusakan()== 2){
            System.out.println("Kerusakan Di ruangan Rusak");
        }
        
        if(Kenyamanan.getKeausan()== 1){
            System.out.println("Keausan Di ruangan Tidak aus \t\t Sesuai");
            Kenyamanan_Sesuai++;
        }else if(Kenyamanan.getKeausan()== 2){
            System.out.println("Keausan Di ruangan aus");
        }
        return Kenyamanan_Sesuai;
    }
     
    public void Kenyamanantest(){
        System.out.println();
        inputKenyamanan();
        System.out.println("=======================================================");
        AnalisisKenyamanan();
        System.out.println("=======================================================");
        System.out.println();
    }
}
