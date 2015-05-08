/*
    Dibuat Oleh : 
    Nama    : Basri Basren
    Nim     : 201410370311030 
*/
package PreSistem;

public class AllTest {
    public static LogIn Login = new LogIn();
    public static SaranaTest Sarana1 = new SaranaTest();
    public static SaranaTest2 Sarana2 = new SaranaTest2();
    public static LingkunganTest Lingkungan =new LingkunganTest();
    public static KebersihanTest Kebersihan = new KebersihanTest();
    public static KenyamananTest Kenyamanan = new KenyamananTest();
    public static KeamananTest Keamanan = new KeamananTest();
    public static IdentitasRuangkelastest Identitas = new IdentitasRuangkelastest();
    public static KondisiRuangtest Kondisi = new KondisiRuangtest();
    public static IndukClass Induk = new IndukClass();
    
    public static double rata_rata;
    
    public static double Rata_rata(double Kondisi,double Lingkungan, double Kebersihan, double Kenyamanan, double Keamanan){
        rata_rata = (Kondisi +Lingkungan + Kebersihan + Kenyamanan + Keamanan)/21*100;
        System.out.println("Jumlah rata_rata Nilai Sesuai = " +rata_rata +" %");
        return rata_rata;
    }
    public static void main(String[] args){
       //Login.Logintest();
       //Identitas.IDKelas();
       Kondisi.kondisitest();
       //Sarana1.saranatest();
       //Sarana2.saranatest2();
       Lingkungan.Lingkungan();
       Kebersihan.Kebersihantest();
       Kenyamanan.Kenyamanantest();
       Keamanan.Keamanantest();
       Rata_rata(Kondisi.KondisiRuang_Sesuai,Lingkungan.Lingkungan_Sesuai, Kebersihan.Kebersihan_Sesuai, Kenyamanan.Kenyamanan_Sesuai, Keamanan.Keamanan_Sesuai);      
    }
}
