package PreSistem;



public class SaranaTest2 extends IndukClass  {

	SaranaRuangan2 KondisiKelas3 = new SaranaRuangan2();
	int Kkipas = 0;
	int PkipasL = 0;
	int PkipasS = 0;
	
	
	public void InputKipasAngin(){
		System.out.println(" ");
		System.out.print("Masukkan Jumlah Kipas Angin kelas anda\t\t: ");
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
		System.out.println(" ");
	}
	public void AnalisisKipasAngin(){
		if(KondisiKelas3.getJumlahKipasAngin() >=0){
			System.out.print("Jumlah Kipas Angin "+KondisiKelas3.getJumlahKipasAngin());
                    if(KondisiKelas3.getJumlahKipasAngin() >=2){
                        System.out.println(" Sesuai");
                        Sesuai++;
                    }else{
                        System.out.println();
                    }
		}
		if(Kkipas >= 0){
			System.out.print("Jumlah Kondisi Kipas Angin Yang Baik "+Kkipas);
                        if(Kkipas == KondisiKelas3.getJumlahKipasAngin()&& Kkipas >= 2){
                            System.out.println(" Sesuai");
                            Sesuai++;
                        }else{
                            System.out.println();
                        }
		}
		if(PkipasL  >= 0 ){
			System.out.print("Jumlah Posisi Kipas Angin di Atap Ruangan "+PkipasL);
                        if(PkipasL == KondisiKelas3.getJumlahKipasAngin()&& PkipasL>= 2){
                            System.out.println(" Sesuai");
                             Sesuai++;
                        }else{
                            System.out.println();
                        }
		}
	}
	
	int KAC = 0;
	int PACB = 0;
	int PACS =0;
	public void InputAC(){
		System.out.println(" ");
		System.out.print("Masukkan Jumlah AC \t\t: ");
		KondisiKelas3.setJumlahAC(input.nextInt());
                System.out.println("1. Kondisi Baik");
                System.out.println("2. Kondisi Buruk");
		for(int a = 0; a< KondisiKelas3.getJumlahAC(); a++){
			System.out.print("Masukkan Kondisi AC ke "+a+"\t: ");
			KondisiKelas3.setKondisiAC(input.nextInt());
				if(KondisiKelas3.getKondisiAC() == 1){
					KAC++; //kondisi AC baik ++
				}
                }
                System.out.println("1. Posisi Di Belakang");
                System.out.println("2. Posisi Di Samping");
                for(int b = 0 ; b<KondisiKelas3.getJumlahAC(); b++){
			System.out.print("Masukkan Posisi AC ke "+b+"\t\t: ");
			KondisiKelas3.setPosisiAC(input.nextInt());
			if(KondisiKelas3.getPosisiAC() == 1){
				PACB++; 
			}
			if(KondisiKelas3.getPosisiAC() == 2){
				PACS++;
			}
		}
	}
	public void AnalisisAC(){
		if(KondisiKelas3.getJumlahAC() >=0){
			System.out.print("Jumlah AC "+KondisiKelas3.getJumlahAC());
                          if(KondisiKelas3.getJumlahAC()>=1){
                             System.out.println("Sesuai");
                             Sesuai++;
                          }else{
                              System.out.println();
                          }
		}
		if(KAC >= 0){
			System.out.print("Jumlah Kondisi AC Yang Baik "+KAC );
                        if( KAC == KondisiKelas3.getJumlahAC()&& KAC >= 1){
                            System.out.println("Sesuai");
                            Sesuai++;
                        }else{
                            System.out.println();
                        }
		}
		if(PACB >= 0){
			System.out.print("Jumlah Posisi AC di Belakang "+PACB );
                        if(PACB == KondisiKelas3.getJumlahAC() && PACB >= 1){
                            System.out.println("Sesuai");
                            Sesuai++;
                        }else{
                            System.out.println();
                        }
		}
		if(PACS >= 0){
			System.out.print("Jumlah Posisi AC di Samping "+PACS );
                        if(PACS == KondisiKelas3.getJumlahAC()&& PACS >= 1){
                            System.out.println("Sesuai");
                            Sesuai++;    
                        }else{
                            System.out.println();
                        }
		}
	}
	
	public void InputSSID(){
		System.out.println(" ");
                System.out.println("1. HotSpot UMM");
		System.out.print("Masukkan Pilihan SSID \t\t: ");
		KondisiKelas3.setSSID(input.nextInt());
		System.out.print("Masukkan Besar Bandwith \t: ");
		KondisiKelas3.setBandwith(input.nextInt());
	}
	public void AnalisisInternet(){
		if(KondisiKelas3.getSSID() == 1){
                    System.out.print("Pilihan SSID =  HotSpot UMM");
                    Sesuai++;
		}
	}
	
	static int KCCTV = 0;
	static int PCCTVD = 0;
	static int PCCTVB = 0;
	public void InputCCTV(){
		System.out.println(" ");
		System.out.print("Masukkan Jumlah CCTV \t\t: ");
		KondisiKelas3.setJumlahCCTV(input.nextInt());
                System.out.println("1. Kondisi Baik");
                System.out.println("2. Kondisi Buruk");
		for(int a = 0; a< KondisiKelas3.getJumlahCCTV(); a++){
			System.out.print("Masukkan Kondisi CCTV ke "+a+"\t: ");
			KondisiKelas3.setKondisiCCTV(input.nextInt());
				if(KondisiKelas3.getKondisiCCTV() == 1){
					KCCTV++; //kondisi lampu baik ++
				}
                }
                System.out.println("1. Posisi CCTV di Depan");
                System.out.println("2. Posisi CCTV di Belakang");
                for(int b = 0; b< KondisiKelas3.getJumlahCCTV(); b++){
			System.out.print("Masukkan Posisi CCTV ke "+b+"\t: ");
			KondisiKelas3.setPosisiCCTV(input.nextInt());
			if(KondisiKelas3.getPosisiCCTV() == 1){
				PCCTVD++; // posisi lampu Di langit '' ++
			}
			if(KondisiKelas3.getPosisiCCTV() == 2){
				PCCTVB++;
			}
		}
	}
	public void AnalisisCCTV(){
		if(KondisiKelas3.getJumlahCCTV() == 0){
                    System.out.print("Jumlah CCTV = "+KondisiKelas3.getJumlahCCTV());
                    if(KondisiKelas3.getJumlahCCTV()>= 2){
                        System.out.println("Sesuai");
                        Sesuai++;
                    }else{
                        System.out.println();
                    }
                }
		if(KCCTV >= 0){
                    System.out.print("Jumlah CCTV yang Berkondisi Baik = "+KCCTV);
                    if(KCCTV == KondisiKelas3.getJumlahCCTV()&& KCCTV >= 2){
                        System.out.println("Sesuai");
                         Sesuai++;
                    }else{
                        System.out.println();
                    }
                }
		if(PCCTVD >= 0){
                    for(int c = 1 ;c<=PCCTVD;c++ ){
                        System.out.println("Posisi CCTV ke "+c+" = "+"Di Depan" );
                    }
		}
		if(PCCTVB >= 0){
                    for(int c = 1 ;c<=PCCTVB;c++ ){
                        System.out.println("Posisi CCTV ke "+c+" = "+"Di Belakang" );
                    }
		}
                if(PCCTVD+PCCTVB == KondisiKelas3.getJumlahCCTV()&& PCCTVD+PCCTVB >=2){
                        System.out.println("Posisi CCTV Sesuai");
                        Sesuai++;
                }
	}
	
	public void saranatest2(){
		InputKipasAngin();
                System.out.println("===================================================");
		AnalisisKipasAngin();
		System.out.println("===================================================");
		InputAC();
                System.out.println("===================================================");
		AnalisisAC();
                System.out.println("===================================================");
		
		InputSSID();
                System.out.println("===================================================");
		AnalisisInternet();
                System.out.println("===================================================");
		InputCCTV();
                System.out.println("===================================================");
		AnalisisCCTV();
                System.out.println("===================================================");
	}
}
