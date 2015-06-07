// Di buat oleh : 
// Nama : Sundari
// Nim : 201410370311022

package PreSistem;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class SaranaTest2 extends IndukClass  {

    public int JumlahKA, KondisiKABaik, KondisiKABuruk, PosisiKAAtap;
    public int JumlahAC, KondisiACBaik, KondisiACBuruk, PosisiACBelakang, PosisiACSamping;
    public int JumlahCCTV, KondisiCCTVBaik, KondisiCCTVBuruk, PosisiCCTVBelakang, PosisiCCTVDepan;
    public String SSID;
    public int Bandwith;
    public static double SaranaRuang2_Sesuai = 0.0;

    public void input(int JumlahKA,int KondisiKABaik, int KondisiKABuruk, int PosisiKAAtap,
            int JumlahAC, int KondisiACBaik, int KondisiACBuruk, int PosisiACBelakang, int PosisiACSamping,
            int JumlahCCTV, int KondisiCCTVBaik, int KondisiCCTVBuruk, int PosisiCCTVBelakang, int PosisiCCTVDepan,
            String SSID, int Bandwith){
        this.JumlahKA = JumlahKA;
        this.KondisiKABaik = KondisiKABaik;
        this.KondisiKABuruk = KondisiKABuruk;
        this.PosisiKAAtap = PosisiKAAtap;
        this.JumlahAC = JumlahAC;
        this.KondisiACBaik = KondisiACBaik;
        this.KondisiACBuruk = KondisiACBuruk;
        this.PosisiACBelakang = PosisiACBelakang;
        this.PosisiACSamping = PosisiACSamping;
        this.JumlahCCTV = JumlahCCTV;
        this.KondisiCCTVBaik = KondisiCCTVBaik;
        this.KondisiCCTVBuruk = KondisiCCTVBuruk;
        this.PosisiCCTVBelakang = PosisiCCTVBelakang;
        this.PosisiCCTVDepan = PosisiCCTVDepan;
        this.SSID = SSID;
        this.Bandwith = Bandwith;
    }
    
    @Override
    public double Analisis() {
        try{
            if(JumlahKA >=2){
            SaranaRuang2_Sesuai++;
            }
            if(KondisiKABaik == JumlahKA && KondisiKABaik >= 2){
                SaranaRuang2_Sesuai++;
            }
            if(PosisiKAAtap == JumlahKA && PosisiKAAtap >= 2){
                SaranaRuang2_Sesuai++;
            }
            if(JumlahAC>=1){
            SaranaRuang2_Sesuai++;
            }
            if(KondisiACBaik == JumlahAC && KondisiACBaik >= 1){
                SaranaRuang2_Sesuai++;
            }
            if(PosisiACBelakang +PosisiACSamping== JumlahAC && PosisiACBelakang +PosisiACSamping >= 1){
                SaranaRuang2_Sesuai++;
            }
            if(JumlahCCTV>= 2){
            SaranaRuang2_Sesuai++;
            }
            if(KondisiCCTVBaik == JumlahCCTV && KondisiCCTVBaik >= 2){
                SaranaRuang2_Sesuai++;
            }
            if(PosisiCCTVBelakang+ PosisiCCTVDepan ==  JumlahCCTV && PosisiCCTVBelakang + PosisiCCTVDepan >=2){
                SaranaRuang2_Sesuai++;
            }
            if("UMM Hotspot".equals(SSID)){
            SaranaRuang2_Sesuai++;
            }
            if("UMM Hospott".equals(SSID) && Bandwith>=1 ){
                SaranaRuang2_Sesuai++;
            }
        }catch(Exception e){
            System.out.println("ERROR");
        }
        
        return SaranaRuang2_Sesuai;
    }

    @Override
    public double Sesuai() {
        return SaranaRuang2_Sesuai/11;
    }

    @Override
    public void Save() {
        try{
            FileWriter Writer = new FileWriter("KondisiKelas3.txt");
            Writer.write("Masukan Jumlah Kipas Angin = "+JumlahKA);
            Writer.write("Masukan Kondisi Kipas Angin Baik = "+KondisiKABaik);
            Writer.write("Masukan Kondisi Kipas Angin Buruk = "+KondisiKABuruk);
            Writer.write("Masukan Posisi Kipas Angin = "+PosisiKAAtap);
            Writer.write("Masukan Jumlah AC = "+JumlahAC);
            Writer.write("Masukan Kondisi AC Baik = "+KondisiACBaik);
            Writer.write("Masukan Kondisi AC Buruk = "+KondisiACBuruk);
            Writer.write("Masukan Posisi AC Belakang = "+PosisiACBelakang);
            Writer.write("Masukan Posisi AC Samping = "+PosisiACSamping);
            Writer.write("Masukan SSID ="+SSID);
            Writer.write("Masukan Bandwith ="+Bandwith);
            Writer.write("Masukan Jumlah CCTV ="+JumlahCCTV);
            Writer.write("Masukan Kondisi CCTV Baik ="+KondisiCCTVBaik);
            Writer.write("Masukan Kondisi CCTV Buruk ="+KondisiCCTVBuruk);
            Writer.write("Masukan Posisi CCTV Belakang ="+PosisiCCTVBelakang);
            Writer.write("Masukan Posisi CCTV Depan ="+PosisiCCTVDepan);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
}
