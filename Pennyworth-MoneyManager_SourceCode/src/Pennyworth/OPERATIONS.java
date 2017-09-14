package  Pennyworth;

import java.lang.Math.* ;
import com.mongodb.AggregationOutput;
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.sun.imageio.plugins.jpeg.JPEG;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.Document;
import java.util.Date;
import javax.swing.*;






public class OPERATIONS extends javax.swing.JFrame {

    
    static String Acc;
    static int k2=0;
    static double avBal=0;
    

    // CREDIT CARD VARIALBLES
     
     static  double currCredit=0,Maxlimit=0;
     static   String cardType;
     static int credit_count=0;
     static String[] CardNo=new String[10];
     static String[] CreditCard_DueDate=new String[10];
     static String[] ExpitationDate=new String[10];
     static int TotalCredits=0,TotalMaxLimit=0;
     
     
     
     
     
    // LOAN DETAILS 
      
     static String LoanType,LoanDueDate,LoanNo;
     static int LoanPaid,LoanEMI=0,LoanAmt,EMIRemaining;
     static double LoanRate,LoanTot=0;
     static int loans_count=0;
     static int TotalLoanPaid=0,TotalAmountRemaining=0,TotalLoanAmount=0;
     
      
    // CASH DETAILS  
     
     static String Cashinfo;
     static int CashVal;
     static int i=0,j=0;
     static int val=0;
     static int CashTot=0;
   
     
     // INvestementSUm
     
     static int  TotalInvestmentVal=0;
     static int  TotalMaturatityVal=0;
     
     
     // MUTULA FUND DETAILS
     
       static int FileNo;
       static int OriginalInvenstment;
       static double CurrentRate;
       static String InvestmentDate;
       static String MatuarityDate;
       static String Period;
       static String Scheme;
       static int MaturatityValue;

     // FIXED DEPOSIT 
       
       
       static int  FD_No;
       static int PrincipalAmt;
       static double InterestRate;
       static String FDInvestmentDate;
       static String FDMatuarityDate;
       static String FDPeriod;
       static int FDMaturatityValue;
       
     
       
     // PROPERTY DETAILS
       
    
      static String PropertyType,PropertyDesc;
      static int OriginalPropertyValue;
      static int CurrentPropertyValue;
      static int PropertyArea;
      static int PropertyCurrentRate;
      static String PropertyName;
      static String PropertyLocation;

       
     // transaction
     static String tdate=null,tdesc=null,tcategory=null;
     static double tamt;
     static int tno;
     static int  TotalTransaction=0;
     
     
     
     
     
    public OPERATIONS() {
        initComponents();
         reterive();  // THIS FUNCTION WILL RETERIVE ALL THE DETAILS
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jMenuItem1 = new javax.swing.JMenuItem();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel40 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        jTextField68 = new javax.swing.JTextField();
        jLabel101 = new javax.swing.JLabel();
        jTextField77 = new javax.swing.JTextField();
        jPanel45 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox();
        jProgressBar3 = new javax.swing.JProgressBar();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jComboBox16 = new javax.swing.JComboBox();
        jProgressBar8 = new javax.swing.JProgressBar();
        jTextField78 = new javax.swing.JTextField();
        jLabel103 = new javax.swing.JLabel();
        jTextField79 = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        jComboBox17 = new javax.swing.JComboBox();
        jProgressBar9 = new javax.swing.JProgressBar();
        jTextField80 = new javax.swing.JTextField();
        jLabel105 = new javax.swing.JLabel();
        jTextField81 = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        jComboBox18 = new javax.swing.JComboBox();
        jProgressBar10 = new javax.swing.JProgressBar();
        jTextField82 = new javax.swing.JTextField();
        jLabel107 = new javax.swing.JLabel();
        jTextField83 = new javax.swing.JTextField();
        jLabel108 = new javax.swing.JLabel();
        jComboBox19 = new javax.swing.JComboBox();
        jProgressBar11 = new javax.swing.JProgressBar();
        jTextField84 = new javax.swing.JTextField();
        jLabel109 = new javax.swing.JLabel();
        jTextField85 = new javax.swing.JTextField();
        btnAddBudget = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        OperationTabbedPane = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        lblDisplayName = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        lblNameofBank = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        lblAvailableBalance = new javax.swing.JLabel();
        lblAccountNo = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtTotalTransactionAmount = new javax.swing.JTextField();
        jPanel36 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        txtTransactionDesc1 = new javax.swing.JTextField();
        txtTransactionDesc2 = new javax.swing.JTextField();
        txtTransactionDesc3 = new javax.swing.JTextField();
        txtTransactionDesc4 = new javax.swing.JTextField();
        txtTransactionDesc5 = new javax.swing.JTextField();
        txtTransactionAmt1 = new javax.swing.JTextField();
        txtTransactionDate1 = new javax.swing.JTextField();
        txtTransactionDate2 = new javax.swing.JTextField();
        txtTransactionDate3 = new javax.swing.JTextField();
        txtTransactionDate4 = new javax.swing.JTextField();
        txtTransactionDate5 = new javax.swing.JTextField();
        CheckTransaction1 = new javax.swing.JCheckBox();
        CheckTransaction2 = new javax.swing.JCheckBox();
        CheckTransaction4 = new javax.swing.JCheckBox();
        CheckTransaction3 = new javax.swing.JCheckBox();
        CheckTransaction5 = new javax.swing.JCheckBox();
        btnAddTransaction = new javax.swing.JButton();
        btnTransactionReceipt = new javax.swing.JButton();
        txtTransactionCategory1 = new javax.swing.JTextField();
        txtTransactionCategory2 = new javax.swing.JTextField();
        txtTransactionCategory3 = new javax.swing.JTextField();
        txtTransactionCategory4 = new javax.swing.JTextField();
        txtTransactionCategory5 = new javax.swing.JTextField();
        txtTransactionAmt3 = new javax.swing.JTextField();
        txtTransactionAmt4 = new javax.swing.JTextField();
        txtTransactionAmt5 = new javax.swing.JTextField();
        txtTransactionAmt2 = new javax.swing.JTextField();
        jPanel47 = new javax.swing.JPanel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel13 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPropertyDesc = new javax.swing.JTextArea();
        jLabel77 = new javax.swing.JLabel();
        ComboProperty = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        txtPropertyValue = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnPropertyDetails = new javax.swing.JButton();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txtTotalPropertyValue = new javax.swing.JTextField();
        jPanel38 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        btnAddLoanNew = new javax.swing.JPanel();
        btnLoanDetails = new javax.swing.JButton();
        LoanComboBox1 = new javax.swing.JComboBox();
        LoanCombo2 = new javax.swing.JComboBox();
        LoanCombo3 = new javax.swing.JComboBox();
        LoanCombo4 = new javax.swing.JComboBox();
        LoanCombo5 = new javax.swing.JComboBox();
        LoanCheck1 = new javax.swing.JCheckBox();
        LoanCheck2 = new javax.swing.JCheckBox();
        LoanCheck3 = new javax.swing.JCheckBox();
        LoanCheck4 = new javax.swing.JCheckBox();
        LoanCheck5 = new javax.swing.JCheckBox();
        txtPaidAmount1 = new javax.swing.JTextField();
        txtPaidAmount2 = new javax.swing.JTextField();
        txtPaidAmount3 = new javax.swing.JTextField();
        txtTotalAmount1 = new javax.swing.JTextField();
        txtEMI3 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        txtLoanDueDate2 = new javax.swing.JTextField();
        txtLoanDueDate1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        txtEMI1 = new javax.swing.JTextField();
        txtEMI2 = new javax.swing.JTextField();
        txtTotalAmount2 = new javax.swing.JTextField();
        btnAddLoan = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        txtTotalAmount3 = new javax.swing.JTextField();
        txtLoanDueDate3 = new javax.swing.JTextField();
        txtPaidAmount4 = new javax.swing.JTextField();
        txtPaidAmount5 = new javax.swing.JTextField();
        txtEMI4 = new javax.swing.JTextField();
        txtEMI5 = new javax.swing.JTextField();
        txtTotalAmount4 = new javax.swing.JTextField();
        txtTotalAmount5 = new javax.swing.JTextField();
        txtLoanDueDate4 = new javax.swing.JTextField();
        txtLoanDueDate5 = new javax.swing.JTextField();
        btnLoanDetailsNew = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtTotalLoanPaid = new javax.swing.JTextField();
        txtTotalAmountRemaining = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtTotalLoanAmount = new javax.swing.JTextField();
        ProgressBarAmountRemaining = new javax.swing.JProgressBar();
        ProgressBarLoanPaid = new javax.swing.JProgressBar();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        CardCheck1 = new javax.swing.JCheckBox();
        ComboCreditType1 = new javax.swing.JComboBox();
        txtCurrentCredits1 = new javax.swing.JTextField();
        txtCurrentCredits2 = new javax.swing.JTextField();
        ComboCreditType2 = new javax.swing.JComboBox();
        CardCheck2 = new javax.swing.JCheckBox();
        CardCheck3 = new javax.swing.JCheckBox();
        ComboCreditType3 = new javax.swing.JComboBox();
        txtCurrentCredits3 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        txtMaxLimit3 = new javax.swing.JTextField();
        txtMaxLimit2 = new javax.swing.JTextField();
        txtMaxLimit1 = new javax.swing.JTextField();
        jTextField75 = new javax.swing.JTextField();
        txtDueDate1 = new javax.swing.JTextField();
        txtDueDate2 = new javax.swing.JTextField();
        txtMaxLimit5 = new javax.swing.JTextField();
        txtMaxLimit6 = new javax.swing.JTextField();
        txtDueDate3 = new javax.swing.JTextField();
        jLabel126 = new javax.swing.JLabel();
        btnCreditCardDetails = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        txtTotalCardCredits = new javax.swing.JTextField();
        txtTotalMaxLimit = new javax.swing.JTextField();
        ProgressBarTotalCurrentCredits = new javax.swing.JProgressBar();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        txtFixedValue = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        btnFixedDeposit = new javax.swing.JButton();
        ComboFixed = new javax.swing.JComboBox();
        btnAddFD = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        txtTotalInvestment = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTotalMatureValue = new javax.swing.JTextField();
        jPanel42 = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        btnMutualDetails = new javax.swing.JButton();
        txtMutualValue = new javax.swing.JTextField();
        ComboMutual = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jPanel44 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        btnAddCash = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        CashTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtTotalCash = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnHelp = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        btnShowVideo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        TimeDateLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        jMenu1.setText("jMenu1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        jToggleButton1.setText("jToggleButton1");

        jLabel100.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel100.setText("Budget Set ");

        jTextField68.setEditable(false);

        jLabel101.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel101.setText("Budget Acheived");

        jTextField77.setEditable(false);

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField68, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel101)
                                .addComponent(jTextField77, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLabel101)
                .addGap(18, 18, 18)
                .addComponent(jTextField68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jLabel21.setText("Budget");

        jTextField34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField34ActionPerformed(evt);
            }
        });

        jLabel23.setText("of");

        jLabel102.setText("Budget");

        jLabel103.setText("of");

        jTextField79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField79ActionPerformed(evt);
            }
        });

        jLabel104.setText("Budget");

        jLabel105.setText("of");

        jTextField81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField81ActionPerformed(evt);
            }
        });

        jLabel106.setText("Budget");

        jLabel107.setText("of");

        jTextField83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField83ActionPerformed(evt);
            }
        });

        jLabel108.setText("Budget");

        jLabel109.setText("of");

        jTextField85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField85ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar11, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addComponent(jLabel108)
                        .addGap(30, 30, 30)
                        .addComponent(jComboBox19, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)
                        .addComponent(jTextField84, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel109)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField85, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jProgressBar10, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addComponent(jLabel106)
                        .addGap(30, 30, 30)
                        .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)
                        .addComponent(jTextField82, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel107)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField83, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jProgressBar9, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addComponent(jLabel104)
                        .addGap(30, 30, 30)
                        .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)
                        .addComponent(jTextField80, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel105)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField81, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jProgressBar8, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addComponent(jLabel102)
                        .addGap(30, 30, 30)
                        .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)
                        .addComponent(jTextField78, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel103)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField79, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(30, 30, 30)
                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(150, 150, 150)
                        .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel102)
                    .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel103))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel104)
                    .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel105))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel106)
                    .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel107))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel108)
                    .addComponent(jComboBox19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel109))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        btnAddBudget.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnAddBudget.setText("Add Budget");

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pennyworth/budget.png"))); // NOI18N

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel49))
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGap(492, 492, 492)
                        .addComponent(btnAddBudget, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(2375, Short.MAX_VALUE))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel40Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel49)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddBudget)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 276, Short.MAX_VALUE)
        );

        jLabel1.setForeground(new java.awt.Color(244, 44, 44));
        jLabel1.setText("                                                             Keep All Your Accounts at one Place . Safe & Secured  ");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1558, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 703, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(727, Short.MAX_VALUE)
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 715, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(656, 656, 656)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        OperationTabbedPane.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N

        jLabel57.setFont(new java.awt.Font("DejaVu Serif", 1, 36)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 26, 17));
        jLabel57.setText("  WELCOME  TO PENNYWORTH");

        lblDisplayName.setFont(new java.awt.Font("Tlwg Typo", 1, 36)); // NOI18N
        lblDisplayName.setForeground(new java.awt.Color(8, 7, 3));

        jPanel23.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Account Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DejaVu Serif Condensed", 1, 18))); // NOI18N

        jLabel26.setFont(new java.awt.Font("UnGraphic", 1, 20)); // NOI18N
        jLabel26.setText(" Name of Bank");
        jLabel26.setToolTipText("");
        jLabel26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblNameofBank.setFont(new java.awt.Font("Ubuntu Light", 1, 20)); // NOI18N

        jLabel69.setFont(new java.awt.Font("UnGraphic", 1, 20)); // NOI18N
        jLabel69.setText("Available Balance");
        jLabel69.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblAvailableBalance.setFont(new java.awt.Font("Ubuntu Light", 1, 20)); // NOI18N

        lblAccountNo.setFont(new java.awt.Font("Ubuntu Light", 1, 20)); // NOI18N

        jLabel68.setFont(new java.awt.Font("UnGraphic", 1, 20)); // NOI18N
        jLabel68.setText("    Account No");
        jLabel68.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAvailableBalance, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(lblNameofBank, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAccountNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNameofBank, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel68, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAccountNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAvailableBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(612, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(lblDisplayName, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(2119, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDisplayName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        OperationTabbedPane.addTab("Overview", jPanel6);

        jPanel35.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel83.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel83.setText("Total Transaction Amount  ");

        txtTotalTransactionAmount.setEditable(false);
        txtTotalTransactionAmount.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        txtTotalTransactionAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(252, 11, 11)));
        txtTotalTransactionAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalTransactionAmountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalTransactionAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel83))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel83)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTotalTransactionAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        jLabel85.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel85.setText("Date");

        jLabel86.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel86.setText("Description");

        jLabel87.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel87.setText("Category");

        jLabel88.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel88.setText("Amount");

        txtTransactionDesc1.setEnabled(false);

        txtTransactionDesc2.setEnabled(false);

        txtTransactionDesc3.setEnabled(false);

        txtTransactionDesc4.setEnabled(false);
        txtTransactionDesc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTransactionDesc4ActionPerformed(evt);
            }
        });

        txtTransactionDesc5.setEnabled(false);

        txtTransactionAmt1.setEnabled(false);

        txtTransactionDate1.setEnabled(false);

        txtTransactionDate2.setEnabled(false);

        txtTransactionDate3.setEnabled(false);

        txtTransactionDate4.setEnabled(false);

        txtTransactionDate5.setEnabled(false);

        CheckTransaction1.setEnabled(false);
        CheckTransaction1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckTransaction1ActionPerformed(evt);
            }
        });

        CheckTransaction2.setEnabled(false);
        CheckTransaction2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckTransaction2ActionPerformed(evt);
            }
        });

        CheckTransaction4.setEnabled(false);
        CheckTransaction4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckTransaction4ActionPerformed(evt);
            }
        });

        CheckTransaction3.setEnabled(false);

        CheckTransaction5.setEnabled(false);
        CheckTransaction5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckTransaction5ActionPerformed(evt);
            }
        });

        btnAddTransaction.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnAddTransaction.setText("Add Transaction");
        btnAddTransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTransactionActionPerformed(evt);
            }
        });

        btnTransactionReceipt.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnTransactionReceipt.setText(" Transaction Receipt");
        btnTransactionReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransactionReceiptActionPerformed(evt);
            }
        });

        txtTransactionAmt3.setEnabled(false);
        txtTransactionAmt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTransactionAmt3ActionPerformed(evt);
            }
        });

        txtTransactionAmt4.setEnabled(false);
        txtTransactionAmt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTransactionAmt4ActionPerformed(evt);
            }
        });

        txtTransactionAmt5.setEnabled(false);
        txtTransactionAmt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTransactionAmt5ActionPerformed(evt);
            }
        });

        txtTransactionAmt2.setEnabled(false);
        txtTransactionAmt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTransactionAmt2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CheckTransaction1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CheckTransaction2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CheckTransaction3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CheckTransaction4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CheckTransaction5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTransactionDate2, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(txtTransactionDate1)
                            .addComponent(txtTransactionDate3)
                            .addComponent(txtTransactionDate4)
                            .addComponent(txtTransactionDate5)))
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel85)))
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTransactionDesc1)
                            .addComponent(txtTransactionDesc2)
                            .addComponent(txtTransactionDesc3)
                            .addComponent(txtTransactionDesc4)
                            .addComponent(txtTransactionDesc5, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel86)))
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel87)
                        .addGap(132, 132, 132)
                        .addComponent(jLabel88)
                        .addGap(414, 414, 414))
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel36Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTransactionCategory2, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                    .addComponent(txtTransactionCategory1)))
                            .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtTransactionCategory3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel36Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTransactionCategory5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTransactionCategory4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTransactionAmt1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTransactionAmt3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTransactionAmt4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTransactionAmt5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTransactionAmt2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(386, 386, 386))))
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(btnAddTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnTransactionReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel85)
                            .addComponent(jLabel88)
                            .addComponent(jLabel87))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel86)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(CheckTransaction5)
                        .addGroup(jPanel36Layout.createSequentialGroup()
                            .addComponent(txtTransactionDesc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtTransactionDesc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTransactionDesc3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTransactionCategory3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTransactionAmt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTransactionDesc4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTransactionCategory4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTransactionAmt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTransactionDesc5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTransactionDate5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTransactionCategory5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTransactionAmt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTransactionCategory1)
                            .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTransactionDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTransactionAmt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(CheckTransaction1)))
                        .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel36Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CheckTransaction2)
                                    .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtTransactionDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTransactionAmt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTransactionDate3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CheckTransaction3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTransactionDate4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CheckTransaction4, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtTransactionCategory2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(146, 146, 146)))))
                .addGap(20, 20, 20)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddTransaction)
                    .addComponent(btnTransactionReceipt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel47.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel47.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N

        jLabel127.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel127.setText("3 Simple Steps to ");

        jLabel128.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel128.setText(" Transition to a Cash  ");

        jLabel129.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel129.setText("1) Commit to Being Different");

        jLabel130.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel130.setText("2) Do a Budget Every Month");

        jLabel131.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel131.setText("3) Use the Envelope System");

        jLabel133.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel133.setText(" Only Lifestyle");

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel128)
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel127))
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel133)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel132))
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel131))
            .addComponent(jLabel129)
            .addComponent(jLabel130)
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel127)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel128)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel133)
                .addGap(66, 66, 66)
                .addComponent(jLabel129, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel132)
                .addGap(14, 14, 14)
                .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel131, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, 801, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(2176, Short.MAX_VALUE))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(749, Short.MAX_VALUE))
        );

        OperationTabbedPane.addTab("Transactions", jPanel34);

        jTabbedPane3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N

        jPanel28.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel76.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel76.setText("Property ");

        txtPropertyDesc.setColumns(20);
        txtPropertyDesc.setRows(5);
        jScrollPane1.setViewportView(txtPropertyDesc);

        jLabel77.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel77.setText("Description");

        ComboProperty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboPropertyActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel11.setText("Property Value");

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton1.setText("ADD PROPERTY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnPropertyDetails.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnPropertyDetails.setText("Get Details");
        btnPropertyDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPropertyDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jButton1)
                .addGap(53, 53, 53)
                .addComponent(btnPropertyDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel77)
                            .addComponent(jLabel76))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel73)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ComboProperty, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(txtPropertyValue, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(ComboProperty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1))
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel76)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel77)
                                .addGap(64, 64, 64)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPropertyValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(73, 73, 73)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnPropertyDetails))
                .addGap(28, 28, 28))
        );

        ComboProperty.getAccessibleContext().setAccessibleName("");
        ComboProperty.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton15.setText("Add Details");

        jPanel18.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel27.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel27.setText("Total Property Value ");

        txtTotalPropertyValue.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        txtTotalPropertyValue.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(246, 9, 9)));
        txtTotalPropertyValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalPropertyValueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(txtTotalPropertyValue, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addContainerGap(23, Short.MAX_VALUE)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addComponent(txtTotalPropertyValue, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jPanel38.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel38.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N

        jLabel51.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel51.setText("Three easy steps to get ");

        jLabel52.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel52.setText(" started with Mint");

        jLabel53.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel53.setText("1) Find your bank or credit card");

        jLabel54.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel54.setText("2) Connect it securely to Mint");

        jLabel55.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel55.setText("3) Let Mint do the rest");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53)
                    .addComponent(jLabel54)
                    .addComponent(jLabel55)))
            .addComponent(jLabel52)
            .addComponent(jLabel51)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel67))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel67)
                .addGap(27, 27, 27)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel52)
                .addGap(18, 18, 18)
                .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel125.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pennyworth/labnd.jpeg"))); // NOI18N

        jLabel123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pennyworth/choosing_home_small.png"))); // NOI18N

        jLabel124.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pennyworth/41469-200.png"))); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(878, 878, 878)
                                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel123)
                                        .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(524, 524, 524)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(521, 521, 521)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(281, 281, 281)
                                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(468, 468, 468)
                .addComponent(jButton15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Property", jPanel13);

        btnAddLoanNew.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnLoanDetails.setText("Get Loan Details");
        btnLoanDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoanDetailsActionPerformed(evt);
            }
        });

        LoanComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Loan Type", "Car Loan", "Home Loan", "Gold Loan", "Education Loan ", "Personal Loan", " " }));
        LoanComboBox1.setEnabled(false);
        LoanComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoanComboBox1ActionPerformed(evt);
            }
        });

        LoanCombo2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Loan Type", "Car Loan", "Home Loan", "Gold Loan", "Education Loan ", "Personal Loan" }));
        LoanCombo2.setEnabled(false);

        LoanCombo3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Loan Type", "Car Loan", "Home Loan", "Gold Loan", "Education Loan ", "Personal Loan", " " }));
        LoanCombo3.setEnabled(false);

        LoanCombo4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Loan Type", "Car Loan", "Home Loan", "Gold Loan", "Education Loan ", "Personal Loan" }));
        LoanCombo4.setEnabled(false);

        LoanCombo5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Loan Type", "Car Loan", "Home Loan", "Gold Loan", "Education Loan ", "Personal Loan" }));
        LoanCombo5.setEnabled(false);

        LoanCheck1.setEnabled(false);
        LoanCheck1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoanCheck1ActionPerformed(evt);
            }
        });

        LoanCheck2.setEnabled(false);
        LoanCheck2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoanCheck2ActionPerformed(evt);
            }
        });

        LoanCheck3.setEnabled(false);

        LoanCheck4.setEnabled(false);

        LoanCheck5.setEnabled(false);
        LoanCheck5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoanCheck5ActionPerformed(evt);
            }
        });

        txtPaidAmount1.setEnabled(false);

        txtPaidAmount2.setEnabled(false);

        txtPaidAmount3.setEnabled(false);

        txtTotalAmount1.setEnabled(false);

        txtEMI3.setEnabled(false);

        jTextField22.setEnabled(false);

        txtLoanDueDate2.setEnabled(false);

        txtLoanDueDate1.setEnabled(false);

        jLabel14.setText("Paid Amount");

        jLabel15.setText("Total Amount");

        jLabel16.setText("Due Date");

        jLabel58.setText("       EMI ");

        txtEMI1.setEnabled(false);

        txtEMI2.setEnabled(false);

        txtTotalAmount2.setEnabled(false);

        btnAddLoan.setText("Add Loan");
        btnAddLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddLoanActionPerformed(evt);
            }
        });

        jLabel50.setText("Loan Type");

        txtTotalAmount3.setEnabled(false);

        txtLoanDueDate3.setEnabled(false);

        txtPaidAmount4.setEnabled(false);

        txtPaidAmount5.setEnabled(false);

        txtEMI4.setEnabled(false);

        txtEMI5.setEnabled(false);

        txtTotalAmount4.setEnabled(false);

        txtTotalAmount5.setEnabled(false);

        txtLoanDueDate4.setEnabled(false);

        txtLoanDueDate5.setEnabled(false);

        btnLoanDetailsNew.setText("Loan Details");
        btnLoanDetailsNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoanDetailsNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btnAddLoanNewLayout = new javax.swing.GroupLayout(btnAddLoanNew);
        btnAddLoanNew.setLayout(btnAddLoanNewLayout);
        btnAddLoanNewLayout.setHorizontalGroup(
            btnAddLoanNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAddLoanNewLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(btnAddLoanNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(btnAddLoanNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LoanCheck1)
                        .addComponent(LoanCheck2)
                        .addComponent(LoanCheck3))
                    .addComponent(LoanCheck4)
                    .addComponent(LoanCheck5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(btnAddLoanNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(btnAddLoanNewLayout.createSequentialGroup()
                        .addComponent(LoanCombo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPaidAmount5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(btnAddLoanNewLayout.createSequentialGroup()
                        .addComponent(LoanCombo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPaidAmount4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(btnAddLoanNewLayout.createSequentialGroup()
                        .addComponent(LoanCombo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPaidAmount3))
                    .addGroup(btnAddLoanNewLayout.createSequentialGroup()
                        .addComponent(LoanCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPaidAmount2))
                    .addGroup(btnAddLoanNewLayout.createSequentialGroup()
                        .addGroup(btnAddLoanNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LoanComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(btnAddLoanNewLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(btnAddLoanNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPaidAmount1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAddLoanNewLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(14, 14, 14)))))
                .addGroup(btnAddLoanNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnAddLoanNewLayout.createSequentialGroup()
                        .addGroup(btnAddLoanNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(btnAddLoanNewLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(btnAddLoanNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAddLoanNewLayout.createSequentialGroup()
                                        .addComponent(jLabel58)
                                        .addGap(39, 39, 39))
                                    .addComponent(txtEMI1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAddLoanNewLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(btnAddLoanNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEMI3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEMI4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEMI5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(btnAddLoanNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(btnAddLoanNewLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAddLoanNewLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtTotalAmount1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(btnAddLoanNewLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(btnAddLoanNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTotalAmount3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotalAmount4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotalAmount5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(btnAddLoanNewLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEMI2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotalAmount2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(btnAddLoanNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtLoanDueDate2)
                    .addComponent(txtLoanDueDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(btnAddLoanNewLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtLoanDueDate3)
                    .addComponent(txtLoanDueDate4)
                    .addComponent(txtLoanDueDate5))
                .addGap(28, 28, 28))
            .addGroup(btnAddLoanNewLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(btnAddLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(btnAddLoanNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnAddLoanNewLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btnLoanDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(btnAddLoanNewLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnLoanDetailsNew, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnAddLoanNewLayout.setVerticalGroup(
            btnAddLoanNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAddLoanNewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(btnAddLoanNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel58)
                    .addComponent(jLabel50))
                .addGap(18, 18, 18)
                .addGroup(btnAddLoanNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnAddLoanNewLayout.createSequentialGroup()
                        .addComponent(txtLoanDueDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtLoanDueDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtLoanDueDate3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtLoanDueDate4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtLoanDueDate5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(btnAddLoanNewLayout.createSequentialGroup()
                        .addGroup(btnAddLoanNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(btnAddLoanNewLayout.createSequentialGroup()
                                .addGroup(btnAddLoanNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTotalAmount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEMI1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66)
                                .addGroup(btnAddLoanNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtEMI3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotalAmount3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(btnAddLoanNewLayout.createSequentialGroup()
                                .addGroup(btnAddLoanNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LoanComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LoanCheck1)
                                    .addComponent(txtPaidAmount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(btnAddLoanNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LoanCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LoanCheck2)
                                    .addComponent(txtPaidAmount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEMI2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotalAmount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(btnAddLoanNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LoanCombo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LoanCheck3)
                                    .addComponent(txtPaidAmount3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(btnAddLoanNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LoanCheck4)
                                    .addComponent(LoanCombo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPaidAmount4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEMI4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotalAmount4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(btnAddLoanNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(btnAddLoanNewLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(btnAddLoanNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(LoanCombo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LoanCheck5)))
                                    .addGroup(btnAddLoanNewLayout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(btnAddLoanNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtPaidAmount5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEMI5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTotalAmount5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(37, 37, 37)
                        .addComponent(btnLoanDetailsNew)
                        .addGap(226, 226, 226)
                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(btnAddLoanNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoanDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddLoan))
                .addGap(42, 42, 42))
        );

        jPanel14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel17.setText("Loan Amount Paid ");

        jLabel18.setText("Total Amount Remaining ");

        txtTotalLoanPaid.setEditable(false);
        txtTotalLoanPaid.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N

        txtTotalAmountRemaining.setEditable(false);
        txtTotalAmountRemaining.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        txtTotalAmountRemaining.setForeground(new java.awt.Color(42, 225, 20));
        txtTotalAmountRemaining.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalAmountRemainingActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel19.setText("Total Loan Amount");

        txtTotalLoanAmount.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        txtTotalLoanAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(246, 9, 9)));
        txtTotalLoanAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalLoanAmountActionPerformed(evt);
            }
        });

        ProgressBarLoanPaid.setForeground(new java.awt.Color(9, 254, 96));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ProgressBarAmountRemaining, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTotalAmountRemaining, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                .addComponent(jLabel18)
                                .addComponent(txtTotalLoanPaid)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(txtTotalLoanAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(ProgressBarLoanPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel19)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalLoanPaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ProgressBarLoanPaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotalAmountRemaining, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ProgressBarAmountRemaining, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTotalLoanAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pennyworth/415.png"))); // NOI18N

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pennyworth/car2.png"))); // NOI18N

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pennyworth/home-loan.png"))); // NOI18N

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pennyworth/graduation.png"))); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnAddLoanNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48))
                .addContainerGap(2210, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddLoanNew, javax.swing.GroupLayout.PREFERRED_SIZE, 443, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Loans", jPanel11);

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        CardCheck1.setEnabled(false);
        CardCheck1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CardCheck1ActionPerformed(evt);
            }
        });

        ComboCreditType1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "VISA", "MASTER CARD", "RU-PAL", "MASTERO", " " }));
        ComboCreditType1.setEnabled(false);
        ComboCreditType1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCreditType1ActionPerformed(evt);
            }
        });

        txtCurrentCredits1.setEnabled(false);

        txtCurrentCredits2.setEnabled(false);

        ComboCreditType2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "VISA", "MASTER CARD", "RU-PAL", "MASTERO" }));
        ComboCreditType2.setEnabled(false);

        CardCheck2.setEnabled(false);
        CardCheck2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CardCheck2ActionPerformed(evt);
            }
        });

        CardCheck3.setEnabled(false);

        ComboCreditType3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "VISA", "MASTER CARD", "RU-PAL", "MASTERO" }));
        ComboCreditType3.setEnabled(false);

        txtCurrentCredits3.setEnabled(false);

        jTextField7.setEnabled(false);

        jTextField8.setEnabled(false);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "VISA", "MASTER CARD", "RU-PAL", "MASTERO" }));
        jComboBox5.setEnabled(false);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "VISA", "MASTER CARD", "RU-PAL", "MASTERO" }));
        jComboBox4.setEnabled(false);

        jCheckBox4.setEnabled(false);

        jCheckBox5.setEnabled(false);
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel35.setText("Card Type");

        jLabel36.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel36.setText("Current credits");

        jLabel74.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel74.setText("Maximum Limit");

        jTextField12.setEnabled(false);

        txtMaxLimit3.setEnabled(false);

        txtMaxLimit2.setEnabled(false);

        txtMaxLimit1.setEnabled(false);

        jTextField75.setEnabled(false);

        txtDueDate1.setEnabled(false);

        txtDueDate2.setEnabled(false);

        txtMaxLimit5.setEnabled(false);

        txtMaxLimit6.setEnabled(false);

        txtDueDate3.setEnabled(false);

        jLabel126.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel126.setText("Due Date");

        btnCreditCardDetails.setText("Credit Card Details");
        btnCreditCardDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditCardDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CardCheck1)
                                .addComponent(CardCheck2)
                                .addComponent(CardCheck3))
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField8))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField7))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(ComboCreditType3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCurrentCredits3))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(ComboCreditType2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCurrentCredits2))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComboCreditType1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel22Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel22Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCurrentCredits1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel22Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel36)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField12)
                            .addComponent(txtMaxLimit3)
                            .addComponent(txtMaxLimit2)
                            .addComponent(txtMaxLimit1)
                            .addComponent(jTextField75)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(btnCreditCardDetails)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDueDate1)
                    .addComponent(txtDueDate2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMaxLimit6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMaxLimit5)
                    .addComponent(txtDueDate3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboCreditType1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CardCheck1)
                    .addComponent(txtCurrentCredits1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaxLimit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDueDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboCreditType2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CardCheck2)
                    .addComponent(txtCurrentCredits2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaxLimit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDueDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboCreditType3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CardCheck3)
                    .addComponent(txtCurrentCredits3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaxLimit3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDueDate3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox4)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaxLimit5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox5)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaxLimit6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btnCreditCardDetails))
        );

        jPanel26.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel37.setText("Total Current Credits");

        jLabel38.setText("Total Card Limit");

        txtTotalCardCredits.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        txtTotalCardCredits.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(246, 9, 9)));
        txtTotalCardCredits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalCardCreditsActionPerformed(evt);
            }
        });

        txtTotalMaxLimit.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        txtTotalMaxLimit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(246, 9, 9)));
        txtTotalMaxLimit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalMaxLimitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTotalCardCredits, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37)))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel26Layout.createSequentialGroup()
                                .addComponent(txtTotalMaxLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel38)
                            .addComponent(ProgressBarTotalCurrentCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel37)
                .addGap(30, 30, 30)
                .addComponent(txtTotalCardCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ProgressBarTotalCurrentCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel38)
                .addGap(34, 34, 34)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalMaxLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pennyworth/Credit_Card.png"))); // NOI18N

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pennyworth/rupay.png"))); // NOI18N

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pennyworth/Maestro.png"))); // NOI18N

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pennyworth/Paypal.png"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel28)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Credit cards", jPanel10);

        jLabel59.setText("jLabel59");

        jLabel65.setText("Fixed Deposite");

        jLabel70.setText("FD Value");

        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pennyworth/icon_step3.png"))); // NOI18N

        btnFixedDeposit.setText("Details");
        btnFixedDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFixedDepositActionPerformed(evt);
            }
        });

        btnAddFD.setText("Add New Fixed Deposit");
        btnAddFD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel64)
                .addGap(35, 35, 35)
                .addComponent(jLabel97)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel65)
                            .addComponent(jLabel70))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ComboFixed, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFixedValue, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(76, Short.MAX_VALUE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddFD, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFixedDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel97))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel98)
                            .addGroup(jPanel25Layout.createSequentialGroup()
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel65)
                                    .addComponent(ComboFixed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel70)
                                    .addComponent(txtFixedValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnFixedDeposit)
                                    .addComponent(btnAddFD))))))
                .addGap(128, 128, 128))
        );

        jLabel71.setText("Fixed Deposite");

        jLabel72.setText("FD  Value");

        jTextField36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField36ActionPerformed(evt);
            }
        });

        jButton14.setText("Details");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel71)
                            .addComponent(jLabel72))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(jButton14)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jButton14))
        );

        jPanel21.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel21.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N

        jLabel39.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel39.setText("Three easy steps to get ");

        jLabel40.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel40.setText(" started with Mint");

        jLabel41.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel41.setText("1) Find your bank or credit card");

        jLabel42.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel42.setText("2) Connect it securely to Mint");

        jLabel43.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel43.setText("3) Let Mint do the rest");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43)))
            .addComponent(jLabel40)
            .addComponent(jLabel39)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel44))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44)
                .addGap(27, 27, 27)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40)
                .addGap(18, 18, 18)
                .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel34.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel34.setText("Total Investment Amount ");

        txtTotalInvestment.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        txtTotalInvestment.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(246, 9, 9)));
        txtTotalInvestment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalInvestmentActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel3.setText("Total Matauring Amount");

        txtTotalMatureValue.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        txtTotalMatureValue.setForeground(new java.awt.Color(86, 211, 26));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTotalInvestment, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalMatureValue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel34)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel34)
                .addGap(26, 26, 26)
                .addComponent(txtTotalInvestment, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtTotalMatureValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jLabel94.setText("Mutual Fund");

        jLabel95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pennyworth/products_icon_mutual_funds.png"))); // NOI18N

        jLabel96.setText("Value");

        btnMutualDetails.setText("Details");
        btnMutualDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMutualDetailsActionPerformed(evt);
            }
        });

        jButton3.setText("Add New Mutual Fund");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jLabel93)
                        .addGap(312, 312, 312)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ComboMutual, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMutualValue, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel96)
                                    .addComponent(jLabel94)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMutualDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel93, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel94)
                            .addComponent(ComboMutual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel96)
                            .addComponent(txtMutualValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel42Layout.createSequentialGroup()
                                .addComponent(btnMutualDetails)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        jPanel44.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel44.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N

        jLabel60.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel60.setText(" 3 Simple Steps To  ");

        jLabel66.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel66.setText(" Building Wealth ");

        jLabel99.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel99.setText("1) You need to make it");

        jLabel120.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel120.setText("2) You need to save it");

        jLabel121.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel121.setText("3) You need to invest it");

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel99)
                            .addComponent(jLabel120)
                            .addComponent(jLabel121)))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel122))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel60)
                            .addComponent(jLabel66))))
                .addGap(140, 140, 140))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel122)
                .addGap(27, 27, 27)
                .addComponent(jLabel60)
                .addGap(12, 12, 12)
                .addComponent(jLabel66)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel99, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel121, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel59))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(256, 256, 256)
                                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1566, 1566, 1566)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(414, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(282, 282, 282)
                        .addComponent(jLabel59))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(999, 999, 999)
                        .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Investments", jPanel12);

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAddCash.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        btnAddCash.setText("Add Cash Amount");
        btnAddCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCashActionPerformed(evt);
            }
        });

        CashTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CashTable.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        CashTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "        Cash", "     Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CashTable.setToolTipText("");
        CashTable.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(CashTable);
        CashTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("DejaVu Serif", 1, 18)); // NOI18N
        jLabel4.setText("Total Cash Amount");

        txtTotalCash.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        txtTotalCash.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(246, 9, 9)));
        txtTotalCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalCashActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtTotalCash)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(txtTotalCash, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jPanel15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel15.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel5.setText("The three key elements");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel8.setText(" your cash flow analysis");

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel9.setText("1) Accounts receivable");

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel10.setText("2) Accounts payable");

        jLabel12.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel12.setText("3) Shortfalls");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel13))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel15Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(38, 38, 38)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pennyworth/Wallet-128.png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(jLabel33)))
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAddCash, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(232, 232, 232)))
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnAddCash))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Cash", jPanel9);

        OperationTabbedPane.addTab("Accounts", jTabbedPane3);

        jLabel24.setFont(new java.awt.Font("cmmi10", 1, 48)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(188, 48, 159));
        jLabel24.setText("Pennyworth");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel6.setText("See all your accounts in one place");

        jLabel20.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel20.setText("Search for your bank, credit cards or investments");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnHelp.setText("Get Help");
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        btnShowVideo.setText("Take A Tour");
        btnShowVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowVideoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnShowVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHelp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnShowVideo)
                    .addComponent(btnHelp)
                    .addComponent(btnLogOut))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pennyworth/products_icon_mutual_funds.png"))); // NOI18N

        TimeDateLabel.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel84)
                .addGap(1012, 1012, 1012)
                .addComponent(jLabel7)
                .addContainerGap(2496, Short.MAX_VALUE))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel116)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(jLabel20)
                        .addContainerGap(2899, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jLabel24)))
                        .addGap(146, 146, 146)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TimeDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(3004, Short.MAX_VALUE))
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel16Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel22)
                    .addContainerGap(3219, Short.MAX_VALUE)))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TimeDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel84)
                    .addComponent(jLabel7))
                .addGap(58, 58, 58))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel16Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(112, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OperationTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OperationTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3567, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(744, 744, 744)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 921, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
        
// RETERIVE FUNCTION   GETS CALLED TO RELOAD CONTENTS 
    
    public  static void reterive(){
        
        
        
      
        
        try{
            
            MongoClient mongoClient = new MongoClient("localhost", 27017);  // CREATING THE MONGO CLIENT OBJECT
            DB db = mongoClient.getDB("PENNYWORTH");                        // Object to access the database
            
            DBCollection coll_bank = db.getCollection("PENNYWORTH_BANKS");
            DBCollection coll = db.getCollection("PENNYWORTH_USERS");
             
            DBObject find_obj=new BasicDBObject("UserName",Mint_login.login_username);
            DBCursor findQuery = coll.find(find_obj);
              
              
            DBObject result=new BasicDBObject();
              
            result=findQuery.next();
            
            
            DBObject outer=(BasicDBObject)result.get("BankDetails");

            
            
   
            
   // STEP 1 : GETTING THE ACCOUNT NO         
            
            Acc=(String)outer.get("AccountNo");
            
            System.out.println(""+Acc);
            
            
           
             
            
   // STEP 2 : LINKING THE CREDIT CARD         
            
            
           
            
   
   
            DBObject user_bank1=new BasicDBObject("AccountNo",OPERATIONS.Acc);
            DBCursor finder_credit1=coll_bank.find(user_bank1);
            
            
            
            
            DBObject o=finder_credit1.next();
            
            String nameofbank;
            nameofbank=(String)o.get("BankName");
            lblNameofBank.setText(nameofbank);
            lblAccountNo.setText(OPERATIONS.Acc);
            lblAvailableBalance.setText(""+o.get("AvailableBalance"));
            lblDisplayName.setText(""+o.get("AccountHolder"));
   
             
               
            DBObject user_bank=new BasicDBObject("AccountNo",OPERATIONS.Acc);
            DBCursor finder_credit=coll_bank.find(user_bank);
            
           while(finder_credit.hasNext()){
               
               
                 credit_count=0;
                
                BasicDBObject e=(BasicDBObject) finder_credit.next();
                
         
                avBal=e.getDouble("AvailableBalance");
                lblAvailableBalance.setText(""+avBal);
                        
                
                
                BasicDBList resq=(BasicDBList)e.get("CreditCard");
                
                for(Object obj : resq){ 
                
                currCredit=((BasicDBObject)obj).getInt("CurrentCredits");
                Maxlimit=((BasicDBObject)obj).getInt("MaxLimit");
                cardType = ((BasicDBObject)obj).getString("CardType");
                
                CardNo[credit_count]=((BasicDBObject)obj).getString("CardNo");
                CreditCard_DueDate[credit_count]=((BasicDBObject)obj).getString("DueDate");
                ExpitationDate[credit_count]=((BasicDBObject)obj).getString("ExpirationDate");
            
                
                
                
                // IF ELSE CONDITIONS 
                
                if(credit_count==0){
                    
                    if(cardType.equals("VISA")){
                        ComboCreditType1.setSelectedIndex(0);
                        ComboCreditType1.setEnabled(false);
                        ComboCreditType1.setEditable(false);
                    }
                   
                    else if(cardType.equals("MASTER CARD")){
                        ComboCreditType1.setSelectedIndex(1);
                        ComboCreditType1.setEnabled(false);
                        ComboCreditType1.setEditable(false);
                    }
                    else if(cardType.equals("RuPal")){
                        ComboCreditType1.setSelectedIndex(2);
                        ComboCreditType1.setEnabled(false);
                        ComboCreditType1.setEditable(false);
                    }
                    else if(cardType.equals("MASESTRO")){
                        ComboCreditType1.setSelectedIndex(3);
                        ComboCreditType1.setEnabled(false);
                        ComboCreditType1.setEditable(false);
                        
                               
                    }
                    
                    
                    txtCurrentCredits1.setText("\t"+currCredit);
                    txtCurrentCredits1.setEnabled(true);
                    txtCurrentCredits1.setEditable(false);
                    
                    
                    
                    txtMaxLimit1.setText("\t"+Maxlimit);
                    txtMaxLimit1.setEnabled(true);
                    txtMaxLimit1.setEditable(false);
                    
                    
                    txtDueDate1.setText(CreditCard_DueDate[credit_count]);
                    txtDueDate1.setEditable(false);
                    txtDueDate1.setEnabled(true);
                    
                    
                    CardCheck1.setEnabled(true);
                    
                    
                    
                    
                    
                }
                
                  if(credit_count==1){
                    
                    if(cardType.equals("VISA")){
                        ComboCreditType2.setSelectedIndex(0);
                        ComboCreditType2.setEnabled(false);
                        ComboCreditType2.setEditable(false);
                    }
                   
                    else if(cardType.equals("MASTER CARD")){
                        ComboCreditType2.setSelectedIndex(1);
                        ComboCreditType2.setEnabled(false);
                        ComboCreditType2.setEditable(false);
                        ComboCreditType1.disable();
                    }
                    else if(cardType.equals("RuPal")){
                        ComboCreditType2.setSelectedIndex(2);
                        ComboCreditType2.setEnabled(false);
                        ComboCreditType2.setEditable(false);
                    }
                    else if(cardType.equals("MASESTRO")){
                        ComboCreditType2.setSelectedIndex(3);
                        ComboCreditType2.setEnabled(false);
                        ComboCreditType2.setEditable(false);
                    }
                    
                    
                    txtCurrentCredits2.setText("\t"+currCredit);
                    txtCurrentCredits2.setEnabled(true);
                    txtCurrentCredits2.setEditable(false);
                    
                    
                    
                    txtMaxLimit2.setText("\t"+Maxlimit);
                    txtMaxLimit2.setEnabled(true);
                    txtMaxLimit2.setEditable(false);
                    
                    
                    txtDueDate2.setText(CreditCard_DueDate[credit_count]);
                    txtDueDate2.setEditable(false);
                    txtDueDate2.setEnabled(true);
                    
                    
                    CardCheck2.setEnabled(true);
                    
                    
                    
                    
                    
                }
                
                
                
                
                
               credit_count++;
                
               } // end of inner loop
      
                
            }
                
           
           
              
    // STEP 3 : RETERIVING THE CASH VALUES 
           
           
             String cashDesc=null;
             int cashVal=0;
           
             DBObject user_Cash=new BasicDBObject("UserName",Mint_login.login_username);
          
           
              DBCursor finder_Cash=coll.find(user_Cash);
            
            
                while(finder_Cash.hasNext()){
                
                BasicDBObject e2=(BasicDBObject)finder_Cash.next();
                
                BasicDBList resq2=(BasicDBList)e2.get("Cash_Info");
                
                
             try{   
                     for(Object obj2 : resq2){ 
                
               cashDesc=(String)((BasicDBObject)obj2).get("Cash_Description");
               cashVal=((BasicDBObject)obj2).getInt("Cash_Amount");
               
               
                Object[] insert_row={cashDesc,cashVal}; 
               
               CashTable.getModel().setValueAt(cashDesc,i, j++);
                CashTable.getModel().setValueAt(cashVal,i, j);
               
                i++;
                j=0;
               
                
                
                                 
               }
                
            }
             catch(Exception e){
                 
             }
                
       }
           
                
                
         
        
            
            
            
     // STEP 3 : LINKING THE LOANS 
      
            DBObject user_bankLoans=new BasicDBObject("AccountNo",OPERATIONS.Acc);
           
           
            DBCursor finder_loans=coll_bank.find(user_bankLoans);
            
            
            
   
             
               
           while(finder_loans.hasNext()){
                
                BasicDBObject e1=(BasicDBObject)finder_loans.next();
                
                BasicDBList resq1=(BasicDBList)e1.get("Loans");
                
               for(Object obj1 : resq1){ 
                
                LoanType=(String)((BasicDBObject)obj1).get("LoanType");
                LoanAmt=((BasicDBObject)obj1).getInt("LoanAmount");
                LoanRate=((BasicDBObject)obj1).getDouble("LoanRate");
                
                LoanPaid=((BasicDBObject)obj1).getInt("AmountPaid");
                LoanDueDate=(String)((BasicDBObject)obj1).get("MonthlyDueDate");
                LoanEMI=((BasicDBObject)obj1).getInt("MonthlyEMI");
                EMIRemaining=((BasicDBObject)obj1).getInt("EMIRemaining");
                LoanTot= ((BasicDBObject)obj1).getInt("TotalLoanAmount");                 
                
           

                // IF ELSE CONDITIONS 
                
                if(loans_count==0){
                    
                    if(LoanType.equals("Car Loan")){
                        LoanComboBox1.setSelectedIndex(1);
                        LoanComboBox1.setEnabled(false);
                        LoanComboBox1.setEditable(false);
                    }
                   
                    else if(LoanType.equals("Home Loan")){
                        LoanComboBox1.setSelectedIndex(2);
                        LoanComboBox1.setEnabled(false);
                        LoanComboBox1.setEditable(false);
                    }
                    else if(LoanType.equals("Gold Loan")){
                         LoanComboBox1.setSelectedIndex(3);
                        LoanComboBox1.setEnabled(false);
                        LoanComboBox1.setEditable(false);
                    }
                    else if(LoanType.equals("Education Loan")){
                     LoanComboBox1.setSelectedIndex(4);
                        LoanComboBox1.setEnabled(false);
                        LoanComboBox1.setEditable(false);
                        
                               
                    }
                    
                     else if(LoanType.equals("Personal Loan")){
                     LoanComboBox1.setSelectedIndex(5);
                        LoanComboBox1.setEnabled(false);
                        LoanComboBox1.setEditable(false);
                        
                     }
                    
                   txtPaidAmount1.setText(""+LoanPaid);
                   txtPaidAmount1.setEditable(false);
                   txtPaidAmount1.setEnabled(true);
                   
                   txtEMI1.setText(""+LoanEMI);
                   txtEMI1.setEditable(false);
                   txtEMI1.setEnabled(true);
                   
                   txtTotalAmount1.setText(""+LoanTot);
                   txtTotalAmount1.setEditable(false);
                   txtTotalAmount1.setEnabled(true);
                   
                   txtLoanDueDate1.setText(LoanDueDate);
                   txtLoanDueDate1.setEditable(false);
                   txtLoanDueDate1.setEnabled(true);
                   
                    LoanCheck1.setEnabled(true);
                   
                           
                    
                    
                    
                    
                
                }
                
           
           loans_count++;
           
               } // 
           
           
           
           
           }// end of loop
           
           
           
           
           
    
                
                
                
    //STEP 4 : LINKING THE  MUTUAL FUNDS 
                
                
                
                
                
                
            DBObject user_bankMutual=new BasicDBObject("AccountNo",OPERATIONS.Acc);
           
           
            DBCursor finder_Mutual=coll_bank.find(user_bankMutual);
            
              
              while(finder_Mutual.hasNext()){
                
                BasicDBObject e3=(BasicDBObject)finder_Mutual.next();
                
                BasicDBList resq3=(BasicDBList)e3.get("MutualFund");
                
               for(Object obj3 : resq3){ 
                
                FileNo=((BasicDBObject)obj3).getInt("FileNo");
                OriginalInvenstment=(int)((BasicDBObject)obj3).getInt("OriginalInvenstment");
               
                CurrentRate=((BasicDBObject)obj3).getDouble("CurrentRate");
                InvestmentDate=((BasicDBObject)obj3).getString("InvestmentDate");
                MatuarityDate=((BasicDBObject)obj3).getString("MatuarityDate");
                Period=((BasicDBObject)obj3).getString("Period");
                Scheme=((BasicDBObject)obj3).getString("Scheme");
                MaturatityValue=(int)(OriginalInvenstment*2*CurrentRate*0.01);
                MaturatityValue=OriginalInvenstment+MaturatityValue;
                
                
                
                
                   if(((DefaultComboBoxModel)ComboMutual.getModel()).getIndexOf(Scheme) == -1) {
                    ComboMutual.addItem(Scheme);
              }
              
                
                if(ComboMutual.getSelectedItem().equals("SBI-GOLDEN MARKET MONEY")){
                    
                    txtMutualValue.setText(""+MaturatityValue);
                    txtMutualValue.setEditable(false);
                    
                }
                
                
                
               }
                   
                   
          }// end of outer loop    
               
          // STEP 5:  LINKING THE FIXED DEPOSIT 
               
               
               
               DBObject user_bankFD=new BasicDBObject("AccountNo",OPERATIONS.Acc);
           
           
               DBCursor finder_FD=coll_bank.find(user_bankFD);
            
              
              while(finder_FD.hasNext()){
                
                BasicDBObject e4=(BasicDBObject)finder_FD.next();
                
                BasicDBList resq4=(BasicDBList)e4.get("FixedDeposit");
                
               for(Object obj4 : resq4){ 
                
                FD_No=((BasicDBObject)obj4).getInt("FD_No");
                PrincipalAmt=(int)((BasicDBObject)obj4).getInt("PrincipalAmt");
               
                InterestRate=((BasicDBObject)obj4).getDouble("InterestRate");
                FDInvestmentDate=((BasicDBObject)obj4).getString("InvestmentDate");
                FDMatuarityDate=((BasicDBObject)obj4).getString("MatuarityDate");
                FDPeriod=((BasicDBObject)obj4).getString("Period");
                
                FDMaturatityValue=(int)(PrincipalAmt*2*InterestRate*0.01);
                FDMaturatityValue=PrincipalAmt+FDMaturatityValue;
                
                
                 if(((DefaultComboBoxModel)ComboFixed.getModel()).getIndexOf("FIXED DEPOSIT "+FDMaturatityValue) == -1) {
                    ComboFixed.addItem("FIXED DEPOSIT "+FDMaturatityValue);
              }
              
                
                
                
                if(ComboFixed.getSelectedItem().equals("FIXED DEPOSIT "+FDMaturatityValue)){
                    
                    txtFixedValue.setText(""+FDMaturatityValue);
                    txtFixedValue.setEditable(false);
                    
                }
                
                
                
               }// inner loop FD
                   
                   
          } // OUTER LOOP   
               
    
               // RETERVING THE Property VALUE S
              
              reterive_property();
              CashSum();
              LoanSum();
              InvestmentSum(); 
              CreditSum();
              reterivalTransaction();
              TransactionSum();
            
        } // END OF TRY BLOCK
        
        catch (UnknownHostException ex) {
            Logger.getLogger(Mint_login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    
    
    public  static void reterivalTransaction(){  
                    
        try{
            
            k2=0;
            
            MongoClient mongoClient = new MongoClient("localhost", 27017);  // CREATING THE MONGO CLIENT OBJECT
            DB db = mongoClient.getDB("PENNYWORTH");                        // Object to access the database
            
            DBCollection coll_bank = db.getCollection("PENNYWORTH_BANKS");
            DBCollection coll = db.getCollection("PENNYWORTH_USERS");
            
          
            
            DBObject user_transaction=new BasicDBObject("UserName",Mint_login.login_username);
            DBCursor finder_transaction=coll.find(user_transaction);
            
                while(finder_transaction.hasNext()){
                    
                    k2=0;
                
                BasicDBObject e5=(BasicDBObject)finder_transaction.next();
                
                BasicDBList resq5=(BasicDBList)e5.get("Transactions");
                
             try{  
               
                 
                 for(Object obj5 : resq5){ 
                
                  k2++;  // incrementing the count
                   
                  tdate=null;
                  tdesc=null;
                  tcategory=null;
                  tamt=0;
                  
                 tdate=((BasicDBObject)obj5).getString("DateofTransaction");
                 tdesc=((BasicDBObject)obj5).getString("TransactionDescription");
                 tcategory=((BasicDBObject)obj5).getString("TransactionCategory");
                 tamt=((BasicDBObject)obj5).getDouble("TransactionAmount");
                  
                  
                  
     
                 // PUTTING THE VALUES
                 
                 
                 if(k2==1){
                     
                   txtTransactionDate1.setText(""+tdate);
                   txtTransactionDate1.setEnabled(true);
                   txtTransactionDate1.setEditable(false);
                   
                   
                   txtTransactionDesc1.setText(""+tdesc);
                   txtTransactionDesc1.setEnabled(true);
                   txtTransactionDesc1.setEditable(false);
                   
                   txtTransactionAmt1.setText(""+tamt);
                   txtTransactionAmt1.setEnabled(true);
                   txtTransactionAmt1.setEditable(false);
                   
                   txtTransactionCategory1.setText(""+tcategory);
                   txtTransactionCategory1.setEnabled(true);
                   txtTransactionCategory1.setEditable(false);  
                     
                   CheckTransaction1.setEnabled(true);
                   
                   
                   
                 }
                 
                 
                 else if(k2==2){
                     
                     
                   txtTransactionDate2.setText(""+tdate);
                   txtTransactionDate2.setEnabled(true);
                   txtTransactionDate2.setEditable(false);
                   
                   
                   txtTransactionDesc2.setText(""+tdesc);
                   txtTransactionDesc2.setEnabled(true);
                   txtTransactionDesc2.setEditable(false);
                   
                   txtTransactionAmt2.setText(""+tamt);
                   txtTransactionAmt2.setEnabled(true);
                   txtTransactionAmt2.setEditable(false);
                   
                   txtTransactionCategory2.setText(""+tcategory);
                   txtTransactionCategory2.setEnabled(true);
                   txtTransactionCategory2.setEditable(false);  
                     
                   CheckTransaction2.setEnabled(true);
                 }                 
                 
                 else if(k2==3){
                     
                     
                   txtTransactionDate3.setText(""+tdate);
                   txtTransactionDate3.setEnabled(true);
                   txtTransactionDate3.setEditable(false);
                   
                   
                   txtTransactionDesc3.setText(""+tdesc);
                   txtTransactionDesc3.setEnabled(true);
                   txtTransactionDesc3.setEditable(false);
                   
                   txtTransactionAmt3.setText(""+tamt);
                   txtTransactionAmt3.setEnabled(true);
                   txtTransactionAmt3.setEditable(false);
                   
                   txtTransactionCategory3.setText(""+tcategory);
                   txtTransactionCategory3.setEnabled(true);
                   txtTransactionCategory3.setEditable(false);  
                     
                   CheckTransaction3.setEnabled(true);
                 }                 
                 
                 else if(k2==4){
                     
                     
                   txtTransactionDate4.setText(""+tdate);
                   txtTransactionDate4.setEnabled(true);
                   txtTransactionDate4.setEditable(false);
                   
                   
                   txtTransactionDesc4.setText(""+tdesc);
                   txtTransactionDesc4.setEnabled(true);
                   txtTransactionDesc4.setEditable(false);
                   
                   txtTransactionAmt4.setText(""+tamt);
                   txtTransactionAmt4.setEnabled(true);
                   txtTransactionAmt4.setEditable(false);
                   
                   txtTransactionCategory4.setText(""+tcategory);
                   txtTransactionCategory4.setEnabled(true);
                   txtTransactionCategory4.setEditable(false);  
                     
                   CheckTransaction4.setEnabled(true);
                 }                 
                 
                 else if(k2==5){
                     
                     
                   txtTransactionDate5.setText(""+tdate);
                   txtTransactionDate5.setEnabled(true);
                   txtTransactionDate5.setEditable(false);
                   
                   
                   txtTransactionDesc5.setText(""+tdesc);
                   txtTransactionDesc5.setEnabled(true);
                   txtTransactionDesc5.setEditable(false);
                   
                   txtTransactionAmt5.setText(""+tamt);
                   txtTransactionAmt5.setEnabled(true);
                   txtTransactionAmt5.setEditable(false);
                   
                   txtTransactionCategory5.setText(""+tcategory);
                   txtTransactionCategory5.setEnabled(true);
                   txtTransactionCategory5.setEditable(false);  
                     
                   CheckTransaction5.setEnabled(true);
                 }                 
                 
                 
                 
                 
                 
                 
                 
                   
       }// inner loop FD
                   
           }
             catch(Exception e){
                 
             }
                 
                 
          } // OUTER LOOP   
               
            
            
            
  }
  
  
  
  
 catch (UnknownHostException ex) {
            Logger.getLogger(Mint_login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
  }
    

    
    
    
    
    // FUNCTION : RETERIVE_PROPERTY 
    
    
    public  static void reterive_property(){
         // SETP 6: LINKING THE PROPERTY OF CUSTOMER
              
      try{        
        
          
          int TotalPropertyValue=0;
          
            MongoClient mongoClient = new MongoClient("localhost", 27017);  // CREATING THE MONGO CLIENT OBJECT
            DB db = mongoClient.getDB("PENNYWORTH");                        // Object to access the database
            
            DBCollection coll_bank = db.getCollection("PENNYWORTH_BANKS");
            DBCollection coll = db.getCollection("PENNYWORTH_USERS");
             
               
          DBObject user_property=new BasicDBObject("UserName",Mint_login.login_username);
           
           
            DBCursor finder_property=coll.find(user_property);
            
              
              while(finder_property.hasNext()){
                
                BasicDBObject e5=(BasicDBObject)finder_property.next();
                
                BasicDBList resq5=(BasicDBList)e5.get("PropertyDetails");
             try{  
               
                 
                 for(Object obj5 : resq5){ 
                

                        PropertyType=null;
                        PropertyDesc=null;
                      OriginalPropertyValue=0;
                     CurrentPropertyValue=0;
                      PropertyArea=0;
                      PropertyCurrentRate=0;
                      PropertyName=null;
                      PropertyLocation=null;
       
               
                
              PropertyName=((BasicDBObject)obj5).getString("PropertyName");
              PropertyType=((BasicDBObject)obj5).getString("PropertyType");
              OriginalPropertyValue=((BasicDBObject)obj5).getInt("PropertyOriginalValue");
              CurrentPropertyValue=((BasicDBObject)obj5).getInt("PropertyCurrentValue");
              PropertyLocation=((BasicDBObject)obj5).getString("PropertyLocation");
              PropertyArea=((BasicDBObject)obj5).getInt("PropertyArea");
              PropertyDesc=((BasicDBObject)obj5).getString("PropertyDescription");

              
       
               TotalPropertyValue=TotalPropertyValue+CurrentPropertyValue;
               
               
              if(((DefaultComboBoxModel)ComboProperty.getModel()).getIndexOf(PropertyName) == -1) {
                    ComboProperty.addItem(PropertyName);
              }
              
              
                   
       }// inner loop FD
                   
           }
             catch(Exception e){
                 
             }
                 
                 
          } // OUTER LOOP   
               
              
              
              txtTotalPropertyValue.setText("Rs"+TotalPropertyValue);
              txtTotalPropertyValue.setEditable(false);
              
              
      }          
               
                 
        catch (UnknownHostException ex) {
            Logger.getLogger(Mint_login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }// end of fn
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // FUNCTION : RETERIVE TOTAL CREDIT CARD
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void CreditSum(){
        
        
                 
      try{        
          
          
             TotalCredits=0;
             TotalMaxLimit=0;
          
            MongoClient mongoClient = new MongoClient("localhost", 27017);  // CREATING THE MONGO CLIENT OBJECT
            DB db = mongoClient.getDB("PENNYWORTH");                        // Object to access the database
            
            DBCollection coll_bank = db.getCollection("PENNYWORTH_BANKS");
            DBCollection coll = db.getCollection("PENNYWORTH_USERS");
             
               
          DBObject user_CreditCard=new BasicDBObject("AccountNo",OPERATIONS.Acc);
           
           
            DBCursor finder_CreditCard=coll_bank.find(user_CreditCard);
            
              
              while(finder_CreditCard.hasNext()){
                
                BasicDBObject e5=(BasicDBObject)finder_CreditCard.next();
                
                BasicDBList resq5=(BasicDBList)e5.get("CreditCard");
             try{  
               
                 
                 for(Object obj5 : resq5){ 
                
           
                      TotalCredits=TotalCredits+((BasicDBObject)obj5).getInt("CurrentCredits");
                      TotalMaxLimit=TotalMaxLimit+((BasicDBObject)obj5).getInt("MaxLimit");
                      
                      
                      
                     
                     
              
              
                   
       }// inner loop FD
                 
                   
                 
                 
                 
                 
           }
             catch(Exception e){
                 
             }
                 
                 
          } // OUTER LOOP   
               
                   int val=((TotalCredits*100)/TotalMaxLimit);
                   System.out.println("int"+val);
                 
                   txtTotalMaxLimit.setText("Rs"+TotalMaxLimit);
                   txtTotalMaxLimit.setEditable(false);
                   
                   txtTotalCardCredits.setText("Rs"+TotalCredits);
                   txtTotalCardCredits.setEditable(false);
                   ProgressBarTotalCurrentCredits.setValue(val);  
      }          
               
                 
        catch (UnknownHostException ex) {
            Logger.getLogger(Mint_login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    
    
    public static void TransactionSum(){
                     
      try{        
          
          
          
             TotalTransaction=0;
          
            MongoClient mongoClient = new MongoClient("localhost", 27017);  // CREATING THE MONGO CLIENT OBJECT
            DB db = mongoClient.getDB("PENNYWORTH");                        // Object to access the database
            
            DBCollection coll_bank = db.getCollection("PENNYWORTH_BANKS");
            DBCollection coll = db.getCollection("PENNYWORTH_USERS");
             
               
              DBObject user_Transaction=new BasicDBObject("UserName",Mint_login.login_username);
           
           
            DBCursor finder_Transaction=coll.find(user_Transaction);
            
              
              while(finder_Transaction.hasNext()){
                
                BasicDBObject e5=(BasicDBObject)finder_Transaction.next();
                
                BasicDBList resq5=(BasicDBList)e5.get("Transactions");
                
             try{  
               
                 
                 for(Object obj5 : resq5){ 
                
           
                      TotalTransaction=TotalTransaction+((BasicDBObject)obj5).getInt("TransactionAmount");
                      
                      
                      
                      
                  
                   
                             }// inner loop FD
                 
                   
                 
                 
                 
                 
           }
             catch(Exception e){
                 
             }
                 
             
             txtTotalTransactionAmount.setText(""+TotalTransaction);
                 
          } // OUTER LOOP   
               
             
               
                 
      
        
    }
    
    
      catch (UnknownHostException ex) {
            Logger.getLogger(Mint_login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // FUNCTION    CASH RETERIVE (SUM)

    
    public static void CashSum(){
        
        try{
            
            
                  
            MongoClient mongoClient = new MongoClient("localhost", 27017);  // CREATING THE MONGO CLIENT OBJECT
            DB db = mongoClient.getDB("PENNYWORTH");                        // Object to access the database
            
            DBCollection coll_bank = db.getCollection("PENNYWORTH_BANKS");
            DBCollection coll = db.getCollection("PENNYWORTH_USERS");
             
             CashTot=0;
        
             DBObject user_Cash=new BasicDBObject("UserName",Mint_login.login_username);
          
           
              DBCursor finder_Cash=coll.find(user_Cash);
            
            
             while(finder_Cash.hasNext()){
                
                BasicDBObject e2=(BasicDBObject)finder_Cash.next();
                
                BasicDBList resq2=(BasicDBList)e2.get("Cash_Info");
                
                
             try{   
                     for(Object obj2 : resq2){ 
                
               
               CashTot= CashTot+((BasicDBObject)obj2).getInt("Cash_Amount");
               
              
               
                
                
                                 
               }
                
            }
             catch(Exception e){
                 
             }
                
       }
             
             // PRINTING THE VALUE 
             
             txtTotalCash.setText("Rs."+CashTot);
           
     }   //outer try      
        
        
           catch (UnknownHostException ex) {
            Logger.getLogger(Mint_login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public static void LoanSum(){
         try{
            
            
                  
            MongoClient mongoClient = new MongoClient("localhost", 27017);  // CREATING THE MONGO CLIENT OBJECT
            DB db = mongoClient.getDB("PENNYWORTH");                        // Object to access the database
            
            DBCollection coll_bank = db.getCollection("PENNYWORTH_BANKS");
            DBCollection coll = db.getCollection("PENNYWORTH_USERS");
             
             TotalAmountRemaining=0;
             TotalLoanAmount=0;
             TotalLoanPaid=0;
        
             DBObject user_Loan=new BasicDBObject("AccountNo",OPERATIONS.Acc);
          
           
              DBCursor finder_Loan=coll_bank.find(user_Loan);
            
            
             while(finder_Loan.hasNext()){
                
                BasicDBObject e2=(BasicDBObject)finder_Loan.next();
                
                BasicDBList resq2=(BasicDBList)e2.get("Loans");
                
                
             try{   
                     for(Object obj2 : resq2){ 
                
               
               TotalLoanPaid= TotalLoanPaid+((BasicDBObject)obj2).getInt("AmountPaid");
               
               
               TotalLoanAmount=(int)((BasicDBObject)obj2).getInt("TotalLoanAmount");
               
               TotalAmountRemaining=TotalLoanAmount-TotalLoanPaid;
               
               txtTotalLoanPaid.setText("\tRs."+TotalLoanPaid);
               txtTotalLoanAmount.setText("\tRs"+TotalLoanAmount);
               txtTotalAmountRemaining.setText("\tRs"+TotalAmountRemaining);
               
               // Progress BAr Dsisaplay
        
              int ProgressBarLoanPaidVal=0,ProgressBarLoanRemainingVal=0;
               
              ProgressBarLoanPaidVal=( (TotalLoanPaid*100)/TotalLoanAmount);
              ProgressBarLoanRemainingVal=( (TotalAmountRemaining*100)/TotalLoanAmount);
                         System.out.println("val"+ ProgressBarLoanPaidVal);
                           System.out.println("val2"+  ProgressBarLoanRemainingVal);
                         
                 ProgressBarLoanPaid.setValue(ProgressBarLoanPaidVal);
                
               
                 ProgressBarAmountRemaining.setValue( ProgressBarLoanRemainingVal);
                 
                                 
               }
                
            }
             catch(Exception e){
                 
             }
                
       }
             
             // PRINTING THE VALUE 
             
             txtTotalCash.setText("Rs."+CashTot);
           
     }   //outer try      
        
        
           catch (UnknownHostException ex) {
            Logger.getLogger(Mint_login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    
    public static void InvestmentSum(){
        
         
        TotalInvestmentVal=0;
        TotalMaturatityVal=0;
        
        
        TotalInvestmentVal=PrincipalAmt+OriginalInvenstment;
        TotalMaturatityVal=FDMaturatityValue+MaturatityValue;   // mATURATITY VAL OF MUTULA FUND 
        
        
        txtTotalInvestment.setText(""+TotalInvestmentVal);
       txtTotalInvestment.setEditable(false);
        txtTotalMatureValue.setText(""+TotalMaturatityVal);
        txtTotalMatureValue.setEditable(false);
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void jTextField85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField85ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField85ActionPerformed

    private void jTextField83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField83ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField83ActionPerformed

    private void jTextField81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField81ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField81ActionPerformed

    private void jTextField79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField79ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField79ActionPerformed

    private void jTextField34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField34ActionPerformed

    // ADD CASH 
    
    
    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void btnShowVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowVideoActionPerformed

        try {
            Desktop desktop = Desktop.getDesktop();
            String path="/home/arun/Desktop/Takeatour.mp4";

            desktop.open(new File(path));
        } catch (IOException ex) {
            Logger.getLogger(OPERATIONS.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnShowVideoActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed

        int userLogOutChoice =JOptionPane.showConfirmDialog(LoanComboBox1,"Do You Want to Log Out ?");

        if(userLogOutChoice==JOptionPane.YES_OPTION){

            this.dispose();
            JOptionPane.showMessageDialog(LoanComboBox1,"Thank You .You Have Sucessfully Logged Out");
            new welcome().setVisible(true);

        }

    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed

        try {
            Desktop desktop = Desktop.getDesktop();
            String path="/home/arun/Desktop/GetHelp.pdf";
            File file = new File(path);
            desktop.open(file);
        } catch (IOException ex) {
            Logger.getLogger(OPERATIONS.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnHelpActionPerformed

    private void txtTransactionAmt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTransactionAmt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTransactionAmt2ActionPerformed

    private void txtTransactionAmt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTransactionAmt5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTransactionAmt5ActionPerformed

    private void txtTransactionAmt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTransactionAmt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTransactionAmt4ActionPerformed

    private void txtTransactionAmt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTransactionAmt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTransactionAmt3ActionPerformed

    private void btnTransactionReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransactionReceiptActionPerformed

       // PDF GENERATION

        if(CheckTransaction1.isSelected()){

            new  Pdf("\t\t\t\tTRANSACTION RECEIPT\n\n\n"+"\tTRANSACTION NO :"+(int)(Math.random()*100000)+"\n\tTRANSACTION AMOUNT : "+txtTransactionAmt1.getText()+"\n\tTRANSACTION CATEGORY : "+txtTransactionCategory1.getText()+"\n\tTRANSACTION DATE : "+txtTransactionDate1.getText());
        }

        else if(CheckTransaction2.isSelected()){

            new  Pdf("\t\t\t\tTRANSACTION RECEIPT\n\n\n"+"\tTRANSACTION NO :"+(int)(Math.random()*10000)+"\n\tTRANSACTION AMOUNT : "+txtTransactionAmt2.getText()+"\n\tTRANSACTION CATEGORY : "+txtTransactionCategory2.getText()+"\n\tTRANSACTION DATE : "+txtTransactionDate2.getText());
        }

        else if(CheckTransaction3.isSelected()){

            new  Pdf("\t\t\t\tTRANSACTION RECEIPT\n\n\n"+"\tTRANSACTION NO :"+(int)(Math.random()*10000)+"\n\tTRANSACTION AMOUNT : "+txtTransactionAmt3.getText()+"\n\tTRANSACTION CATEGORY : "+txtTransactionCategory3.getText()+"\n\tTRANSACTION DATE : "+txtTransactionDate3.getText());
        }

        else if(CheckTransaction4.isSelected()){

            new  Pdf("\t\t\t\tTRANSACTION RECEIPT\n\n\n"+"\tTRANSACTION NO :"+(int)(Math.random()*10000)+"\n\tTRANSACTION AMOUNT : "+txtTransactionAmt4.getText()+"\n\tTRANSACTION CATEGORY : "+txtTransactionCategory4.getText()+"\n\tTRANSACTION DATE : "+txtTransactionDate4.getText());
        }

        else if(CheckTransaction5.isSelected()){

            new  Pdf("\t\t\t\tTRANSACTION RECEIPT\n\n\n"+"\tTRANSACTION NO :"+(int)(Math.random()*10000)+"\n\tTRANSACTION AMOUNT : "+txtTransactionAmt5.getText());
        }
    }//GEN-LAST:event_btnTransactionReceiptActionPerformed

    private void btnAddTransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTransactionActionPerformed

        new TransactionChoice().setVisible(true);
    }//GEN-LAST:event_btnAddTransactionActionPerformed

    private void CheckTransaction5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckTransaction5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckTransaction5ActionPerformed

    private void CheckTransaction4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckTransaction4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckTransaction4ActionPerformed

    private void CheckTransaction2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckTransaction2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckTransaction2ActionPerformed

    private void CheckTransaction1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckTransaction1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckTransaction1ActionPerformed

    private void txtTotalTransactionAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalTransactionAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalTransactionAmountActionPerformed

    private void txtTotalCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalCashActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalCashActionPerformed

    private void btnAddCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCashActionPerformed

        try{
            MongoClient mongoClient = new MongoClient("localhost", 27017); // CREATING THE MONGO CLIENT OBJECT
            DB db = mongoClient.getDB("PENNYWORTH");        // Object to access the database

            // CHOOSING THE COLLECTION

            DBCollection coll_bank = db.getCollection("PENNYWORTH_BANKS");
            DBCollection coll = db.getCollection("PENNYWORTH_USERS");

            // CHOOSING THE COLLECTION

            Cashinfo=JOptionPane.showInputDialog("WHERE U HAVE CASH  ???");
            CashVal=(Integer.parseInt(JOptionPane.showInputDialog("Enter Cash Value")));

            // ADDING CONTENT

            Object[] insert_row={Cashinfo,CashVal};

            CashTable.getModel().setValueAt(Cashinfo,i, j++);
            CashTable.getModel().setValueAt(CashVal,i, j);

            i++;
            j=0;

            DBObject curUser=new BasicDBObject("UserName",Mint_login.login_username);

            // ADDING CONTENT TO A PARTICULAR FIELD

            //coll.update(curUser,new BasicDBObject("$set",new BasicDBObject("Cash_Info",new BasicDBObject("Cash_Description",Cashinfo).append("Cash_Amount",CashVal))));

            DBObject listItem = new BasicDBObject("Cash_Info", new BasicDBObject("Cash_Description",Cashinfo).append("Cash_Amount",CashVal));
            DBObject updateQuery = new BasicDBObject("$push", listItem);
            coll.update(curUser, updateQuery);

            CashSum();

        }

        catch (UnknownHostException ex) {
            Logger.getLogger(Mint_login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddCashActionPerformed

    private void btnMutualDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMutualDetailsActionPerformed
        // TODO add your handling code here:

        if(ComboMutual.getSelectedItem().equals("SBI-GOLDEN MARKET MONEY")){
          JOptionPane.showMessageDialog(LoanCombo2, "Mutual Fund Details are As Follows : "+"\nFileNo : "+FileNo+"\nOriginal Investment Amount : "+OriginalInvenstment+"\nCurrent Market Rate : "+CurrentRate+"\nInvestment Date : "+InvestmentDate+"\nMaturatity Date : "+MatuarityDate+"\nScheme Invested : "+Scheme+"\nMaturatity Value : "+MaturatityValue);
        
        }
    }//GEN-LAST:event_btnMutualDetailsActionPerformed

    private void txtTotalInvestmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalInvestmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalInvestmentActionPerformed

    private void jTextField36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField36ActionPerformed

    private void btnAddFDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFDActionPerformed
        // TODO add your handling code here:

        new addFD().setVisible(true);
    }//GEN-LAST:event_btnAddFDActionPerformed

    private void btnFixedDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFixedDepositActionPerformed

        if(ComboFixed.getSelectedItem().equals("FIXED DEPOSIT "+FDMaturatityValue)){

           JOptionPane.showMessageDialog(LoanCombo2,"Fixed Deposit Details are As Follows : "+"\nFD_No : "+FD_No+"\nPrincipal Amount : "+PrincipalAmt+"\nFixed Interest Rate : "+InterestRate+"\nInvestment Date : "+FDInvestmentDate+"\nMaturatity Date : "+FDMatuarityDate+"\nMaturatity Value : "+FDMaturatityValue);
        
        }
    }//GEN-LAST:event_btnFixedDepositActionPerformed

    private void txtTotalMaxLimitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalMaxLimitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalMaxLimitActionPerformed

    private void txtTotalCardCreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalCardCreditsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalCardCreditsActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void CardCheck2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CardCheck2ActionPerformed

    }//GEN-LAST:event_CardCheck2ActionPerformed

    private void ComboCreditType1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCreditType1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboCreditType1ActionPerformed

    private void CardCheck1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CardCheck1ActionPerformed

    }//GEN-LAST:event_CardCheck1ActionPerformed

    private void txtTotalPropertyValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalPropertyValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalPropertyValueActionPerformed

    private void btnPropertyDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPropertyDetailsActionPerformed

        try{

            MongoClient mongoClient = new MongoClient("localhost", 27017);  // CREATING THE MONGO CLIENT OBJECT
            DB db = mongoClient.getDB("PENNYWORTH");                        // Object to access the database

            DBCollection coll_bank = db.getCollection("PENNYWORTH_BANKS");
            DBCollection coll = db.getCollection("PENNYWORTH_USERS");

            DBObject find_obj=new BasicDBObject("UserName",Mint_login.login_username);

            //DBObject find_PropertyName=new BasicDBObject("PropertyName",Mint_login.login_username);

            DBObject user_property=new BasicDBObject("UserName",Mint_login.login_username);

            DBCursor finder_property=coll.find(user_property);

            BasicDBList e1=(BasicDBList) finder_property.next().get("PropertyDetails");

            int k=ComboProperty.getSelectedIndex();

            DBObject resq10=(BasicDBObject)e1.get(k);   // LINKING ALL THE RECORDS

            txtPropertyDesc.setText("Property Type :"+resq10.get("PropertyType")+"\nProperty Original Value : "+resq10.get("PropertyOriginalValue")+"\nProperty Current Value : "+resq10.get("PropertyCurrentValue")+"\nProperty Location : "+resq10.get("PropertyLocation")+"\nProperty  Area : "+resq10.get("PropertyArea")+"sq.ft"+"\nProperty Description : "+resq10.get("PropertyDescription"));
            txtPropertyValue.setText("Rs."+resq10.get("PropertyCurrentValue"));

        } //outer try

        catch (UnknownHostException ex) {
            Logger.getLogger(Mint_login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPropertyDetailsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new propertydetails().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ComboPropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboPropertyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboPropertyActionPerformed

    private void txtTotalLoanAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalLoanAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalLoanAmountActionPerformed

    private void txtTotalAmountRemainingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalAmountRemainingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalAmountRemainingActionPerformed

    private void btnAddLoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddLoanActionPerformed

        new loan().setVisible(true);
    }//GEN-LAST:event_btnAddLoanActionPerformed

    private void LoanCheck5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoanCheck5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoanCheck5ActionPerformed

    private void LoanCheck2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoanCheck2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoanCheck2ActionPerformed

    private void LoanCheck1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoanCheck1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoanCheck1ActionPerformed

    private void LoanComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoanComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoanComboBox1ActionPerformed

    private void btnLoanDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoanDetailsActionPerformed

    }//GEN-LAST:event_btnLoanDetailsActionPerformed

    private void btnLoanDetailsNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoanDetailsNewActionPerformed
       
        try{

            MongoClient mongoClient = new MongoClient("localhost", 27017);  // CREATING THE MONGO CLIENT OBJECT
            DB db = mongoClient.getDB("PENNYWORTH");                        // Object to access the database

            DBCollection coll_bank = db.getCollection("PENNYWORTH_BANKS");
            DBCollection coll = db.getCollection("PENNYWORTH_USERS");

            DBObject find_obj=new BasicDBObject("UserName",Mint_login.login_username);
            DBCursor findQuery = coll.find(find_obj);

            DBObject result=new BasicDBObject();

            result=findQuery.next();

            DBObject outer=(BasicDBObject)result.get("BankDetails");

            // STEP 1 : GETTING THE ACCOUNT NO

            Acc=(String)outer.get("AccountNo");

            System.out.println(Acc);

            // STEP 2 : LINKING THE CREDIT CARD

            DBObject user_bank=new BasicDBObject("AccountNo",OPERATIONS.Acc);
            DBCursor finder_loans=coll_bank.find(user_bank);

            int k=0;
            String cardno=null,ExpirationDate=null,NameofBank=null;

            if(LoanCheck1.isSelected()){

       

                    BasicDBList e1=(BasicDBList) finder_loans.next().get("Loans");

                    DBObject resq1=(BasicDBObject)e1.get(0);   // LINKING ALL THE RECORDS

                    LoanType=(String)resq1.get("LoanType");

                

                // DISPLAYING DETAILS IN JOPTION PANE

                JOptionPane.showMessageDialog(LoanComboBox1,"Your Loan Details Details are As Follows :"+"\n"+"Loan No : "+LoanNo+"\nLoan Type : "+LoanType+"\nAmount of Loan Taken : "+LoanAmt+"\nMonthly EMI Amount : "+LoanEMI+"\nLoan Interest Rate : "+LoanRate+"\nLoan Amount Paid Till Now : "+LoanPaid+"\nTotal Loan To be Paid : "+LoanTot+"\nLast Date to Pay EMI : "+LoanDueDate+"\nNo of EMI Remaining : "+EMIRemaining );

            }// END OF LOOP

            
            
            
             if(LoanCheck2.isSelected()){

       

                    BasicDBList e1=(BasicDBList) finder_loans.next().get("Loans");

                    DBObject resq1=(BasicDBObject)e1.get(1);   // LINKING ALL THE RECORDS

                    LoanType=(String)resq1.get("LoanType");

                

                // DISPLAYING DETAILS IN JOPTION PANE

                JOptionPane.showMessageDialog(LoanComboBox1,"Your Loan Details Details are As Follows :"+"\n"+"Loan No : "+LoanNo+"\nLoan Type : "+LoanType+"\nAmount of Loan Taken : "+LoanAmt+"\nMonthly EMI Amount : "+LoanEMI+"\nLoan Interest Rate : "+LoanRate+"\nLoan Amount Paid Till Now : "+LoanPaid+"\nTotal Loan To be Paid : "+LoanTot+"\nLast Date to Pay EMI : "+LoanDueDate+"\nNo of EMI Remaining : "+EMIRemaining );

            }// END OF LOOP
            
             
             
             
             
             
             
             
              if(LoanCheck3.isSelected()){

       

                    BasicDBList e1=(BasicDBList) finder_loans.next().get("Loans");

                    DBObject resq1=(BasicDBObject)e1.get(2);   // LINKING ALL THE RECORDS

                    LoanType=(String)resq1.get("LoanType");

                

                // DISPLAYING DETAILS IN JOPTION PANE

                JOptionPane.showMessageDialog(LoanComboBox1,"Your Loan Details Details are As Follows :"+"\n"+"Loan No : "+LoanNo+"\nLoan Type : "+LoanType+"\nAmount of Loan Taken : "+LoanAmt+"\nMonthly EMI Amount : "+LoanEMI+"\nLoan Interest Rate : "+LoanRate+"\nLoan Amount Paid Till Now : "+LoanPaid+"\nTotal Loan To be Paid : "+LoanTot+"\nLast Date to Pay EMI : "+LoanDueDate+"\nNo of EMI Remaining : "+EMIRemaining );

            }// END OF LOOP
              
              
              
              
              
              
              
              
               if(LoanCheck4.isSelected()){

       

                    BasicDBList e1=(BasicDBList) finder_loans.next().get("Loans");

                    DBObject resq1=(BasicDBObject)e1.get(3);   // LINKING ALL THE RECORDS

                    LoanType=(String)resq1.get("LoanType");

                

                // DISPLAYING DETAILS IN JOPTION PANE

                JOptionPane.showMessageDialog(LoanComboBox1,"Your Loan Details Details are As Follows :"+"\n"+"Loan No : "+LoanNo+"\nLoan Type : "+LoanType+"\nAmount of Loan Taken : "+LoanAmt+"\nMonthly EMI Amount : "+LoanEMI+"\nLoan Interest Rate : "+LoanRate+"\nLoan Amount Paid Till Now : "+LoanPaid+"\nTotal Loan To be Paid : "+LoanTot+"\nLast Date to Pay EMI : "+LoanDueDate+"\nNo of EMI Remaining : "+EMIRemaining );

            }// END OF LOOP
               
               
               
               
               
               
               
                if(LoanCheck5.isSelected()){

       

                    BasicDBList e1=(BasicDBList) finder_loans.next().get("Loans");

                    DBObject resq1=(BasicDBObject)e1.get(4);   // LINKING ALL THE RECORDS

                    LoanType=(String)resq1.get("LoanType");

                

                // DISPLAYING DETAILS IN JOPTION PANE

                JOptionPane.showMessageDialog(LoanComboBox1,"Your Loan Details Details are As Follows :"+"\n"+"Loan No : "+LoanNo+"\nLoan Type : "+LoanType+"\nAmount of Loan Taken : "+LoanAmt+"\nMonthly EMI Amount : "+LoanEMI+"\nLoan Interest Rate : "+LoanRate+"\nLoan Amount Paid Till Now : "+LoanPaid+"\nTotal Loan To be Paid : "+LoanTot+"\nLast Date to Pay EMI : "+LoanDueDate+"\nNo of EMI Remaining : "+EMIRemaining );

            }// END OF LOOP
            
            
        }

        catch (UnknownHostException ex) {
            Logger.getLogger(Mint_login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLoanDetailsNewActionPerformed

    private void btnCreditCardDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditCardDetailsActionPerformed
      
        
                    
  try{
            
            MongoClient mongoClient = new MongoClient("localhost", 27017);  // CREATING THE MONGO CLIENT OBJECT
            DB db = mongoClient.getDB("PENNYWORTH");                        // Object to access the database
            
            DBCollection coll_bank = db.getCollection("PENNYWORTH_BANKS");
            DBCollection coll = db.getCollection("PENNYWORTH_USERS");
             
            DBObject find_obj=new BasicDBObject("UserName",Mint_login.login_username);
            DBCursor findQuery = coll.find(find_obj);
              
              
            DBObject result=new BasicDBObject();
              
            result=findQuery.next();
            
            
            DBObject outer=(BasicDBObject)result.get("BankDetails");

            
   // STEP 1 : GETTING THE ACCOUNT NO         
            
            Acc=(String)outer.get("AccountNo");
            
            System.out.println(Acc);
            
             
            
   // STEP 2 : LINKING THE CREDIT CARD         
            
            
            DBObject user_bank=new BasicDBObject("AccountNo",OPERATIONS.Acc);
            DBCursor finder_credit=coll_bank.find(user_bank);
            
            int k=0;
            String cardno=null,ExpirationDate=null,NameofBank=null;
            
            
       if(CardCheck1.isSelected()){     
            
            
            while(finder_credit.hasNext()){
                
                BasicDBList e=(BasicDBList) finder_credit.next().get("CreditCard");
                
                DBObject resq=(BasicDBObject)e.get(0);   // LINKING ALL THE RECORDS
                
                currCredit=(double)resq.get("CurrentCredits");
                Maxlimit=(double)resq.get("MaxLimit");
                cardType=(String)resq.get("CardType");
                NameofBank="STATE BANK OF INDIA";
                cardno=(String)resq.get("CardNo");
                ExpirationDate=(String)resq.get("ExpirationDate");
                
                
                
      
                
            }
    
            
            
            // DISPLAYING DETAILS IN JOPTION PANE 
            
            
            JOptionPane.showMessageDialog(LoanComboBox1,"Your Credit Card Details are As Follows :"+"\n"+"CARD NO :"+cardno+"\nExpiration Date:"+ExpirationDate+"\nIssuing Bank:"+NameofBank+"\nCurrent Credits:"+currCredit+"\nMax. Limit"+Maxlimit);
            
            
            
       }// END OF LOOP
            
       
       
  if(CardCheck2.isSelected()){     
            
            
            while(finder_credit.hasNext()){
                
                BasicDBList e=(BasicDBList) finder_credit.next().get("CreditCard");
                
                DBObject resq=(BasicDBObject)e.get(1);   // LINKING ALL THE RECORDS
                
                currCredit=(double)resq.get("CurrentCredits");
                Maxlimit=(double)resq.get("CurrentCredits");
                cardType=(String)resq.get("CardType");
                NameofBank="STATE BANK OF INDIA";
                cardno=(String)resq.get("CardNo");
                ExpirationDate=(String)resq.get("ExpirationDate");
                
                
      
                
            }
    
            
            
             JOptionPane.showMessageDialog(LoanComboBox1,"Your Credit Card Details are As Follows :"+"\n"+"CARD NO :"+cardno+"\nExpiration Date:"+ExpirationDate+"\nIssuing Bank:"+NameofBank+"\nCurrent Credits:"+currCredit+"\nMax. Limit"+Maxlimit);
            
       }// END OF if 2
            
            
            

            
            
        } 
        
        catch (UnknownHostException ex) {
            Logger.getLogger(Mint_login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }//GEN-LAST:event_btnCreditCardDetailsActionPerformed

    private void txtTransactionDesc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTransactionDesc4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTransactionDesc4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
       new addMF().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    
    
    
    
   
  
  
    



    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(OPERATIONS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OPERATIONS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OPERATIONS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OPERATIONS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OPERATIONS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JCheckBox CardCheck1;
    public static javax.swing.JCheckBox CardCheck2;
    public static javax.swing.JCheckBox CardCheck3;
    public static javax.swing.JTable CashTable;
    public static javax.swing.JCheckBox CheckTransaction1;
    public static javax.swing.JCheckBox CheckTransaction2;
    public static javax.swing.JCheckBox CheckTransaction3;
    public static javax.swing.JCheckBox CheckTransaction4;
    public static javax.swing.JCheckBox CheckTransaction5;
    public static javax.swing.JComboBox ComboCreditType1;
    public static javax.swing.JComboBox ComboCreditType2;
    public static javax.swing.JComboBox ComboCreditType3;
    public static javax.swing.JComboBox ComboFixed;
    public static javax.swing.JComboBox ComboMutual;
    public static javax.swing.JComboBox ComboProperty;
    public static javax.swing.JCheckBox LoanCheck1;
    public static javax.swing.JCheckBox LoanCheck2;
    public static javax.swing.JCheckBox LoanCheck3;
    public static javax.swing.JCheckBox LoanCheck4;
    public static javax.swing.JCheckBox LoanCheck5;
    public static javax.swing.JComboBox LoanCombo2;
    public static javax.swing.JComboBox LoanCombo3;
    public static javax.swing.JComboBox LoanCombo4;
    public static javax.swing.JComboBox LoanCombo5;
    public static javax.swing.JComboBox LoanComboBox1;
    public static javax.swing.JTabbedPane OperationTabbedPane;
    public static javax.swing.JProgressBar ProgressBarAmountRemaining;
    public static javax.swing.JProgressBar ProgressBarLoanPaid;
    public static javax.swing.JProgressBar ProgressBarTotalCurrentCredits;
    public static javax.swing.JLabel TimeDateLabel;
    public static javax.swing.JButton btnAddBudget;
    public static javax.swing.JButton btnAddCash;
    public static javax.swing.JButton btnAddFD;
    public static javax.swing.JButton btnAddLoan;
    public static javax.swing.JPanel btnAddLoanNew;
    public static javax.swing.JButton btnAddTransaction;
    public static javax.swing.JButton btnCreditCardDetails;
    public static javax.swing.JButton btnFixedDeposit;
    public static javax.swing.JButton btnHelp;
    public javax.swing.JButton btnLoanDetails;
    public static javax.swing.JButton btnLoanDetailsNew;
    public static javax.swing.JButton btnLogOut;
    public static javax.swing.JButton btnMutualDetails;
    public static javax.swing.JButton btnPropertyDetails;
    public static javax.swing.JButton btnShowVideo;
    public static javax.swing.JButton btnTransactionReceipt;
    public static javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.ButtonGroup buttonGroup2;
    public static javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton14;
    public static javax.swing.JButton jButton15;
    public static javax.swing.JButton jButton3;
    public static javax.swing.JCheckBox jCheckBox4;
    public static javax.swing.JCheckBox jCheckBox5;
    public static javax.swing.JComboBox jComboBox16;
    public static javax.swing.JComboBox jComboBox17;
    public static javax.swing.JComboBox jComboBox18;
    public static javax.swing.JComboBox jComboBox19;
    public static javax.swing.JComboBox jComboBox4;
    public static javax.swing.JComboBox jComboBox5;
    public static javax.swing.JComboBox jComboBox6;
    public static javax.swing.JFrame jFrame1;
    public static javax.swing.JFrame jFrame2;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel100;
    public static javax.swing.JLabel jLabel101;
    public static javax.swing.JLabel jLabel102;
    public static javax.swing.JLabel jLabel103;
    public static javax.swing.JLabel jLabel104;
    public static javax.swing.JLabel jLabel105;
    public static javax.swing.JLabel jLabel106;
    public static javax.swing.JLabel jLabel107;
    public static javax.swing.JLabel jLabel108;
    public static javax.swing.JLabel jLabel109;
    public static javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel116;
    public static javax.swing.JLabel jLabel12;
    public static javax.swing.JLabel jLabel120;
    public static javax.swing.JLabel jLabel121;
    public static javax.swing.JLabel jLabel122;
    public static javax.swing.JLabel jLabel123;
    public static javax.swing.JLabel jLabel124;
    public static javax.swing.JLabel jLabel125;
    public static javax.swing.JLabel jLabel126;
    public static javax.swing.JLabel jLabel127;
    public static javax.swing.JLabel jLabel128;
    public static javax.swing.JLabel jLabel129;
    public static javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel jLabel130;
    public static javax.swing.JLabel jLabel131;
    public static javax.swing.JLabel jLabel132;
    public static javax.swing.JLabel jLabel133;
    public static javax.swing.JLabel jLabel14;
    public static javax.swing.JLabel jLabel15;
    public static javax.swing.JLabel jLabel16;
    public static javax.swing.JLabel jLabel17;
    public static javax.swing.JLabel jLabel18;
    public static javax.swing.JLabel jLabel19;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel20;
    public static javax.swing.JLabel jLabel21;
    public static javax.swing.JLabel jLabel22;
    public static javax.swing.JLabel jLabel23;
    public static javax.swing.JLabel jLabel24;
    public static javax.swing.JLabel jLabel26;
    public static javax.swing.JLabel jLabel27;
    public static javax.swing.JLabel jLabel28;
    public static javax.swing.JLabel jLabel29;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel30;
    public static javax.swing.JLabel jLabel31;
    public static javax.swing.JLabel jLabel33;
    public static javax.swing.JLabel jLabel34;
    public static javax.swing.JLabel jLabel35;
    public static javax.swing.JLabel jLabel36;
    public static javax.swing.JLabel jLabel37;
    public static javax.swing.JLabel jLabel38;
    public static javax.swing.JLabel jLabel39;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel40;
    public static javax.swing.JLabel jLabel41;
    public static javax.swing.JLabel jLabel42;
    public static javax.swing.JLabel jLabel43;
    public static javax.swing.JLabel jLabel44;
    public static javax.swing.JLabel jLabel45;
    public static javax.swing.JLabel jLabel46;
    public static javax.swing.JLabel jLabel47;
    public static javax.swing.JLabel jLabel48;
    public static javax.swing.JLabel jLabel49;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel50;
    public static javax.swing.JLabel jLabel51;
    public static javax.swing.JLabel jLabel52;
    public static javax.swing.JLabel jLabel53;
    public static javax.swing.JLabel jLabel54;
    public static javax.swing.JLabel jLabel55;
    public static javax.swing.JLabel jLabel57;
    public static javax.swing.JLabel jLabel58;
    public static javax.swing.JLabel jLabel59;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel60;
    public static javax.swing.JLabel jLabel64;
    public static javax.swing.JLabel jLabel65;
    public static javax.swing.JLabel jLabel66;
    public static javax.swing.JLabel jLabel67;
    public static javax.swing.JLabel jLabel68;
    public static javax.swing.JLabel jLabel69;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel70;
    public static javax.swing.JLabel jLabel71;
    public static javax.swing.JLabel jLabel72;
    public static javax.swing.JLabel jLabel73;
    public static javax.swing.JLabel jLabel74;
    public static javax.swing.JLabel jLabel75;
    public static javax.swing.JLabel jLabel76;
    public static javax.swing.JLabel jLabel77;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel83;
    public static javax.swing.JLabel jLabel84;
    public static javax.swing.JLabel jLabel85;
    public static javax.swing.JLabel jLabel86;
    public static javax.swing.JLabel jLabel87;
    public static javax.swing.JLabel jLabel88;
    public static javax.swing.JLabel jLabel9;
    public static javax.swing.JLabel jLabel93;
    public static javax.swing.JLabel jLabel94;
    public static javax.swing.JLabel jLabel95;
    public static javax.swing.JLabel jLabel96;
    public static javax.swing.JLabel jLabel97;
    public static javax.swing.JLabel jLabel98;
    public static javax.swing.JLabel jLabel99;
    public static javax.swing.JMenu jMenu1;
    public static javax.swing.JMenuItem jMenuItem1;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel10;
    public static javax.swing.JPanel jPanel11;
    public static javax.swing.JPanel jPanel12;
    public static javax.swing.JPanel jPanel13;
    public static javax.swing.JPanel jPanel14;
    public static javax.swing.JPanel jPanel15;
    public static javax.swing.JPanel jPanel16;
    public static javax.swing.JPanel jPanel18;
    public static javax.swing.JPanel jPanel19;
    public static javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel20;
    public static javax.swing.JPanel jPanel21;
    public static javax.swing.JPanel jPanel22;
    public static javax.swing.JPanel jPanel23;
    public static javax.swing.JPanel jPanel25;
    public static javax.swing.JPanel jPanel26;
    public static javax.swing.JPanel jPanel27;
    public static javax.swing.JPanel jPanel28;
    public static javax.swing.JPanel jPanel29;
    public static javax.swing.JPanel jPanel3;
    public static javax.swing.JPanel jPanel30;
    public static javax.swing.JPanel jPanel33;
    public static javax.swing.JPanel jPanel34;
    public static javax.swing.JPanel jPanel35;
    public static javax.swing.JPanel jPanel36;
    public static javax.swing.JPanel jPanel38;
    public static javax.swing.JPanel jPanel4;
    public static javax.swing.JPanel jPanel40;
    public static javax.swing.JPanel jPanel42;
    public static javax.swing.JPanel jPanel43;
    public static javax.swing.JPanel jPanel44;
    public static javax.swing.JPanel jPanel45;
    public static javax.swing.JPanel jPanel47;
    public static javax.swing.JPanel jPanel5;
    public static javax.swing.JPanel jPanel6;
    public static javax.swing.JPanel jPanel7;
    public static javax.swing.JPanel jPanel8;
    public static javax.swing.JPanel jPanel9;
    public static javax.swing.JProgressBar jProgressBar10;
    public static javax.swing.JProgressBar jProgressBar11;
    public static javax.swing.JProgressBar jProgressBar3;
    public static javax.swing.JProgressBar jProgressBar8;
    public static javax.swing.JProgressBar jProgressBar9;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JSeparator jSeparator1;
    public static javax.swing.JSeparator jSeparator2;
    public static javax.swing.JSeparator jSeparator3;
    public static javax.swing.JSeparator jSeparator4;
    public static javax.swing.JSeparator jSeparator5;
    public static javax.swing.JSeparator jSeparator6;
    public static javax.swing.JTabbedPane jTabbedPane3;
    public static javax.swing.JTextField jTextField12;
    public static javax.swing.JTextField jTextField22;
    public static javax.swing.JTextField jTextField34;
    public static javax.swing.JTextField jTextField35;
    public static javax.swing.JTextField jTextField36;
    public static javax.swing.JTextField jTextField37;
    public static javax.swing.JTextField jTextField68;
    public static javax.swing.JTextField jTextField7;
    public static javax.swing.JTextField jTextField75;
    public static javax.swing.JTextField jTextField77;
    public static javax.swing.JTextField jTextField78;
    public static javax.swing.JTextField jTextField79;
    public static javax.swing.JTextField jTextField8;
    public static javax.swing.JTextField jTextField80;
    public static javax.swing.JTextField jTextField81;
    public static javax.swing.JTextField jTextField82;
    public static javax.swing.JTextField jTextField83;
    public static javax.swing.JTextField jTextField84;
    public static javax.swing.JTextField jTextField85;
    public static javax.swing.JToggleButton jToggleButton1;
    public static javax.swing.JLabel lblAccountNo;
    public static javax.swing.JLabel lblAvailableBalance;
    public static javax.swing.JLabel lblDisplayName;
    public static javax.swing.JLabel lblNameofBank;
    public static javax.swing.JTextField txtCurrentCredits1;
    public static javax.swing.JTextField txtCurrentCredits2;
    public static javax.swing.JTextField txtCurrentCredits3;
    public static javax.swing.JTextField txtDueDate1;
    public static javax.swing.JTextField txtDueDate2;
    public static javax.swing.JTextField txtDueDate3;
    public static javax.swing.JTextField txtEMI1;
    public static javax.swing.JTextField txtEMI2;
    public static javax.swing.JTextField txtEMI3;
    public static javax.swing.JTextField txtEMI4;
    public static javax.swing.JTextField txtEMI5;
    public static javax.swing.JTextField txtFixedValue;
    public static javax.swing.JTextField txtLoanDueDate1;
    public static javax.swing.JTextField txtLoanDueDate2;
    public static javax.swing.JTextField txtLoanDueDate3;
    public static javax.swing.JTextField txtLoanDueDate4;
    public static javax.swing.JTextField txtLoanDueDate5;
    public static javax.swing.JTextField txtMaxLimit1;
    public static javax.swing.JTextField txtMaxLimit2;
    public static javax.swing.JTextField txtMaxLimit3;
    public static javax.swing.JTextField txtMaxLimit5;
    public static javax.swing.JTextField txtMaxLimit6;
    public static javax.swing.JTextField txtMutualValue;
    public static javax.swing.JTextField txtPaidAmount1;
    public static javax.swing.JTextField txtPaidAmount2;
    public static javax.swing.JTextField txtPaidAmount3;
    public static javax.swing.JTextField txtPaidAmount4;
    public static javax.swing.JTextField txtPaidAmount5;
    public static javax.swing.JTextArea txtPropertyDesc;
    public static javax.swing.JTextField txtPropertyValue;
    public static javax.swing.JTextField txtTotalAmount1;
    public static javax.swing.JTextField txtTotalAmount2;
    public static javax.swing.JTextField txtTotalAmount3;
    public static javax.swing.JTextField txtTotalAmount4;
    public static javax.swing.JTextField txtTotalAmount5;
    public static javax.swing.JTextField txtTotalAmountRemaining;
    public static javax.swing.JTextField txtTotalCardCredits;
    public static javax.swing.JTextField txtTotalCash;
    public static javax.swing.JTextField txtTotalInvestment;
    public static javax.swing.JTextField txtTotalLoanAmount;
    public static javax.swing.JTextField txtTotalLoanPaid;
    public static javax.swing.JTextField txtTotalMatureValue;
    public static javax.swing.JTextField txtTotalMaxLimit;
    public static javax.swing.JTextField txtTotalPropertyValue;
    public static javax.swing.JTextField txtTotalTransactionAmount;
    public static javax.swing.JTextField txtTransactionAmt1;
    public static javax.swing.JTextField txtTransactionAmt2;
    public static javax.swing.JTextField txtTransactionAmt3;
    public static javax.swing.JTextField txtTransactionAmt4;
    public static javax.swing.JTextField txtTransactionAmt5;
    public static javax.swing.JTextField txtTransactionCategory1;
    public static javax.swing.JTextField txtTransactionCategory2;
    public static javax.swing.JTextField txtTransactionCategory3;
    public static javax.swing.JTextField txtTransactionCategory4;
    public static javax.swing.JTextField txtTransactionCategory5;
    public static javax.swing.JTextField txtTransactionDate1;
    public static javax.swing.JTextField txtTransactionDate2;
    public static javax.swing.JTextField txtTransactionDate3;
    public static javax.swing.JTextField txtTransactionDate4;
    public static javax.swing.JTextField txtTransactionDate5;
    public static javax.swing.JTextField txtTransactionDesc1;
    public static javax.swing.JTextField txtTransactionDesc2;
    public static javax.swing.JTextField txtTransactionDesc3;
    public static javax.swing.JTextField txtTransactionDesc4;
    public static javax.swing.JTextField txtTransactionDesc5;
    // End of variables declaration//GEN-END:variables
}
