package javaframes;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class AddSectionn extends javax.swing.JFrame {

    public AddSectionn() {
        initComponents();
        setDefaultCloseOperation(AddSectionn.HIDE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Currentseats = new javax.swing.JLabel();
        EnterSectionName = new javax.swing.JTextField();
        ConfirmAddSection = new javax.swing.JToggleButton();
        maxseats = new javax.swing.JLabel();
        CourseID = new javax.swing.JTextField();
        Maximum_seats = new javax.swing.JTextField();
        Namesection = new javax.swing.JLabel();
        Current_seats = new javax.swing.JTextField();
        Course = new javax.swing.JLabel();
        AddSectionResultLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AddSectionResult = new javax.swing.JTextArea();
        AddSectionLabel = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));

        Currentseats.setBackground(new java.awt.Color(255, 255, 255));
        Currentseats.setFont(new java.awt.Font("Transit521 BT", 1, 18)); // NOI18N
        Currentseats.setForeground(new java.awt.Color(255, 255, 255));
        Currentseats.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Currentseats.setText("Current Seats");

        EnterSectionName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterSectionNameActionPerformed(evt);
            }
        });

        ConfirmAddSection.setText("Add");
        ConfirmAddSection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmAddSectionActionPerformed(evt);
            }
        });

        maxseats.setBackground(new java.awt.Color(255, 255, 255));
        maxseats.setFont(new java.awt.Font("Transit521 BT", 1, 18)); // NOI18N
        maxseats.setForeground(new java.awt.Color(255, 255, 255));
        maxseats.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maxseats.setText("Maximum Seats");

        CourseID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseIDActionPerformed(evt);
            }
        });

        Maximum_seats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Maximum_seatsActionPerformed(evt);
            }
        });

        Namesection.setBackground(new java.awt.Color(255, 255, 255));
        Namesection.setFont(new java.awt.Font("Transit521 BT", 1, 18)); // NOI18N
        Namesection.setForeground(new java.awt.Color(255, 255, 255));
        Namesection.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Namesection.setText("Name");

        Current_seats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Current_seatsActionPerformed(evt);
            }
        });

        Course.setBackground(new java.awt.Color(255, 255, 255));
        Course.setFont(new java.awt.Font("Transit521 BT", 1, 18)); // NOI18N
        Course.setForeground(new java.awt.Color(255, 255, 255));
        Course.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Course.setText("CourseID");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(ConfirmAddSection, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CourseID, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(EnterSectionName, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Current_seats, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxseats, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Maximum_seats))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Currentseats, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(Namesection, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(228, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(Course, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(209, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Currentseats)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnterSectionName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Current_seats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(maxseats)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CourseID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Maximum_seats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(ConfirmAddSection, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(Namesection)
                    .addContainerGap(201, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(110, 110, 110)
                    .addComponent(Course)
                    .addContainerGap(117, Short.MAX_VALUE)))
        );

        AddSectionResultLabel.setFont(new java.awt.Font("Transit521 BT", 1, 36)); // NOI18N
        AddSectionResultLabel.setForeground(new java.awt.Color(255, 255, 255));
        AddSectionResultLabel.setText("Result:");

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));

        AddSectionResult.setColumns(20);
        AddSectionResult.setRows(5);
        jScrollPane1.setViewportView(AddSectionResult);

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
        AddSectionLabel.setText("Add Section");

        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/reply (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddSectionLabel))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(AddSectionResultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(back))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddSectionLabel)
                            .addComponent(AddSectionResultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void EnterSectionNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterSectionNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnterSectionNameActionPerformed

    private void CourseIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CourseIDActionPerformed

    private void Maximum_seatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Maximum_seatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Maximum_seatsActionPerformed

    private void Current_seatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Current_seatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Current_seatsActionPerformed

    private void ConfirmAddSectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmAddSectionActionPerformed
        // TODO add your handling code here:
        Connection con;
        Statement stmt;
        boolean error1=true,error2=true,error3=true,error4=true,error5=true;
        String name="",course="",Current="",Maximum="";
        int Cseats=0,Mseats=0;
        if(!EnterSectionName.getText().equals(""))
        {
            error1=false;
            name=EnterSectionName.getText();
        }
        else 
            JOptionPane.showMessageDialog(EnterSectionName,"Please enter Section Name!");
        if(!CourseID.getText().equals(""))
        {
            course=CourseID.getText();
            error2=false;
        }
        else
            JOptionPane.showMessageDialog(CourseID,"Please enter CourseID!");
        if(!Current_seats.getText().equals(""))
        {
            Current=Current_seats.getText();
            Cseats=Integer.parseInt(Current);
            error3=false;
        }
        else 
            JOptionPane.showMessageDialog(Current_seats,"Please enter current number of seats!");
        if(!Maximum_seats.getText().equals(""))
        {
            Maximum=Maximum_seats.getText();
            Mseats=Integer.parseInt(Maximum);
            error4=false;
        }
        else
            JOptionPane.showMessageDialog(Maximum_seats,"Please enter Maximum Seats");
        
        if(error1 == false && error2 == false && error3 == false && error4 == false)
        {
          try
            {
                if(Cseats<=Mseats)
                {
                    con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=project","Abdul_Rehman","123456");
                    stmt=con.createStatement();
                    try
                    {
                        String query1="Select * from Section where name = ? and courseID = ?";
                        PreparedStatement preparedStmt1 = con.prepareStatement(query1);
                        preparedStmt1.setString (1, name);
                        preparedStmt1.setString(2,course);
                        preparedStmt1.execute();
                        ResultSet rs= preparedStmt1.executeQuery();
                        
                        if(rs.next()==true)
                        {
                            JOptionPane.showMessageDialog(ConfirmAddSection,"Section already exists!");
                        }        
                        String query = " insert into Section"
                                + " values (?, ?, ?, ?)";
                       
                        // create the mysql insert preparedstatement
                        PreparedStatement preparedStmt = con.prepareStatement(query);
                        preparedStmt.setString (1, name);
                        preparedStmt.setInt (2,Cseats);
                        preparedStmt.setInt(3, Mseats);
                        preparedStmt.setString(4,course);
                       // execute the preparedstatement
                        preparedStmt.execute();
      
                      // ResultSet rs=stmt.executeQuery(a);
                        JOptionPane.showMessageDialog(ConfirmAddSection,"Section has been added");
                
                    }
                    catch(SQLException | HeadlessException E)
                    {
            
                         JOptionPane.showMessageDialog(ConfirmAddSection,"Section already exists!");
            
                    }
                }
                else
                {
                        
                     JOptionPane.showMessageDialog(ConfirmAddSection,"Current seats cannot exceed Maximum Capacity");
                
                }
           
            }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(ConfirmAddSection,e);
        
        }
            
        } 
        
    }//GEN-LAST:event_ConfirmAddSectionActionPerformed

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
            java.util.logging.Logger.getLogger(AddSectionn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddSectionn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddSectionn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddSectionn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddSectionn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddSectionLabel;
    private javax.swing.JTextArea AddSectionResult;
    private javax.swing.JLabel AddSectionResultLabel;
    private javax.swing.JToggleButton ConfirmAddSection;
    private javax.swing.JLabel Course;
    private javax.swing.JTextField CourseID;
    private javax.swing.JTextField Current_seats;
    private javax.swing.JLabel Currentseats;
    private javax.swing.JTextField EnterSectionName;
    private javax.swing.JTextField Maximum_seats;
    private javax.swing.JLabel Namesection;
    private javax.swing.JLabel back;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel maxseats;
    // End of variables declaration//GEN-END:variables
}
