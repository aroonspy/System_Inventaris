// Di buat oleh : 
// Nama : Sundari
// Nim : 201410370311022
package PreSistem;

import java.io.FileWriter;


public class SaranaTest extends IndukClass{
SaranaRuangan KondisiKelas2 = new SaranaRuangan();
    public static double SaranaRuang_Sesuai = 0.0;
    int Ksteker =0;
    int PstekerD=0;
    int PstekerP=0;
    int KLCD = 0;
    int PLCDD = 0;    
    int KLampu = 0;
    int PLampuL = 0;
    
    @Override
    public void Input() {
        // Input Steker /////////////////////////////////////////////////////////
        System.out.println(" ");
        System.out.println("=================== Intput Steker ====================");
	System.out.print("Masukkan Jumlah Steker \t\t: ");
	KondisiKelas2.setJumlahSteker(input.nextInt());
        System.out.println("1. Kondisi Baik");
        System.out.println("2. Kondisi Buruk");
        for(int a = 1; a<= KondisiKelas2.getJumlahSteker(); a++){
            System.out.print("Masukkan Kondisi Steker ke "+a+" \t: ");
            KondisiKelas2.setKondisiSteker(input.nextInt());
            if(KondisiKelas2.getKondisiSteker() == 1){                        
		Ksteker++;
            }
        }
        System.out.println("1. Posisi Dekat Dosen");
        System.out.println("2. Posisi Pojok Ruang");
        for(int b= 1; b<= KondisiKelas2.getJumlahSteker(); b++){
            System.out.print("Masukkan Posisi Steker ke "+b+"\t: ");
            KondisiKelas2.setPosisiSteker(input.nextInt());
            if(KondisiKelas2.getPosisiSteker() == 1){
                PstekerD++;
            }
            else if(KondisiKelas2.getPosisiSteker() == 2){
                PstekerP++;
            }
	}
        System.out.println("======================================================");
	System.out.println(" ");
        /////////////////////////////////////////////////////////////////////////////////
        //Input LCD //////////////////////////////////////////////////////////////////////
        System.out.println(" ");
        System.out.println("================== Intput Kabel LCD ==================");
	System.out.print("Masukkan Jumlah Kabel LCD \t: ");
	KondisiKelas2.setJumlahKabelLCD(input.nextInt());
        System.out.println("1. Kondisi Berfungsi");
        System.out.println("2. Kondisi Tidak Berfungsi");
        for(int a = 1; a<= KondisiKelas2.getJumlahKabelLCD(); a++){
            System.out.print("Masukkan Kondisi Kabel LCD ke "+a+"\t: ");
            KondisiKelas2.setKondisiKabelLCD(input.nextInt());
            if(KondisiKelas2.getKondisiKabelLCD() == 1){	
                KLCD++; //kondisi LCD baik ++
            }
        }
        System.out.println("1. Posisi Dekat Dosen");
        for(int b = 1; b<= KondisiKelas2.getJumlahKabelLCD(); b++){
            System.out.print("Masukkan Posisi Kabel LCD ke "+b+"\t: ");
            KondisiKelas2.setPosisiKabelLCD(input.nextInt());
            if(KondisiKelas2.getPosisiKabelLCD() == 1){
                PLCDD++; // posisi LCD Dekat Dose ++
            }
	}
        System.out.println("======================================================");
        System.out.println(" ");
        ////////////////////////////////////////////////////////////////////////////////////
        //Input Lampu /////////////////////////////////////////////////////////////////////
        System.out.println(" ");
        System.out.println("=================== Intput Lampu =====================");
	System.out.print("Masukkan Jumlah Lampu \t\t: ");
	KondisiKelas2.setJumlahLampu(input.nextInt());
        System.out.println("1. Kondisi Baik");
        System.out.println("2. Kondisi Buruk");
        for(int a = 1; a<= KondisiKelas2.getJumlahLampu(); a++){
            System.out.print("Masukkan Kondisi Lampu ke "+a+"\t: ");
            KondisiKelas2.setKondisiLampu(input.nextInt());
            if(KondisiKelas2.getKondisiLampu() == 1){
		KLampu++; //kondisi lampu baik ++
            }
        }
        System.out.println("1. Posisi di Langit - Langit");
        for(int b = 1; b<= KondisiKelas2.getJumlahLampu(); b++){
            System.out.print("Masukkan Posisi Lampu ke "+b+"\t: ");
            KondisiKelas2.setPosisiLampu(input.nextInt());
            if(KondisiKelas2.getPosisiLampu() == 1){
		PLampuL++; // posisi lampu Di langit '' ++
            }
	}
        System.out.println("======================================================");
        System.out.println(" ");
        //////////////////////////////////////////////////////////////////////////////////////////////
    }

    @Override
    public double Analisis() {
        //Analisis Kelistrikan
        if(KondisiKelas2.getJumlahSteker() >=4){
            SaranaRuang_Sesuai++;
        }
        if(Ksteker == KondisiKelas2.getJumlahSteker() && Ksteker >= 4){
            SaranaRuang_Sesuai++;
        }
        if(PstekerD+PstekerP == KondisiKelas2.getJumlahSteker()&& PstekerD+PstekerP >=4){
            SaranaRuang_Sesuai++;
        }
        
        //Analisis LCD
        if(KondisiKelas2.getJumlahKabelLCD()>=1){
            SaranaRuang_Sesuai++;
        }
        if(KLCD == KondisiKelas2.getJumlahKabelLCD()&& KLCD >= 1){
            SaranaRuang_Sesuai++;
        }
        if(PLCDD == KondisiKelas2.getJumlahKabelLCD()&& PLCDD >=1){
            SaranaRuang_Sesuai++;
        }
        
        //Analsis Lampu
        if(KondisiKelas2.getJumlahLampu() >=18){
            SaranaRuang_Sesuai++;
        }
        if(KLampu == KondisiKelas2.getJumlahLampu()&& KLampu>=18){
            SaranaRuang_Sesuai++;
        }
        if (PLampuL == KondisiKelas2.getJumlahLampu()&& PLampuL >= 18 ){
            SaranaRuang_Sesuai++;
        }
            
        return SaranaRuang_Sesuai;
    }

    @Override
    public void Tampil() {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("=================== Output Steker ====================");
        System.out.println("Jumlah Steker = "+KondisiKelas2.getJumlahSteker());
        System.out.println("Jumlah Steker Yang Berkondisi Baik = "+Ksteker);
        System.out.println("Steker Berposisi Di Pojok Ruang = "+PstekerP);
        System.out.println("Steker Berposisi Di Dekat Dosen = "+PstekerD);
        System.out.println("======================================================");
        System.out.println(" ");
        
        System.out.println("================== Output Kabel LCD ==================");
        System.out.println("Jumlah Kabel LCD = "+KondisiKelas2.getJumlahKabelLCD());
        System.out.println("Jumlah Kabel LCD Yang Berkondisi Baik = "+KLCD);
        System.out.println("Kabel LCD Berposisi Dekat Dosen = "+PLCDD);
        System.out.println("======================================================");
        System.out.println(" ");
        
        System.out.println("=================== Output Lampu ====================");
        System.out.println("Jumlah Lampu = "+KondisiKelas2.getJumlahLampu());
        System.out.println("Jumlah Lampu Yang Berkondisi Baik = "+KLampu);
        System.out.println("Lampu Berposisi Di Langit - Langit = "+PLampuL); 
        System.out.println("======================================================");
        System.out.println(" ");
    }

    @Override
    public void Save() {
        try{
            FileWriter Writer = new FileWriter("SaranaKelas.txt");
            Writer.write("Masukan Jumlah Steker = "+KondisiKelas2.getJumlahSteker());
            Writer.write("Masukan Kondisi Steker = "+KondisiKelas2.getPosisiSteker());
            Writer.write("Masukan Posisi Steker = "+KondisiKelas2.getPosisiSteker());
            Writer.write("Masukan Jumlah Kabel LCD = "+KondisiKelas2.getJumlahKabelLCD());
            Writer.write("Masukan Kondisi Kabel LCD = "+KondisiKelas2.getKondisiKabelLCD());
            Writer.write("Masukan Posisi Kabel LCD = "+KondisiKelas2.getPosisiKabelLCD());
            Writer.write("Masukan Jumlah Lampu ="+KondisiKelas2.getJumlahLampu());
            Writer.write("Masukan Kondisi Lampu ="+KondisiKelas2.getKondisiLampu());
            Writer.write("Masukan Posisi Lampu ="+KondisiKelas2.getPosisiLampu());    
        }catch(Exception ex){
            ex.printStackTrace();
        } 
    }
    
    @Override
    public void Pemanggilan() {
        System.out.println();
        Input();
        Analisis();
        Tampil();
        Save();
        System.out.println();
    }

    public double Sesuai() {
        return SaranaRuang_Sesuai/9;
    }
}
