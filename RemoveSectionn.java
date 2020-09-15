
package javaframes;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class RemoveSectionn extends javax.swing.JFrame {

    public RemoveSectionn() {
        initComponents();
        setDefaultCloseOperation(RemoveSectionn.HIDE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        NamesectionRemove = new javax.swing.JLabel();
        EnterSectionNameRemove = new javax.swing.JTextField();
        SectionCourseRemove = new javax.swing.JLabel();
        EnterCourseNameRemove = new javax.swing.JTextField();
        ConfirmRemoveSection = new javax.swing.JToggleButton();
        Maximum_seats = new javax.swing.JTextField();
        Currentseats = new javax.swing.JTextField();
        Current_seats = new javax.swing.JLabel();
        Maximum_SEATS = new javax.swing.JLabel();
        RemoveSectionResultLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RemoveSectionResult = new javax.swing.JTextArea();
        AddSectionLabel = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));

        NamesectionRemove.setBackground(new java.awt.Color(255, 255, 255));
        NamesectionRemove.setFont(new java.awt.Font("Transit521 BT", 1, 18)); // NOI18N
        NamesectionRemove.setForeground(new java.awt.Color(255, 255, 255));
        NamesectionRemove.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NamesectionRemove.setText("Enter Name:");

        EnterSectionNameRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterSectionNameRemoveActionPerformed(evt);
            }
        });

        SectionCourseRemove.setBackground(new java.awt.Color(255, 255, 255));
        SectionCourseRemove.setFont(new java.awt.Font("Transit521 BT", 1, 18)); // NOI18N
        SectionCourseRemove.setForeground(new java.awt.Color(255, 255, 255));
        SectionCourseRemove.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SectionCourseRemove.setText("Enter Course:");

        ConfirmRemoveSection.setText("Remove");
        ConfirmRemoveSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmRemoveSectionActionPerformed(evt);
            }
        });

        Maximum_seats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Maximum_seatsActionPerformed(evt);
            }
        });

        Currentseats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CurrentseatsActionPerformed(evt);
            }
        });

        Current_seats.setBackground(new java.awt.Color(255, 255, 255));
        Current_seats.setFont(new java.awt.Font("Transit521 BT", 1, 18)); // NOI18N
        Current_seats.setForeground(new java.awt.Color(255, 255, 255));
        Current_seats.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Current_seats.setText("Current seats");

        Maximum_SEATS.setBackground(new java.awt.Color(255, 255, 255));
        Maximum_SEATS.setFont(new java.awt.Font("Transit521 BT", 1, 18)); // NOI18N
        Maximum_SEATS.setForeground(new java.awt.Color(255, 255, 255));
        Maximum_SEATS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Maximum_SEATS.setText("Maximum Seats");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NamesectionRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SectionCourseRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(EnterCourseNameRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EnterSectionNameRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Maximum_seats, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Currentseats, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Current_seats, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Maximum_SEATS, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(ConfirmRemoveSection, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(NamesectionRemove))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Current_seats)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnterSectionNameRemove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Currentseats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SectionCourseRemove)
                    .addComponent(Maximum_SEATS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnterCourseNameRemove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Maximum_seats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(ConfirmRemoveSection, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        RemoveSectionResultLabel.setFont(new java.awt.Font("Transit521 BT", 1, 36)); // NOI18N
        RemoveSectionResultLabel.setForeground(new java.awt.Color(255, 255, 255));
        RemoveSectionResultLabel.setText("Result:");

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));

        RemoveSectionResult.setColumns(20);
        RemoveSectionResult.setRows(5);
        jScrollPane1.setViewportView(RemoveSectionResult);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addContainerGap())
        );

        AddSectionLabel.setFont(new java.awt.Font("Transit521 BT", 1, 36)); // NOI18N
        AddSectionLabel.setForeground(new java.awt.Color(255, 255, 255));
        AddSectionLabel.setText("Remove Section:");

        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/reply (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddSectionLabel)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RemoveSectionResultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddSectionLabel)
                            .addComponent(RemoveSectionResultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(back)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnterSectionNameRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterSectionNameRemoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnterSectionNameRemoveActionPerformed

    private void Maximum_seatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Maximum_seatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Maximum_seatsActionPerformed

    private void CurrentseatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CurrentseatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CurrentseatsActionPerformed

    private void ConfirmRemoveSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmRemoveSectionActionPerformed
        // TODO add your handling code here:
        Connection con;
        Statement stmt;
        boolean error1=true,error2=true,error3=true,error4=true;
        String name="",course="",Current="",Maximum="";
        int Cseats=0,Mseats=0;
        if(!EnterCourseNameRemove.getText().equals(""))
        {
            error1=false;
            course=EnterCourseNameRemove.getText();
        }
        else 
            JOptionPane.showMessageDialog(EnterCourseNameRemove,"Please enter course name!");
        if(!EnterSectionNameRemove.getText().equals(""))
        {
            error2=false;
            name=EnterSectionNameRemove.getText();
        }
        else
            JOptionPane.showMessageDialog(EnterSectionNameRemove,"Please enter section name!");
        if(!Currentseats.getText().equals(""))
        {
            Current=Currentseats.getText();
            Cseats=Integer.parseInt(Current);
            error3=false;
        }
        else 
            JOptionPane.showMessageDialog(Currentseats,"Please enter number of current Seats!");
        if(!Maximum_seats.getText().equals(""))
        {
            Maximum=Maximum_seats.getText();
            Mseats=Integer.parseInt(Maximum);
            error4=false;
        }
        else
            JOptionPane.showMessageDialog(Maximum_seats,"Please enter Maximum Seats!");
        
        if(error1 == false && error2 == false && error3 == false && error4 == false)
        {
            try
            {
                    con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=project","Abdul_Rehman","123456");
                    stmt=con.createStatement();
                    try
                    {
                        String query = " delete from section where name=? and currentSeats =? and maxSeats = ? and courseID =?";                      
                        // create the mysql insert preparedstatement
                        PreparedStatement preparedStmt = con.prepareStatement(query);
                        preparedStmt.setString (1, name);
                        preparedStmt.setInt (2,Cseats);
                        preparedStmt.setInt(3, Mseats);
                        preparedStmt.setString(4,course);
                       // execute the preparedstatement
                       if( preparedStmt.executeUpdate()==0 || preparedStmt.executeUpdate()==-1)
                       {
                         JOptionPane.showMessageDialog(ConfirmRemoveSection,"Failed to remove section");   
                       }
                      else
                         JOptionPane.showMessageDialog(ConfirmRemoveSection,"Section has been removed!");
                
                    }
                    catch(SQLException | HeadlessException E)
                    {
            
                         JOptionPane.showMessageDialog(ConfirmRemoveSection,E);
            
                    }
                
           
            }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(ConfirmRemoveSection,e);
        
        }
        } 
            
    }//GEN-LAST:event_ConfirmRemoveSectionActionPerformed

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
            java.util.logging.Logger.getLogger(RemoveSectionn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveSectionn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveSectionn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveSectionn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveSectionn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddSectionLabel;
    private javax.swing.JToggleButton ConfirmRemoveSection;
    private javax.swing.JLabel Current_seats;
    private javax.swing.JTextField Currentseats;
    private javax.swing.JTextField EnterCourseNameRemove;
    private javax.swing.JTextField EnterSectionNameRemove;
    private javax.swing.JLabel Maximum_SEATS;
    private javax.swing.JTextField Maximum_seats;
    private javax.swing.JLabel NamesectionRemove;
    private javax.swing.JTextArea RemoveSectionResult;
    private javax.swing.JLabel RemoveSectionResultLabel;
    private javax.swing.JLabel SectionCourseRemove;
    private javax.swing.JLabel back;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

