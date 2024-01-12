package bank.management.system;
import javax.swing.*;
import java.sql.*;
import java.awt.*;


public class MiniStatement extends JFrame
{
    String pinnumber;
    MiniStatement(String pinnumber)
    {
        this.pinnumber = pinnumber;
        setTitle("MINI STATEMENT");
        
        setLayout(null);
        
        JLabel mini = new JLabel();
        mini.setBounds(20,140,400,200);
        add(mini);
        
        JLabel balance = new JLabel();
        balance.setFont(new Font("Raleway",Font.BOLD,14));
        balance.setBounds(20,400,300,20);
        add(balance);
        
        JLabel bank = new JLabel("Bank MiniStatement");
        bank.setFont(new Font("Raleway",Font.BOLD,14));
        bank.setBounds(150,20,200,20);
        add(bank);
        
        JLabel card = new JLabel();
        card.setBounds(20,80,300,20);
        add(card);
        
        try
        {
            Conn conn = new Conn();
            
            ResultSet rs = conn.s.executeQuery("select * from login where pin = '"+pinnumber+"'");
            while(rs.next())
            {
                card.setText("Card Number: " + rs.getString("cardnumber").substring(0, 4) + "-XXXX-XXXX-" + rs.getString("cardnumber").substring(12));
                
                
            }
            
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        try
        {
            Conn conn = new Conn();
            int bal = 0;
            ResultSet rs = conn.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
            while(rs.next())
            {
                mini.setText(mini.getText() + "<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>");
                if(rs.getString("type").equals("Deposit"))
                    {
                       bal += Integer.parseInt(rs.getString("amount"));
                    }
                    else
                    {
                        bal -=Integer.parseInt(rs.getString("amount"));
                    }
            }
            balance.setText("Your current account balance is Rs " + bal);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        
        
        
        
        setSize(400,600);
        setLocation(20,20);
        getContentPane().setBackground(Color.white);
        setVisible(true);
    }
    public static void main(String Arg[])
    {
        new MiniStatement("");
    }
    
}
