//di buat oleh :
//Nama  : Khopsawati khotimah
// NIM  :201410370311025

package PreSistem;

import java.io.FileWriter;


public class KondisiRuangtest extends IndukClass implements ClassInterface{
    
    KondisiRuang KondisiKelas = new KondisiRuang();
    public static double KondisiRuang_Sesuai = 0.0;
    public double Panjang, Lebar , Luas, Rasio; 
    public int jumlahkursi, jumlahpintu, jumlahjendela;
    public String bentuk;
    
    public void Input(double Panjang, double Lebar, int jumlahkursi, int jumlahpintu, int jumlahjendela) {
        this.Panjang = Panjang;
        this.Lebar = Lebar;
        this.jumlahkursi = jumlahkursi;
        this.jumlahpintu = jumlahpintu;
        this.jumlahjendela = jumlahjendela;
    }

    @Override
    public double luas(){
        Luas = Panjang*Lebar;
        return Luas;
    }
    
    @Override
    public String bentuk(){
        if(Panjang != Luas){
           bentuk = "Persegi Panjang";
        }else{
            bentuk = "Bukan Persegi panjang";
        }
        return bentuk;
    }

    @Override
    public double rasio() {
        Rasio = Luas/ jumlahkursi;
        return Rasio;
    }
    
    @Override
    public double Analisis() {
        if(Panjang != Luas){
           KondisiRuang_Sesuai ++;
        }
        if(Rasio >= 0.5){
            KondisiRuang_Sesuai++;
        }
        if(jumlahpintu >= 2){ 
            KondisiRuang_Sesuai++; 
        }
        if(jumlahjendela >= 1){
            KondisiRuang_Sesuai ++;
        }
        return KondisiRuang_Sesuai;   
    }

    @Override
    public double Sesuai() {
        return KondisiRuang_Sesuai/4;
    }

    @Override
    public void Save() {
        try{
            FileWriter Writer = new FileWriter("Kondisi.txt");
            Writer.write("Panjang Ruangan ="+Panjang);
            Writer.write("Lebar Ruangan ="+Lebar);
            Writer.write("Jumlah Kursi ="+jumlahkursi);
            Writer.write("Jumlah Pintu ="+jumlahpintu);
            Writer.write("Jumlah Jendela ="+jumlahjendela);
            Writer.write("Luas Ruangan "+Luas);
            Writer.write("Rasio Ruangan "+Rasio);
            Writer.write("Bentuk Ruangan "+bentuk);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
