package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame  implements ActionListener{
    JButton  login , signup, clear;
    JTextField cardTextField;
    JPasswordField pinTextField;       
    Login() {
        setTitle("Automatic Bank System");
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, 100);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);
        
        JLabel text= new JLabel("Welcome to ATM");
        text.setFont(new Font("osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);
        
        getContentPane().setBackground(Color.WHITE);
        
        JLabel cardno = new JLabel("Card No : ");
        cardno.setFont(new Font("Raleway",Font.BOLD,24));
        cardno.setBounds(120,150,150,30);
        add(cardno);
        
        cardTextField = new JTextField();
        cardTextField.setBounds(300,150,250,30);
        add(cardTextField);
       
              
                 
        JLabel pin = new JLabel("Pin : ");
        pin.setFont(new Font("Raleway",Font.BOLD,24));
        pin.setBounds(120,220,250,30);
        add(pin);
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(300,220,250,30);
        add(pinTextField);
        
        login= new JButton("Sign In");
        login.setBounds(300,300,100,30);
        login.setBackground( Color.BLACK);
        login.setForeground( Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        signup= new JButton("Sign Up");
        signup.setBounds(300,350,230,30);
        signup.setBackground( Color.BLACK);
        signup.setForeground( Color.WHITE);
        signup.addActionListener(this);
        add(signup);
        
        clear= new JButton("Clear");
        clear.setBounds(430,300,100,30);
        clear.setBackground( Color.BLACK);
        clear.setForeground( Color.WHITE);
        clear.addActionListener(this);
        add(clear);


        setSize(800, 480);
        setVisible(true);
        setLocation(350, 200);
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()==clear){
            cardTextField.setText("");
            pinTextField.setText("");
        } else if (ae.getSource()==login){
            Conn conn = new Conn();
            String cardnumber= cardTextField.getText();
            String pinnumber = pinTextField.getText();
            String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"'";
            try{
                ResultSet rs = conn.a.executeQuery(query);
                if (rs.next()){
                    setVisible(false);
                    new Transaction(pinnumber).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null,"Incorrect card no or pin");   
                }
            }catch(Exception e){
                System.out.println(e);
                
            }
            
        } else if (ae.getSource()==signup){
            setVisible(false);
            new SignupOne().setVisible(true);
            
        }
            
        
    }

    public static void main(String args[]) {
        new Login();
    }
}
