package Inventory.Services;

import Inventory.DatabaseConnection.DbCon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StoreService {
    public String[][] populateTable() {

        String data[][]=new String[50][3];
        try {
            Connection con = DbCon.createC();
            String query = "SELECT id,name,status FROM items";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            int count=0;
            while (rs.next()) {


                String  id = String.valueOf(rs.getInt("id"));
                String name = rs.getString("name");
                String status = rs.getString("status");

                data[count]= new String[]{id, name, status};
//                DefaultTableModel t= (DefaultTableModel)table.getModel();
//                t.addRow(data);
                count++;
            }
            rs.close();
            ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}
