// Di buat oleh : 
// Nama : Sundari
// Nim : 201410370311022
package PreSistem;

import java.io.FileWriter;


public class SaranaTest extends IndukClass{
    public static double SaranaRuang_Sesuai = 0.0;
    public int JumlahSteker, KondisiStekerBaik, KondisiStekerBuruk, PosisiStekerDD, PosisiStekerPR;
    public int JumlahLampu, KondisiLampuBaik, KondisiLampuBuruk, PosisiLampuA;
    public int JumlahKLCD, KondisiKLCDBaik, KondisiKLCDBuruk, PosisiKLCDDD;

    public void input(int JumlahSteker,int KondisiStekerBaik, int KondisiStekerBuruk, int PosisiStekerDD, int PosisiStekerPR,
            int JumlahLampu, int KondisiLampuBaik, int KondisiLampuBuruk, int PosisiLampuA,
            int JumlahKLCD, int KondisiKLCDBaik, int KondisiKLCDBuruk, int PosisiKLCDDD){
        this.JumlahSteker = JumlahSteker;
        this.KondisiStekerBaik = KondisiStekerBaik;
        this.KondisiStekerBuruk = KondisiStekerBuruk;
        this.PosisiStekerDD = PosisiStekerDD;
        this.PosisiStekerPR = PosisiStekerPR;
        this.JumlahLampu = JumlahLampu;
        this.KondisiLampuBaik = KondisiLampuBaik;
        this.KondisiLampuBuruk = KondisiLampuBuruk;
        this.PosisiLampuA = PosisiLampuA;
        this.JumlahKLCD = JumlahKLCD;
        this.KondisiKLCDBaik = KondisiKLCDBaik;
        this.KondisiKLCDBuruk = KondisiKLCDBuruk;
        this.PosisiKLCDDD = PosisiKLCDDD;
    }

    @Override
    public double Analisis() {
        try{
            if(JumlahSteker>=4){
            SaranaRuang_Sesuai++;
            }
            if(KondisiStekerBaik == JumlahSteker && KondisiStekerBaik >= 4){
                SaranaRuang_Sesuai++;
            }
            if(PosisiStekerDD + PosisiStekerPR == JumlahSteker && PosisiStekerDD +  PosisiStekerPR >= 4){
                SaranaRuang_Sesuai++;
            }
            if(JumlahLampu>=18){
                SaranaRuang_Sesuai++;
            }
            if(KondisiLampuBaik == JumlahLampu && KondisiLampuBaik >= 18){
                SaranaRuang_Sesuai++;
            }
            if(PosisiLampuA == JumlahLampu && PosisiLampuA >= 18){
                SaranaRuang_Sesuai++;
            }
            if(JumlahKLCD>= 1){
                SaranaRuang_Sesuai++;
            }
            if(KondisiKLCDBaik == JumlahKLCD && KondisiKLCDBaik >= 1){
                SaranaRuang_Sesuai++;
            }
            if(PosisiKLCDDD ==  JumlahKLCD && PosisiKLCDDD >=1){
                SaranaRuang_Sesuai++;
            }
        }catch(Exception e){
            System.out.println("ERROR");
        }
 
        return SaranaRuang_Sesuai;
    }

    @Override
    public double Sesuai() {
        return SaranaRuang_Sesuai/9;
    }

    @Override
    public void Save() {
        try{
            FileWriter Writer = new FileWriter("SaranaKelas.txt");
            Writer.write("Masukan Jumlah Steker = "+JumlahSteker);
            Writer.write("Masukan Kondisi Steker Baik = "+KondisiStekerBaik);
            Writer.write("Masukan Kondisi Steker Buruk = "+KondisiStekerBuruk);
            Writer.write("Masukan Posisi Steker di Dekat Dosen = "+PosisiStekerDD);
            Writer.write("Masukan Posisi Steker di Pojok Ruang = "+PosisiStekerPR);
            Writer.write("Masukan Jumlah Kabel LCD = "+JumlahKLCD);
            Writer.write("Masukan Kondisi Kabel LCD Baik = "+KondisiKLCDBaik);
            Writer.write("Masukan Kondisi Kabel LCD Buruk = "+KondisiKLCDBuruk);
            Writer.write("Masukan Posisi Kabel LCD di Dekat Dosen = "+PosisiKLCDDD);
            Writer.write("Masukan Jumlah Lampu ="+JumlahLampu);
            Writer.write("Masukan Kondisi Lampu Baik ="+KondisiLampuBaik);
            Writer.write("Masukan Kondisi Lampu Buruk ="+KondisiLampuBuruk);
            Writer.write("Masukan Posisi Lampu di Atap Ruangan ="+PosisiLampuA);    
        }catch(Exception ex){
            ex.printStackTrace();
        } 
    }

}
