/*
    Dibuat Oleh : 
    Nama    : Basri Basren
    Nim     : 201410370311030 
*/
package PreSistem;

public class AllTest {
    public static LogIn Login = new LogIn();
    public static IdentitasRuangkelastest Identitas = new IdentitasRuangkelastest();
    public static KondisiRuangtest Kondisi = new KondisiRuangtest();
    public static SaranaTest Sarana1 = new SaranaTest();
    public static SaranaTest2 Sarana2 = new SaranaTest2();
    public static LingkunganTest Lingkungan =new LingkunganTest();
    public static KebersihanTest Kebersihan = new KebersihanTest();
    public static KenyamananTest Kenyamanan = new KenyamananTest();
    public static KeamananTest Keamanan = new KeamananTest();
    public static double rata_rata;
    
    public static double Rata_rata (double Kondisi,double Sarana, double sarana2,
            double Lingkungan, double Kebersihan, double Kenyamanan, double Keamanan){
        rata_rata = (Kondisi +Sarana +sarana2 +Lingkungan + Kebersihan + Kenyamanan + Keamanan)/40*100;
        System.out.println("Jumlah rata_rata Nilai Sesuai = " +rata_rata +" %");
        return rata_rata;
    }
    public static void main(String[] args){
       //Login.Logintest();
       //Identitas.IDKelas();
       
       /*
         Menggunakan Konsep Polimorfisme
         Polimorfisme adalah kemampuan sebuah class untuk memiliki banyak class turunan
         Dalam Program Ini Class IndukClass Memiliki 7 class turunan 
       */
       //IndukClass kondisi = new KondisiRuangtest();
       //kondisi.Pemanggilan();
       IndukClass SaranaRuang = new SaranaTest ();
       SaranaRuang.Pemanggilan();
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
       
       //Rata_rata(Kondisi.KondisiRuang_Sesuai,Sarana1.SaranaRuang_Sesuai,Sarana2.SaranaRuang2_Sesuai,
              // Lingkungan.Lingkungan_Sesuai, Kebersihan.Kebersihan_Sesuai, Kenyamanan.Kenyamanan_Sesuai, 
              // Keamanan.Keamanan_Sesuai);
       Keamanan.KeamananPilihan();
    }
}