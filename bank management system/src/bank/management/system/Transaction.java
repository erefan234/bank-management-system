
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class Transaction extends JFrame implements ActionListener{
    
    JButton deposit,fastcash,cashwithdraw,ministate,exit,pinchange,benquiry,withdraw,transfer; 
    String pinnumber;
    Transaction(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        
        JLabel text = new JLabel("please select your Transaction");
        text.setBounds(215,300,700,30);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(155,415,150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(155,450,150,30);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        cashwithdraw = new JButton("Cash Withdrawal");
        cashwithdraw.setBounds(350,415,150,30);
        cashwithdraw.addActionListener(this);
        image.add(cashwithdraw);
        
        ministate = new JButton("Mini Statement");
        ministate.setBounds(350,450,150,30);
        ministate.addActionListener(this);
        image.add(ministate);
        
        pinchange = new JButton("Change PIN");
        pinchange.setBounds(155,485,150,30);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        benquiry = new JButton("Balance Enquiry");
        benquiry.setBounds(350,485,150,30);
        benquiry.addActionListener(this);
        image.add(benquiry);
        
        exit = new JButton("Exit");
        exit.setBounds(350,520,150,30);
        exit.addActionListener(this);
        image.add(exit);
        
        transfer = new JButton("Transfer Money");
        transfer.setBounds(155,520,150,30);
        transfer.addActionListener(this);
        image.add(transfer);
        
      
        
        
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    
     public void actionPerformed(ActionEvent ae){
         if (ae.getSource() ==exit){
             System.exit(0);
         }else if(ae.getSource()==deposit){
             setVisible(false);
             new Deposit(pinnumber).setVisible(true);
             
         }else if(ae.getSource()==cashwithdraw){
             setVisible(false);
             new Withdraw(pinnumber).setVisible(true);
             
             
         }else if (ae.getSource()== fastcash){
             setVisible(false);
             new Fastcash(pinnumber).setVisible(true);
         }else if(ae.getSource()== pinchange){
             setVisible(false);
             new Pinchange(pinnumber).setVisible(true);
         }else if (ae.getSource()==benquiry){
             setVisible(false);
             new Balanceenquiry(pinnumber).setVisible(true);
         }else if(ae.getSource()==ministate){
            new Ministate(pinnumber).setVisible(true);
         }else if(ae.getSource()==transfer){
             setVisible(false);
             new Transfer(pinnumber).setVisible(true);
         
     }
         
         
     }

    
    public static void main(String args[]) {
        new Transaction("");
       
    }
}
