package bank.mangement.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {

    JTextField pan,aadhar;//to make global
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,category,occupation,education,income;
    String formno;

    SignupTwo(String formno) {
        this.formno = formno;
        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");//to set unique no. formno and concatenate random
        additionalDetails.setFont(new Font("Raleway",Font.BOLD, 22));//to change font
        additionalDetails.setBounds(290, 80, 400, 30);//setbounds will not work untill setlayout is null
        add(additionalDetails);

        JLabel name = new JLabel("Religion:");//to set unique no. formno and concatenate random
        name.setFont(new Font("Raleway",Font.BOLD, 20));//to change font
        name.setBounds(100, 140, 100, 30);//setbounds will not work untill setlayout is null
        add(name);
        
        String valReligion[] = {"Hindu","Muslim","Sikh","Christian","Other"};//values
        religion = new JComboBox(valReligion);//putting values 
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);

        JLabel cat = new JLabel("Category:");//to set unique no. formno and concatenate random
        cat.setFont(new Font("Raleway",Font.BOLD, 20));//to change font
        cat.setBounds(100, 190, 200, 30);//setbounds will not work untill setlayout is null
        add(cat);

        String valcategory[] = {"General","OBC","SC","ST","Other"};
        category = new JComboBox(valcategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);

        JLabel in = new JLabel("Income:");//to set unique no. formno and concatenate random
        in.setFont(new Font("Raleway",Font.BOLD, 20));//to change font
        in.setBounds(100, 240, 200, 30);//setbounds will not work untill setlayout is null
        add(in);

        String incomecategory[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
        income = new JComboBox(incomecategory);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
        
        JLabel ed = new JLabel("Educational");//to set unique no. formno and concatenate random
        ed.setFont(new Font("Raleway",Font.BOLD, 20));//to change font
        ed.setBounds(100, 290, 200, 30);//setbounds will not work untill setlayout is null
        add(ed);


        JLabel qu = new JLabel("Qualification:");//to set unique no. formno and concatenate random
        qu.setFont(new Font("Raleway",Font.BOLD, 20));//to change font
        qu.setBounds(100, 315, 200, 30);//setbounds will not work untill setlayout is null
        add(qu);

        String educationValues[] = {"Non-Graduation","Graduate","Post-Graduation","Doctrate","Others"};
        education = new JComboBox(educationValues);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
        add(education);

        JLabel occ = new JLabel("Occupation:");//to set unique no. formno and concatenate random
        occ.setFont(new Font("Raleway",Font.BOLD, 20));//to change font
        occ.setBounds(100, 390, 200, 30);//setbounds will not work untill setlayout is null
        add(occ);

        String occupationValues[] = {"Salaried","Self-Employed","Business","Student","Retired","Others"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);

        JLabel panno = new JLabel("PAN Number:");//to set unique no. formno and concatenate random
        panno.setFont(new Font("Raleway",Font.BOLD, 20));//to change font
        panno.setBounds(100, 440, 200, 30);//setbounds will not work untill setlayout is null
        add(panno);

        pan = new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300,440,400,30);
        add(pan);

        JLabel aadharno = new JLabel("Aadhar Number:");//to set unique no. formno and concatenate random
        aadharno.setFont(new Font("Raleway",Font.BOLD, 20));//to change font
        aadharno.setBounds(100, 490, 200, 30);//setbounds will not work untill setlayout is null
        add(aadharno);

        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);

        JLabel state = new JLabel("Senior Citizen:");//to set unique no. formno and concatenate random
        state.setFont(new Font("Raleway",Font.BOLD, 20));//to change font
        state.setBounds(100, 540, 200, 30);//setbounds will not work untill setlayout is null
        add(state);

        syes = new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup mar = new ButtonGroup();
        mar.add(syes);
        mar.add(sno);

        JLabel pincode = new JLabel("Existing Account:");//to set unique no. formno and concatenate random
        pincode.setFont(new Font("Raleway",Font.BOLD, 20));//to change font
        pincode.setBounds(100, 590, 200, 30);//setbounds will not work untill setlayout is null
        add(pincode);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup emar = new ButtonGroup();
        emar.add(eyes);
        emar.add(eno);

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
        String sreligion = (String) religion.getSelectedItem();//to get values from dropdown
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String seniorcitizen = null;
        if(syes.isSelected()) {
            seniorcitizen = "Yes";
        } else if (sno.isSelected()) {
            seniorcitizen = "No";
        }

        String existingaccount = null;
        if(eyes.isSelected()) {
            existingaccount = "Yes";
        } else if (eno.isSelected()) {
            existingaccount = "No";
        }
        String span = pan.getText();
        String saadhar = aadhar.getText();

        try {
            Conn c = new Conn();//to establish connection
            String query =  "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";//to concatenate all
            c.s.executeUpdate(query);

            //Signup3 Object
            setVisible(false);
            new SignupThree(formno).setVisible(true);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String args[]) {
        new SignupTwo("");

    }
}