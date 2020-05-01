/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dentaltoolkit.Frame;

import Controlador.Usuario;
import Validaciones.Validador;
import com.google.zxing.WriterException;
import dentaltoolkit.Frame.Admin;
import java.awt.Window;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import scanner.EMAIL;
import scanner.SMS;

/**
 *
 * @author EHef_
 */
public class RegistroAdmin extends javax.swing.JPanel {
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    /**
     * Creates new form RegistroAdmin
     */
    public JPanel A;
    public RegistroAdmin() {
        initComponents();
    }
    public void AgregarPanel(JPanel loc){
        A=loc;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        CAMPOCEL = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        CAMPOAM = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        CAMPONOMBRE = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        CAMPOAP = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CAMPOCORREO = new javax.swing.JTextField();
        CAMPOTEL = new javax.swing.JTextField();
        CONTRA2 = new javax.swing.JPasswordField();
        CONTRA1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("REGISTRO ADMINISTRADOR");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 270, 50));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 730, 10));

        CAMPOCEL.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CAMPOCEL.setBorder(null);
        CAMPOCEL.setNextFocusableComponent(CAMPOCORREO);
        CAMPOCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAMPOCELActionPerformed(evt);
            }
        });
        add(CAMPOCEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 340, 30));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 340, 10));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 340, 10));
        add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 340, 10));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 340, 10));
        add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 340, 10));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setText("APELLIDO MATERNO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        CAMPOAM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CAMPOAM.setBorder(null);
        CAMPOAM.setNextFocusableComponent(CONTRA1);
        jPanel1.add(CAMPOAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 340, 30));

        jLabel7.setForeground(new java.awt.Color(51, 153, 255));
        jLabel7.setText("APELLIDO PATERNO");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 340, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 340, 10));

        jLabel8.setForeground(new java.awt.Color(51, 153, 255));
        jLabel8.setText("NOMBRES");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        CAMPONOMBRE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CAMPONOMBRE.setBorder(null);
        CAMPONOMBRE.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        CAMPONOMBRE.setNextFocusableComponent(CAMPOAP);
        CAMPONOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAMPONOMBREActionPerformed(evt);
            }
        });
        jPanel1.add(CAMPONOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 340, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 340, 10));

        CAMPOAP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CAMPOAP.setBorder(null);
        CAMPOAP.setNextFocusableComponent(CAMPOAM);
        CAMPOAP.setOpaque(false);
        CAMPOAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAMPOAPActionPerformed(evt);
            }
        });
        jPanel1.add(CAMPOAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 340, 30));

        jLabel10.setForeground(new java.awt.Color(51, 153, 255));
        jLabel10.setText("CONTRASEÑA");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("CONFIRMA CONTRASEÑA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setText("NÚMERO CELULAR");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setText("CORREO ELECTRONICO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        jLabel6.setForeground(new java.awt.Color(51, 153, 255));
        jLabel6.setText("TELEFONO CASA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, -1, -1));

        CAMPOCORREO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CAMPOCORREO.setBorder(null);
        CAMPOCORREO.setNextFocusableComponent(CAMPOTEL);
        jPanel1.add(CAMPOCORREO, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 340, 30));

        CAMPOTEL.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CAMPOTEL.setBorder(null);
        CAMPOTEL.setNextFocusableComponent(jButton1);
        CAMPOTEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAMPOTELActionPerformed(evt);
            }
        });
        jPanel1.add(CAMPOTEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 340, 30));

        CONTRA2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CONTRA2.setText("DENTALLLSLSSS");
        CONTRA2.setBorder(null);
        CONTRA2.setNextFocusableComponent(CAMPOCEL);
        CONTRA2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CONTRA2FocusGained(evt);
            }
        });
        jPanel1.add(CONTRA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 340, 20));

        CONTRA1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CONTRA1.setText("DENTALTOOLKIT");
        CONTRA1.setBorder(null);
        CONTRA1.setNextFocusableComponent(CONTRA2);
        CONTRA1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CONTRA1FocusGained(evt);
            }
        });
        CONTRA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CONTRA1ActionPerformed(evt);
            }
        });
        jPanel1.add(CONTRA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 340, 20));

        jButton1.setText("ACEPTAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 140, 50));

        jButton2.setText("CANCELAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 500, 140, 50));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 580));
    }// </editor-fold>//GEN-END:initComponents

    private void CAMPOAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAMPOAPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAMPOAPActionPerformed

    private void CAMPOCELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAMPOCELActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAMPOCELActionPerformed

    private void CAMPONOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAMPONOMBREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAMPONOMBREActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Usuario Admin= new Usuario();
        Validador Va= new Validador();
           new Thread(() -> {
               if(Va.ValidaContra(CONTRA1.getText(),CONTRA2.getText())){
                    if(Va.ValidaCel(CAMPOCEL.getText())){
                        if(Va.ValidaTel(CAMPOTEL.getText())){
                            if(Va.validateEMAIL(CAMPOCORREO.getText())){
                                try {
                                    if(Admin.CrearUsuario(CAMPONOMBRE.getText(),CAMPOAM.getText()+" "+CAMPOAP.getText(),CONTRA1.getText(),CAMPOCEL.getText(),CAMPOCORREO.getText(),CAMPOTEL.getText(),"1")==1){
                                        SMS S = new SMS();
                                        EMAIL E = new EMAIL();
                                        S.mandar(CAMPOCEL.getText(),"Administrador "+CAMPONOMBRE.getText()+" ha sido registrado");
                                        E.ENVIAR(CAMPOCORREO.getText(),"Registro", "Administrador "+CAMPONOMBRE.getText()+" ha sido registrado");
                                        JOptionPane.showMessageDialog(this,"Administrador "+CAMPONOMBRE.getText()+" ha sido registrado");
                                        JComponent comp = (JComponent) evt.getSource();
                                        Window win = SwingUtilities.getWindowAncestor(comp);
                                        win.dispose();
                                        Admin Ad =new Admin(Admin);
                                        Ad.show();
                                    }else{
                                        JOptionPane.showMessageDialog(this, "¡Error en registro!");
                                    }
                                } catch (SQLException ex) {
                                    Logger.getLogger(RegistroAdmin.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (IOException ex) {
                                    Logger.getLogger(RegistroAdmin.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }else{
                               JOptionPane.showMessageDialog(this, "¡Correo invalido!");
                            }
                        }else{
                           JOptionPane.showMessageDialog(this, "¡Telefono de casa con mal formato!");
                        }
                    }else{
                       JOptionPane.showMessageDialog(this, "¡Telefono celular con mal formato!");
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "¡Las contraseñas no coinciden!");
                    CONTRA1.setText("");
                    CONTRA2.setText("");
                }
           }).start();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CONTRA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CONTRA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CONTRA1ActionPerformed

    private void CONTRA1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CONTRA1FocusGained
        CONTRA1.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_CONTRA1FocusGained

    private void CONTRA2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CONTRA2FocusGained
        CONTRA2.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_CONTRA2FocusGained

    private void CAMPOTELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAMPOTELActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAMPOTELActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        A.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CAMPOAM;
    private javax.swing.JTextField CAMPOAP;
    private javax.swing.JTextField CAMPOCEL;
    private javax.swing.JTextField CAMPOCORREO;
    private javax.swing.JTextField CAMPONOMBRE;
    private javax.swing.JTextField CAMPOTEL;
    private javax.swing.JPasswordField CONTRA1;
    private javax.swing.JPasswordField CONTRA2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
