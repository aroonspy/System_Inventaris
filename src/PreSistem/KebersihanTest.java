/*
    Dibuat Oleh : 
    Nama    : Basri Basren
    Nim     : 201410370311030 
*/
package PreSistem;


public class KebersihanTest extends IndukClass{
    KebersihanRuangKelas KebersihanKelas = new KebersihanRuangKelas();
    public static double Kebersihan_Sesuai = 0.0;
    
    public void inputKebersihan(){
        System.out.println("1. Lancar");
        System.out.println("2. Tidak Lancar");
        System.out.print("Masukkan Kondisi Sirkulasi Udara = ");
        KebersihanKelas.setSirkulasiUdara(input.nextInt());

        System.out.print("Masukkan Nilai Pencahayaan ( 250 - 350 )= ");
        KebersihanKelas.setnilaiPencahayaan(input.nextInt());

        System.out.print("Masukkan Nilai Kelembapan ( 70 - 80 ) = ");
        KebersihanKelas.setKelembapan(input.nextInt());

        System.out.print("Masukkan Nilai Suhu ( 25 - 35 )= ");
        KebersihanKelas.setsuhu(input.nextInt());
    }
    
    public double AnalisisKebersihan(){
        if(KebersihanKelas.getSirkulasiUdara() == 1){
            System.out.println("Sirkulasi Udara Di ruangan Lancar Sesuai");
            Kebersihan_Sesuai++;
        }else if(KebersihanKelas.getSirkulasiUdara() == 2){
            System.out.println("Sirkulasi Udara Di ruangan Tidak Lancar");
        }
        
        if(KebersihanKelas.getnilaiPencahayaan() >= 250 && KebersihanKelas.getnilaiPencahayaan() <=350){
            System.out.println("Nilai Pencahayaan Ruangan \t = "+KebersihanKelas.getnilaiPencahayaan()+" Sesuai");
            Kebersihan_Sesuai++;
        }else{
            System.out.println("Nilai Pencahayaan Ruangan \t = "+KebersihanKelas.getnilaiPencahayaan());
        }
        
        if(KebersihanKelas.getKelembapan() >= 70 && KebersihanKelas.getKelembapan()<= 80){
            System.out.println("Nilai Kelembapan Ruangan \t = "+KebersihanKelas.getKelembapan()+" Sesuai");
            Kebersihan_Sesuai++;
        }else{
            System.out.println("Nilai Kelembapan Ruangan \t = "+KebersihanKelas.getKelembapan());
        }
        
        if(KebersihanKelas.getsuhu() >= 25 && KebersihanKelas.getsuhu()<= 35){
            System.out.println("Nilai Suhu Ruangan \t\t = "+KebersihanKelas.getsuhu()+" Sesuai");
            Kebersihan_Sesuai++;
        }else{
            System.out.println("Nilai Suhu Ruangan \t\t = "+KebersihanKelas.getsuhu());
        }
        return Kebersihan_Sesuai;
    }

    @Override
    public void Pemanggilan() {
        System.out.println();
        inputKebersihan();
        System.out.println("======================================================");
        AnalisisKebersihan();
        System.out.println("======================================================");
        System.out.println();
    }
}
