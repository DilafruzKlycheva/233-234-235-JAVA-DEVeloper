package com.tpe.jdbc;

import java.sql.*;

public class ExecuteUpdate01 {

    public static void main(String[] args) throws SQLException {

        //!!! 2.ADIM : Hangi DB , Hangi kullaniciAdi ve sifre
        Connection con =
                DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbc_nt","techpront","password");

        //!!! 3.ADIM : statement nesnesi olusturuluyor
        Statement st  = con.createStatement();
        System.out.println("success");

        // update islemi oncesi
        System.out.println("---------------- UPDATE ONCESI ----------------------");
        ResultSet rs = st.executeQuery("SELECT * FROM developers");
        while (rs.next()){
            System.out.println(rs.getString("name") + "------" + rs.getDouble("salary"));
        }

        //!!!  ÖRNEK1:developers tablosunda maaşı ortalama maaştan az olanların maaşını ortalama maaş ile güncelleyiniz
        String sql1 =
          "UPDATE developers SET salary=(SELECT AVG(salary) FROM developers) WHERE salary<(SELECT AVG(salary) FROM developers)";
        int updated = st.executeUpdate(sql1);
        System.out.println("Guncellenen kayit sayisi : " + updated);

        // update islemi sonrasi
        System.out.println("---------------- UPDATE SONRASI ----------------------");
        ResultSet rs2 = st.executeQuery("SELECT * FROM developers");
        while (rs2.next()){
            System.out.println(rs2.getString("name") + "------" + rs2.getDouble("salary"));
        }

        st.close();
        con.close();
    }
}
