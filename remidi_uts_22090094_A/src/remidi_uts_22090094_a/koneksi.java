
package remidi_uts_22090094_a;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class koneksi {
   public static Connection koneksi_database() {
        try {
            MysqlDataSource m = new MysqlDataSource();
            m.setUser("root");
            m.setPassword("");
            m.setDatabaseName("mahasiswa");
            m.setServerName("localhost");
            m.setPortNumber(3306);
            m.setServerTimezone("Asia/Jakarta");
            
            Connection C = m.getConnection();
            System.out.println("sukses terhubung ke database");
            return C;
           
                    
        } catch (Exception e) {
            //penanganan eror
            System.out.println("gagal terhubung ke database");
            System.out.println("Eror: "+ e.getMessage());
            
        }
        return null;
   }
}
