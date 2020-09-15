
package javaframes;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class DeleteCourse extends javax.swing.JFrame {

    public DeleteCourse() {
        initComponents();
        setDefaultCloseOperation(DeleteCourse.HIDE_ON_CLOSE);
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
        Removetime2 = new javax.swing.JLabel();
        Setremovetime1 = new javax.swing.JTextField();
        Removetime3 = new javax.swing.JLabel();
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

        Removetime3.setBackground(new java.awt.Color(255, 255, 255));
        Removetime3.setFont(new java.awt.Font("Transit521 BT", 1, 18)); // NOI18N
        Removetime3.setForeground(new java.awt.Color(255, 255, 255));
        Removetime3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Removetime3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/black-wallclock.png"))); // NOI18N
        Removetime3.setText("Course Name");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Setremovetime, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Removetime2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Removetime3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Setremovetime1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(ConfirmremoveSlot, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(245, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RemoveDate, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SetRemoveDate, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(275, 275, 275))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Removetime2)
                    .addComponent(Removetime3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Setremovetime)
                    .addComponent(Setremovetime1))
                .addGap(34, 34, 34)
                .addComponent(RemoveDate)
                .addGap(18, 18, 18)
                .addComponent(SetRemoveDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(ConfirmremoveSlot)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        RemoveSlotLabel.setFont(new java.awt.Font("Transit521 BT", 1, 36)); // NOI18N
        RemoveSlotLabel.setForeground(new java.awt.Color(255, 255, 255));
        RemoveSlotLabel.setText("Delete Course");

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RemoveSlotLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RemoveSlotLabel)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
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

    private void ConfirmremoveSlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmremoveSlotActionPerformed
        Connection con;
        Statement stmt;
        String prereq="",dept="",cID="",ins="",cname="",Dura="";
        boolean error1=true,error2=true,error3=true,error4=true;
        
        if(!SetRemoveDate.getText().equals(""))
        {
            prereq=SetRemoveDate.getText();
            error1=false;
        }
        else 
            JOptionPane.showMessageDialog(SetRemoveDate,"Please enter Pre-requisite");
        
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
            JOptionPane.showMessageDialog(Setremovetime1,"Please enter Course Name");
        
        if(error1 == false && error2 == false  && error4 == false)
        {
            try
            {
                con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=project","ramin_rafi","12569");
                stmt=con.createStatement();
                try
                {
                    //float Duration = Float.valueOf(Dura);
                    
                    String query = " delete from Course where courseID = ? and name = ? and prereq=?";
                            

                    // create the mysql insert preparedstatement
                    PreparedStatement preparedStmt = con.prepareStatement(query);
                    
                    preparedStmt.setString(1,cID);
                    preparedStmt.setString(2,cname);
                    preparedStmt.setString(3,prereq);
                    
                    String query2 = " delete from section where and courseID =?";                      
                        // create the mysql insert preparedstatement
                    PreparedStatement preparedStmt2 = con.prepareStatement(query2);
                    preparedStmt2.setString(1,cID);
                   // execute the preparedstatement

                       // execute the preparedstatement
                   if( preparedStmt.executeUpdate()==0  || preparedStmt.executeUpdate()==-1)
                       JOptionPane.showMessageDialog(ConfirmremoveSlot,"Failed to remove course.");                       
                   else
                       JOptionPane.showMessageDialog(ConfirmremoveSlot,"Course has been removed");
                    
                
                }
                catch(SQLException | HeadlessException E)
                {
            
                     JOptionPane.showMessageDialog(ConfirmremoveSlot,E);
                }       
            }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(ConfirmremoveSlot,e);
        
        }
        } 
    }//GEN-LAST:event_ConfirmremoveSlotActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
          this.setVisible(false);
        UpdateTimetable tb= new UpdateTimetable();
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
            java.util.logging.Logger.getLogger(DeleteCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ConfirmremoveSlot;
    private javax.swing.JLabel RemoveDate;
    private javax.swing.JLabel RemoveSlotLabel;
    private javax.swing.JLabel Removetime2;
    private javax.swing.JLabel Removetime3;
    private javax.swing.JTextField SetRemoveDate;
    private javax.swing.JTextField Setremovetime;
    private javax.swing.JTextField Setremovetime1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
