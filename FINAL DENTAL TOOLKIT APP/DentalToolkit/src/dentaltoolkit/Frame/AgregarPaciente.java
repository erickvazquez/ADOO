/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dentaltoolkit.Frame;

import Controlador.Paciente;
import Validaciones.Validador;
import com.google.zxing.WriterException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import scanner.Alertas;
import scanner.EMAIL;

/**
 *
 * @author EHef_
 */
public class AgregarPaciente extends javax.swing.JPanel {
    public InfoPaciente P;
    /**
     * Creates new form RegistroAdmin
     */
    public AgregarPaciente() {
        initComponents();
    }
    public void AgregarPanel(InfoPaciente A){
        P=A;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        CAMPONOMBRE = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        CAMPOAM = new javax.swing.JTextField();
        CAMPONUMCEL = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        CAMPOCORREO = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        CAMPOTEL = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CAMPOPADECIMIENTOS = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CAMPOAP = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 1200, 10));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("CREAR PACIENTE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 230, 50));

        CAMPONOMBRE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CAMPONOMBRE.setBorder(null);
        CAMPONOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAMPONOMBREActionPerformed(evt);
            }
        });
        jPanel1.add(CAMPONOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 330, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 330, 10));

        jLabel8.setForeground(new java.awt.Color(51, 153, 255));
        jLabel8.setText("NOMBRE");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 330, 10));

        CAMPOAM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CAMPOAM.setBorder(null);
        CAMPOAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAMPOAMActionPerformed(evt);
            }
        });
        jPanel1.add(CAMPOAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 330, 30));

        CAMPONUMCEL.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CAMPONUMCEL.setBorder(null);
        CAMPONUMCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAMPONUMCELActionPerformed(evt);
            }
        });
        jPanel1.add(CAMPONUMCEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 410, 30));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 410, 10));

        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setText("PADECIMIENTOS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, -1));

        CAMPOCORREO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CAMPOCORREO.setBorder(null);
        jPanel1.add(CAMPOCORREO, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 410, 30));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 500, 410, 10));

        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setText("CORREO ELECTRONICO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, -1, -1));

        CAMPOTEL.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CAMPOTEL.setBorder(null);
        jPanel1.add(CAMPOTEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 530, 410, 30));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 560, 410, 10));

        jLabel6.setForeground(new java.awt.Color(51, 153, 255));
        jLabel6.setText("TELEFONO CASA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, -1, -1));

        jLabel11.setForeground(new java.awt.Color(51, 153, 255));
        jLabel11.setText("NÚMERO CELULAR");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, -1, -1));

        CAMPOPADECIMIENTOS.setColumns(20);
        CAMPOPADECIMIENTOS.setRows(5);
        jScrollPane1.setViewportView(CAMPOPADECIMIENTOS);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 410, 110));

        jButton2.setText("ACEPTAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 590, 140, 50));

        jLabel7.setForeground(new java.awt.Color(51, 153, 255));
        jLabel7.setText("APELLIDO MATERNO");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        jLabel9.setForeground(new java.awt.Color(51, 153, 255));
        jLabel9.setText("APELLIDO PATERNO");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        CAMPOAP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CAMPOAP.setBorder(null);
        jPanel1.add(CAMPOAP, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 330, 30));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 330, 10));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentaltoolkit/Image/archivo (1).png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel10MouseReleased(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 580, -1, -1));

        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("SUBIR HISTORIA CLINICA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 660, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 740));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseReleased
        jLabel10.setLocation(1000, 570);
    }//GEN-LAST:event_jLabel10MouseReleased

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
        jLabel10.setLocation(1010, 580);
    }//GEN-LAST:event_jLabel10MousePressed

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        jLabel10.setLocation(1010, 580);
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        jLabel10.setLocation(1000, 570);
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Paciente Pa= new Paciente();
        Validador Va = new Validador();
        if(Va.ValidaCel(CAMPONUMCEL.getText())){
            if(Va.ValidaTel(CAMPOTEL.getText())){
                if(Va.validateEMAIL(CAMPOCORREO.getText())){
                    int a=0;
                    try {
                        a=Pa.CrearPaciente(CAMPONOMBRE.getText(),CAMPOAP.getText()+ " "+CAMPOAM.getText(),CAMPOPADECIMIENTOS.getText(),CAMPONUMCEL.getText(),CAMPOCORREO.getText(),CAMPOTEL.getText(),"3");
                        if(a==1){
                            JOptionPane.showMessageDialog(this, "Registro Exitoso, paciente "+CAMPONOMBRE.getText()+" agregado.");
                        }else{
                            JOptionPane.showMessageDialog(this, "Paciente duplicado");
                        }
                        Alertas A = new Alertas();
                        A.AlertaGlobal(CAMPONUMCEL.getText(),"Hola "+CAMPONOMBRE.getText()+" gracias por tu preferencia","Registro", CAMPOCORREO.getText());
                        EMAIL EM = new EMAIL();
                        EM.ENVIARQR(CAMPOCORREO.getText(),"Bienvenido","Gracias por elegirnos.");
                        CAMPOAM.setText("");
                        CAMPONOMBRE.setText("");
                        CAMPOAP.setText("");
                        CAMPOAM.setText("");
                        CAMPOPADECIMIENTOS.setText("");
                        CAMPONUMCEL.setText("");
                        CAMPOCORREO.setText("");
                        CAMPOTEL.setText("");
                        P.llenarbox();
                    } catch (SQLException ex) {
                        Logger.getLogger(AgregarPaciente.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(AgregarPaciente.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (WriterException ex) {
                        Logger.getLogger(AgregarPaciente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "¡Correo invalido!");
                }
            }else{
                JOptionPane.showMessageDialog(this, "¡Numero de casa invalido!");
            }
        }else{
            JOptionPane.showMessageDialog(this, "¡Numero de celualr invalido!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CAMPONUMCELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAMPONUMCELActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAMPONUMCELActionPerformed

    private void CAMPOAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAMPOAMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAMPOAMActionPerformed

    private void CAMPONOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAMPONOMBREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAMPONOMBREActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CAMPOAM;
    private javax.swing.JTextField CAMPOAP;
    private javax.swing.JTextField CAMPOCORREO;
    private javax.swing.JTextField CAMPONOMBRE;
    private javax.swing.JTextField CAMPONUMCEL;
    private javax.swing.JTextArea CAMPOPADECIMIENTOS;
    private javax.swing.JTextField CAMPOTEL;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    // End of variables declaration//GEN-END:variables
}
