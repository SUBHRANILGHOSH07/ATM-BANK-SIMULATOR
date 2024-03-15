package bank.mangement.system;

import java.sql.*;

public class Conn {

    Connection c;//Create connection
    Statement s;//Create statement
    public Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Subhra@07");//connection done
            s = c.createStatement();
     
        } catch(Exception e) {
            System.out.println(e);//for exception handling,printing exception
        }
    }
    
}
