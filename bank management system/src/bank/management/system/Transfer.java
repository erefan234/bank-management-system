
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;



public class Transfer extends JFrame implements ActionListener{
    
    String pinnumber;
    JButton send,cancel;
    JTextField fromtf,totf,amounttf;
    
    Transfer(String pinnumber){
        
        this.pinnumber=pinnumber;
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=  i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("Enter the amount you want to Transfer");
        text.setBounds(170,300,400,40);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        JLabel from = new JLabel("From Account :");
        from.setBounds(170,340,400,40);
        from.setForeground(Color.WHITE);
        from.setFont(new Font("System",Font.BOLD,16));
        image.add(from);
        
        fromtf= new JTextField();
        fromtf.setBounds(300,350,200,20);
        fromtf.setFont(new Font("System",Font.BOLD,16));
        fromtf.setBackground(Color.WHITE);
        image.add(fromtf);
        
        JLabel to = new JLabel("To Account :");
        to.setBounds(170,370,400,40);
        to.setForeground(Color.WHITE);
        to.setFont(new Font("System",Font.BOLD,16));
        image.add(to);
        
        totf= new JTextField();
        totf.setBounds(300,380,200,20);
        totf.setFont(new Font("System",Font.BOLD,16));
        totf.setBackground(Color.WHITE);
        image.add(totf);
        
        JLabel amount = new JLabel("Amount :");
        amount.setBounds(170,440,400,40);
        amount.setForeground(Color.WHITE);
        amount.setFont(new Font("System",Font.BOLD,16));
        image.add(amount);
        
        amounttf= new JTextField();
        amounttf.setBounds(300,450,200,20);
        amounttf.setFont(new Font("System",Font.BOLD,16));
        amounttf.setBackground(Color.WHITE);
        image.add(amounttf);
        
        send=new JButton("Send");
        send.setBounds(410,500,90,20);
        send.addActionListener(this);
        image.add(send);
        
        cancel=new JButton("Cancel");
        cancel.setBounds(300,500,90,20);
        cancel.addActionListener(this);
        image.add(cancel);
        
        
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
        
    
    }
    
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource()== send){
            String fromaccount = fromtf.getText();
            String toaccount = totf.getText();
            String amount= amounttf.getText();
            Date date =new Date();
            if(fromaccount.equals("")){
                 JOptionPane.showMessageDialog(null,"Please enter the amount");
                 
             }else {
                 try{
                 Conn conn = new Conn();
                 String query1="insert into bank values('"+fromaccount+"','"+pinnumber+"','"+date+"','Withdraw','"+amount+"')";
                 conn.a.executeUpdate(query1);
                 String query2="insert into bank values('"+toaccount+"','"+pinnumber+"','"+date+"','Deposite','"+amount+"')";
                 conn.a.executeUpdate(query2);
                 
                 JOptionPane.showMessageDialog(null,"Rs. "+amount+" transfered to "+toaccount+" successfully ");
                 setVisible(false);
                 new Transaction(pinnumber).setVisible(true);
             }catch(Exception e){
                     System.out.println();
             
             }
             } 
            
        }else if (ae.getSource()== cancel){
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        }else{
                
                }
            
        }
        
    

    
    public static void main(String args[]) {
        new Transfer("");
    }
}
