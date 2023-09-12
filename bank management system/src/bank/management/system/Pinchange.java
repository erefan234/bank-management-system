
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Pinchange extends JFrame implements ActionListener{
    
    JPasswordField pin,repin;
    JButton change,back;
    String pinnumber;
    
    Pinchange(String pinnumber){
        this.pinnumber=pinnumber;
        
       
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
        JLabel text = new JLabel(" CHANGE YOUR PIN");
        text.setBounds(250,300,700,40);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        JLabel pintext = new JLabel(" ENTER YOUR PIN");
        pintext.setBounds(200,350,700,20);
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("System",Font.BOLD,10));
        image.add(pintext);
       
        pin = new JPasswordField();
        pin.setFont(new Font("Raleway",Font.BOLD,10));
        pin.setBounds(320,350,180,20);
        image.add(pin);
        
        JLabel repintext = new JLabel(" RE-ENTER YOUR PIN");
        repintext.setBounds(200,400,500,20);
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("System",Font.BOLD,10));
        image.add(repintext);
        
        repin = new JPasswordField();
        repin.setFont(new Font("Raleway",Font.BOLD,10));
        repin.setBounds(320,400,180,20);
        image.add(repin);
        
        change = new JButton("CHANGE");
        change.setBounds(350,450,150,30);
        change.addActionListener(this);
        image.add(change);

        back = new JButton("BACK");
        back.setBounds(350,500,150,30);
        back.addActionListener(this);
        image.add(back);
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == change){
        try{
            String npin= pin.getText();
            String rpin= repin.getText();
            
            if(!npin.equals(rpin)){
                JOptionPane.showMessageDialog(null,"Entered pin does not match ");
                return;
            }
            
            if (npin.equals("")){
                JOptionPane.showMessageDialog(null,"Please Enter pin ");
                return;
            }    
                
             if (rpin.equals("")){
                JOptionPane.showMessageDialog(null,"Please RE-Entered pin ");
                return;   
            }
             
            Conn conn= new Conn();
            String query1= "update bank set pin = '"+rpin+"' where pin = '"+pinnumber+"'";
            String query2= "update login set pin = '"+rpin+"' where pin = '"+pinnumber+"'";
            String query3= "update signthree set pin = '"+rpin+"' where pin = '"+pinnumber+"'";
            
            JOptionPane.showMessageDialog(null,"PIN changed successfully ");
            
            
            setVisible(false);
            new Transaction(rpin).setVisible(true);

            conn.a.executeUpdate(query1);
            conn.a.executeUpdate(query2);
            conn.a.executeUpdate(query3);
            
            
            
            
            setVisible(false);
            new Transaction(rpin).setVisible(true);
        }catch(Exception e){
            System.out.println(e);
        }
}
    
        else {
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
    
}

    }
    
    public static void main(String args[]) {
        new Pinchange("").setVisible(true);
        
    }
}
