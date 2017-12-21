/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Convenience;

/*
 * @author Student554
 */
import java.sql.DriverManager;
import java.sql.Connection;
//import java.sql.SQLException;

public class ConnectDB {
    public ConnectDB(){
        initialconn();
    }
    
    Connection connect = null;
    
    public void initialconn(){
            
            
        
            try {

                Class.forName("com.mysql.jdbc.Driver");

                connect =  DriverManager.getConnection("jdbc:mysql://localhost/store" +"?user=Admin&password=admin");

                if(connect != null){

                    System.out.println("Database Connected.");

                } else {

                    System.out.println("Database Connect Failed.");
                }
            } catch (Exception e) {

                e.printStackTrace();
            }
            
    }
    
}
