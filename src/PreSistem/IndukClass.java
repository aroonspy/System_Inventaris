package PreSistem;

import java.util.Scanner;

public class IndukClass {
    double Sesuai = 0.0;
    double rata_rata;
    Scanner input = new Scanner(System.in);
    public double rata_rata(){
        rata_rata = (Sesuai/6)*100;
        System.out.println("Jumlah Rata - Rata Sesuai = " + rata_rata);
        return rata_rata;        
    }
}
