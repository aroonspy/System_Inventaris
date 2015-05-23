// Di buat oleh : 
// Nama : Sundari
// Nim : 201410370311022
package PreSistem;


public class SaranaTest extends IndukClass{
    SaranaRuangan KondisiKelas2 = new SaranaRuangan();
    public static double SaranaRuang_Sesuai = 0.0;
    int Ksteker =0;
    int PstekerD=0;
    int PstekerP=0;
    public void InputSteker(){
                System.out.println(" ");
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
		System.out.println(" ");
	}

    int KLCD = 0;
    int PLCDD = 0;
    public void InputKabelLCD(){
		System.out.println(" ");
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
	}

    int KLampu = 0;
    int PLampuL = 0;
    public void InputLampu(){
		System.out.println(" ");
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
	}
    public double AnalisisLampu(){
		if(KondisiKelas2.getJumlahLampu() >=0){
			System.out.print("Jumlah Lampu = "+KondisiKelas2.getJumlahLampu());
                        if(KondisiKelas2.getJumlahLampu() >=18){
                            System.out.println(" Sesuai");
                            SaranaRuang_Sesuai++;
                        }else{
                        System.out.println();
                        }
		}
		if(KLampu >= 0){
			System.out.print("Jumlah Lampu Yang Berkondisi Baik = "+KLampu);
                        if(KLampu >=18){
                            System.out.println(" Sesuai");
                            SaranaRuang_Sesuai++;
                        }else{
                        System.out.println();
                        }
                }
		if(PLampuL >= 0){
			System.out.print("Lampu Berposisi Di Langit - Langit = "+PLampuL);
                        if (PLampuL == KondisiKelas2.getJumlahLampu()&& PLampuL >= 18 ){
                            System.out.println(" Sesuai");
                            SaranaRuang_Sesuai++;
                        }else{
                            System.out.println();
                        }
		}
            return SaranaRuang_Sesuai;
	}
  
	 

    @Override
    public void Pemanggilan() {
        InputSteker();
        System.out.println("===================== Output Steker ==============================");
	KondisiKelas2.Analisis(4,KondisiKelas2.getJumlahSteker(),0.0,Ksteker,PstekerD,PstekerP);
        System.out.println("==================================================================");
	SaranaRuang_Sesuai = SaranaRuang_Sesuai+KondisiKelas2.getSaranaRuang_Sesuai();	
        
	InputKabelLCD();
        System.out.println("===================== Output LCD =================================");
	KondisiKelas2.Analisis(1,KondisiKelas2.getJumlahKabelLCD(),0.0,KLCD,PLCDD);
        System.out.println("==================================================================");
        SaranaRuang_Sesuai = SaranaRuang_Sesuai + KondisiKelas2.getSaranaRuang_Sesuai();
        
	InputLampu();
	AnalisisLampu();
    }
}
