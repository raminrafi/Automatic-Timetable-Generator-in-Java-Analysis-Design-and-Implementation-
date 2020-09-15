
package javaframes;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class AddCourse extends javax.swing.JFrame {

    public AddCourse() {
        initComponents();
        setDefaultCloseOperation(AddCourse.HIDE_ON_CLOSE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Setremovetime = new javax.swing.JTextField();
        RemoveDate = new javax.swing.JLabel();
        SetRemoveDate = new javax.swing.JTextField();
        ConfirmremoveSlot = new javax.swing.JToggleButton();
        Removetime1 = new javax.swing.JLabel();
        Removetime2 = new javax.swing.JLabel();
        Setremovetime1 = new javax.swing.JTextField();
        SetRemoveDate2 = new javax.swing.JTextField();
        RemoveDate1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        Removetime4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        RemoveDate2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        Removetime5 = new javax.swing.JLabel();
        RemoveSlotLabel = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));

        Setremovetime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetremovetimeActionPerformed(evt);
            }
        });

        RemoveDate.setBackground(new java.awt.Color(255, 255, 255));
        RemoveDate.setFont(new java.awt.Font("Transit521 BT", 1, 18)); // NOI18N
        RemoveDate.setForeground(new java.awt.Color(255, 255, 255));
        RemoveDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RemoveDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/calendar-page-of-day-6-of-a-month (1).png"))); // NOI18N
        RemoveDate.setText("Pre-req");

        SetRemoveDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetRemoveDateActionPerformed(evt);
            }
        });

        ConfirmremoveSlot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/check.png"))); // NOI18N
        ConfirmremoveSlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmremoveSlotActionPerformed(evt);
            }
        });

        Removetime1.setBackground(new java.awt.Color(255, 255, 255));
        Removetime1.setFont(new java.awt.Font("Transit521 BT", 1, 18)); // NOI18N
        Removetime1.setForeground(new java.awt.Color(255, 255, 255));
        Removetime1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Removetime1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/black-wallclock.png"))); // NOI18N
        Removetime1.setText("Department");

        Removetime2.setBackground(new java.awt.Color(255, 255, 255));
        Removetime2.setFont(new java.awt.Font("Transit521 BT", 1, 18)); // NOI18N
        Removetime2.setForeground(new java.awt.Color(255, 255, 255));
        Removetime2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Removetime2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/black-wallclock.png"))); // NOI18N
        Removetime2.setText("CourseID");

        Setremovetime1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Setremovetime1ActionPerformed(evt);
            }
        });

        SetRemoveDate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetRemoveDate2ActionPerformed(evt);
            }
        });

        RemoveDate1.setBackground(new java.awt.Color(255, 255, 255));
        RemoveDate1.setFont(new java.awt.Font("Transit521 BT", 1, 18)); // NOI18N
        RemoveDate1.setForeground(new java.awt.Color(255, 255, 255));
        RemoveDate1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RemoveDate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/calendar-page-of-day-6-of-a-month (1).png"))); // NOI18N
        RemoveDate1.setText("Instructor");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        Removetime4.setBackground(new java.awt.Color(255, 255, 255));
        Removetime4.setFont(new java.awt.Font("Transit521 BT", 1, 18)); // NOI18N
        Removetime4.setForeground(new java.awt.Color(255, 255, 255));
        Removetime4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Removetime4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/black-wallclock.png"))); // NOI18N
        Removetime4.setText("Total Sections");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        RemoveDate2.setBackground(new java.awt.Color(255, 255, 255));
        RemoveDate2.setFont(new java.awt.Font("Transit521 BT", 1, 18)); // NOI18N
        RemoveDate2.setForeground(new java.awt.Color(255, 255, 255));
        RemoveDate2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RemoveDate2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/calendar-page-of-day-6-of-a-month (1).png"))); // NOI18N
        RemoveDate2.setText("BatchID");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        Removetime5.setBackground(new java.awt.Color(255, 255, 255));
        Removetime5.setFont(new java.awt.Font("Transit521 BT", 1, 18)); // NOI18N
        Removetime5.setForeground(new java.awt.Color(255, 255, 255));
        Removetime5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Removetime5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/black-wallclock.png"))); // NOI18N
        Removetime5.setText("Course Name");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RemoveDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(RemoveDate, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Removetime5)
                            .addComponent(Removetime4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGap(15, 15, 15))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(SetRemoveDate, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SetRemoveDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Removetime2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Setremovetime, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Setremovetime1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Removetime1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(RemoveDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ConfirmremoveSlot, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Removetime2)
                    .addComponent(Removetime5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Setremovetime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Setremovetime1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RemoveDate)
                    .addComponent(Removetime1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SetRemoveDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SetRemoveDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RemoveDate1)
                    .addComponent(Removetime4))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(RemoveDate2)
                        .addGap(26, 26, 26)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ConfirmremoveSlot))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        RemoveSlotLabel.setFont(new java.awt.Font("Transit521 BT", 1, 36)); // NOI18N
        RemoveSlotLabel.setForeground(new java.awt.Color(255, 255, 255));
        RemoveSlotLabel.setText("Add Course");

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/reply (1).png"))); // NOI18N
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(RemoveSlotLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(RemoveSlotLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SetremovetimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetremovetimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SetremovetimeActionPerformed

    private void SetRemoveDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetRemoveDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SetRemoveDateActionPerformed

    private void Setremovetime1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Setremovetime1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Setremovetime1ActionPerformed

    private void SetRemoveDate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetRemoveDate2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SetRemoveDate2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void ConfirmremoveSlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmremoveSlotActionPerformed
         
        Connection con;
        Statement stmt;
        String prereq="",dept="",cID="",ins="",cname="",batch="";
        String sect="";
        int number=0; //sec count
      
        boolean error1=true,error2=true,error3=true,error4=true,error5=true,error6=true,error7=true;
        
        if(!SetRemoveDate.getText().equals(""))
        {
            prereq=SetRemoveDate.getText();
            error1=false;
        }
        else 
            JOptionPane.showMessageDialog(SetRemoveDate,"Please enter pre-requisite");
        
        if(!SetRemoveDate2.getText().equals(""))
        {
            dept=SetRemoveDate2.getText();
            error3=false;
        }
        else 
            JOptionPane.showMessageDialog(SetRemoveDate2,"Please enter time DepartmentID");
        if(!Setremovetime.getText().equals(""))
        {
            cID=Setremovetime.getText();
            error4=false;
        }
        else
            JOptionPane.showMessageDialog(Setremovetime,"Please enter CourseID");
        if(!Setremovetime1.getText().equals(""))
        {
            cname=Setremovetime1.getText();
            error2=false;
        }
        else
            JOptionPane.showMessageDialog(Setremovetime1,"Please enter course name");
        if(!jTextField1.getText().equals(""))
        {
            ins=jTextField1.getText();
            error5=false;
        }
        else
            JOptionPane.showMessageDialog(jTextField1,"Please enter InstructorID");
       
        
        if(!jTextField2.getText().equals(""))
        {
            sect=jTextField2.getText();
            number = Integer.parseInt(sect);
            error6=false;
        }
        else
            JOptionPane.showMessageDialog(jTextField2,"Please enter number of sections");
        if(!jTextField3.getText().equals(""))
        {
            sect=jTextField3.getText();
            //number = Integer.parseInt(sect);
            error7=false;
        }
        else
            JOptionPane.showMessageDialog(jTextField3,"Please enter BatchID");
        
        if(error1 == false && error2 == false && error3 == false && error4 == false 
                && error5==false && error6==false && error7==false )
        {
            try
            {
                con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=project","ramin_rafi","12569");
                stmt=con.createStatement();
                try
                {                                    
                    String query = " insert into Course"
                            + " values (?, ?, ?, ?, ?, ?, ?, ?,?)";

                    // create the mysql insert preparedstatement
                    PreparedStatement preparedStmt = con.prepareStatement(query);
                    preparedStmt.setString(1,cID);
                    preparedStmt.setString(2,cname);
                    preparedStmt.setInt(3,3); //cr hrs
                    preparedStmt.setDouble(4,1.5);//duration
                    preparedStmt.setString (5,prereq);
                    preparedStmt.setString (6, ins);
                    preparedStmt.setInt(7,number);
                    preparedStmt.setString (8, dept);
                    preparedStmt.setString (9, sect);
                                       
                    // execute the preparedstatement
                    preparedStmt.execute(); 
                    JOptionPane.showMessageDialog(ConfirmremoveSlot,"Course has been added");
                    
                    //for(int i=0;i<number;i++)
                    //{
                    String query2 = " insert into Section"
                            + " values (?, ?, ?, ?)";

                    // create the mysql insert preparedstatement
                    PreparedStatement preparedStmt2 = con.prepareStatement(query2);
                    preparedStmt2.setString(1,"A");
                    preparedStmt2.setInt(2,0);
                    preparedStmt2.setInt(3,50);
                    preparedStmt2.setString(4,cID);
                    preparedStmt2.execute(); 
                    JOptionPane.showMessageDialog(ConfirmremoveSlot,"A default section has also been added for this course!");
                   // }
                }
                catch(SQLException | HeadlessException E)
                {
                     JOptionPane.showMessageDialog(ConfirmremoveSlot,"Please enter correct information");
                }       
            }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(ConfirmremoveSlot,"Please enter correct information");
        
        }
    } 
    }//GEN-LAST:event_ConfirmremoveSlotActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        UpdateTimetable tb = new UpdateTimetable();
        tb.setVisible(true);
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed
   

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
            java.util.logging.Logger.getLogger(AddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ConfirmremoveSlot;
    private javax.swing.JLabel RemoveDate;
    private javax.swing.JLabel RemoveDate1;
    private javax.swing.JLabel RemoveDate2;
    private javax.swing.JLabel RemoveSlotLabel;
    private javax.swing.JLabel Removetime1;
    private javax.swing.JLabel Removetime2;
    private javax.swing.JLabel Removetime4;
    private javax.swing.JLabel Removetime5;
    private javax.swing.JTextField SetRemoveDate;
    private javax.swing.JTextField SetRemoveDate2;
    private javax.swing.JTextField Setremovetime;
    private javax.swing.JTextField Setremovetime1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
