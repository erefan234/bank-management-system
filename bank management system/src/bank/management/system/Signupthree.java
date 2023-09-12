

package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;


public class Signupthree extends JFrame implements ActionListener{
    
    
    
    
    JButton can,sub;
    JRadioButton r1,r2,r3,r4;
    JCheckBox q1,q2,q3,q4,q5,q6,q7;
    String formno;
    
    
    Signupthree(String formno) {
        this.formno= formno;
        
        setLayout(null);
        
              
        setTitle("  BANKING : ");
        
        JLabel addidetail= new JLabel("PAGE NO.3 : ACCOUNT DETAILS ");
        addidetail.setFont(new Font("Raleway",Font.BOLD,30));
        addidetail.setBounds(140,80,600,40);
        add(addidetail);
        
        JLabel acct= new JLabel("Account Type:  ");
        acct.setFont(new Font("Raleway",Font.BOLD,20));
        acct.setBounds(100,150,200,30);
        add(acct);
        
        r1= new JRadioButton("Savings Account");
        r1.setBounds(100,200, 120 , 30);
        r1.setBackground(Color.WHITE);
        add(r1);
        
        r2= new JRadioButton("Fixed Deposit");
        r2.setBounds(100,230, 120 , 30);
        r2.setBackground(Color.WHITE);
        add(r2);
         
        r3= new JRadioButton("Current Account");
        r3.setBounds(300,200, 120 , 30);
        r3.setBackground(Color.WHITE);
        add(r3);
        
        r4= new JRadioButton("Recurring Deposit Account");
        r4.setBounds(300,230, 200 , 30);
        r4.setBackground(Color.WHITE);
        add(r4);
        
        ButtonGroup jgrp = new ButtonGroup();
        jgrp.add(r1);
        jgrp.add(r2);
        jgrp.add(r3);
        jgrp.add(r4);
        
        JLabel cardno= new JLabel("Card Number  :  ");
        cardno.setFont(new Font("Raleway",Font.BOLD,20));
        cardno.setBounds(100,300,200,30);
        add(cardno);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel info= new JLabel("Your 16 digit card no ");
        info.setFont(new Font("Raleway",Font.BOLD,10));
        info.setBounds(100,320,200,30);
        add(info);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel number= new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("Raleway",Font.BOLD,20));
        number.setBounds(300,300,300,30);
        add(number);
        
        
        
        JLabel pin= new JLabel("PIN    :  ");
        pin.setFont(new Font("Raleway",Font.BOLD,20));
        pin.setBounds(100,370,300,30);
        add(pin);
        
        JLabel adinfo= new JLabel("Enter your 4 digit pin ");
        adinfo.setFont(new Font("Raleway",Font.BOLD,10));
        adinfo.setBounds(100,390,300,30);
        add(adinfo);
        
        JLabel pnumber= new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway",Font.BOLD,20));
        pnumber.setBounds(300,370,300,30);
        add(pnumber);
        
        
        
        
        
        JLabel sr= new JLabel("Services Required:  ");
        sr.setFont(new Font("Raleway",Font.BOLD,20));
        sr.setBounds(100,430,400,30);
        add(sr);
        
        q1= new JCheckBox("ATM Card");
        q1.setBounds(100,470, 200 , 30);
        q1.setBackground(Color.WHITE);
        add(q1);
        
        q2= new JCheckBox("Internet Banking");
        q2.setBounds(300,470, 200 , 30);
        q2.setBackground(Color.WHITE);
        add(q2);
        
        q3= new JCheckBox("Mobile Banking");
        q3.setBounds(100,520, 200 , 30);
        q3.setBackground(Color.WHITE);
        add(q3);
        
        q4= new JCheckBox("EMAIL & SMS Alerts");
        q4.setBounds(300,520, 200 , 30);
        q4.setBackground(Color.WHITE);
        add(q4);
        
        q5= new JCheckBox("Cheque Book");
        q5.setBounds(100,580, 200 , 30);
        q5.setBackground(Color.WHITE);
        add(q5);
       
        q6= new JCheckBox("E-Statement");
        q6.setBounds(300,580, 200 , 30);
        q6.setBackground(Color.WHITE);
        add(q6);
        
        q7= new JCheckBox("The above etails are true to my knowledge and I accept all the terms ");
        q7.setBounds(100,680, 800 , 30);
        q7.setBackground(Color.WHITE);
        add(q7);
       
     
        can= new JButton("Cancel");
        can.setBackground(Color.BLACK);
        can.setForeground(Color.WHITE);
        can.setBounds(650,740,80,30);
        can.addActionListener(this);
        add(can);
        
        sub= new JButton("Submit");
        sub.setBackground(Color.BLACK);
        sub.setForeground(Color.WHITE);
        sub.setBounds(550,740,80,30);
        sub.addActionListener(this);
        add(sub);
               
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,850);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == sub){
            String accounttype= null;
            if(r1.isSelected()){
                accounttype="Saving Account";
            }else if(r2.isSelected()){
                accounttype="Fixed Deposit Account";
            }else if(r3.isSelected()){
                accounttype="Current Account";
            }else if(r4.isSelected()){
                accounttype="Recurring Deposite Account";
            }
            
            Random ran= new Random();
            String cardnumber="" + Math.abs((ran.nextLong()% 90000000L) + 504093600000000L);
            
            String pinnumber="" + Math.abs((ran.nextLong()% 9000L) + 1000L);
                    
            String facility="";
            if(q1.isSelected()){
                facility=facility+"ATM card";
            }else if(q2.isSelected()){
                facility=facility+"Internet Banking";
            }else if(q3.isSelected()){
                facility=facility+"MObile Banking";
            }else if(q4.isSelected()){
                facility=facility+"EMAIL & SMS Alerts";
            }else if(q5.isSelected()){
                facility=facility+"Cheque Book";
            }else if(q6.isSelected()){
                facility=facility+"E-Statement";
            }    
            
            try{
                if(accounttype.equals("")){
                    JOptionPane.showMessageDialog(null,"Account Type is required");
                } else{
                    Conn conn = new Conn();
                    String query1= "insert into signupthree values('"+formno+"','"+accounttype+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                    String query2= "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                    conn.a.executeUpdate(query1);
                    conn.a.executeUpdate(query2);
                    
                    
                    
                    JOptionPane.showMessageDialog(null,"Card Number: "+ cardnumber+"\n Pin: " + pinnumber);
                    
                    setVisible(false);
                    new Deposit(pinnumber).setVisible(false);
                }
            }catch (Exception e){
                System.out.println(e);
                
            }
            
        }else if(ae.getSource() == can){
            setVisible(false);
            new Login().setVisible(true);
            
        } 
        
    }
        
      
   
    public static void main(String args[]) {
       
        new Signupthree("");
    }
}
