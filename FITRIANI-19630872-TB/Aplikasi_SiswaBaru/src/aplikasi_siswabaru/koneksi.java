/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi_siswabaru;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class koneksi {
    
    static Connection CONN;


    public static Connection getConnection(){
        try {
          CONN = DriverManager.getConnection("jdbc:mysql://localhost/siswa_baru","root","");
        } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "Koneksi Terputus");
        }
        return CONN;
        
    }
      
}
