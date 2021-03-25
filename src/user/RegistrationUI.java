/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;
import business.Student;
import business.Module;
import business.Registration;
import data.StudentDB;
import data.ModuleDB;
import data.RegistrationDB;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegistrationUI extends javax.swing.JFrame {
private StudentDB sDB;
private ModuleDB mDB;
private RegistrationDB rDB;
private DefaultTableModel tblModel;
    /**
     * Creates new form RegistrationUI
     */
    public RegistrationUI() {
        initComponents();
        sDB=new StudentDB();
        mDB=new ModuleDB();
        rDB=new RegistrationDB();
        
        ArrayList<Student> sList=sDB.getAll();
        for (Student s : sList) {
            cmbStudentID.addItem(String.valueOf(s.getStudentID()));
        }
        
        ArrayList<Module> mList=mDB.getAll();
        for (Module m : mList) {
            cmbModuleID.addItem(m.getModuleID());
        }
        
        tblModel=new DefaultTableModel();
        tblRegistration.setModel(tblModel);
        tblModel.addColumn("Registration ID");
        tblModel.addColumn("Student ID");
        tblModel.addColumn("Module ID");
        tblModel.addColumn("Registration Date");
        
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblRegistrationID = new javax.swing.JLabel();
        txtRegistrationID = new javax.swing.JTextField();
        lblStudentID = new javax.swing.JLabel();
        cmbStudentID = new javax.swing.JComboBox<>();
        lblModuleID = new javax.swing.JLabel();
        cmbModuleID = new javax.swing.JComboBox<>();
        lblRegistrationDate = new javax.swing.JLabel();
        txtRegistrationDate = new javax.swing.JTextField();
        lblRegistration = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistration = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnShowAll = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuHome = new javax.swing.JMenuItem();
        mnuStudent = new javax.swing.JMenuItem();
        mnuLecturer = new javax.swing.JMenuItem();
        mnuModule = new javax.swing.JMenuItem();
        mnuClose = new javax.swing.JMenuItem();
        mnuHelp = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRegistrationID.setText("Registration ID");

        lblStudentID.setText("Student ID");

        cmbStudentID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select Student ID --" }));

        lblModuleID.setText("Module ID");

        cmbModuleID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Select Module ID --" }));

        lblRegistrationDate.setText("Registration Date");

        lblRegistration.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblRegistration.setText("Registration");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRegistrationID)
                            .addComponent(lblStudentID)
                            .addComponent(lblModuleID)
                            .addComponent(lblRegistrationDate))
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRegistrationID)
                            .addComponent(cmbStudentID, 0, 150, Short.MAX_VALUE)
                            .addComponent(cmbModuleID, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtRegistrationDate)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(lblRegistration)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblRegistration)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegistrationID)
                    .addComponent(txtRegistrationID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStudentID)
                    .addComponent(cmbStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModuleID)
                    .addComponent(cmbModuleID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegistrationDate)
                    .addComponent(txtRegistrationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 397, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        tblRegistration.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Registration ID", "Student ID", "Module ID", "Registration Date"
            }
        ));
        jScrollPane1.setViewportView(tblRegistration);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnShowAll.setText("Show All");
        btnShowAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 36)); // NOI18N
        jLabel1.setText("XYZ Institute");

        jMenu1.setText("File");

        mnuHome.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        mnuHome.setText("Home");
        mnuHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHomeActionPerformed(evt);
            }
        });
        jMenu1.add(mnuHome);

        mnuStudent.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mnuStudent.setText("Student");
        mnuStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuStudentActionPerformed(evt);
            }
        });
        jMenu1.add(mnuStudent);

        mnuLecturer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        mnuLecturer.setText("Lecturer");
        mnuLecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLecturerActionPerformed(evt);
            }
        });
        jMenu1.add(mnuLecturer);

        mnuModule.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        mnuModule.setText("Module");
        mnuModule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuModuleActionPerformed(evt);
            }
        });
        jMenu1.add(mnuModule);

        mnuClose.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        mnuClose.setText("Close");
        mnuClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCloseActionPerformed(evt);
            }
        });
        jMenu1.add(mnuClose);

        jMenuBar1.add(jMenu1);

        mnuHelp.setText("Help");
        jMenuBar1.add(mnuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnShowAll))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate)
                    .addComponent(btnFind)
                    .addComponent(btnShowAll))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String registrationID=txtRegistrationID.getText();
        int studentID=Integer.valueOf(cmbStudentID.getSelectedItem().toString());
        String moduleID=String.valueOf(cmbModuleID.getSelectedItem());
        String registrationDate=txtRegistrationDate.getText();
        Registration r=new Registration(registrationID,studentID,moduleID,registrationDate);
        
        int result=rDB.add(r);
        if (result==1) {
            JOptionPane.showMessageDialog(rootPane, "Registration successfully added");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Registration unsuccessful");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String registrationID=JOptionPane.showInputDialog("Enter the Registration ID");
        int result=rDB.delete(registrationID);
        if(result==1){
            JOptionPane.showMessageDialog(rootPane, "Registration record is deleted");
        }else{
            JOptionPane.showMessageDialog(rootPane, "Registration record is not deleted");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String registrationID=txtRegistrationID.getText();
        int studentID=Integer.valueOf(cmbStudentID.getSelectedItem().toString());
        String moduleID=String.valueOf(cmbModuleID.getSelectedItem());
        String registrationDate=txtRegistrationDate.getText();
        
        Registration r=new Registration(registrationID,studentID,moduleID,registrationDate);
        
        int result=rDB.update(r);
        if(result==1){
            JOptionPane.showMessageDialog(rootPane, "Registration is updated");
        }else{
            JOptionPane.showMessageDialog(rootPane, "Registration is not updated");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        String registrationID=JOptionPane.showInputDialog("Enter registration ID ");
        Registration r=rDB.get(registrationID);
        if(r!=null){
            txtRegistrationID.setText(String.valueOf(r.getRegistrationID()));
            cmbStudentID.setSelectedItem(String.valueOf(r.getStudentID()));
            cmbModuleID.setSelectedItem(String.valueOf(r.getModuleID()));
            txtRegistrationDate.setText(r.getRegistrationDate());
        }else{
            System.out.println("Invalid registration ID");
        }
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnShowAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllActionPerformed
        // TODO add your handling code here:
        ArrayList<Registration> rList=rDB.getAll();
        
        tblModel.setRowCount(0);
        for(Registration r:rList){
            String registrationID=r.getRegistrationID();
            int studentID=r.getStudentID();
            String moduleID=r.getModuleID();
            String registrationDate=r.getRegistrationDate();
            tblModel.addRow(new Object[]{registrationID,studentID,moduleID,registrationDate});
        }
    }//GEN-LAST:event_btnShowAllActionPerformed

    private void mnuStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuStudentActionPerformed
        // TODO add your handling code here:
        StudentUI sui=new StudentUI();
        sui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuStudentActionPerformed

    private void mnuLecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLecturerActionPerformed
        // TODO add your handling code here:
        LecturerUI lui=new LecturerUI();
        lui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuLecturerActionPerformed

    private void mnuModuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuModuleActionPerformed
        // TODO add your handling code here:
        ModuleUI mui=new ModuleUI();
        mui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuModuleActionPerformed

    private void mnuCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCloseActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mnuCloseActionPerformed

    private void mnuHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHomeActionPerformed
        // TODO add your handling code here:
        MainUI mui=new MainUI();
        mui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mnuHomeActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnShowAll;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbModuleID;
    private javax.swing.JComboBox<String> cmbStudentID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblModuleID;
    private javax.swing.JLabel lblRegistration;
    private javax.swing.JLabel lblRegistrationDate;
    private javax.swing.JLabel lblRegistrationID;
    private javax.swing.JLabel lblStudentID;
    private javax.swing.JMenuItem mnuClose;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JMenuItem mnuHome;
    private javax.swing.JMenuItem mnuLecturer;
    private javax.swing.JMenuItem mnuModule;
    private javax.swing.JMenuItem mnuStudent;
    private javax.swing.JTable tblRegistration;
    private javax.swing.JTextField txtRegistrationDate;
    private javax.swing.JTextField txtRegistrationID;
    // End of variables declaration//GEN-END:variables
}
