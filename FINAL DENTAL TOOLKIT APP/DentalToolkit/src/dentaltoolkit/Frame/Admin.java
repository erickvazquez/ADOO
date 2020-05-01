package dentaltoolkit.Frame;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import AppPackage.AnimationClass;
import Controlador.Usuario;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Admin extends javax.swing.JFrame {
    Color naranja = new Color(255, 153, 153);
    AnimationClass fonR = new AnimationClass();
    AnimationClass fonL = new AnimationClass();
    AnimationClass bandejaR = new AnimationClass();
    AnimationClass bandejaL = new AnimationClass();
    AnimationClass correoR = new AnimationClass();
    AnimationClass correoL = new AnimationClass();
    AnimationClass herramientaR = new AnimationClass();
    AnimationClass herramientaL = new AnimationClass();
    AnimationClass vialR = new AnimationClass();
    AnimationClass vialL = new AnimationClass();
    String a="";
    Usuario Admin1;
    GridBagLayout layout = new GridBagLayout();
    Agenda agenda;
    Consultorios consultorios =  new Consultorios();
    MATERIALES materiales = new MATERIALES();
    public Admin(Usuario Admin) throws SQLException {
        agenda = new Agenda(Admin1);
        Admin1=Admin;
        initComponents();
        this.setTitle("Dental Toolkit");
        this.setLocationRelativeTo(null);
        ETIQUETAUSUARIO.setText(Admin.Nombre);
        jPanel3.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        jPanel3.add(agenda, c);
        jPanel3.add(consultorios, c);
        jPanel3.add(materiales, c);
        /*jPanel4.add(agenda, c);*/
        agenda.setVisible(false);
        consultorios.setVisible(false);
        materiales.setVisible(false);
        jPanel4.setVisible(true);
        ImageIcon img = new ImageIcon(a+"\\src\\Splash\\Splash3.png");
        this.setIconImage(img.getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        herramienta = new javax.swing.JLabel();
        bandejaLabel = new javax.swing.JLabel();
        fonLabel = new javax.swing.JLabel();
        sendLabel = new javax.swing.JLabel();
        vial = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ETIQUETAUSUARIO = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();

        jLabel13.setText("jLabel13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 102), 5));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        herramienta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        herramienta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentaltoolkit/Image/taladro-dental (1).png"))); // NOI18N

        bandejaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bandejaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentaltoolkit/Image/email (5).png"))); // NOI18N

        fonLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fonLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentaltoolkit/Image/aprovechar.png"))); // NOI18N
        fonLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fonLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fonLabelMouseExited(evt);
            }
        });

        sendLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sendLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentaltoolkit/Image/email (8).png"))); // NOI18N

        vial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentaltoolkit/Image/vial (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sendLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
            .addComponent(bandejaLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fonLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(vial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(herramienta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(herramienta, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vial, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fonLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sendLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bandejaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, 110, 120, 690));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Adobe Fangsong Std R", 2, 100)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("BIENVENIDO");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 640, 340));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 670, 260));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentaltoolkit/Image/molar.png"))); // NOI18N
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 840));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1350, 840));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentaltoolkit/Image/mas (2).png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 51, 100));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentaltoolkit/Image/salida.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 10, 130, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentaltoolkit/Image/agenda (1).png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentaltoolkit/Image/cepillo-de-dientes.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, -1));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 47, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentaltoolkit/Image/silla-de-escritorio.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, -1, -1));

        ETIQUETAUSUARIO.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ETIQUETAUSUARIO.setForeground(new java.awt.Color(255, 255, 255));
        ETIQUETAUSUARIO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ETIQUETAUSUARIO.setText("NOMBRE DE USUARIO");
        jPanel2.add(ETIQUETAUSUARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 40, 170, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("MATERIALES");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 110, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("CONSULTORIOS");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 90, 130, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("AGENDA");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 80, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 10, 30, 90));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 50, 90));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 60, -1));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 110, 20));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 90, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 950));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        
       /* fonR.jLabelXRight(-70, 20, 10, 5, fonLabel);
     
        fonL.jLabelXLeft(20, -70, 10, 5, fonLabel);
        
        bandejaR.jLabelXRight(-70, 20, 10, 5, bandejaLabel);
        
        bandejaL.jLabelXLeft(20, -70, 10, 5, bandejaLabel);
        
        correoR.jLabelXRight(-70, 20, 10, 5, sendLabel);
        
        correoL.jLabelXLeft(20, -70, 10, 5, sendLabel);
        
        herramientaR.jLabelXRight(-70, 20, 10, 5, herramienta);
        
        herramientaL.jLabelXLeft(20, -70, 10, 5, herramienta);
        
        vialR.jLabelXRight(-70, 20, 10, 5, vial);
        
        vialL.jLabelXLeft(20, -70, 10, 5, vial);*/
        File file = new File("");
        try {
            a= file.getCanonicalFile().toString();
        } catch (IOException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        Icon icono = new ImageIcon("\\src\\dentaltoolkit\\Image\\mas (3).png");
        if (jLabel5.getIcon().toString().equals(icono.toString())) {
            evt.consume();
            jLabel5.setIcon(new ImageIcon("\\src\\dentaltoolkit\\Image\\mas (2).png"));
            Animacion.Animacion.mover_izquierda(0, -150, 2, 2, jPanel5);
            
        } else {
            jLabel5.setIcon(new ImageIcon("\\src\\dentaltoolkit\\Image\\mas (3).png"));
            Animacion.Animacion.mover_derecha(-150, 0, 2, 2, jPanel5);
        }

    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
        agenda.setVisible(true);
        consultorios.setVisible(false);
        materiales.setVisible(false);
        jPanel4.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        agenda.setVisible(false);
        consultorios.setVisible(false);
        materiales.setVisible(true);
        jPanel4.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        agenda.setVisible(false);
        consultorios.setVisible(true);
        materiales.setVisible(false);
        jPanel4.setVisible(false);
        
        
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        jLabel2.setLocation(270, 10);
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        jLabel2.setLocation(265, 5);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        jLabel2.setLocation(270, 10);
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        jLabel2.setLocation(265, 5);
    }//GEN-LAST:event_jLabel2MouseReleased

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setLocation(535, 5);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setLocation(540, 10);
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        jLabel3.setLocation(540, 10);
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jLabel6.setLocation(805, 5);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jLabel6.setLocation(810, 10);
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        jLabel6.setLocation(810, 10);
    }//GEN-LAST:event_jLabel6MousePressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        LogIn login = new LogIn();
        login.show();
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void fonLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fonLabelMouseEntered
      //  fonLabel.setBorder(BorderFactory.createLineBorder(naranja, 2));
    }//GEN-LAST:event_fonLabelMouseEntered

    private void fonLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fonLabelMouseExited
        // fonLabel.setBorder(BorderFactory.createLineBorder(naranja, 0));
    }//GEN-LAST:event_fonLabelMouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        
        jLabel1.setIcon(new ImageIcon(a+"\\src\\dentaltoolkit\\Image\\salida(1).png"));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
       
        jLabel1.setIcon(new ImageIcon(a+"\\src\\dentaltoolkit\\Image\\salida.png"));
    }//GEN-LAST:event_jLabel1MouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ETIQUETAUSUARIO;
    private javax.swing.JLabel bandejaLabel;
    private javax.swing.JLabel fonLabel;
    private javax.swing.JLabel herramienta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel sendLabel;
    private javax.swing.JLabel vial;
    // End of variables declaration//GEN-END:variables
}
