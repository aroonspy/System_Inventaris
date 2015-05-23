
package PreSistem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiDB {
    private static Connection koneksi;
    public static Connection getKoneksi(){
        if(koneksi == null){
            try {
                String url = "jdbc:mysql://localhost/System_Inventaris";
                String user = "root";
                String Password = "12345";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            }catch(SQLException se){
                System.out.println(se);
            }
        }
        return koneksi;
    }
}
