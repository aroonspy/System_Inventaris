// Di buat oleh : 
// Nama : Sundari
// Nim : 201410370311022

package PreSistem;

import java.io.FileWriter;
import java.io.IOException;

public class SaranaTest2 extends IndukClass  {
    SaranaRuangan2 KondisiKelas3 = new SaranaRuangan2();
    int Kkipas = 0;
    int PkipasL = 0;
    int PkipasS = 0;
    public static double SaranaRuang2_Sesuai = 0.0;
    int KAC = 0;
    int PACB = 0;
    int PACS = 0;
    static int KCCTV = 0;
    static int PCCTVD = 0;
    static int PCCTVB = 0;

    @Override
    public void Input() {
        // input Kipas Angin ////////////////////////////////////////////////////////
        System.out.println(" ");
        System.out.println("================== Input Kipas Angin =================");
	System.out.print("Masukkan Jumlah Kipas Angin kelas anda\t: ");
	KondisiKelas3.setJumlahKipasAngin(input.nextInt());
        System.out.println("1. Kondisi Baik");
        System.out.println("2. Kondisi Buruk");
	for(int a = 1; a<= KondisiKelas3.getJumlahKipasAngin(); a++){
            System.out.print("Masukkan Kondisi Kipas Angin ke "+a+" \t: ");
            KondisiKelas3.setKondisiKipasAngin(input.nextInt());
            if(KondisiKelas3.getKondisiKipasAngin() == 1){
		Kkipas++;
            }
        }
        System.out.println("1. Posisi Atap di Ruangan");
        for(int b = 1; b<= KondisiKelas3.getJumlahKipasAngin(); b++){
            System.out.print("Masukkan Posisi Kipas Angin ke "+b+"\t: ");
            KondisiKelas3.setPosisiKipasAngin(input.nextInt());
            if(KondisiKelas3.getPosisiKipasAngin() == 1){
		PkipasL++;
            }
	}
        System.out.println("======================================================");
	System.out.println(" ");
        
        //Input AC ////////////////////////////////////////////////////////////////////
        System.out.println(" ");
        System.out.println("===================== Intput AC ======================");
	System.out.print("Masukkan Jumlah AC \t\t: ");
	KondisiKelas3.setJumlahAC(input.nextInt());
        System.out.println("1. Kondisi Baik");
        System.out.println("2. Kondisi Buruk");
	for(int a = 1; a<= KondisiKelas3.getJumlahAC(); a++){
            System.out.print("Masukkan Kondisi AC ke "+a+"\t: ");
            KondisiKelas3.setKondisiAC(input.nextInt());
            if(KondisiKelas3.getKondisiAC() == 1){
		KAC++; //kondisi AC baik ++
            }
        }
        System.out.println("1. Posisi Di Belakang");
        System.out.println("2. Posisi Di Samping");
        for(int b = 1 ; b<=KondisiKelas3.getJumlahAC(); b++){
            System.out.print("Masukkan Posisi AC ke "+b+"\t\t: ");
            KondisiKelas3.setPosisiAC(input.nextInt());
            if(KondisiKelas3.getPosisiAC() == 1){
		PACB++; 
            }
            else if(KondisiKelas3.getPosisiAC() == 2){
                PACS++;
            }
        }
        System.out.println("======================================================");
        System.out.println(" ");
        
        //Input SSID //////////////////////////////////////////////////////////////////
        System.out.println(" ");
        System.out.println("===================== Input SSID =====================");
        System.out.println("1. HotSpot UMM");
	System.out.print("Masukkan Pilihan SSID \t\t: ");
	KondisiKelas3.setSSID(input.nextInt());
	System.out.print("Masukkan Besar Bandwith \t: ");
	KondisiKelas3.setBandwith(input.nextInt());
        System.out.println("======================================================");
        System.out.println(" ");
        
        //Input CCTV //////////////////////////////////////////////////////////////////
        System.out.println(" ");
        System.out.println("====================== Input CCTV ====================");
	System.out.print("Masukkan Jumlah CCTV \t\t: ");
	KondisiKelas3.setJumlahCCTV(input.nextInt());
        System.out.println("1. Kondisi Baik");
        System.out.println("2. Kondisi Buruk");
	for(int a = 1; a<= KondisiKelas3.getJumlahCCTV(); a++){
            System.out.print("Masukkan Kondisi CCTV ke "+a+"\t: ");
            KondisiKelas3.setKondisiCCTV(input.nextInt());
            if(KondisiKelas3.getKondisiCCTV() == 1){
		KCCTV++; 
            }
        }
        System.out.println("1. Posisi CCTV di Depan");
        System.out.println("2. Posisi CCTV di Belakang");
        for(int b = 1; b<= KondisiKelas3.getJumlahCCTV(); b++){
            System.out.print("Masukkan Posisi CCTV ke "+b+"\t: ");
            KondisiKelas3.setPosisiCCTV(input.nextInt());
            if(KondisiKelas3.getPosisiCCTV() == 1){
		PCCTVD++;
            }
            else if(KondisiKelas3.getPosisiCCTV() == 2){
		PCCTVB++;
            }
	}
        System.out.println("======================================================");
        System.out.println(" ");
    }

    @Override
    public double Analisis() {
        //Analisis Kipas Angin
        if(KondisiKelas3.getJumlahKipasAngin() >=2){
            SaranaRuang2_Sesuai++;
        }
        if(Kkipas == KondisiKelas3.getJumlahKipasAngin()&& Kkipas >= 2){
            SaranaRuang2_Sesuai++;
        }
        if(PkipasL == KondisiKelas3.getJumlahKipasAngin()&& PkipasL>= 2){
            SaranaRuang2_Sesuai++;
        }
        
        //Analisis AC
        if(KondisiKelas3.getJumlahAC()>=1){
            SaranaRuang2_Sesuai++;
        }
        if(KAC == KondisiKelas3.getJumlahAC()&& KAC >= 1){
            SaranaRuang2_Sesuai++;
        }
        if(PACB+PACS == KondisiKelas3.getJumlahAC() && PACB+PACS >= 1){
            SaranaRuang2_Sesuai++;
        }
            
        //Analisis SSID
        if(KondisiKelas3.getSSID() == 1){
            SaranaRuang2_Sesuai++;
	}
        if(KondisiKelas3.getSSID() == 1 && KondisiKelas3.getBandwith()>=1 ){
            SaranaRuang2_Sesuai++;
        }
        
        //Analisis CCTV
        if(KondisiKelas3.getJumlahCCTV()>= 2){
            SaranaRuang2_Sesuai++;
        }
        if(KCCTV == KondisiKelas3.getJumlahCCTV()&& KCCTV >= 2){
            SaranaRuang2_Sesuai++;
        }
        if(PCCTVD+PCCTVB == KondisiKelas3.getJumlahCCTV()&& PCCTVD+PCCTVB >=2){
            SaranaRuang2_Sesuai++;
        }
        
        return SaranaRuang2_Sesuai;
    }

    @Override
    public void Tampil() {
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("================= Output Kipas Angin =================");
	System.out.println("Jumlah Kipas Angin "+KondisiKelas3.getJumlahKipasAngin());
	System.out.println("Jumlah Kondisi Kipas Angin Yang Baik "+Kkipas);
	System.out.println("Jumlah Posisi Kipas Angin di Atap Ruangan "+PkipasL);
	System.out.println("======================================================");
        System.out.println(" ");
        
        System.out.println("===================== Output AC ======================");
        System.out.println("Jumlah AC "+KondisiKelas3.getJumlahAC());
	System.out.println("Jumlah Kondisi AC Yang Baik "+KAC );
	System.out.println("Jumlah Posisi AC di Belakang "+PACB );
	System.out.println("Jumlah Posisi AC di Samping "+PACS );
        System.out.println("======================================================");
        System.out.println(" ");
        
        System.out.println("===================== Output SSID ====================");
        System.out.println("Pilihan SSID =  HotSpot UMM");
        System.out.println("======================================================");
        System.out.println(" ");
        
        System.out.println("===================== Output CCTV ====================");
        System.out.println("Jumlah CCTV = "+KondisiKelas3.getJumlahCCTV());
        System.out.println("Jumlah CCTV yang Berkondisi Baik = "+KCCTV);
        for(int c = 1 ;c<=PCCTVD;c++ ){
            System.out.println("Posisi CCTV ke "+c+" = "+"Di Depan" );
        }
        for(int c = 1 ;c<=PCCTVB;c++ ){
            System.out.println("Posisi CCTV ke "+c+" = "+"Di Belakang" );
        }
        System.out.println("======================================================");
        System.out.println(" ");
    }

    @Override
    public void Save() {
        try{
            FileWriter Writer = new FileWriter("KondisiKelas3.txt");
            Writer.write("Masukan Jumlah Kipas Angin = "+KondisiKelas3.getJumlahKipasAngin());
            Writer.write("Masukan Kondisi Kipas Angin = "+KondisiKelas3.getKondisiKipasAngin());
            Writer.write("Masukan Posisi Kipas Angin = "+KondisiKelas3.getPosisiKipasAngin());
            Writer.write("Masukan Jumlah AC = "+KondisiKelas3.getJumlahAC());
            Writer.write("Masukan Kondisi AC = "+KondisiKelas3.getKondisiAC());
            Writer.write("Masukan Posisi AC= "+KondisiKelas3.getPosisiAC());
            Writer.write("Masukan SSID ="+KondisiKelas3.getSSID());
            Writer.write("Masukan Jumlah CCTV ="+KondisiKelas3.getJumlahCCTV());
            Writer.write("Masukan Kondisi CCTV ="+KondisiKelas3.getKondisiCCTV());
            Writer.write("Masukan Posisi CCTV ="+KondisiKelas3.getPosisiCCTV());
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
        return SaranaRuang2_Sesuai/11;
    }

}
