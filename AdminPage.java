
package javaframes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class AdminPage extends javax.swing.JFrame {

    
    public AdminPage() {
        initComponents();
        setDefaultCloseOperation(AdminPage.HIDE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Viewtimetable = new javax.swing.JToggleButton();
        updatetimetable = new javax.swing.JToggleButton();
        Deletetimetable = new javax.swing.JToggleButton();
        GenerateTimetable = new javax.swing.JToggleButton();
        logOut = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Transit521 BT", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/10303-man-office-worker-light-skin-tone-icon.png"))); // NOI18N
        jLabel1.setText("Admin Portal");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Viewtimetable.setBackground(new java.awt.Color(204, 204, 255));
        Viewtimetable.setFont(new java.awt.Font("Transit521 BT", 1, 14)); // NOI18N
        Viewtimetable.setText("View Timetable");
        Viewtimetable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewtimetableActionPerformed(evt);
            }
        });

        updatetimetable.setBackground(new java.awt.Color(204, 204, 255));
        updatetimetable.setFont(new java.awt.Font("Transit521 BT", 1, 14)); // NOI18N
        updatetimetable.setText("Update Timetable");
        updatetimetable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatetimetableActionPerformed(evt);
            }
        });

        Deletetimetable.setBackground(new java.awt.Color(204, 204, 255));
        Deletetimetable.setFont(new java.awt.Font("Transit521 BT", 1, 14)); // NOI18N
        Deletetimetable.setText("Delete Timetable");
        Deletetimetable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletetimetableActionPerformed(evt);
            }
        });

        GenerateTimetable.setBackground(new java.awt.Color(204, 204, 255));
        GenerateTimetable.setFont(new java.awt.Font("Transit521 BT", 1, 14)); // NOI18N
        GenerateTimetable.setText("Generate Timetable");
        GenerateTimetable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateTimetableActionPerformed(evt);
            }
        });

        logOut.setBackground(new java.awt.Color(153, 102, 255));
        logOut.setFont(new java.awt.Font("Transit521 BT", 1, 14)); // NOI18N
        logOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/logout (1).png"))); // NOI18N
        logOut.setText("Logout");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/working-team (2).png"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(112, 112, 112)
                            .addComponent(GenerateTimetable))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Viewtimetable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(updatetimetable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Deletetimetable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(logOut)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(GenerateTimetable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Viewtimetable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updatetimetable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Deletetimetable)
                        .addGap(18, 18, 18)
                        .addComponent(logOut)
                        .addGap(75, 75, 75))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewtimetableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewtimetableActionPerformed
        viewTimetable v = new viewTimetable();
        v.setVisible(true);
        
    }//GEN-LAST:event_ViewtimetableActionPerformed

    private void updatetimetableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatetimetableActionPerformed
        UpdateTimetable u=new UpdateTimetable();
        u.setVisible(true);
    }//GEN-LAST:event_updatetimetableActionPerformed

    private void DeletetimetableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletetimetableActionPerformed
        Timetabledeletion td=new Timetabledeletion();
        td.setVisible(true);
    }//GEN-LAST:event_DeletetimetableActionPerformed

    private void GenerateTimetableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateTimetableActionPerformed
        Timetable tt=new Timetable();
        ArrayList <String> ven = new ArrayList<String>();
        Connection con;
        Statement stmt;
         try{         
            String connection = "jdbc:sqlserver://localhost:1433;databaseName=project"; //check
            con= (Connection) DriverManager.getConnection(connection,"ramin_rafi","12569");
            stmt = (Statement)con.createStatement(); 
            try{
                String query = "select * from Venue";

                PreparedStatement preparedStmt =con.prepareStatement(query);

                ResultSet rs = preparedStmt.executeQuery();
                
                while(rs.next()){
                    ven.add(rs.getString(1));
                }       
            }
            catch(Exception e)
            {
                System.out.println(e);
            } 
        }
        catch(Exception e)
        {
            System.out.println(e);
        }    
        tt.setBatchesUsingDatabase();
        tt.setCoursesUsingDatabase();
        tt.setDepartmentsUsingDatabase();
        tt.setInstructorsUsingDatabase();
        tt.setSectionsUsingDatabase();
        tt.setTimeSlotsUsingDatabase();
        tt.setTitle("Timetable Version 1");
        //tt.displayAllTimeSlotsUsingDatabase();
        tt.Schedule();
        
        JOptionPane.showMessageDialog(GenerateTimetable,"Timetable has been generated! ");
    }//GEN-LAST:event_GenerateTimetableActionPerformed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        // TODO add your handling code here:
        LOGOUT a= new LOGOUT();
        a.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_logOutActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Deletetimetable;
    private javax.swing.JToggleButton GenerateTimetable;
    private javax.swing.JToggleButton Viewtimetable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logOut;
    private javax.swing.JToggleButton updatetimetable;
    // End of variables declaration//GEN-END:variables
    

}
