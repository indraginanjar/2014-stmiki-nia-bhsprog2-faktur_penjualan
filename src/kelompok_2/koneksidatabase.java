/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kelompok_2;

import java.sql.*;
import javax.swing.JOptionPane;

public class koneksidatabase {
    Connection cn;
    Statement st;
    public void koneksi()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/dbfaktur_penjualan", "root", "");
            st = cn.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"koneksi gagal : "+ e);
        }
    }
}
