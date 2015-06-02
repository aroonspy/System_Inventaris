//di buat oleh :
//Nama  : Khopsawati khotimah
// NIM  :201410370311025

package PreSistem;

import java.io.FileWriter;


public class KondisiRuangtest extends IndukClass implements ClassInterface{
    
        KondisiRuang KondisiKelas = new KondisiRuang();
        public static double KondisiRuang_Sesuai = 0.0;
        private String bentuk;
        private double Rasio;
        private String analisis;
    @Override
    public void Input() {
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

    @Override
    public int luas(){
        return KondisiKelas.getPanjang()*KondisiKelas.getLebar();
    }
    
    @Override
    public String bentuk(){
        if(KondisiKelas.getPanjang()!=luas()){
           bentuk = "Persegi Panjang";
        }else{
            bentuk = "Bukan Persegi panjang";
        }
        return bentuk;
    }

    public double rasio() {
        Rasio = luas()/ KondisiKelas.getJumlahkursi();
        return Rasio;
    }
    
    @Override
    public double Analisis() {
        if(KondisiKelas.getPanjang()!=luas()){
           KondisiRuang_Sesuai ++;
        }
        if(Rasio >= 0.5){
            KondisiRuang_Sesuai++;
        }
        if(KondisiKelas.getJumlahpintu()>=2){ 
            KondisiRuang_Sesuai++; 
        }
        if(KondisiKelas.getJumlahjendela()>=1){
            KondisiRuang_Sesuai ++;
        }
        return KondisiRuang_Sesuai;   
    }

    @Override
    public void Tampil() {
        System.out.println("Luas ruangan = "+luas());
        System.out.println("Rasio ruangan = "+Rasio);
        System.out.println("Bentuk ruangan = "+bentuk);
        System.out.println("jumlah Kursi "+KondisiKelas.getJumlahkursi());
        System.out.println("jumlah pintu "+KondisiKelas.getJumlahpintu());
        System.out.println("jumlah jendela "+KondisiKelas.getJumlahjendela());
    }

    @Override
    public void Save() {
        try{
            FileWriter Writer = new FileWriter("Kondisi.txt");
            Writer.write("Panjang Ruangan ="+KondisiKelas.getPanjang());
            Writer.write("Lebar Ruangan ="+KondisiKelas.getLebar());
            Writer.write("jumlah kursi ="+KondisiKelas.getJumlahkursi());
            Writer.write("Jumlah Pintu ="+KondisiKelas.getJumlahpintu());
            Writer.write("Jumlah Jendela ="+KondisiKelas.getJumlahjendela());
            Writer.write("luas"+luas());
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void Pemanggilan() {
        Input();
        luas();
        bentuk();
        rasio();
        Analisis();
        System.out.println("================ Output Kondisi Ruang ===============");
        Tampil();
        Save();
        System.out.println("=====================================================");
    }  

    public double Sesuai() {
        return KondisiRuang_Sesuai/4;
    }
}
