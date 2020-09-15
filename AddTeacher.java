
package javaframes;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class AddTeacher extends javax.swing.JFrame {

    public AddTeacher() {
        initComponents();
        setDefaultCloseOperation(AddTeacher.HIDE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        AddSectionLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        FirstNameTeacher = new javax.swing.JLabel();
        FNameTeacher = new javax.swing.JTextField();
        TeacherEmail = new javax.swing.JLabel();
        EmailTeacher = new javax.swing.JTextField();
        teacherPass = new javax.swing.JLabel();
        PassTeacher = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        LNameTeacher = new javax.swing.JTextField();
        LastNameTeacher = new javax.swing.JLabel();
        PhoneTeacher = new javax.swing.JTextField();
        TeacherPhone = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TeacherDept = new javax.swing.JLabel();
        DeptTeacher = new javax.swing.JTextField();
        teacherId = new javax.swing.JLabel();
        IdTeacher = new javax.swing.JTextField();
        TeacherCourse = new javax.swing.JLabel();
        CourseTeacher = new javax.swing.JTextField();
        teacherId1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        Addteacher = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        AddSectionLabel.setFont(new java.awt.Font("Transit521 BT", 1, 36)); // NOI18N
        AddSectionLabel.setForeground(new java.awt.Color(255, 255, 255));
        AddSectionLabel.setText("Add Instructor:");

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));

        FirstNameTeacher.setFont(new java.awt.Font("Transit521 BT", 1, 18)); // NOI18N
        FirstNameTeacher.setForeground(new java.awt.Color(255, 255, 255));
        FirstNameTeacher.setText("First Name:");

        FNameTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNameTeacherActionPerformed(evt);
            }
        });

        TeacherEmail.setBackground(new java.awt.Color(255, 255, 255));
        TeacherEmail.setFont(new java.awt.Font("Transit521 BT", 1, 18)); // NOI18N
        TeacherEmail.setForeground(new java.awt.Color(255, 255, 255));
        TeacherEmail.setText("Email:");

        EmailTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTeacherActionPerformed(evt);
            }
        });

        teacherPass.setBackground(new java.awt.Color(255, 255, 255));
        teacherPass.setFont(new java.awt.Font("Transit521 BT", 1, 18)); // NOI18N
        teacherPass.setForeground(new java.awt.Color(255, 255, 255));
        teacherPass.setText("Password:");

        PassTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassTeacherActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Transit521 BT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));

        LNameTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LNameTeacherActionPerformed(evt);
            }
        });

        LastNameTeacher.setFont(new java.awt.Font("Transit521 BT", 1, 18)); // NOI18N
        LastNameTeacher.setForeground(new java.awt.Color(255, 255, 255));
        LastNameTeacher.setText("Last Name:");

        PhoneTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneTeacherActionPerformed(evt);
            }
        });

        TeacherPhone.setFont(new java.awt.Font("Transit521 BT", 1, 18)); // NOI18N
        TeacherPhone.setForeground(new java.awt.Color(255, 255, 255));
        TeacherPhone.setText("Phone:");

        jLabel8.setFont(new java.awt.Font("Transit521 BT", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));

        TeacherDept.setFont(new java.awt.Font("Transit521 BT", 1, 18)); // NOI18N
        TeacherDept.setForeground(new java.awt.Color(255, 255, 255));
        TeacherDept.setText("Dept.");

        DeptTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeptTeacherActionPerformed(evt);
            }
        });

        teacherId.setFont(new java.awt.Font("Transit521 BT", 1, 18)); // NOI18N
        teacherId.setForeground(new java.awt.Color(255, 255, 255));
        teacherId.setText("Teacher Id:");

        IdTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdTeacherActionPerformed(evt);
            }
        });

        TeacherCourse.setFont(new java.awt.Font("Transit521 BT", 1, 18)); // NOI18N
        TeacherCourse.setForeground(new java.awt.Color(255, 255, 255));
        TeacherCourse.setText("Course:");

        CourseTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseTeacherActionPerformed(evt);
            }
        });

        teacherId1.setFont(new java.awt.Font("Transit521 BT", 1, 18)); // NOI18N
        teacherId1.setForeground(new java.awt.Color(255, 255, 255));
        teacherId1.setText("Section:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        Addteacher.setBackground(new java.awt.Color(0, 0, 0));
        Addteacher.setFont(new java.awt.Font("Transit521 BT", 1, 14)); // NOI18N
        Addteacher.setForeground(new java.awt.Color(255, 255, 255));
        Addteacher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaframes/add-users-interface-symbol (2).png"))); // NOI18N
        Addteacher.setText("  Add");
        Addteacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddteacherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(FirstNameTeacher)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LastNameTeacher)
                        .addGap(67, 67, 67))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teacherPass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(IdTeacher, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teacherId, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FNameTeacher, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TeacherEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmailTeacher, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PassTeacher, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teacherId1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TeacherCourse)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 273, Short.MAX_VALUE)
                                        .addComponent(TeacherPhone)
                                        .addGap(9, 9, 9)))
                                .addGap(76, 76, 76))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(TeacherDept)
                                        .addGap(93, 93, 93))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(CourseTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(PhoneTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(LNameTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(DeptTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(77, 77, 77)
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Addteacher, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(56, 56, 56))))))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstNameTeacher)
                    .addComponent(LastNameTeacher))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FNameTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LNameTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TeacherEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TeacherPhone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EmailTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teacherPass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(TeacherDept)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addGap(86, 86, 86))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PassTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeptTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(teacherId)
                            .addComponent(TeacherCourse))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IdTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CourseTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(teacherId1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Addteacher, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(50, Short.MAX_VALUE))))
        );

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
                .addComponent(AddSectionLabel)
                .addGap(207, 207, 207)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddSectionLabel)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddteacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddteacherActionPerformed
               
        boolean error1=true,error2=true,error3=true,error4=true,error5=true,error6=true,error7=true,error8=true,error9=true;
        
        Connection con;
        Statement stmt;
        String uID="",fname="",lname="",mail="",pas="",pn="",dept="",course="",section="";
        
        if(!FNameTeacher.getText().equals(""))
        {
            fname=FNameTeacher.getText();
            error1=false;
        }
        else 
            JOptionPane.showMessageDialog(FNameTeacher,"Please enter first name");
        if(!LNameTeacher.getText().equals(""))
        {
            lname=LNameTeacher.getText();
            error2=false;
        }
        else
            JOptionPane.showMessageDialog(LNameTeacher,"Please enter last name");
        if(!EmailTeacher.getText().equals(""))
        {
            mail=EmailTeacher.getText();
            error3=false;
        }
        else 
            JOptionPane.showMessageDialog(EmailTeacher,"Please enter email");
        if(!PassTeacher.getText().equals(""))
        {
            pas=PassTeacher.getText();
            error4=false;
        }
        else
            JOptionPane.showMessageDialog(PassTeacher,"Please enter password");
        if(!PhoneTeacher.getText().equals(""))
        {
            pn=PhoneTeacher.getText();
            error5=false;
        }
        else
            JOptionPane.showMessageDialog(PhoneTeacher,"Please enter phone number");
        if(!DeptTeacher.getText().equals(""))
        {
            dept=DeptTeacher.getText();
            error6=false;
        }
        else
            JOptionPane.showMessageDialog(DeptTeacher,"Please enter DepartmentID");
        if(!IdTeacher.getText().equals(""))
        {
            uID=IdTeacher.getText();
            error7=false;
        }
        else
            JOptionPane.showMessageDialog(IdTeacher,"Please enter InstructorID");
        if(!CourseTeacher.getText().equals(""))
        {
            course=CourseTeacher.getText();
            error8=false;
        }
        else
            JOptionPane.showMessageDialog(CourseTeacher,"Please enter CourseID");
         if(!jTextField1.getText().equals(""))
        {
            section=jTextField1.getText();
            error9=false;
        }
        else
            JOptionPane.showMessageDialog(jTextField1,"Please enter Section");
        

        
        if(error1 == false && error2 == false && error3 == false && error4 == false && error5 == false && error6 == false && error9==false && error7==false && error8==false)
        {
            try
            {
                    con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=project","ramin_rafi","12569");
                    stmt=con.createStatement();
                    try
                    {
                       
                        String checkq="select * from Course where courseID=?";
                        PreparedStatement preparedStmtt = con.prepareStatement(checkq);
                        preparedStmtt.setString (1, course);
                        ResultSet rs= preparedStmtt.executeQuery();
                        
                        String checkq2="select * from Section where courseID=? and name=?";
                        PreparedStatement preparedStmtt2 = con.prepareStatement(checkq2);
                        preparedStmtt2.setString (1, course);
                        ResultSet rs2= preparedStmtt2.executeQuery();
                        if( !rs.next() && !rs2.next())
                           JOptionPane.showMessageDialog(Addteacher,"Please enter correct courseID and section");                       
                        else
                        { 
                                                                                                               
                        String query = " insert into [User]"
                                + " values (?, ?, ?, ?, ? , ?,?,?,?)";                      
                        // create the mysql insert preparedstatement
                        PreparedStatement preparedStmt = con.prepareStatement(query);
                        preparedStmt.setString (1, uID);
                        preparedStmt.setString (2,fname);
                        preparedStmt.setString(3, lname);
                        preparedStmt.setString(4,dept);
                        preparedStmt.setString (5, mail);
                        preparedStmt.setString (6,pas);
                        preparedStmt.setString(7, pn);
                        preparedStmt.setInt(8,0); //0= teacher role
                        preparedStmt.setInt(9,0);
                       // execute the preparedstatement
                        preparedStmt.execute();
                        
                        String query2="insert into Instructor"
                                + " values (?,?,?,?,?)";
                        PreparedStatement preparedStmt2 = con.prepareStatement(query2);
                        preparedStmt2.setString (1, uID);
                        preparedStmt2.setString(2,dept);
                        preparedStmt2.setInt(3,1); //1=default no of courses
                        preparedStmt2.setString (4,course);
                        preparedStmt2.setString (5,section);
                        preparedStmt2.execute();
                        
                        String query3="insert into section  values (?,?,?,?)";
                        PreparedStatement preparedStmt3 = con.prepareStatement(query3);
                        preparedStmt3.setString (1, section);
                        preparedStmt3.setInt(2,0);
                        preparedStmt3.setInt(3,50); //1=default no of courses
                        preparedStmt3.setString (4,course);
                      // ResultSet rs=stmt.executeQuery(a);
                        JOptionPane.showMessageDialog(Addteacher,"Instructor has been added");
                       // }
                    }
                    }
                    catch(SQLException | HeadlessException E)
                    {
            
                         JOptionPane.showMessageDialog(Addteacher,"Please enter correct information");
            
                    }
            }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(Addteacher,e);
        
        }
           
        }

    }//GEN-LAST:event_AddteacherActionPerformed

    private void DeptTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeptTeacherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeptTeacherActionPerformed

    private void PhoneTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneTeacherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneTeacherActionPerformed

    private void LNameTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LNameTeacherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LNameTeacherActionPerformed

    private void PassTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassTeacherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PassTeacherActionPerformed

    private void EmailTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTeacherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTeacherActionPerformed

    private void FNameTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FNameTeacherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FNameTeacherActionPerformed

    private void IdTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdTeacherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdTeacherActionPerformed

    private void CourseTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseTeacherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CourseTeacherActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        UpdateTimetable tb= new UpdateTimetable();
        tb.setVisible(true);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(AddTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTeacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTeacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddSectionLabel;
    private javax.swing.JToggleButton Addteacher;
    private javax.swing.JTextField CourseTeacher;
    private javax.swing.JTextField DeptTeacher;
    private javax.swing.JTextField EmailTeacher;
    private javax.swing.JTextField FNameTeacher;
    private javax.swing.JLabel FirstNameTeacher;
    private javax.swing.JTextField IdTeacher;
    private javax.swing.JTextField LNameTeacher;
    private javax.swing.JLabel LastNameTeacher;
    private javax.swing.JTextField PassTeacher;
    private javax.swing.JTextField PhoneTeacher;
    private javax.swing.JLabel TeacherCourse;
    private javax.swing.JLabel TeacherDept;
    private javax.swing.JLabel TeacherEmail;
    private javax.swing.JLabel TeacherPhone;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel teacherId;
    private javax.swing.JLabel teacherId1;
    private javax.swing.JLabel teacherPass;
    // End of variables declaration//GEN-END:variables
}
