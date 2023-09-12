
package bank.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement a ;

    
    public Conn() {
        
        try{
            c =DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Erefan@234");
            a =c.createStatement();
        }catch (Exception e){
            System.out.println(e);
        }
        
    }
}
