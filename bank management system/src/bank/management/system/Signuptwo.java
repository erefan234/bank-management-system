
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class Signuptwo extends JFrame implements ActionListener{
    
    
    JTextField pantf,aadtf,reltf,edutf,inctf,occtf,exacc,cattf;
    JComboBox religion,occupation,education,category,income;
    JButton next;
    JRadioButton yes,no,s,n;
    String formno;
   
    
    
    Signuptwo(String formno) {
        this.formno= formno;
        
        setLayout(null);
        
              
        setTitle("BANKING : ");
        
        JLabel addidetail= new JLabel("PAGE NO.2 : ADDITIONAL DETAILS ");
        addidetail.setFont(new Font("Raleway",Font.BOLD,30));
        addidetail.setBounds(140,80,600,40);
        add(addidetail);
        
        JLabel rel= new JLabel("Religion:  ");
        rel.setFont(new Font("Raleway",Font.BOLD,20));
        rel.setBounds(100,150,200,30);
        add(rel);
        
        String valrel[]={"Select Religion","Hindu","Muslim","Christian","Sikh","Others"};
        religion=new JComboBox(valrel);
        religion.setBounds(300,150,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        
        JLabel cat= new JLabel("Category:  ");
        cat.setFont(new Font("Raleway",Font.BOLD,20));
        cat.setBounds(100,200,200,30);
        add(cat);
        getContentPane().setBackground(Color.WHITE);
        
        String valcat[]={"Select Category","OC","OBC","SC","ST","Other"};
        category=new JComboBox(valcat);
        category.setBounds(300,200,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        
        JLabel inc= new JLabel("Income:  ");
        inc.setFont(new Font("Raleway",Font.BOLD,20));
        inc.setBounds(100,320,200,30);
        add(inc);
        
        String valinc[]={"Select","<1,50,000","<2,50,000","<5,00,000","<10,00,000","above 10,00,000"};
        income=new JComboBox(valinc);
        income.setBounds(300,320,400,30);
        income.setBackground(Color.WHITE);
        add(income);
        
        
        JLabel edu= new JLabel("Educational  ");
        edu.setFont(new Font("Raleway",Font.BOLD,20));
        edu.setBounds(100,250,300,30);
        add(edu);
        JLabel qu= new JLabel("Qualification:  ");
        qu.setFont(new Font("Raleway",Font.BOLD,20));
        qu.setBounds(100,270,300,30);
        add(qu);
        
        String valedu[]={"Select","High School","Under Graduate","Post Graduate","Phd","Others"};
        education=new JComboBox(valedu);
        education.setBounds(300,260,400,30);
        education.setBackground(Color.WHITE);
        add(education);
        
        
        
        
        
        
        JLabel occ= new JLabel("Occupation:  ");
        occ.setFont(new Font("Raleway",Font.BOLD,20));
        occ.setBounds(100,370,400,30);
        add(occ);
        
        String valocc[]={"Select","Stat Government","Private","Central Government","Others"};
        occupation=new JComboBox(valocc);
        occupation.setBounds(300,370,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        
       
        
        JLabel pan= new JLabel("PAN Number:  ");
        pan.setFont(new Font("Raleway",Font.BOLD,20));
        pan.setBounds(100,420,200,30);
        add(pan);
        
        pantf = new JTextField();
        pantf.setFont(new Font("Raleway",Font.BOLD,14));
        pantf.setBounds(300,420,400,30);
        add(pantf);
        
        
        JLabel aad= new JLabel("Aadhar Number:  ");
        aad.setFont(new Font("Raleway",Font.BOLD,20));
        aad.setBounds(100,470,200,30);
        add(aad);
        
        aadtf = new JTextField();
        aadtf.setFont(new Font("Raleway",Font.BOLD,14));
        aadtf.setBounds(300,470,400,30);
        add(aadtf);
        
        
        
      
        
      
        
        
       
        
        
        JLabel sc= new JLabel("Senior Citizen:  ");
        sc.setFont(new Font("Raleway",Font.BOLD,20));
        sc.setBounds(100,520,200,30);
        add(sc);
        
        yes= new JRadioButton("Yes");
        yes.setBounds(300,520, 120 , 30);
        yes.setBackground(Color.WHITE);
        add(yes);
        
        no= new JRadioButton("No");
        no.setBounds(450,520, 120 , 30);
        no.setBackground(Color.WHITE);
        add(no);
        
        ButtonGroup jgrp = new ButtonGroup();
        jgrp.add(yes);
        jgrp.add(no);
        
        
        JLabel exacc= new JLabel("Existing  \t Account:  ");
        exacc.setFont(new Font("Raleway",Font.BOLD,20));
        exacc.setBounds(100,570,200,30);
        add(exacc);
        
       
        
        s= new JRadioButton("Yes");
        s.setBounds(300,570, 120 , 30);
        s.setBackground(Color.WHITE);
        add(s);
        
        n= new JRadioButton("No");
        n.setBounds(450,570, 120 , 30);
        n.setBackground(Color.WHITE);
        add(n);
        
        ButtonGroup igrp = new ButtonGroup();
        igrp.add(s);
        igrp.add(n);
        
        
        
        JButton next= new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(650,720,80,30);
        next.addActionListener(this);
        add(next);
               
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,850);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String reli = (String)religion.getSelectedItem();
        String cat = (String)category.getSelectedItem();
        String edu = (String)education.getSelectedItem();
        String sci=null;
        if(yes.isSelected()){
            sci="Yes";
        } else if (no.isSelected()){
            sci="No";
        }
        
        
        String inco=(String)income.getSelectedItem();
        String exiac=null;
        if(s.isSelected()){
            exiac="Yes";
            
        }else if(n.isSelected()){
            exiac="No";
        }
        
        String occ=(String)occupation.getSelectedItem();
        String pan=pantf.getText();
       
        
        
        try{
            if(reli.equals("")){
                JOptionPane.showMessageDialog(null,"Name is required");
            }else {
                Conn c=new Conn();
                String query2="insert into signuptwo values('"+formno+"','"+reli+"','"+cat+"','"+inco+"','"+edu+"','"+occ+"','"+pan+"','"+sci+"','"+exiac+"')";
                 c.a.executeUpdate(query2);
                 
                 setVisible(false);
                 new Signupthree(formno).setVisible(true);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    
    

   
    public static void main(String args[]) {
       
        new Signuptwo("");
    }
}
