
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class Deposit extends JFrame implements ActionListener {
    
    JButton deposit,back;
    String pinnumber;
    JTextField amount,cardTextField;
    
    Deposit(String pinnumber){
        
        this.pinnumber=pinnumber;
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=  i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("Enter the amount you want to deposit");
        text.setBounds(170,300,400,40);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        
        amount= new JTextField();
        amount.setFont(new Font("Raleway",Font.BOLD,16));
        amount.setBounds(170,350,320,30);
        image.add(amount);
        
        JLabel cardno = new JLabel("Enter Your card number: ");
        cardno.setBounds(170,370,400,40);
        cardno.setForeground(Color.WHITE);
        cardno.setFont(new Font("System",Font.BOLD,16));
        image.add(cardno);
        
        cardTextField= new JTextField();
        cardTextField.setFont(new Font("Raleway",Font.BOLD,16));
        cardTextField.setBounds(170,410,320,30);
        image.add(cardTextField);
        
        
        
        
        deposit = new JButton("Deposit");
        deposit.setBounds(175,480,150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        back = new JButton("Back");
        back.setBounds(350,480,150,30);
        back.addActionListener(this);
        image.add(back);
        
        
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
         if (ae.getSource() ==deposit){
             String number= amount.getText();
             String cardnumber=cardTextField.getText();
             Date date =new Date();
             if(number.equals("")){
                 JOptionPane.showMessageDialog(null,"Please enter the amount");
                 
             }else {
                 try{
                 Conn conn = new Conn();
                 String query="insert into bank values('"+cardnumber+"','"+pinnumber+"','"+date+"','Deposit','"+number+"')";
                 conn.a.executeUpdate(query);
                 JOptionPane.showMessageDialog(null,"Rs"+number+"Deposited Successfully");
                 setVisible(false);
                 new Transaction(pinnumber).setVisible(true);
             }catch(Exception e){
                     System.out.println();
             
             }
             } 
         }
         else if(ae.getSource()==back){
             setVisible(false);
             new Transaction(pinnumber).setVisible(true);
         }
     }

    
    public static void main(String args[]) {
        new Deposit("");
        
    }
}
