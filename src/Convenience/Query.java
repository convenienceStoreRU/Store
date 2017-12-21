/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Convenience;

import java.sql.ResultSet;
//import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
//import java.sql.Connection;
//import java.sql.DriverManager;

/**
 *
 * @author Student554
 */
public class Query extends ConnectDB {
    public Query(){
        super();
        Namelogin();
    }   
    
    Vector Items = new Vector();
    
        public void Namelogin() {
            try {
                
                
                Statement s = null;
                s = connect.createStatement();
                
                String sql = "SELECT E_ID,E_F_Name FROM  employee";


            ResultSet rec = s.executeQuery(sql);
            while((rec!=null) && (rec.next()))
            
            {
                Items.add(rec.getString("E_ID")+ " - " +rec.getString("E_F_Name"));
                
            }
          } catch (Exception e) 
          { e.printStackTrace(); }
        }
}
