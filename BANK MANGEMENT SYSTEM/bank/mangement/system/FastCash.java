package bank.mangement.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;//to import resultset
import java.util.Date;//compiler gets confused where to take date package from sql or util so we specifically write date 

import javax.swing.*;

public class FastCash extends JFrame implements ActionListener {

    JButton amount1,amount2,amount3,amount4,amount5,amount6,back;//define globally so that we can use in action performed 
    String pinnumber;
    FastCash(String pinnumber) {
        this.pinnumber = pinnumber;//to store local variable in global variable
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bank/mangement/system/icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);//to scale the image
        ImageIcon i3 = new ImageIcon(i2);//to convert into imageicon
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);//so that it start from origin
        add(image);

        JLabel text = new JLabel("SELECT WITHDRAWAL AMOUNT");
        text.setBounds(210,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);//to add the text above image

        amount1 = new JButton("Rs 100");
        amount1.setBounds(170,415,150,30);
        amount1.addActionListener(this);
        image.add(amount1);

        amount2 = new JButton("Rs 500");
        amount2.setBounds(355,415,150,30);
        amount2.addActionListener(this);
        image.add(amount2);

        amount3 = new JButton("Rs 1000");
        amount3.setBounds(170,450,150,30);
        amount3.addActionListener(this);
        image.add(amount3);

        amount4 = new JButton("Rs 2000");
        amount4.setBounds(355,450,150,30);
        amount4.addActionListener(this);
        image.add(amount4);

        amount5 = new JButton("Rs 5000");
        amount5.setBounds(170,485,150,30);
        amount5.addActionListener(this);
        image.add(amount5);

        amount6 = new JButton("Rs 10000");
        amount6.setBounds(355,485,150,30);
        amount6.addActionListener(this);
        image.add(amount6);

        back = new JButton("BACK");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);

        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);//to not see the top bar
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == back) {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        } else {
            String amount = ((JButton)ae.getSource()).getText().substring(3);//to get source of button,JButton to typecast,to get text,substring(3) to remove first 3 characters from Rs 500
            Conn c = new Conn();
            try {
                ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");// we are getting all values where it matches pinumber
                int balance = 0;
                while(rs.next()) {
                    if (rs.getString("type").equals("Deposit")) {
                        balance += Integer.parseInt(rs.getString("amount"));//because balance is integer
                    } else {
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }

                if (ae.getSource() != back && balance < Integer.parseInt(amount)) {
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");//if balance is less than than given amount
                    return;
                }

                Date date = new Date();
                String query = "insert into bank values('"+pinnumber+"', '"+date+"', 'withdrawal', '"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Debited Successfully");

                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String args[]) {
        new FastCash("");

    }
    
}
