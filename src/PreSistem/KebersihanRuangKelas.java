/*
    Dibuat Oleh : 
    Nama    : Basri Basren
    Nim     : 201410370311030 
*/
package PreSistem;


public class KebersihanRuangKelas {
    private int SirkulasiUdara;
    private int nilaiPencahayaan;
    private int Kelembapan;
    private int suhu;
    
    public void setSirkulasiUdara(int SirkulasiUdara){
        this.SirkulasiUdara = SirkulasiUdara;
    }
    public int getSirkulasiUdara(){
        return SirkulasiUdara;
    }
    
    public void setnilaiPencahayaan(int nilaiPencahayaan){
        this.nilaiPencahayaan = nilaiPencahayaan;
    }
    public int getnilaiPencahayaan(){
        return nilaiPencahayaan;
    }
    
    public void setKelembapan(int Kelembapan){
        this.Kelembapan = Kelembapan;
    }
    public int getKelembapan(){
        return Kelembapan;
    }
    
    public void setsuhu(int suhu){
        this.suhu = suhu;
    }
    public int getsuhu(){
        return suhu;
    }
}
