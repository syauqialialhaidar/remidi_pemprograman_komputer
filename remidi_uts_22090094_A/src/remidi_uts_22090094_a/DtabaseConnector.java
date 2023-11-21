
package remidi_uts_22090094_a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DtabaseConnector {
    public static Connection koneksi() {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/mahasiswa";

            conn = DriverManager.getConnection(url);
            if (conn != null) {
                System.out.println("Koneksi sukses!");
            }
        } catch (SQLException e) {
            System.out.println("Koneksi gagal! Error: " + e.getMessage());
        }
        return conn;
    }
}
