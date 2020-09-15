
package javaframes;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


public class RemoveSlott extends javax.swing.JFrame {

   
    public RemoveSlott() {
        initComponents();
        setDefaultCloseOperation(RemoveSlott.HIDE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Removetime = new javax.swing.JLabel();
        Start_time = new javax.swing.JTextField();
        RemoveDate = new javax.swing.JLabel();
        Date = new javax.swing.JTextField();
        ConfirmremoveSlot = new javax.swing.JToggleButton();
        Removetime1 = new javax.swing.JLabel();
        Venue = new javax.swing.JTextField();
        Removetime2 = new javax.swing.JLabel();
        End_time = new javax.swing.JTextField();
        Removetime3 = new javax.swing.JLabel();
        Duration = new javax.swing.JTextField();
        RmoveResultLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RemoveslotResult = new javax.swing.JTextArea();
        RemoveSlotLabel = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));

        Removetime.setBackground(new java.awt.Color(255, 255, 255));
        Removetime.setFont(new java.awt.Font("Transit521 BT", 1, 18)); // NOI18N
        Removetime.setForeground(new java.awt.Color(255, 255, 255));
        Removetime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Removetime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/venue (3).png"))); // NOI18N
        Removetime.setText("Enter Venue:");
        Removetime.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        Start_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start_timeActionPerformed(evt);
            }
        });

        RemoveDate.setBackground(new java.awt.Color(255, 255, 255));
        RemoveDate.setFont(new java.awt.Font("Transit521 BT", 1, 18)); // NOI18N
        RemoveDate.setForeground(new java.awt.Color(255, 255, 255));
        RemoveDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RemoveDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/calendar-page-of-day-6-of-a-month (1).png"))); // NOI18N
        RemoveDate.setText("Enter Date:");

        Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateActionPerformed(evt);
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
        Removetime1.setText("Enter Duration:");

        Venue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VenueActionPerformed(evt);
            }
        });

        Removetime2.setBackground(new java.awt.Color(255, 255, 255));
        Removetime2.setFont(new java.awt.Font("Transit521 BT", 1, 18)); // NOI18N
        Removetime2.setForeground(new java.awt.Color(255, 255, 255));
        Removetime2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Removetime2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/black-wallclock.png"))); // NOI18N
        Removetime2.setText("Enter Start Time:");

        End_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                End_timeActionPerformed(evt);
            }
        });

        Removetime3.setBackground(new java.awt.Color(255, 255, 255));
        Removetime3.setFont(new java.awt.Font("Transit521 BT", 1, 18)); // NOI18N
        Removetime3.setForeground(new java.awt.Color(255, 255, 255));
        Removetime3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Removetime3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/black-wallclock.png"))); // NOI18N
        Removetime3.setText("Enter End Time:");

        Duration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DurationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Start_time, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RemoveDate, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(End_time, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addComponent(Removetime1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Duration, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Removetime2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Removetime3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Removetime, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(Venue, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(173, 173, 173)
                                .addComponent(ConfirmremoveSlot, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Removetime2)
                    .addComponent(Removetime3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Start_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(End_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Removetime1)
                    .addComponent(RemoveDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Duration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(Removetime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Venue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(ConfirmremoveSlot))
        );

        RmoveResultLabel.setFont(new java.awt.Font("Transit521 BT", 1, 36)); // NOI18N
        RmoveResultLabel.setForeground(new java.awt.Color(255, 255, 255));
        RmoveResultLabel.setText("Result:");

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));

        RemoveslotResult.setColumns(20);
        RemoveslotResult.setRows(5);
        jScrollPane1.setViewportView(RemoveslotResult);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addContainerGap())
        );

        RemoveSlotLabel.setFont(new java.awt.Font("Transit521 BT", 1, 36)); // NOI18N
        RemoveSlotLabel.setForeground(new java.awt.Color(255, 255, 255));
        RemoveSlotLabel.setText(" Remove Slot:");

        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/reply (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RemoveSlotLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(back))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RmoveResultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(RemoveSlotLabel))
                    .addComponent(back))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RmoveResultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void Start_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Start_timeActionPerformed

    private void DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateActionPerformed

    private void VenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VenueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VenueActionPerformed

    private void End_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_End_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_End_timeActionPerformed

    private void DurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DurationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DurationActionPerformed

    private void ConfirmremoveSlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmremoveSlotActionPerformed
        // TODO add your handling code here:
        Connection con;
        Statement stmt;
        boolean error1=true,error2=true,error3=true,error4=true,error5=true;
        String weekday="",VenueID="",Stime="",Etime="",Dura="";
        float dur=0;
        
        if(!Date.getText().equals(""))
        {
            error1=false;
            weekday=Date.getText();
        }
        else 
            JOptionPane.showMessageDialog(Date,"Please enter day!");
        if(!Venue.getText().equals(""))
        {
            VenueID=Venue.getText();
            error2=false;
        }
        else
            JOptionPane.showMessageDialog(Venue,"Please enter venueID!");
        if(!Duration.getText().equals(""))
        {
            Dura=Duration.getText();
            dur=Float.parseFloat(Dura);
            System.out.println(dur);
            error3=false;
        }
        else 
            JOptionPane.showMessageDialog(Duration,"Please enter time duration!");
        if(!Start_time.getText().equals(""))
        {
            Stime=Start_time.getText();
            error4=false;
        }
        else
            JOptionPane.showMessageDialog(Start_time,"Please enter startTime!");
        if(!End_time.getText().equals(""))
        {
            Etime=End_time.getText();
            error5=false;
        }
        else
            JOptionPane.showMessageDialog(End_time,"Please enter End time!");
        
        if(error1 == false && error2 == false && error3 == false && error4 == false && error5 == false)
        {
          try
            {
                con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=project","Abdul_Rehman","123456");
                stmt=con.createStatement();
                try
                {
                   // float Duraton = Float.valueOf(Dura);
                    String query = " delete from TimeSlot where [Day]=? and Venue=? and Duration=? and StartTime=? and EndTime = ?";
                    PreparedStatement preparedStmt = con.prepareStatement(query);
                    preparedStmt.setString (1, weekday);
                    preparedStmt.setString (2,VenueID);
                    preparedStmt.setFloat(3,dur);
                    preparedStmt.setString(4,Stime);
                    preparedStmt.setString(5,Etime);

                     // execute the preparedstatement
                     if( preparedStmt.executeUpdate()==0 || preparedStmt.executeUpdate()==-1)
                       {
                         JOptionPane.showMessageDialog(ConfirmremoveSlot,"Failed to remove slot");   
                       }
                      else
                        JOptionPane.showMessageDialog(ConfirmremoveSlot,"Slot has been Removed");
                
                   
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
            java.util.logging.Logger.getLogger(RemoveSlott.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveSlott.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveSlott.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveSlott.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveSlott().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton ConfirmremoveSlot;
    private javax.swing.JTextField Date;
    private javax.swing.JTextField Duration;
    private javax.swing.JTextField End_time;
    private javax.swing.JLabel RemoveDate;
    private javax.swing.JLabel RemoveSlotLabel;
    private javax.swing.JTextArea RemoveslotResult;
    private javax.swing.JLabel Removetime;
    private javax.swing.JLabel Removetime1;
    private javax.swing.JLabel Removetime2;
    private javax.swing.JLabel Removetime3;
    private javax.swing.JLabel RmoveResultLabel;
    private javax.swing.JTextField Start_time;
    private javax.swing.JTextField Venue;
    private javax.swing.JLabel back;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
