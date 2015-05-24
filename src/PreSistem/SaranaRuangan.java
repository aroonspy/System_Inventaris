package PreSistem;

public class SaranaRuangan {
	private int JumlahSteker;
	private int KondisiSteker;
	private int PosisiSteker;
	private int JumlahKabelLCD;
	private int KondisiKabelLCD;
	private int PosisiKabelLCD;
	private int JumlahLampu;
	private int KondisiLampu;
	private int PosisiLampu;
        public double SaranaRuang_Sesuai = 0.0;
	
        
        int getJumlahSteker(){
		return JumlahSteker;
	}
	void setJumlahSteker(int JumlahSteker){
		this.JumlahSteker = JumlahSteker;
	}
	int getKondisiSteker(){
		return KondisiSteker;
	}
	void setKondisiSteker(int KondisiSteker){
		this.KondisiSteker = KondisiSteker;
	}
	int getPosisiSteker(){
		return PosisiSteker;
	}
	void setPosisiSteker(int PosisiSteker){
		this.PosisiSteker = PosisiSteker;
	}
	
	int getJumlahKabelLCD(){
		return JumlahKabelLCD;
	}
	void setJumlahKabelLCD(int JumlahKabelLCD){
		this.JumlahKabelLCD = JumlahKabelLCD;
	}
	int getKondisiKabelLCD(){
		return KondisiKabelLCD;
	}
	void setKondisiKabelLCD(int KondisiKabelLCD){
		this.KondisiKabelLCD = KondisiKabelLCD;
	}
	int getPosisiKabelLCD(){
		return PosisiKabelLCD;
	}
	void setPosisiKabelLCD(int PosisiKabelLCD){
		this.PosisiKabelLCD = PosisiKabelLCD;
	}
	
	int getJumlahLampu(){
		return JumlahLampu;
	}
	void setJumlahLampu(int JumlahLampu){
		this.JumlahLampu = JumlahLampu;
	}
	int getKondisiLampu(){
		return KondisiLampu;
	}
	void setKondisiLampu(int KondisiLampu){
		this.KondisiLampu = KondisiLampu;
	}
	int getPosisiLampu(){
		return PosisiLampu;
	}
	void setPosisiLampu(int PosisiLampu){
		this.PosisiLampu = PosisiLampu;
	}
        
        public double getSaranaRuang_Sesuai() {
            return SaranaRuang_Sesuai;
        }
        public void setSaranaRuang_Sesuai(double SaranaRuang_Sesuai) {
            this.SaranaRuang_Sesuai = SaranaRuang_Sesuai;
        }
        

    public double Analisis(int JumlahMax, int JumlahAsli, double SaranaRuang_Sesuai, int Kondisi, int PosisiD, int PosisiP){
	this.SaranaRuang_Sesuai = SaranaRuang_Sesuai;
        if(JumlahAsli >= 0){
            System.out.print("Jumlah "+JumlahAsli);
            if(JumlahAsli >= JumlahMax){
                System.out.println(" Sesuai");
                this.SaranaRuang_Sesuai++;
            }else{
                System.out.println();
            }
        }
        if(Kondisi >= 0){
            System.out.print("Kondisi Baik "+Kondisi);
                if(Kondisi == JumlahAsli && Kondisi >= JumlahMax){
                    System.out.println(" Sesuai");
                    this.SaranaRuang_Sesuai++;
                }else{
                    System.out.println("");
                }
	}
        if(PosisiD >= 0){
            for(int c = 1 ;c<=PosisiD;c++ ){
                System.out.println("Posisi ke "+c+" = "+"Dekat Dosen" );
            }
	}
        if(PosisiP >=0){
            for(int a = 1 ;a<=PosisiP;a++ ){
                System.out.println("Posisi ke "+a+" = "+"Pojok Ruang" );
            }
	}else{
            System.out.println();
        }
        
        if(PosisiP +PosisiD == JumlahAsli && PosisiP + PosisiD >= JumlahMax ){
                    System.out.println("Posisi Sesuai");
                    this.SaranaRuang_Sesuai++;
        }
        setSaranaRuang_Sesuai(this.SaranaRuang_Sesuai);
        return 0;
    }
    public double Analisis(int JumlahMax, int JumlahAsli, double SaranaRuang_Sesuai, int Kondisi, int PosisiD){
        this.SaranaRuang_Sesuai = SaranaRuang_Sesuai;
        if(JumlahAsli >= 0){
            System.out.print("Jumlah "+JumlahAsli);
                if(JumlahAsli >= JumlahMax){
                    System.out.println(" Sesuai");
                    this.SaranaRuang_Sesuai++;
                }else{
                    System.out.println();
                }
        }
        if(Kondisi >= 0){
            System.out.print("Kondisi Baik "+Kondisi);
                if(Kondisi == JumlahAsli && Kondisi >= JumlahMax){
                    System.out.println(" Sesuai");
                    this.SaranaRuang_Sesuai++;
                }else{
                    System.out.println("");
                }
	}
        if(PosisiD >= 0){
            System.out.print("Posisi Dekat Dosen = "+PosisiD );
                if(PosisiD == JumlahAsli && PosisiD >= 1){
                    System.out.println("Sesuai");
                    this.SaranaRuang_Sesuai++;
                }else{
                     System.out.println();
                }
	}
        setSaranaRuang_Sesuai(this.SaranaRuang_Sesuai);
        return 0;
    }
    
}
