package bank.management.system;

import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.util.*;


public class SignupTwo extends JFrame implements ActionListener
{
   
   JDateChooser dateChooser;
   JComboBox  religion,category,occupation,education,income;
   JTextField pan,adhaar;
   JButton next;
   JRadioButton sno,syes,eyes,eno;
   String formno;
   
    SignupTwo(String formno)
    {
        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/form.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(40,5,120,120);
        add(label);
        setLayout(null);
        
       
        JLabel AdditionalDetails = new JLabel("Page 2 : Additional Details");
        AdditionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        AdditionalDetails.setBounds(290,80,400,30);
        add(AdditionalDetails);
        
        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway",Font.BOLD,22));
        name.setBounds(100,140,100,30);
        add(name);
        
        String ValReligion[] = {"Hindu","Muslim","Sikh","Cristian","Other"};
        religion = new JComboBox(ValReligion);
        religion.setBounds(300,140,400,30);
        add(religion);
        /*
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        */
        
        
        JLabel fname = new JLabel("Category :");
        fname.setFont(new Font("Raleway",Font.BOLD,22));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        String ValCategory[] = {"General","OBC","SC","ST","Other"};
        category = new JComboBox(ValCategory);     
        category.setBounds(300,190,400,30);
        add(category);
        
        
        
        JLabel dob = new JLabel("Income :");
        dob.setFont(new Font("Raleway",Font.BOLD,22));
        dob.setBounds(100,240,200,30);
        add(dob);
        
         String incomecategory[] = {"NULL","< 1,50,000","< 2,50,000","< 5,00,000","< 10,00,000","More than 10Lakhs"};
        income = new JComboBox(incomecategory);     
        income.setBounds(300,240,400,30);
        add(income);
        
       
      
        JLabel gender = new JLabel("Educational-");
        gender.setFont(new Font("Raleway",Font.BOLD,22));
        gender.setBounds(100,290,200,30);
        add(gender);
          
        JLabel email = new JLabel("Qualification :");
        email.setFont(new Font("Raleway",Font.BOLD,22));
        email.setBounds(100,315,200,30);
        add(email);
        
         String educationalValues[] = {"Non Graduate","< Graduate","< Post Graduation","Doctorate","Others"};
        education = new JComboBox(educationalValues);     
        education.setBounds(300,310,400,30);
        add(education);
        
        
        JLabel marital = new JLabel("Occupation :");
        marital.setFont(new Font("Raleway",Font.BOLD,22));
        marital.setBounds(100,390,200,30);
        add(marital);
        
        String OccupationValues[] = {"Salaried","Self-Employed","Bussiness","Student"};
        occupation = new JComboBox(OccupationValues);     
        occupation.setBounds(300,390,400,30);
        add(occupation);
        
       
        JLabel address = new JLabel("Pan Number :");
        address.setFont(new Font("Raleway",Font.BOLD,22));
        address.setBounds(100,440,200,30);
        add(address);
        
        pan = new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300,440,400,30);
        add(pan);
       
        JLabel city = new JLabel("Adhaar Number :");
       city.setFont(new Font("Raleway",Font.BOLD,22));
        city.setBounds(100,490,200,30);
        add(city);
        
        adhaar = new JTextField();
        adhaar.setFont(new Font("Raleway",Font.BOLD,14));
        adhaar.setBounds(300,490,400,30);
        add(adhaar);
        
         JLabel state = new JLabel("Senior Citizen :");
       state.setFont(new Font("Raleway",Font.BOLD,22));
        state.setBounds(100,540,200,30);
        add(state);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.lightGray);
        add(syes);
        sno = new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.lightGray);
        add(sno);
       
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);
       
        
        JLabel pincode = new JLabel("Existing Account :");
       pincode.setFont(new Font("Raleway",Font.BOLD,22));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.lightGray);
        add(eyes);
        eno = new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.lightGray);
        add(eno);
       
        ButtonGroup emaritalgroup = new ButtonGroup();
        emaritalgroup.add(eyes);
        emaritalgroup.add(eno);
        
        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.lightGray);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        
        String sreligion = (String)religion.getSelectedItem();  //setText
        String scategory = (String)category.getSelectedItem();
        String sincome = (String)income.getSelectedItem();
        String seducation= (String)education.getSelectedItem();
        String soccupation = (String)occupation.getSelectedItem();
        String seniorcitizen = null;
        if(syes.isSelected())
        {
            seniorcitizen = "Yes";
            
        }
        else if(sno.isSelected())
        {
            seniorcitizen = "No";
        }
        
        String exisitingaccount = null;
        if(eyes.isSelected())
        {
            exisitingaccount = "Yes";
        }
        else if(eno.isSelected())
        {
            exisitingaccount = "No";
        }
        
        
        String span = pan.getText();
        String sadhaar = adhaar.getText();
        
        try
        {
                Conn c = new Conn();
                String query = "Insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+sadhaar+"', '"+seniorcitizen+"', '"+exisitingaccount+"')";
                c.s.executeUpdate(query);
                
             
                //signup3 Object
                setVisible(false);
                new SignupThree(formno).setVisible(true);
            
        }catch (Exception e)
        {
            System.out.println(e);
        }
                
    }
    
    public static void main(String Agr[])
    {
           new SignupTwo("");
    }
    
}

