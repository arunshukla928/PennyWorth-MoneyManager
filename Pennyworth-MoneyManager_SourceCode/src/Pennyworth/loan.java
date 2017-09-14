package  Pennyworth;

import static Pennyworth.addFD.FD_No;
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


public class loan extends javax.swing.JFrame {

    
    static String LoanType;
    static int LoanAmt;
    static String LoanTenure;
    static double LoanRate;
    static int EMIAmount;
    static int NoofEMI;
    static String DueDate;
    static int TotalLoanAmt;
    
  
    public loan() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ComboLoanType = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtLoanAmt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ComboLoanTenure = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtLoanRate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEMIAmount = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNoofEMI = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ComboDay = new javax.swing.JComboBox();
        ComboMonth = new javax.swing.JComboBox();
        ComboYear = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(34, 168, 227));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pennyworth/sbi.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(138, 138, 138))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(34, 168, 227));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Ubuntu Condensed", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(233, 42, 42));
        jLabel1.setText("                      Apply For Easy Loan ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Type of Loan ");

        ComboLoanType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Please Select Type of Loan", "Education Loan", "Car Loan", "Home Loan", "Gold Loan", "Personal Loan", " " }));
        ComboLoanType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboLoanTypeActionPerformed(evt);
            }
        });

        jLabel3.setText("Loan Amount");

        jLabel4.setText("Loan Tenure");

        ComboLoanTenure.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Please Select Tenure For Your Loan", "6 Months", "1 Year", "2 Years", " ", " ", " " }));
        ComboLoanTenure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboLoanTenureActionPerformed(evt);
            }
        });

        jLabel5.setText("Interest  Rate");

        txtLoanRate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLoanRateFocusLost(evt);
            }
        });

        jLabel6.setText("EMI Amount");

        jLabel8.setText("No of EMI");

        txtNoofEMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoofEMIActionPerformed(evt);
            }
        });

        jLabel9.setText("Due Date");

        ComboDay.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", " " }));
        ComboDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboDayActionPerformed(evt);
            }
        });

        ComboMonth.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));

        ComboYear.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", "2016", "2017", "2018", "2019", "2020", " " }));

        jButton1.setText("Apply For Loan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ComboLoanType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtLoanAmt)
                                .addComponent(ComboLoanTenure, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtLoanRate)
                                .addComponent(txtEMIAmount)
                                .addComponent(txtNoofEMI))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ComboDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ComboYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jButton1)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboLoanType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLoanAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ComboLoanTenure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtLoanRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEMIAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNoofEMI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(ComboDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        
        try{
            
            
            OPERATIONS.reterive();
            
            MongoClient mongoClient = new MongoClient("localhost", 27017); // CREATING THE MONGO CLIENT OBJECT
            DB db = mongoClient.getDB("PENNYWORTH");        // Object to access the database

                 // CHOOSING THE COLLECTION


            DBCollection coll_bank = db.getCollection("PENNYWORTH_BANKS");
            DBCollection coll = db.getCollection("PENNYWORTH_USERS");

          
          LoanType=(String)ComboLoanType.getSelectedItem();
            LoanAmt=Integer.parseInt(txtLoanAmt.getText());
            LoanTenure=(String)(ComboLoanTenure.getSelectedItem());
            
            
            if(ComboLoanType.getSelectedIndex()==1){
              
                
                LoanRate=9.0;
              txtLoanRate.setText(""+LoanRate);
              txtLoanRate.setEditable(false);
              
              
              
            }
            
            if(ComboLoanType.getSelectedIndex()==2){
              LoanRate=8.0;
              txtLoanRate.setText(""+LoanRate);
            txtLoanRate.setEditable(false);
            }
            
            if(ComboLoanType.getSelectedIndex()==3){
              LoanRate=8.5;
            
              txtLoanRate.setEditable(false);
              txtLoanRate.setText(""+LoanRate);
            }
            
            if(ComboLoanType.getSelectedIndex()==4){
              LoanRate=8.9;
              
              txtLoanRate.setEditable(false);
              txtLoanRate.setText(""+LoanRate);
            }
            if(ComboLoanType.getSelectedIndex()==5){
              LoanRate=9.2;
              txtLoanRate.setEditable(false);
              txtLoanRate.setText(""+LoanRate);
            }
            
            
            
            
            
            
            
            
            if(ComboLoanTenure.getSelectedIndex()==1){
                
                NoofEMI=6;
                txtNoofEMI.setText(""+NoofEMI);
                txtNoofEMI.setEditable(false);
                TotalLoanAmt=(int)(LoanAmt*LoanRate*0.01*0.5);
                TotalLoanAmt=LoanAmt+TotalLoanAmt;
                    
                EMIAmount=TotalLoanAmt/NoofEMI;
                txtEMIAmount.setText(""+EMIAmount);
                
                
                ComboDay.setSelectedIndex(7);
                ComboMonth.setSelectedIndex(3);
                ComboYear.setSelectedIndex(2);
                   
                ComboDay.setEnabled(false);
                ComboMonth.setEnabled(false);
                ComboYear.setEnabled(false);
                
                
                
                DueDate=(String)(ComboDay.getSelectedItem()+"/"+ComboMonth.getSelectedItem()+"/"+ComboYear.getSelectedItem());
                   
                   
            }
            
            
            if(ComboLoanTenure.getSelectedIndex()==2){
                
                NoofEMI=12;
                txtNoofEMI.setText(""+NoofEMI);
                txtNoofEMI.setEditable(false);
                 TotalLoanAmt=(int)(LoanAmt*LoanRate*0.01*1);
                    TotalLoanAmt=LoanAmt+TotalLoanAmt;
                    
                    EMIAmount=TotalLoanAmt/NoofEMI;
                        txtEMIAmount.setText(""+EMIAmount);
                        
                        
                        
                 ComboDay.setSelectedIndex(7);
                ComboMonth.setSelectedIndex(11);
                ComboYear.setSelectedIndex(2);
                   
                
                  ComboDay.setEnabled(false);
                ComboMonth.setEnabled(false);
                ComboYear.setEnabled(false);
                   
                
                DueDate=(String)(ComboDay.getSelectedItem()+"/"+ComboMonth.getSelectedItem()+"/"+ComboYear.getSelectedItem());
                
            }
            
            
            
            if(ComboLoanTenure.getSelectedIndex()==3){
                
                NoofEMI=24;
                txtNoofEMI.setText(""+NoofEMI);
                txtNoofEMI.setEditable(false);
                 TotalLoanAmt=(int)(LoanAmt*LoanRate*0.01*2);
                    TotalLoanAmt=LoanAmt+TotalLoanAmt;
                    
                    EMIAmount=TotalLoanAmt/NoofEMI;
                        txtEMIAmount.setText(""+EMIAmount);
                
                        
                ComboDay.setSelectedIndex(7);
                ComboMonth.setSelectedIndex(11);
                ComboYear.setSelectedIndex(3);
                   
                
                
                  ComboDay.setEnabled(false);
                ComboMonth.setEnabled(false);
                ComboYear.setEnabled(false);
                   
                
                DueDate=(String)(ComboDay.getSelectedItem()+"/"+ComboMonth.getSelectedItem()+"/"+ComboYear.getSelectedItem());
            }     
            
            
          DBObject curUser=new BasicDBObject("AccountNo",OPERATIONS.Acc);
          
          DBObject listItem = new BasicDBObject("Loans", new BasicDBObject("LoanNo",(int)(Math.random()*10000)).append("LoanAmount",LoanAmt).append("LoanRate",LoanRate).append("TotalLoanAmount",TotalLoanAmt).append("EMIRemaining",NoofEMI).append("DueDate",DueDate).append("AmountPaid",0).append("MonthlyEMI",EMIAmount).append("MonthlyDueDate","06/11/2016"));
          DBObject updateQuery = new BasicDBObject("$push", listItem);
          coll_bank.update(curUser, updateQuery);
            
           
         OPERATIONS.reterive();
         
         this.dispose();
        
       
          
          
          
          
          
          
     
        
        }
        
         catch (UnknownHostException ex) {
            Logger.getLogger(Mint_login.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ComboLoanTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboLoanTypeActionPerformed
           
            if(ComboLoanType.getSelectedIndex()==1){
              LoanRate=9.0;
              txtLoanRate.setText(""+LoanRate);
              txtLoanRate.setEditable(false);
            }
            
            if(ComboLoanType.getSelectedIndex()==2){
              LoanRate=8.0;
              txtLoanRate.setText(""+LoanRate);
            txtLoanRate.setEditable(false);
            }
            
            if(ComboLoanType.getSelectedIndex()==3){
              LoanRate=8.5;
            
              txtLoanRate.setEditable(false);
              txtLoanRate.setText(""+LoanRate);
            }
            
            if(ComboLoanType.getSelectedIndex()==4){
              LoanRate=8.9;
              
              txtLoanRate.setEditable(false);
              txtLoanRate.setText(""+LoanRate);
            }
            if(ComboLoanType.getSelectedIndex()==5){
              LoanRate=9.2;
              txtLoanRate.setEditable(false);
              txtLoanRate.setText(""+LoanRate);
            }
            
    }//GEN-LAST:event_ComboLoanTypeActionPerformed

    private void ComboLoanTenureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboLoanTenureActionPerformed
if(ComboLoanTenure.getSelectedIndex()==1){
                
                NoofEMI=6;
                txtNoofEMI.setText(""+NoofEMI);
                txtNoofEMI.setEditable(false);
                
            }
            
            
            if(ComboLoanTenure.getSelectedIndex()==2){
                
                NoofEMI=12;
                txtNoofEMI.setText(""+NoofEMI);
                txtNoofEMI.setEditable(false);
                
            }
            
            
            
            if(ComboLoanTenure.getSelectedIndex()==3){
                
                NoofEMI=24;
                txtNoofEMI.setText(""+NoofEMI);
                txtNoofEMI.setEditable(false);
                
            }
            
                    // TODO add your handling code here:
    }//GEN-LAST:event_ComboLoanTenureActionPerformed

    private void txtLoanRateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLoanRateFocusLost
        // TODO add your handling code here:
         LoanType=(String)ComboLoanType.getSelectedItem();
            LoanAmt=Integer.parseInt(txtLoanAmt.getText());
            LoanTenure=(String)(ComboLoanTenure.getSelectedItem());
            
            
            if(ComboLoanType.getSelectedIndex()==1){
              
                
                LoanRate=9.0;
              txtLoanRate.setText(""+LoanRate);
              txtLoanRate.setEditable(false);
              
              
              
            }
            
            if(ComboLoanType.getSelectedIndex()==2){
              LoanRate=8.0;
              txtLoanRate.setText(""+LoanRate);
            txtLoanRate.setEditable(false);
            }
            
            if(ComboLoanType.getSelectedIndex()==3){
              LoanRate=8.5;
            
              txtLoanRate.setEditable(false);
              txtLoanRate.setText(""+LoanRate);
            }
            
            if(ComboLoanType.getSelectedIndex()==4){
              LoanRate=8.9;
              
              txtLoanRate.setEditable(false);
              txtLoanRate.setText(""+LoanRate);
            }
            if(ComboLoanType.getSelectedIndex()==5){
              LoanRate=9.2;
              txtLoanRate.setEditable(false);
              txtLoanRate.setText(""+LoanRate);
            }
            
            
            
            
            
            
            
            
            if(ComboLoanTenure.getSelectedIndex()==1){
                
                NoofEMI=6;
                txtNoofEMI.setText(""+NoofEMI);
                txtNoofEMI.setEditable(false);
                TotalLoanAmt=(int)(LoanAmt*LoanRate*0.01*0.5);
                TotalLoanAmt=LoanAmt+TotalLoanAmt;
                    
                EMIAmount=TotalLoanAmt/NoofEMI;
                txtEMIAmount.setText(""+EMIAmount);
                
                
                ComboDay.setSelectedIndex(7);
                ComboMonth.setSelectedIndex(3);
                ComboYear.setSelectedIndex(2);
                   
                ComboDay.setEnabled(false);
                ComboMonth.setEnabled(false);
                ComboYear.setEnabled(false);
                
                
                
                DueDate=(String)(ComboDay.getSelectedItem()+"/"+ComboMonth.getSelectedItem()+"/"+ComboYear.getSelectedItem());
                   
                   
            }
            
            
            if(ComboLoanTenure.getSelectedIndex()==2){
                
                NoofEMI=12;
                txtNoofEMI.setText(""+NoofEMI);
                txtNoofEMI.setEditable(false);
                 TotalLoanAmt=(int)(LoanAmt*LoanRate*0.01*1);
                    TotalLoanAmt=LoanAmt+TotalLoanAmt;
                    
                    EMIAmount=TotalLoanAmt/NoofEMI;
                        txtEMIAmount.setText(""+EMIAmount);
                        
                        
                        
                 ComboDay.setSelectedIndex(7);
                ComboMonth.setSelectedIndex(11);
                ComboYear.setSelectedIndex(2);
                   
                
                  ComboDay.setEnabled(false);
                ComboMonth.setEnabled(false);
                ComboYear.setEnabled(false);
                   
                
                DueDate=(String)(ComboDay.getSelectedItem()+"/"+ComboMonth.getSelectedItem()+"/"+ComboYear.getSelectedItem());
                
            }
            
            
            
            if(ComboLoanTenure.getSelectedIndex()==3){
                
                NoofEMI=24;
                txtNoofEMI.setText(""+NoofEMI);
                txtNoofEMI.setEditable(false);
                 TotalLoanAmt=(int)(LoanAmt*LoanRate*0.01*2);
                    TotalLoanAmt=LoanAmt+TotalLoanAmt;
                    
                    EMIAmount=TotalLoanAmt/NoofEMI;
                        txtEMIAmount.setText(""+EMIAmount);
                
                        
                ComboDay.setSelectedIndex(7);
                ComboMonth.setSelectedIndex(11);
                ComboYear.setSelectedIndex(3);
                   
                
                
                  ComboDay.setEnabled(false);
                ComboMonth.setEnabled(false);
                ComboYear.setEnabled(false);
                   
                
                DueDate=(String)(ComboDay.getSelectedItem()+"/"+ComboMonth.getSelectedItem()+"/"+ComboYear.getSelectedItem());
            }
            
            
            
    }//GEN-LAST:event_txtLoanRateFocusLost

    private void ComboDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboDayActionPerformed
      
            if(ComboLoanTenure.getSelectedIndex()==1){
            
                
                
                
                
            }
            
            
            if(ComboLoanTenure.getSelectedIndex()==2){
                
            
                
            }
            
            
            
            if(ComboLoanTenure.getSelectedIndex()==3){
                
            
            }
            
            
            
    }//GEN-LAST:event_ComboDayActionPerformed

    private void txtNoofEMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoofEMIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoofEMIActionPerformed

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
            java.util.logging.Logger.getLogger(loan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboDay;
    private javax.swing.JComboBox ComboLoanTenure;
    private javax.swing.JComboBox ComboLoanType;
    private javax.swing.JComboBox ComboMonth;
    private javax.swing.JComboBox ComboYear;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtEMIAmount;
    private javax.swing.JTextField txtLoanAmt;
    private javax.swing.JTextField txtLoanRate;
    private javax.swing.JTextField txtNoofEMI;
    // End of variables declaration//GEN-END:variables
}
