/*
    Dibuat Oleh : 
    Nama    : Basri Basren
    Nim     : 201410370311030 
*/
package PreSistem;

import java.io.FileWriter;

public class TotalRata {
    
    double rata_rata;
    IdentitasRuangkelastest Identitas = new IdentitasRuangkelastest();
    KondisiRuangtest Kondisi = new KondisiRuangtest();
    SaranaTest Sarana1 = new SaranaTest();
    SaranaTest2 Sarana2 = new SaranaTest2();
    KeamananTest Keamanan = new KeamananTest();
    KenyamananTest Kenyamanan = new KenyamananTest();
    KebersihanTest Kebersihan = new KebersihanTest();
    LingkunganTest Lingkungan = new LingkunganTest();
    
    public double Rata_rata (double Kondisi,double Sarana, double sarana2,
            double Lingkungan, double Kebersihan, double Kenyamanan, double Keamanan){
        rata_rata = (Kondisi +Sarana +sarana2 +Lingkungan + Kebersihan + Kenyamanan + Keamanan)/40*100;
        System.out.println("Jumlah rata_rata Nilai Sesuai = " +rata_rata +" %");
        return rata_rata;
    }
    public void Rata(){
       //Login.Logintest();
       //Identitas.IDKelas();
       //IndukClass kondisi = new KondisiRuangtest();
       //kondisi.Pemanggilan();
       //IndukClass SaranaRuang = new SaranaTest ();
       //SaranaRuang.Pemanggilan();
       //IndukClass SaranaRuang2 = new SaranaTest2();
       //SaranaRuang2.Pemanggilan();
       //IndukClass lingkungan = new LingkunganTest();
       //lingkungan.Pemanggilan();
       //IndukClass kebersihan = new KebersihanTest();
       //kebersihan.Pemanggilan();
       //IndukClass kenyamanan = new KenyamananTest();
       //kenyamanan.Pemanggilan();
       //IndukClass keamanan = new KeamananTest();
       //keamanan.Pemanggilan();
       
       Rata_rata(Kondisi.KondisiRuang_Sesuai,Sarana1.SaranaRuang_Sesuai,Sarana2.SaranaRuang2_Sesuai,
              Lingkungan.Lingkungan_Sesuai, Kebersihan.Kebersihan_Sesuai, Kenyamanan.Kenyamanan_Sesuai, 
              Keamanan.Keamanan_Sesuai);
       //Keamanan.KeamananPilihan();
    }

    public void Save() {
        try{
            FileWriter Writer = new FileWriter("Total Rata - Rata.txt");
            Writer.write("Masukan Jumlah Total Persentase Rata - rata Inputan Sesuai = "+rata_rata);   
        }catch(Exception ex){
            ex.printStackTrace();
        } 
    }
}