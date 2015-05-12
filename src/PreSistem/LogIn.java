package PreSistem;

import java.util.Scanner;

public class LogIn {
private String A;
private String B;
private String Nama;
private String PasswordL;
private String PasswordB;
private String Nama2;
private String Password2;
private int Pilih;
private int a = 1;
Scanner input = new Scanner(System.in);

private String SetNama (){
	System.out.print("Masukkan Nama : ");
	Nama = input.nextLine();
	return Nama;
}
private String SetPasswordL (){
	System.out.print("Masukkan Password : ");
	PasswordL  = input.nextLine();
	return PasswordL;
}
public int Menu(){
	A = "1. GANTI PASSWORD";
	B = "2. LOG IN";
			
	System.out.println(" ");
	System.out.println("+++ Masukkan Pilihan +++");
	System.out.println(A);
	System.out.println(B);
	System.out.print("Masukkan Pilihan : ");
	Pilih = input.nextInt();
	
	return Pilih;

}

private String Gantipassword() {
		System.out.println(" ");
		System.out.println(A);
		SetNama();
		SetPasswordL();
		System.out.print("Masukkan Password Baru: ");
		PasswordB = input.nextLine();
		
		PasswordL=PasswordB;
		return PasswordL;
	}

public void Masuk(String Nama,String PasswordL) {
		System.out.println(" ");
		System.out.println("LOG IN");
		System.out.print("Masukkan Nama : ");
		Nama2 = input.next();
		System.out.print("Masukkan Password : ");
		Password2  = input.next();
		
		if (Nama2.equals(Nama) && Password2.equals(PasswordL))
			System.out.print("Log In Berhasil \n\n");
		else System.out.print("Log In Gagal");
	}
public void Option(int Pilih, String Nama, String PasswordL){
	if (Pilih == 1){
		Gantipassword();
		a = 2;
		Logintest();
	}
	else if (Pilih == 2){	
		Masuk(Nama,PasswordL);
                
	}
	else
		System.out.println("ERROR");
}

public void Logintest() {
	if( a == 1){
		SetNama();
		SetPasswordL();
		Menu();
		Option(Pilih,Nama,PasswordL);
	}
	else if (a == 2){
		Menu();
		Option(Pilih,Nama,PasswordL);
	}
    }
}
