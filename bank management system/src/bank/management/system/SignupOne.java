
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class SignupOne extends JFrame implements ActionListener{
    
    long random;
    JTextField nametf,placetf,fnametf,dobtf,emailtf,gentf,adtf,citytf,statetf,pcodetf;
    JButton next;
    JRadioButton male,fmale,oth,mar,umarr,other;
    JDateChooser datechooser;
    
    
    SignupOne() {
        
        setLayout(null);
        
        Random ran= new Random();
        long random =Math.abs((ran.nextLong() % 9000L)+  1000L);
        
        JLabel formno= new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel personaldetail= new JLabel("PAGE NO.1 : PERSONAL DETAILS ");
        personaldetail.setFont(new Font("Raleway",Font.BOLD,30));
        personaldetail.setBounds(140,80,600,40);
        add(personaldetail);
        
        JLabel name= new JLabel("Name:  ");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,150,100,30);
        add(name);
        
        nametf = new JTextField();
        nametf.setFont(new Font("Raleway",Font.BOLD,14));
        nametf.setBounds(300,150,400,30);
        add(nametf);
        
        
        JLabel place= new JLabel("Place:  ");
        place.setFont(new Font("Raleway",Font.BOLD,20));
        place.setBounds(100,200,100,30);
        add(place);
        getContentPane().setBackground(Color.WHITE);
        
        placetf = new JTextField();
        placetf.setFont(new Font("Raleway",Font.BOLD,14));
        placetf.setBounds(300,200,400,30);
        add(placetf);
        
        
        JLabel fname= new JLabel("Fathers Name:  ");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,300,200,30);
        add(fname);
        
        fnametf = new JTextField();
        fnametf.setFont(new Font("Raleway",Font.BOLD,14));
        fnametf.setBounds(300,300,400,30);
        add(fnametf);
        
        
        JLabel dob= new JLabel("Date of Birth:  ");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,250,200,30);
        add(dob);
        
        datechooser= new JDateChooser();
        datechooser.setBounds(300,250,400,30);
        datechooser.setForeground(new Color(105,105,105));
        add(datechooser);
        
        
        
        
        JLabel gen= new JLabel("Gender:  ");
        gen.setFont(new Font("Raleway",Font.BOLD,20));
        gen.setBounds(100,350,400,30);
        
        add(gen);
        
        male= new JRadioButton("Male");
        male.setBounds(300,350, 120 , 30);
        male.setBackground(Color.WHITE);
        add(male);
        
        fmale= new JRadioButton("Female");
        fmale.setBounds(450,350, 120 , 30);
        fmale.setBackground(Color.WHITE);
        add(fmale);
        
        oth= new JRadioButton("Others");
        oth.setBounds(600,350, 120 , 30);
        oth.setBackground(Color.WHITE);
        add(oth);
        
        ButtonGroup gengrp = new ButtonGroup();
        gengrp.add(male);
        gengrp.add(fmale);
        gengrp.add(oth);
        
        JLabel email= new JLabel("Email:  ");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,400,100,30);
        add(email);
        
        emailtf = new JTextField();
        emailtf.setFont(new Font("Raleway",Font.BOLD,14));
        emailtf.setBounds(300,400,400,30);
        add(emailtf);
        
        
        JLabel marital= new JLabel("Marital Status:  ");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,450,200,30);
        add(marital);
        
        mar= new JRadioButton("Married");
        mar.setBounds(300,450, 120 , 30);
        mar.setBackground(Color.WHITE);
        add(mar);
        
        umarr= new JRadioButton("Unmarried");
        umarr.setBounds(450,450, 120 , 30);
        umarr.setBackground(Color.WHITE);
        add(umarr);
        
        other= new JRadioButton("Others");
        other.setBounds(600,450, 120 , 30);
        other.setBackground(Color.WHITE);
        add(other);
        
        ButtonGroup jgrp = new ButtonGroup();
        jgrp.add(mar);
        jgrp.add(umarr);
        jgrp.add(other);
        
       
        
        
        JLabel ad= new JLabel("Address:  ");
        ad.setFont(new Font("Raleway",Font.BOLD,20));
        ad.setBounds(100,500,100,30);
        add(ad);
        
        adtf = new JTextField();
        adtf.setFont(new Font("Raleway",Font.BOLD,14));
        adtf.setBounds(300,500,400,30);
        add(adtf);
        
        
        JLabel city= new JLabel("City:  ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,550,100,30);
        add(city);
        
        citytf = new JTextField();
        citytf.setFont(new Font("Raleway",Font.BOLD,14));
        citytf.setBounds(300,550,400,30);
        add(citytf);
        
        
       
        JLabel state= new JLabel("State:  ");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,600,100,30);
        add(state);
        
        statetf = new JTextField();
        statetf.setFont(new Font("Raleway",Font.BOLD,14));
        statetf.setBounds(300,600,400,30);
        add(statetf);
        
        
        JLabel pcode= new JLabel("Pincode:  ");
        pcode.setFont(new Font("Raleway",Font.BOLD,20));
        pcode.setBounds(100,650,100,30);
        add(pcode);
        
        pcodetf = new JTextField();
        pcodetf.setFont(new Font("Raleway",Font.BOLD,14));
        pcodetf.setBounds(300,650,400,30);
        add(pcodetf);
        
        
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
        String formno = "" + random;//  long
        String name = nametf.getText();
        String fname = fnametf.getText();
        String dob = ((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(male.isSelected()){
            gender="Male";
        } else if (fmale.isSelected()){
            gender="Female";
        } else if(oth.isSelected() ){
            gender="others";
        }
        
        String email=emailtf.getText();
        String marital=null;
        if(mar.isSelected()){
            marital="Married";
            
        }else if(umarr.isSelected()){
            marital="Unmarried";
        }else if(other.isSelected()){
            marital="Others";
        }
        
        String address=adtf.getText();
        String city=citytf.getText();
        String state=statetf.getText();
        String pin=pcodetf.getText();
        
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null,"Name is required");
            }else {
                Conn c=new Conn();
                String query="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+address+"','"+marital+"','"+city+"','"+state+"','"+pin+"')";
                 c.a.executeUpdate(query);
            }
            setVisible(false);
            new Signuptwo(formno).setVisible(true);
        }catch (Exception e){
            System.out.println(e);
        }
    }
    
    

   
    public static void main(String args[]) {
       
        new SignupOne();
    }
}
