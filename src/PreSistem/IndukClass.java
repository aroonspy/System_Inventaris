package PreSistem;

//Membuat abstract class

import java.util.Scanner;

public abstract class IndukClass {
    Scanner input = new Scanner(System.in);
    public abstract void Input();
    public abstract double Analisis();
    public abstract void Tampil();
    public abstract void Save();
    public abstract void Pemanggilan();
}
