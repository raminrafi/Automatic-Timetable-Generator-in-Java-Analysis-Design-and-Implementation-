
package javaframes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


 
public final class chatInterface extends javax.swing.JFrame {

    Connection sectionCon;
    Statement sectionStmt;
    boolean flag,a=false;
    public chatInterface() {
        flag = false;        
        try{ 
        String connection = "jdbc:sqlserver://localhost:1433;databaseName=project";
        this.sectionCon= (Connection) DriverManager.getConnection(connection,"ramin_rafi","12569");
        this.sectionStmt = (Statement) this.sectionCon.createStatement(); 
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        initComponents();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/icons8-chat-48.png"))); // NOI18N
        jLabel1.setText("Chatting App");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/icons8-chat-bubble-30.png"))); // NOI18N
        jLabel2.setText("Message");

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/check.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setText("Enter...");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addComponent(jButton1)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(24, 24, 24))))
        );

        pack();
    }// </editor-fold>                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           
    public void LoadMessages(){
        try{
            a=true;
            ResultSet rs;
            rs=sectionStmt.executeQuery("select * from Messages");
            while(rs.next())
            {
                jTextArea1.append(rs.getString(2) + ": " + rs.getString(3)+ "\n");
            }   
        }
        catch(Exception e) 
        {
            System.out.print(e);
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String username="";
            try{
             if(a==false)
             {
                 LoadMessages();
             }
             String query2="select * from [User] where isLoggedIn=?";
             PreparedStatement preparedStmt2 = sectionCon.prepareStatement(query2); 
             preparedStmt2.setInt(1,1);
             ResultSet rs=preparedStmt2.executeQuery();
             
             while(rs.next())
             {
                username = rs.getString(1);
                System.out.println(username+rs.getString(1));
                String query = "select * from Instructor where instructorID=?";
                PreparedStatement preparedStmt = sectionCon.prepareStatement(query); 
                preparedStmt.setString(1,username);
                ResultSet rs2=preparedStmt.executeQuery();
                System.out.println(username);
                while(rs2.next())
                {
                    if( rs2.getString(1) == username){
                        flag =true;
                        break;
                    }
                }
             }
         }
         catch(Exception e) 
         {
              System.out.print(e);
         }
      
            jTextArea1.append(username + ": " + jTextField1.getText()+ "\n");
            try{ 
                String query = " insert into Messages"
                                    + " values (?, ?, ?)";

                    // creating the mysql insert preparedstatement
                    PreparedStatement preparedStmt = sectionCon.prepareStatement(query);
                    preparedStmt.setInt (1, 0);

                    if(username == null)
                    {
                        preparedStmt.setString (2,"Unknown");
                    }
                    else
                        preparedStmt.setString (2,username);

                    preparedStmt.setString(3,jTextField1.getText());
                   // execute the preparedstatement
                    boolean x = preparedStmt.execute();
                if(x)
                    System.out.println("Unable to add message in db\n");
                else
                    System.out.println("Added Successfully!\n");
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            
        setDefaultCloseOperation(chatInterface.DISPOSE_ON_CLOSE);
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
            java.util.logging.Logger.getLogger(chatInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chatInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chatInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chatInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chatInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration                   
}
