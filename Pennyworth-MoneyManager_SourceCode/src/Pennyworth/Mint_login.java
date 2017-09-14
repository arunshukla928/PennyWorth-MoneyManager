// THIS IS SIGNUP/LOGIN  FRAME  

package Pennyworth;

import java.util.regex.*;
import javax.swing.*;
import com.mongodb.*;
import java.net.UnknownHostException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.awt.EventQueue;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;



public class Mint_login extends javax.swing.JFrame {

    // STATIC VARIABLE 
    
      
      private Pattern pattern;
      private Matcher matcher;
      private static final String PASSWORD_PATTERN = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20})";
      
      
     int flag_firstname=0,flag_lastname=0,flag_email=0,flag_username=0,flag_password=0,flag_cpassword=0;
     int duplicate_email=0,duplicate_username=0,confirmPass=0,ID;
      
     static String fname,lname,email,username,password,cpassword;
     static String login_username,login_password;
          
    
    
    public Mint_login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        LoginTab = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        txtlname = new javax.swing.JTextField();
        UsernameSignUp = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        passwordSignUp = new javax.swing.JPasswordField();
        jLabel15 = new javax.swing.JLabel();
        btnsignup = new javax.swing.JButton();
        txtemailSignUp = new javax.swing.JTextField();
        ConfirmPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        btnlogin = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        LoginTab.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N

        jPanel3.setAutoscrolls(true);
        jPanel3.setLayout(null);

        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setBackground(new java.awt.Color(137, 232, 239));
        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel5.setText("Why you'll like it");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel6.setText("1) See all your accounts in one place");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel8.setText("2) Set a budget and pay down your debt");

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel9.setText("3) Find the best ways to grow your money");

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel10.setText("4) Stay safe and secure");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pennyworth/9784287.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel5))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel3))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jPanel3.add(jPanel5);
        jPanel5.setBounds(760, 30, 340, 410);

        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel4.setText("First Name\n");

        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel11.setText("Last Name");

        jLabel12.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel12.setText("Your Email");

        jLabel13.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel13.setText("Username");

        txtfname.setToolTipText("<html>\n\n<body color=\"red\"><b>ONLY APLAHABETS</body>\n</html>");
        txtfname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfnameFocusLost(evt);
            }
        });

        txtlname.setToolTipText("<html>\n\n<body color=\"green\"><b>ONLY APLAHABETS</body>\n</html>");
        txtlname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtlnameFocusLost(evt);
            }
        });

        UsernameSignUp.setToolTipText("<html>\n\n<body>\nEnter  UserName\n\n</body>\n\n</html>");
        UsernameSignUp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                UsernameSignUpFocusLost(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel14.setText("Password");

        passwordSignUp.setToolTipText("<html>\n<body>\n<b color=\"red\"/>*</b>Should Contain Aleast <b color=\"red\">One UpperCase,</b><b>Numbers,<b color=\"green\">Special Character \n<br>\n\n<b color=\"red\"/>*</b>Password should be<b color=\"red\">8</b> Characters Long\n\n</body>\n</html>");
        passwordSignUp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordSignUpFocusLost(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel15.setText("Confirm password");

        btnsignup.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnsignup.setText("SIGN UP");
        btnsignup.setToolTipText("Click to Sign Up !!!");
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });

        txtemailSignUp.setToolTipText("<html>\n<body> Enter Emailid : <b color=\"blue\">abc@gmail.com\n</body>\n</html>");
        txtemailSignUp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtemailSignUpFocusLost(evt);
            }
        });

        ConfirmPassword.setToolTipText("<html>\n\n<b color=\"green\">Confirm Password </b>\n</html>");
        ConfirmPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ConfirmPasswordFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UsernameSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtemailSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(btnsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtemailSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UsernameSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jPanel3.add(jPanel6);
        jPanel6.setBounds(50, 30, 570, 404);
        jPanel3.add(jLabel2);
        jLabel2.setBounds(12, 6, 0, 0);

        LoginTab.addTab("Sign Up", jPanel3);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, LoginTab, org.jdesktop.beansbinding.ELProperty.create("${background}"), jPanel4, org.jdesktop.beansbinding.BeanProperty.create("background"));
        bindingGroup.addBinding(binding);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel20.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel20.setText(" Username");

        txtusername.setToolTipText("Enter your user ID"); // NOI18N
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel21.setText("Password");

        txtpassword.setToolTipText("Enter your Password");

        btnlogin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnlogin.setText("LOGIN");
        btnlogin.setToolTipText("Click To Login \n");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(106, 106, 106)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtpassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnlogin)
                .addGap(31, 31, 31))
        );

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pennyworth/l2.png"))); // NOI18N

        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel17.setBackground(new java.awt.Color(137, 232, 239));
        jLabel17.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel17.setText("Why you'll like it");

        jLabel24.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel24.setText("1) See all your accounts in one place");

        jLabel26.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel26.setText("2) Set a budget and pay down your debt");

        jLabel27.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel27.setText("3) Find the best ways to grow your money");

        jLabel28.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel28.setText("4) Stay safe and secure");

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pennyworth/9784287.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel17))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel24))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel26))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel27))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel29))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel28)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addComponent(jLabel26)
                .addGap(18, 18, 18)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel16))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        LoginTab.addTab("Login", jPanel4);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pennyworth/products_icon_mutual_funds.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("cmmi10", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(188, 48, 159));
        jLabel7.setText("Pennyworth");

        jLabel19.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel19.setText("See all your accounts in one place");

        jLabel25.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel25.setText("Search for your bank, credit cards or investments");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addGap(98, 98, 98)
                        .addComponent(jLabel23)
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel25))
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(LoginTab))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel25)
                            .addGap(17, 17, 17))
                        .addComponent(jLabel23)))
                .addGap(18, 18, 18)
                .addComponent(LoginTab, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // FUNCTION : SIGNUP 
    
    
    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupActionPerformed
        
        username=UsernameSignUp.getText();
           
        try {
           
          MongoClient mongoClient = new MongoClient("localhost", 27017); // CREATING THE MONGO CLIENT OBJECT
          DB db = mongoClient.getDB("PENNYWORTH");        // Object to access the database
          
          // CHOOSING THE COLLECTION
          
            DBCollection coll = db.getCollection("PENNYWORTH_USERS");
            
            // APPENDING THE DOCUMENT VALUES
            ID=(int)(Math.random()*10000);
            
            BasicDBObject doc = new BasicDBObject("Customer_No",ID).
            append("FirstName", fname).
            append("LastName",lname).
            append("EmailId",email).
            append("UserName",username).
            append("Password", password);
            
            
           
                  
          BasicDBObject whereQuery_username = new BasicDBObject();
          whereQuery_username.put("UserName",username);
            
          DBCursor cursor_username = coll.find(whereQuery_username);
          
              
         
          while(cursor_username.hasNext()) {
          
              duplicate_username=1;
              cursor_username.next();
                      
              

          }
          
             if(duplicate_username==1){
                
                
               JOptionPane.showMessageDialog(rootPane,"UserName already Registered !!! Please Choose Another Username","Error",JOptionPane.ERROR_MESSAGE);
               txtusername.setText("");
               txtusername.requestFocus();
            }
            
            
         
          
          BasicDBObject whereQuery = new BasicDBObject();
          whereQuery.put("EmailId",email);
          
           DBCursor cursor = coll.find(whereQuery);
           
           
           
           
          while(cursor.hasNext()) {
          
              duplicate_email=1;
                 cursor.next();
            
              

          }
         
      
           
            if(duplicate_email==1){
                
               
                JOptionPane.showMessageDialog(rootPane,"Email Already Registered !!!","Error",JOptionPane.ERROR_MESSAGE);
                txtemailSignUp.setText("");            
            }
            
            
            
            
            // DOES NOT ALLOW TO ENTER DUPLICATE EMAIL AND USERNAME
            
       
            
            
        
      
         // USING JoptionPane
        if((duplicate_username==0) && (duplicate_email==0) && (confirmPass==1)){
                    coll.insert(doc);  // INSERTING THE DOCUMENT 
                JOptionPane.showMessageDialog(rootPane,"SUCESSFULLY ADDED"+"\n"+"CUSTOMER ID :"+ID);


                
           // ONLY ALLOWS ONE BANK TO ENTER      
                
           //  WILL ALLOW TO LINK ONE ACCOUNT AT THE TIME OF SIGNUP  
                
                new bankselect().setVisible(true);
                this.dispose();
            }
            
            
            
            
            
            mongoClient.close();
            
        } 
        
        
        
        catch (UnknownHostException ex) {
            Logger.getLogger(Mint_login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
        
        
        
 
      
      
        
        
        
        
        
    }//GEN-LAST:event_btnsignupActionPerformed

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

      
    
    // FUNCTION : FOR THE LOGIN 
    
    
    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
      
        
        int user=0,correctPass=0;
        
        login_username=txtusername.getText();
        login_password=txtpassword.getText();
        
        try{
            
        MongoClient mongoClient = new MongoClient("localhost", 27017); // CREATING THE MONGO CLIENT OBJECT
        DB db = mongoClient.getDB("PENNYWORTH");        // Object to access the database
          
        // CHOOSING THE COLLECTION
          
        DBCollection coll = db.getCollection("PENNYWORTH_USERS");
        
        // DEFINING CURSOR 
        
        
        // DEFINING OBJECT 
        
        DBObject validUser=new BasicDBObject("UserName",login_username);
      
        validUser.put("Password",login_password);
 
       
        DBCursor valid_user=coll.find(validUser);
        
         
        
        while(valid_user.hasNext()){
            
            
            valid_user.next();
            
            user=1;
            
                  
        }
        
        
      if(user==1){
          
         JOptionPane.showMessageDialog(rootPane,"SUCESSFULLY LOGGED IN !!!");
         
         // OPENING THE OPERATIONS FRAME 
         
         
         new OPERATIONS().setVisible(true);
         
         
         this.dispose();
      }
      
      else{
          
          JOptionPane.showMessageDialog(rootPane,"Username or Password is Incorrect !!!","Error",JOptionPane.ERROR_MESSAGE);
          txtpassword.setText("");
          txtpassword.requestFocus();
          
        
        }
        
      
        
      
    }//GEN-LAST:event_btnloginActionPerformed
 
    catch (UnknownHostException ex) {
            Logger.getLogger(Mint_login.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void txtfnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfnameFocusLost
          
        // 0 - incorrect First name 
        // 1 - Correct first name
        
        
        fname=txtfname.getText();
        
        if(validateFirstName(fname)){
            flag_firstname=1;
        }
        
        else{
            
            flag_firstname=0;

            JOptionPane.showMessageDialog(rootPane,"First Name Should Contain Only Alphabets","OOPS",JOptionPane.ERROR_MESSAGE);
            txtfname.setText("");
            txtfname.requestFocus();    // GETS THE FOCUS BACK TO TXTFNAME
        }
        
      
        
    }//GEN-LAST:event_txtfnameFocusLost

    private void txtlnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtlnameFocusLost
        

        // 0 - incorrect First name 
        // 1 - Correct first name
        
        
        lname=txtlname.getText();
        
        if(validateFirstName(lname)){
            flag_lastname=1;
        }
        
        else{
            
            flag_lastname=0;

            JOptionPane.showMessageDialog(rootPane,"Last Name Should Contain Only Alphabets","OOPS",JOptionPane.ERROR_MESSAGE);
            txtlname.setText("");
            txtlname.requestFocus();    // GETS THE FOCUS BACK TO TXTFNAME
        }
        
               
      
        
    }//GEN-LAST:event_txtlnameFocusLost

    
    
    
    private void txtemailSignUpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailSignUpFocusLost
        email=txtemailSignUp.getText();
        
        if(isValidEmailAddress(email)){
            
            flag_email=1;
        }
        else{
            

            flag_email=0;
            txtemailSignUp.setText("");
            txtemailSignUp.requestFocus();
            JOptionPane.showMessageDialog(rootPane,"Invalid Email Format","OOPS !!!",JOptionPane.ERROR_MESSAGE);
            
        }
        
        
       
         
    }//GEN-LAST:event_txtemailSignUpFocusLost

    private void passwordSignUpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordSignUpFocusLost
          
        password=passwordSignUp.getText();
        
        if(validatePassword(password)){
            
            flag_password=1;
            
        }
        
        else{
            
            flag_password=0;
            JOptionPane.showMessageDialog(rootPane,"Enter Password According to given norms","OOPS !!!",JOptionPane.ERROR_MESSAGE);
            passwordSignUp.setText("");
          
                    
        }
    }//GEN-LAST:event_passwordSignUpFocusLost

    private void ConfirmPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ConfirmPasswordFocusLost
        
        
         cpassword=ConfirmPassword.getText();
        
        if(password.equals(cpassword)){
            confirmPass=1;
        }
        else{
            confirmPass=0; 
            ConfirmPassword.setText("");
            JOptionPane.showMessageDialog(rootPane,"Password Does Not Match","Error",JOptionPane.ERROR_MESSAGE);

        
        }   
        
      
    }//GEN-LAST:event_ConfirmPasswordFocusLost

    private void UsernameSignUpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameSignUpFocusLost

    }//GEN-LAST:event_UsernameSignUpFocusLost

    
    
    
    // FUNCTION FOR VALIDATING PASSWORD 
    
    
    
    
     // PASSWORD NORMS : 
    
    // AT LEAST ONE DIGIT
    /// ONE SPECIA; CHARACTER 
    // AT LEAST 8 CHARACTERS 
    // at least one UpperCase
      
      
      public boolean validatePassword(final String passwd){


         String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{5,10}";
         return passwd.matches(pattern);
	 
      
      }
    
      
      
      
    // FUNCTION VALIDATE FIRST NAME 
    
    public static boolean validateFirstName( String firstName )
   {
      return firstName.matches( "[a-zA-Z]*" );  // ONLY ALPHABETS 
   } // end method validateFirstName
    
    // FUNCTION VALIDATE EMAIL ID
 
     public boolean isValidEmailAddress(String email) {
         
           String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
           java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
           java.util.regex.Matcher m = p.matcher(email);
           return m.matches();
    }
    

    
    
     
     
     
    
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     

    public static void main(String args[]) {
        
   
      
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mint_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mint_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mint_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mint_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mint_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ConfirmPassword;
    private javax.swing.JTabbedPane LoginTab;
    private javax.swing.JTextField UsernameSignUp;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnsignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPasswordField passwordSignUp;
    private javax.swing.JTextField txtemailSignUp;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtlname;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
