
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ayon
 */
public class SignIn extends javax.swing.JFrame {

    /**
     * Creates new form SignIn
     */
    public SignIn() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SignIn_Pass = new javax.swing.JPasswordField();
        SignIn_Email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        SignUP_Btn = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        SignIN_BTN = new javax.swing.JLabel();
        SignIn_combo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        SignIn_Notice = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1068, 619));
        getContentPane().setLayout(null);

        SignIn_Pass.setText("sdsdsdsdsdsdsd");
        SignIn_Pass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 204)));
        SignIn_Pass.setOpaque(false);
        getContentPane().add(SignIn_Pass);
        SignIn_Pass.setBounds(580, 280, 350, 18);

        SignIn_Email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SignIn_Email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 204, 204)));
        SignIn_Email.setOpaque(false);
        SignIn_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignIn_EmailActionPerformed(evt);
            }
        });
        getContentPane().add(SignIn_Email);
        SignIn_Email.setBounds(580, 180, 350, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("User Type");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(580, 330, 90, 17);

        SignUP_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SignUp Btn 2.png"))); // NOI18N
        SignUP_Btn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SignUP_BtnMouseMoved(evt);
            }
        });
        SignUP_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUP_BtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignUP_BtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignUP_BtnMouseExited(evt);
            }
        });
        getContentPane().add(SignUP_Btn);
        SignUP_Btn.setBounds(100, 440, 250, 70);

        jLabel2.setBackground(new java.awt.Color(0, 0, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SignUp Banner.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 460, 620);

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 42)); // NOI18N
        jLabel1.setText("Sign In");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(680, 50, 340, 80);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Email");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(580, 160, 31, 17);

        SignIN_BTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SignIn Btn 2.png"))); // NOI18N
        SignIN_BTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignIN_BTNMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignIN_BTNMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignIN_BTNMouseExited(evt);
            }
        });
        getContentPane().add(SignIN_BTN);
        SignIN_BTN.setBounds(630, 440, 250, 70);

        SignIn_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "General User" }));
        getContentPane().add(SignIn_combo);
        SignIn_combo.setBounds(580, 370, 100, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("PassWord");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(580, 240, 90, 17);

        SignIn_Notice.setText(" ");
        getContentPane().add(SignIn_Notice);
        SignIn_Notice.setBounds(680, 530, 220, 16);

        setSize(new java.awt.Dimension(1068, 619));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SignUP_BtnMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUP_BtnMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_SignUP_BtnMouseMoved

    private void SignUP_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUP_BtnMouseClicked
        this.setVisible(false);
        new start().setVisible(true);

    }//GEN-LAST:event_SignUP_BtnMouseClicked

    private void SignUP_BtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUP_BtnMouseEntered
        SignUP_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SignUp Btn 2 M.png")));
    }//GEN-LAST:event_SignUP_BtnMouseEntered

    private void SignUP_BtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUP_BtnMouseExited
        SignUP_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SignUp Btn 2.png")));         // TODO add your handling code here:
    }//GEN-LAST:event_SignUP_BtnMouseExited

    private void SignIn_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignIn_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SignIn_EmailActionPerformed

    private void SignIN_BTNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignIN_BTNMouseEntered
       SignIN_BTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SignIn Btn 2 M.png")));
    }//GEN-LAST:event_SignIN_BTNMouseEntered

    private void SignIN_BTNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignIN_BTNMouseExited
      SignIN_BTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/SignIn Btn 2.png")));
    }//GEN-LAST:event_SignIN_BTNMouseExited

    private void SignIN_BTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignIN_BTNMouseClicked


    String User_Type= (String) SignIn_combo.getSelectedItem();    
        
        
        
     if(User_Type.equalsIgnoreCase("ADMIN")){   
     try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
            .getConnection(
            "jdbc:sqlserver://localhost:1433;databaseName=ApartmentBusinessManagement;selectMethod=cursor", "sa", "123456");





            String sql = "Select * from ADMIN where Email=? and AdminPassword = ?";
                        PreparedStatement pst = connection.prepareStatement(sql);
                        pst.setString(1, SignIn_Email.getText());
                        pst.setString(2, SignIn_Pass.getText());
                        ResultSet rs = pst.executeQuery();


                        if(rs.next()){

                           this.setVisible(false);
                            new HomePage().setVisible(true);


                           SignIn_Email.setText("");
                           SignIn_Pass.setText("");

                        }
                        else{
                           SignIn_Notice.setText("Incorrect Email or Password!");


                        }


} catch (Exception e) {
    e.printStackTrace();
}

}
     
     
     
     else
     {
         
         
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
            .getConnection(
            "jdbc:sqlserver://localhost:1433;databaseName=ApartmentBusinessManagement;selectMethod=cursor", "sa", "123456");





            String sql = "Select * from GUSER where Email=? and UserPassword = ?";
                        PreparedStatement pst = connection.prepareStatement(sql);
                        pst.setString(1, SignIn_Email.getText());
                        pst.setString(2, SignIn_Pass.getText());
                        ResultSet rs = pst.executeQuery();


                        if(rs.next()){

                           this.setVisible(false);
                           new HomePage().setVisible(true);


                           SignIn_Email.setText("");
                           SignIn_Pass.setText("");

                        }
                        else{
                           SignIn_Notice.setText("Incorrect Email or Password!");


                        }


} catch (Exception e) {
    e.printStackTrace();
}
         
         
     }






       
    }//GEN-LAST:event_SignIN_BTNMouseClicked

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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SignIN_BTN;
    private javax.swing.JTextField SignIn_Email;
    private javax.swing.JLabel SignIn_Notice;
    private javax.swing.JPasswordField SignIn_Pass;
    private javax.swing.JComboBox<String> SignIn_combo;
    private javax.swing.JLabel SignUP_Btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
