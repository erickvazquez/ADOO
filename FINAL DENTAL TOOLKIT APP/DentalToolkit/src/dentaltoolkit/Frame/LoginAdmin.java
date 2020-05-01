/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dentaltoolkit.Frame;

import Controlador.Usuario;
import Validaciones.Validador;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author EHef_
 */
public class LoginAdmin extends javax.swing.JPanel {

    /**
     * Creates new form LoginDoc
     */
     GridBagLayout layout = new GridBagLayout();
     RegistroAdmin r1 =new RegistroAdmin();
    public LoginAdmin() {
        initComponents();
        r1.AgregarPanel(loginA);
        panel0.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        panel0.add(r1, c);
        //c.gridx = 0;
        //c.gridy = 0;
        //panel0.add(loginA, c);
        r1.setVisible(false);
        loginA.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel0 = new javax.swing.JPanel();
        loginA = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        CAMPOUSUARIO = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        CAMPOCONTRA = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel0.setBackground(new java.awt.Color(255, 255, 255));
        panel0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        panel0.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginA.setBackground(new java.awt.Color(255, 255, 255));
        loginA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("LOGIN ADMINISTRADOR");
        loginA.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 240, 50));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        loginA.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 660, 10));

        CAMPOUSUARIO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CAMPOUSUARIO.setForeground(new java.awt.Color(255, 153, 102));
        CAMPOUSUARIO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CAMPOUSUARIO.setText("CORREO");
        CAMPOUSUARIO.setBorder(null);
        CAMPOUSUARIO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CAMPOUSUARIOMouseClicked(evt);
            }
        });
        CAMPOUSUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAMPOUSUARIOActionPerformed(evt);
            }
        });
        loginA.add(CAMPOUSUARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 360, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentaltoolkit/Image/llave-de-la-puerta.png"))); // NOI18N
        loginA.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentaltoolkit/Image/empleados (2).png"))); // NOI18N
        loginA.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        jButton1.setText("ENTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        loginA.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 130, 40));

        jSeparator2.setForeground(new java.awt.Color(204, 102, 0));
        loginA.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 360, 20));

        jSeparator3.setForeground(new java.awt.Color(204, 102, 0));
        loginA.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 360, 20));

        CAMPOCONTRA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CAMPOCONTRA.setForeground(new java.awt.Color(255, 153, 102));
        CAMPOCONTRA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CAMPOCONTRA.setText("contraseña");
        CAMPOCONTRA.setBorder(null);
        CAMPOCONTRA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CAMPOCONTRAFocusGained(evt);
            }
        });
        CAMPOCONTRA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CAMPOCONTRAMouseClicked(evt);
            }
        });
        loginA.add(CAMPOCONTRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 360, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 102, 0));
        jLabel4.setText("CONTRASEÑA:");
        loginA.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 140, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 102, 0));
        jLabel6.setText("CORREO DE USUARIO");
        loginA.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 170, 30));

        jButton2.setText("REGISTRARSE");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        loginA.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, 130, 40));

        panel0.add(loginA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 580));

        add(panel0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 580));
    }// </editor-fold>//GEN-END:initComponents

    private void CAMPOUSUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAMPOUSUARIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAMPOUSUARIOActionPerformed

    private void CAMPOUSUARIOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CAMPOUSUARIOMouseClicked
    CAMPOUSUARIO.setText(null);
    }//GEN-LAST:event_CAMPOUSUARIOMouseClicked

    private void CAMPOCONTRAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CAMPOCONTRAMouseClicked
     CAMPOCONTRA.setText(null);   // TODO add your handling code here:
    }//GEN-LAST:event_CAMPOCONTRAMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        r1.setVisible(true);
        loginA.setVisible(false);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Usuario Admin = new Usuario();
        Validador Va = new Validador();
        new Thread(() -> {
                 if(Va.validateEMAIL(CAMPOUSUARIO.getText())){
                        File file = new File("");
                        String a = "";
                           if(System.getProperty("os.name").equals("Linux")){        
                                try {
                                    a=file.getCanonicalFile().toString()+"/src/dentaltoolkit/Image/loading.gif";
                                } catch (IOException ex) {
                                    Logger.getLogger(LoginAdmin.class.getName()).log(Level.SEVERE, null, ex);
                                }
                           }else{
                                try {
                                    a = file.getCanonicalFile().toString()+"\\src\\dentaltoolkit\\Image\\loading.gif";
                                } catch (IOException ex) {
                                    Logger.getLogger(LoginAdmin.class.getName()).log(Level.SEVERE, null, ex);
                                }
                           }
                        ImageIcon loading = new ImageIcon(a);
                        JLabel A =new JLabel("Cargando... ", loading, JLabel.CENTER);
                        panel0.add(A);
                        loginA.setVisible(false);
                        A.setVisible(true);
                        String RESP="";
                            try {
                                RESP = Admin.LoginUsuario(CAMPOUSUARIO.getText(),CAMPOCONTRA.getText(),1);
                            } catch (SQLException ex) {
                                Logger.getLogger(LoginAdmin.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        if(!RESP.equals("")){
                            Admin.Nombre=RESP;
                            JOptionPane.showMessageDialog(this, "¡Ingreso exitoso!");
                            JComponent comp = (JComponent) evt.getSource();
                            Window win = SwingUtilities.getWindowAncestor(comp);
                            win.dispose();
                            Admin Ad;
                            try {
                                Ad = new Admin(Admin);
                                Ad.show();
                            } catch (SQLException ex) {
                                Logger.getLogger(LoginAdmin.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                        }else{
                            JOptionPane.showMessageDialog(this, "¡Error en credenciales!");
                            A.setVisible(false);
                            loginA.setVisible(true);
                        }
                }else{
                    JOptionPane.showMessageDialog(this, "¡Correo invalido!");
                }
                 
         }).start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CAMPOCONTRAFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CAMPOCONTRAFocusGained
        // TODO add your handling code here:
        CAMPOCONTRA.setText("");
    }//GEN-LAST:event_CAMPOCONTRAFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CAMPOCONTRA;
    private javax.swing.JTextField CAMPOUSUARIO;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel loginA;
    private javax.swing.JPanel panel0;
    // End of variables declaration//GEN-END:variables
}