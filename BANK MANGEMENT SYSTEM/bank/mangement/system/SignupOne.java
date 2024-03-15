package bank.mangement.system;

import java.awt.*;

import javax.swing.*;
import java.util.*;//to import random no.
import com.toedter.calendar.JDateChooser;//package for jar calendar file
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener {

    long random;//to make global variable
    JTextField nameTextField, fnameTextField, dobTextField, emailTextField, addressTextField, cityTextField, stateTextField, pinTextField;//to make global
    JButton next;
    JRadioButton male,female,other,married,unmarried;
    JDateChooser dateChooser;

    SignupOne() {

        setLayout(null);

        Random ran = new Random();//to make random object
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);//Math.abs to printe positive no,size of ran

        JLabel formno = new JLabel("APPLICATION FORM No. " + random);//to set unique no. formno and concatenate random
        formno.setFont(new Font("Raleway",Font.BOLD, 38));//to change font
        formno.setBounds(140, 20, 600, 40);//setbounds will not work untill setlayout is null
        add(formno);

        JLabel personalDetails = new JLabel("Page 1: Personal Details");//to set unique no. formno and concatenate random
        personalDetails.setFont(new Font("Raleway",Font.BOLD, 22));//to change font
        personalDetails.setBounds(290, 80, 400, 30);//setbounds will not work untill setlayout is null
        add(personalDetails);

        JLabel name = new JLabel("Name:");//to set unique no. formno and concatenate random
        name.setFont(new Font("Raleway",Font.BOLD, 20));//to change font
        name.setBounds(100, 140, 100, 30);//setbounds will not work untill setlayout is null
        add(name);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);

        JLabel fname = new JLabel("Father's Name:");//to set unique no. formno and concatenate random
        fname.setFont(new Font("Raleway",Font.BOLD, 20));//to change font
        fname.setBounds(100, 190, 200, 30);//setbounds will not work untill setlayout is null
        add(fname);

        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);

        JLabel dob = new JLabel("Date of Birth:");//to set unique no. formno and concatenate random
        dob.setFont(new Font("Raleway",Font.BOLD, 20));//to change font
        dob.setBounds(100, 240, 200, 30);//setbounds will not work untill setlayout is null
        add(dob);

        dateChooser = new JDateChooser();//to add calendar
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);
        

        JLabel gender = new JLabel("Gender:");//to set unique no. formno and concatenate random
        gender.setFont(new Font("Raleway",Font.BOLD, 20));//to change font
        gender.setBounds(100, 290, 200, 30);//setbounds will not work untill setlayout is null
        add(gender);

        male = new JRadioButton("Male");//to add radiobutton
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup gendergroup = new ButtonGroup();//to choose only one radio button at one instance
        gendergroup.add(male);
        gendergroup.add(female);


        JLabel email = new JLabel("Email Address:");//to set unique no. formno and concatenate random
        email.setFont(new Font("Raleway",Font.BOLD, 20));//to change font
        email.setBounds(100, 340, 200, 30);//setbounds will not work untill setlayout is null
        add(email);

        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);

        JLabel marital = new JLabel("Marital Status:");//to set unique no. formno and concatenate random
        marital.setFont(new Font("Raleway",Font.BOLD, 20));//to change font
        marital.setBounds(100, 390, 200, 30);//setbounds will not work untill setlayout is null
        add(marital);

        married = new JRadioButton("Married");//to add radiobutton
        married.setBounds(300,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

        other = new JRadioButton("Other");
        other.setBounds(630,390,100,30);
        other.setBackground(Color.WHITE);
        add(other);

        ButtonGroup maritalGroup = new ButtonGroup();//to choose only one radio button at one instance
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(other);

        JLabel address = new JLabel("Address:");//to set unique no. formno and concatenate random
        address.setFont(new Font("Raleway",Font.BOLD, 20));//to change font
        address.setBounds(100, 440, 200, 30);//setbounds will not work untill setlayout is null
        add(address);

        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);

        JLabel city = new JLabel("City:");//to set unique no. formno and concatenate random
        city.setFont(new Font("Raleway",Font.BOLD, 20));//to change font
        city.setBounds(100, 490, 200, 30);//setbounds will not work untill setlayout is null
        add(city);

        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);

        JLabel state = new JLabel("State:");//to set unique no. formno and concatenate random
        state.setFont(new Font("Raleway",Font.BOLD, 20));//to change font
        state.setBounds(100, 540, 200, 30);//setbounds will not work untill setlayout is null
        add(state);

        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);

        JLabel pincode = new JLabel("Pin Code:");//to set unique no. formno and concatenate random
        pincode.setFont(new Font("Raleway",Font.BOLD, 20));//to change font
        pincode.setBounds(100, 590, 200, 30);//setbounds will not work untill setlayout is null
        add(pincode);

        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway",Font.BOLD,14));
        pinTextField.setBounds(300,590,400,30);
        add(pinTextField);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);//color of frame

        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        String formno = "" + random;//to enter values in database,""+ to change long to string
        String name = nameTextField.getText();//to get values from text
        String fname = fnameTextField.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();//concat using Jtextfield
        String gender = null;
        if(male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        }

        String email = emailTextField.getText();
        String marital = null;
        if(married.isSelected()) {
            marital = "Married";
        } else if (unmarried.isSelected()) {
            marital = "Unmarried";
        } else if (other.isSelected()) {
            marital = "Other";
        }

        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pinTextField.getText();

        try {
            if(name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is Required");//to show popup using joption pane
            } else {
                Conn c = new Conn();//to establish connection
                String query =  "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";//to concatenate all
                c.s.executeUpdate(query);

                setVisible(false);//to open signup two
                new SignupTwo(formno).setVisible(true);//passing value of formno in signup two
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String args[]) {
        new SignupOne();

    }
}
