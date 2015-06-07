package PreSistem;

import javax.swing.JOptionPane;

public class LogIn {
public String NamaCreat;
public String PasswordCreat;
public String Passwordconf;
public String NamaLogin;
public String PasswordLogin;
public boolean Next;
    
    public void SetMater(String Nama, String Password, String ConfPass){
        Next = false;
        this.NamaCreat = Nama;
        this.PasswordCreat = Password;
        this.Passwordconf = ConfPass;
        try{
            if(this.PasswordCreat.equals(Passwordconf)){
               Next = true;
            }
        }catch(Exception e){
            System.out.println("ERROR");
        }
    }
    
    public void SetLogin(String Nama, String Password) {
        Next = false;
        this.NamaLogin = Nama;
        this.PasswordLogin = Password;
        try{
            if(this.NamaLogin.equals(NamaCreat) && this.PasswordLogin.equals(PasswordCreat)){
                Next = true;
                JOptionPane.showMessageDialog(null, "Anda Berhasil Login");
            }
        }catch(Exception e){
            System.out.println("ERROR");
        }
    }
    
}
