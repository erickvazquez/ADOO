/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dentaltoolkit.Frame;

import java.awt.Color;

/**
 *
 * @author EHef_
 */
public class Consultorio extends javax.swing.JPanel {

    /**
     * Creates new form Consultorio
     */
    Color naranja = new Color(255, 153, 153);
    public Consultorio() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("CONSULTORIO ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 1240, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentaltoolkit/Image/seguidores (1).png"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("AGREGAR DOCTOR");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 440, 10));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 220, 490, 530));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentaltoolkit/Image/dentista (2).png"))); // NOI18N
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("INFORMACION DOCTOR");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 440, 10));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 490, 530));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -20, 1360, 860));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 840));
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        jPanel5.setBackground(naranja);
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        jPanel4.setBackground(naranja);
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        jPanel4.setBackground(Color.white);
    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
       jPanel5.setBackground(Color.white);
    }//GEN-LAST:event_jPanel5MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
