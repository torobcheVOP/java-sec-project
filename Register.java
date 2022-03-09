package Login;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.*;
import java.util.regex.Pattern;

public class Register extends JFrame implements ActionListener {
    public static JFrame j1;
    public static JPasswordField Password_Field1;
    public static JTextField Username_Field1,Email_Field1;
    public static JLabel Username_lable1,Password_lable1,Email_lable1;
    public static JButton Register_Button1,Login_Button1;
    public  String userText1;
    public   String pwdText1;
    public   String emlText1;
    public static JFrame j ;
    public static JLabel Username_lable,Password_lable;
    public static JTextField Username_Field;
    public static JPasswordField Password_Field;
    public static JButton Login_Button,Registry_Button;
    public  String UserText;
    public   String PwdText;
    String regex;
    String U,P;
    String m;
Pattern pattern;
    public Register () {
        String regex = "^(.+)@(.+).com";

        pattern = Pattern.compile(regex);
        j1 = new JFrame();
        Scanner scanner = new Scanner(System.in);
         Username_lable1 = new JLabel("Username:");
         Username_Field1 = new JTextField();
         Password_lable1 = new JLabel("Password:");
         Password_Field1 = new JPasswordField();
         Email_lable1 = new JLabel("Email address:");
         Email_Field1 = new JTextField();
         Register_Button1 = new JButton("Register");
         Login_Button1 = new JButton("Login");
        j1.add(Username_lable1);
        j1.add(Username_Field1);
        j1.add(Password_lable1);
        j1.add(Password_Field1);
        j1.add(Register_Button1);
        j1.add(Login_Button1);
        j1.add(Email_lable1);
        j1.add(Email_Field1);
        Register_Button1.addActionListener(this);
        Login_Button1.addActionListener(this);
        j1.setSize(600, 500);
        Username_lable1.setBounds(50, 50, 100, 30);
        Username_Field1.setBounds(150, 50, 350, 30);
        Password_lable1.setBounds(50, 100, 100, 30);
        Password_Field1.setBounds(150, 100, 350, 30);
        Email_lable1.setBounds(50, 150, 100, 30);
        Email_Field1.setBounds(150, 150, 350, 30);
        Register_Button1.setBounds(50, 370, 100, 30);
        Login_Button1.setBounds(450, 370, 100, 30);
        j1.setLayout(null);
        j1.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //Coding Part of LOGIN button
        if (e.getSource() == Register_Button1) {

            userText1 = Username_Field1.getText();
            pwdText1 = Password_Field1.getText();
            emlText1= Email_Field1.getText();
        if (!userText1.isEmpty() && !pwdText1.isEmpty() &&!emlText1.isEmpty()) {
            if (pattern.matcher(emlText1).matches()) {
                JOptionPane.showMessageDialog(this, "Registration successful");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Wrong email ");

            }
       }
        else
        {
            JOptionPane.showMessageDialog(this, "Invalid Username or Password");

        }


        }
        else if(e.getSource()==Login_Button1)
        {
            userText1 = Username_Field1.getText();
            pwdText1 = Password_Field1.getText();
            emlText1= Email_Field1.getText();
            if(!userText1.isEmpty() && !pwdText1.isEmpty() &&!emlText1.isEmpty()) {
                if (pattern.matcher(emlText1).matches())
                {
                    Login(userText1, pwdText1);
                    j1.setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Wrong email ");
                }

            }
            else if(userText1.isEmpty() || pwdText1.isEmpty() || emlText1.isEmpty())
            {
                JOptionPane.showMessageDialog(this, "first fill the form");

            }
        }

        else if (e.getSource() == Login_Button) {

            UserText = Username_Field.getText();
            PwdText = Password_Field.getText();
            if(!UserText.isEmpty()||!PwdText.isEmpty()){
                if (UserText.contentEquals(U) && PwdText.contentEquals(P) ) {
                    JOptionPane.showMessageDialog(this, "Login successful");
                }
                else{
                    JOptionPane.showMessageDialog(this, "valid Username or Password");
                }
            }

        }
        else if(e.getSource()==Registry_Button)
        {
       Register register =new Register();

        }
    }



    public void Login(String user,String pass) {
        U=user;
        P=pass;
        Scanner scanner=new Scanner(System.in);
        j=new JFrame();
        Username_lable=new JLabel("Username:");
        Username_Field=new JTextField();
        Password_lable=new JLabel("Password:");
        Password_Field=new JPasswordField();
        Login_Button=new JButton("Login");
        Registry_Button=new JButton("Register");
        j.add(Username_lable);
        j.add(Username_Field);
        j.add(Password_lable);
        j.add(Password_Field);
        j.add(Login_Button);
        j.add(Registry_Button);
        Login_Button.addActionListener(this);
        Registry_Button.addActionListener(this);
        j.setSize(400,500);
        Username_lable.setBounds(50,50,100,30);
        Username_Field.setBounds(150,50,200,30);
        Password_lable.setBounds(50,100,100,30);
        Password_Field.setBounds(150,100,200,30);
        Login_Button.setBounds(50,370,100,30);
        Registry_Button.setBounds(250,370,100,30);
        j.setLayout(null);
        j.setVisible(true);

    }


    public static void main(String[] args) {
        Register login =new Register();
    }

}



