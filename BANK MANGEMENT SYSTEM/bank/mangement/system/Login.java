package bank.mangement.system;


import javax.swing.*;//import all packages
import java.awt.*;//import image package
import java.awt.event.*;//import action listener
import java.sql.*;//for Resultset package

public class Login extends JFrame implements ActionListener {

    JButton login,signup,clear;//to make global so that everyone can access
    JTextField cardTextField;
    JPasswordField pinTextField;

    Login() {
        setTitle("AUTOMATED TELLER MACHINE");//to create title 

        setLayout(null);//setting image layout as null

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bank/mangement/system/icons/logo.jpg"));//to give image
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);//to make the image smaller
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);//beacuse we cannot directly add image
        label.setBounds(70, 10, 100, 100);//to change image layout
        add(label);//putting the JLabel in frame

        JLabel text = new JLabel("Welcome to ATM");//adding content
        text.setFont(new Font("Osward",Font.BOLD, 38));//to set font size
        text.setBounds(200, 40, 400, 40);//text location
        add(text);
        
        JLabel cardno = new JLabel("Card No.");//adding content
        cardno.setFont(new Font("Raleway",Font.BOLD, 28));//to set font size
        cardno.setBounds(120, 150, 150, 30);//text location
        add(cardno);

        cardTextField = new JTextField();//to create textfield in front of CardNo.
        cardTextField.setBounds(300, 150, 230, 30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardTextField);


        JLabel pin = new JLabel("PIN");//adding content
        pin.setFont(new Font("Raleway",Font.BOLD, 28));//to set font size
        pin.setBounds(120, 220, 250, 30);//text location
        add(pin);

        pinTextField = new JPasswordField();//to create textfield in front of PIN
        pinTextField.setBounds(300, 220, 230, 30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinTextField);

        login = new JButton("SIGN IN");//to create SIGN IN button
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);//set background color
        login.setForeground(Color.WHITE);
        login.addActionListener(this);//to hear sound when we click button
        add(login);

        clear = new JButton("CLEAR");//to create CLEAR button
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);//set background color
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SIGN UP");//to create SIGN UP button
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);//set background color
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);

        getContentPane().setBackground(Color.WHITE);//setting background color

        setSize(800,480);//to create frame
        setVisible(true);//to see frame
        setLocation(350, 200);//to open at different loaction
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == clear){
            cardTextField.setText("");//beacuse if we type clear it will not contain any text
            pinTextField.setText("");
        }
        else if(ae.getSource() == login) {
            Conn conn = new Conn();//to establish connection
            String cardnumber = cardTextField.getText();//to get value from cardtextfield
            String pinnumber = pinTextField.getText();//it is showing mark beacuse it is a password text field,but it will work just fine
            String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"'";//we want to match table cardnumber in sql with string cardnumber we have taken and same process for pin
            try {
                ResultSet rs = conn.s.executeQuery(query);//because of ddl command we are using execute query and alse we are putting the data in resultset
                if(rs.next()) {
                    setVisible(false);//rs.next imply if data is there and it also implies that user has succesfuly captured data and after that we are closing the frame
                    new Transactions(pinnumber).setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin");//if  data doesnot match it will show this message
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        else if(ae.getSource() == signup) {
            setVisible(false);//to open signup frame
            new SignupOne().setVisible(true);//we have to set it beacuse it is by default false
        }
    }
    public static void main(String args[]) {
        new Login();//new object
    }
}