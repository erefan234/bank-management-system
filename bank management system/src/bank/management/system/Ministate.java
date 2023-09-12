
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;


public class Ministate extends JFrame implements ActionListener{
    
    String pinnumber;
    Ministate(String pinnumber){
        
        this.pinnumber=pinnumber;
        setTitle("MINI STATEMENT");
        
        setLayout(null);
        
        JLabel mini= new JLabel();
        add(mini);
        
        JLabel bank= new JLabel("BHARATH BANK");
        bank.setBounds(150,20,100,10);
        add(bank);
        
        
        JLabel card= new JLabel();
        card.setBounds(20,80,300,20);
        add(card);
        
        JLabel balance= new JLabel();
        balance.setBounds(20,400,300,20);
        add(balance);
        
        try{
            Conn conn=new Conn();
            ResultSet rs =  conn.a.executeQuery("select * from login where pin = '"+pinnumber+"'");
            while(rs.next()){
                card.setText("Card Number: " + rs.getString("cardnumber").substring(0,4) + "xxxxxxx" + rs.getString("cardnumber").substring(12));
            }       
        
        } catch(Exception e){
            System.out.println(e);
        }
        
        try{
            int bal = 0;
            Conn conn = new Conn();
            ResultSet rs  = conn.a.executeQuery("Select * from bank where pin = '"+pinnumber+"'");
            while(rs.next()){
                mini.setText(mini.getText() + "<html>" + rs.getString("date") + " &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type")+" &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><br>");
                if(rs.getString("type").equals("Deposit")){
                         bal += Integer.parseInt(rs.getString("amount"));
                         
                     }else{
                         bal-= Integer.parseInt(rs.getString("amount"));
                     }
            }
            
            balance.setText("Your current account balance is Rs " + bal );
                  
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        mini.setBounds(20,140,400,200);
        
        
        setSize(400,600);
        setLocation(20,20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Transaction(pinnumber).setVisible(true);
    }
    public static void main(String args[]) {
       new Ministate("");
        
    }
}
