/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dentaltoolkit.Frame;

import dentaltoolkit.ImagenTabla;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author EHef_
 */
public class AgregarFarmaco extends javax.swing.JPanel {

    DefaultTableModel modelo, dtm;
    ListSelectionModel seleccionado;
    TableRowSorter trs;
    ArrayList<String> datos = new ArrayList<String>();
    String ruta = null;

    public AgregarFarmaco() {
        initComponents();
        modelo = (DefaultTableModel) jTable1.getModel();
        seleccionado = jTable1.getSelectionModel();
        modelo.addColumn("NOMBRE");
        modelo.addColumn("MARCA");
        modelo.addColumn("PROVEEDOR");
        modelo.addColumn("FUNCION");
        modelo.addColumn("TEL. PROVEEDOR");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("FOTO");
        modelo.addColumn("CADUCIDAD");
    }

    public void llenarTabla(String nombre, String marca, String proveedor, String funcion, String telefonoProveedor, String cantidad, String foto, String caducidad) {
        jTable1.setDefaultRenderer(Object.class, new ImagenTabla());
        if (foto.equals(null)) {
            modelo.addRow(new Object[]{nombre, marca, proveedor, funcion, telefonoProveedor, cantidad, "No imagen", caducidad});
        } else {
            ImageIcon imagen = new ImageIcon();
            imagen = (ImageIcon) jLabel1.getIcon();
            modelo.addRow(new Object[]{nombre, marca, proveedor, funcion, telefonoProveedor, cantidad, new JLabel(imagen), caducidad});
        }
        jTable1.setRowHeight(90);
        jTable1.setModel(modelo);
    }

    public void eliminarElemento(int row) {
        datos.clear();
        datos.add(0, "\nNombre del material: " + (String) modelo.getValueAt(row, 0));
        datos.add(1, "\nMarca: " + (String) modelo.getValueAt(row, 1));
        datos.add(2, "\nProveedor: " + (String) modelo.getValueAt(row, 2));
        datos.add(3, "\nFuncion: " + (String) modelo.getValueAt(row, 3));
        datos.add(4, "\nTelefono de Proveedor: " + (String) modelo.getValueAt(row, 4));
        datos.add(5, "\nCantidad: " + (String) modelo.getValueAt(row, 5));
        datos.add(5, "\nCaducidad: " + (String) modelo.getValueAt(row, 7));
        if (JOptionPane.showConfirmDialog(this, "SEGURO QUE DESEA ELIMINAR LA CITA CON LOS SIGUIENTES DATOS: " + datos, "ELIMINAR CITA", JOptionPane.YES_NO_OPTION) == 0) {
            modelo.removeRow(row);
        }
    }

    public void modificarElemento(int row) {
        String[] caduc;
        jTextField9.setText((String) modelo.getValueAt(row, 0));
        jTextField5.setText((String) modelo.getValueAt(row, 1));
        jTextField2.setText((String) modelo.getValueAt(row, 2));
        jTextArea1.setText((String) modelo.getValueAt(row, 3));
        jTextField4.setText((String) modelo.getValueAt(row, 4));
        jTextField11.setText((String) modelo.getValueAt(row, 5));
        caduc = ((String) modelo.getValueAt(row, 7)).split("/");
        jTextField14.setText(caduc[0]);
        jTextField12.setText(caduc[1]);
        jTextField13.setText(caduc[2]);
        modelo.removeRow(row);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField9 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jTextField11 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setText("ACEPTAR");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 680, 100, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 1270, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setText("AGREGAR HERRAMIENTA");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 810, 330));

        jButton1.setText("MODIFICAR");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 620, 110, 50));

        jLabel10.setText("BUSCAR  CADUCIDAD");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 490, -1, -1));

        jTextField6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField6MouseClicked(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField6KeyTyped(evt);
            }
        });
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 540, 240, 40));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 100, 580));

        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setBorder(null);
        jPanel3.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 270, 30));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 270, 10));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 270, 10));

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setBorder(null);
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 270, 30));

        jLabel3.setForeground(new java.awt.Color(51, 153, 255));
        jLabel3.setText("PROVEEDOR");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setText("FUNCION DE LA HERRAMIENTA");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setBorder(null);
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 290, 30));
        jPanel3.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 290, 10));

        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setText("TELEFONO DE PROVEEDOR");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        jLabel11.setForeground(new java.awt.Color(51, 153, 255));
        jLabel11.setText("CADUCIDAD");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 270, 110));

        jLabel12.setForeground(new java.awt.Color(51, 153, 255));
        jLabel12.setText("MARCA");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setBorder(null);
        jPanel3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 270, 30));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 270, 10));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dentaltoolkit/Image/foto.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel13MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel13MouseReleased(evt);
            }
        });
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, 60, 60));

        jLabel2.setForeground(new java.awt.Color(51, 153, 255));
        jLabel2.setText("SUBIR FOTO");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 630, -1, -1));
        jPanel3.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, 70, 10));

        jTextField11.setForeground(new java.awt.Color(153, 153, 153));
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("0");
        jTextField11.setBorder(null);
        jTextField11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField11MouseClicked(evt);
            }
        });
        jPanel3.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 70, 30));

        jLabel14.setForeground(new java.awt.Color(51, 153, 255));
        jLabel14.setText("NOMBRE ");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 60, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 90));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, 130, 90));
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 690, 370, 20));

        jLabel15.setText("BUSCAR POR NOMBRE");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, -1, -1));

        jTextField7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField7MouseClicked(evt);
            }
        });
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField7KeyTyped(evt);
            }
        });
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 480, 240, 40));

        jButton2.setText("ELIMINAR");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 620, 110, 50));

        jLabel16.setForeground(new java.awt.Color(51, 153, 255));
        jLabel16.setText("CANTIDAD");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, -1, -1));

        jTextField12.setForeground(new java.awt.Color(153, 153, 153));
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setText("MM");
        jTextField12.setBorder(null);
        jTextField12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField12MouseClicked(evt);
            }
        });
        jPanel3.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 70, 30));

        jTextField13.setForeground(new java.awt.Color(153, 153, 153));
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setText("AAAA");
        jTextField13.setBorder(null);
        jTextField13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField13MouseClicked(evt);
            }
        });
        jPanel3.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, 70, 30));

        jTextField14.setForeground(new java.awt.Color(153, 153, 153));
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setText("DD");
        jTextField14.setBorder(null);
        jTextField14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField14MouseClicked(evt);
            }
        });
        jPanel3.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, 70, 30));
        jPanel3.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, 70, 10));
        jPanel3.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 540, 70, 10));
        jPanel3.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 70, 10));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 480, 180, 40));

        jLabel17.setText("BUSCAR POR PROVEEDOR");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 550, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 740));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked

        datos.add(0, jTextField9.getText());
        datos.add(1, jTextField5.getText());
        datos.add(2, jTextField2.getText());
        datos.add(3, jTextArea1.getText());
        datos.add(4, jTextField4.getText());
        datos.add(5, jTextField11.getText());
        datos.add(6, jLabel7.getText());
        datos.add(7, jTextField14.getText() + "/" + jTextField12.getText() + "/" + jTextField13.getText());
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            if (datos.get(0).equals(modelo.getValueAt(i, 0))) {
                if (JOptionPane.showConfirmDialog(this, "EL NOMBRE INGRESADO YA EXISTE\n¿DESEA AGREGARLO DE NUEVO?", "\nELIMINAR CITA", JOptionPane.YES_NO_OPTION) == 0) {
                    llenarTabla(datos.get(0), datos.get(1), datos.get(2), datos.get(3), datos.get(4), datos.get(5), datos.get(6), datos.get(7));
                    JOptionPane.showMessageDialog(null, "Herramienta agregada");
                    jTextArea1.setText(null);
                    jTextField9.setText(null);
                    jTextField5.setText(null);
                    jTextField2.setText(null);
                    jTextField4.setText(null);
                    jTextField11.setText("0");
                    jLabel1.setIcon(null);
                    jLabel7.setText(null);
                    jTextField14.setText("DD");
                    jTextField12.setText("MM");
                    jTextField13.setText("AAAA");
                    return;
                } else {
                    return;
                }
            }
        }
        llenarTabla(datos.get(0), datos.get(1), datos.get(2), datos.get(3), datos.get(4), datos.get(5), datos.get(6), datos.get(7));
        JOptionPane.showMessageDialog(null, "Herramienta agregada");
        ///////////////////////////////////////////////////////
        jTextArea1.setText(null);
        jTextField9.setText(null);
        jTextField5.setText(null);
        jTextField2.setText(null);
        jTextField4.setText(null);
        jTextField11.setText("0");
        jLabel1.setIcon(null);
        jLabel7.setText(null);
        jTextField14.setText("DD");
        jTextField12.setText("MM");
        jTextField13.setText("AAAA");
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        int row;
        row = seleccionado.getMinSelectionIndex();
        this.modificarElemento(row);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTextField6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6MouseClicked
        jTextField7.setText(null);
    }//GEN-LAST:event_jTextField6MouseClicked

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        jTextField6.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                trs.setRowFilter(RowFilter.regexFilter(jTextField6.getText(), 2));
            }
        });

        trs = new TableRowSorter(modelo);
        jTable1.setRowSorter(trs);
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked

        JFileChooser j = new JFileChooser();
        j.setCurrentDirectory(new File("C:\\Users\\EHef_\\OneDrive\\Imágenes"));
        int ap = j.showOpenDialog(this);

        if (ap == JFileChooser.APPROVE_OPTION) {
            ruta = j.getSelectedFile().getAbsolutePath();
            rsscalelabel.RSScaleLabel.setScaleLabel(jLabel1, ruta);

            //jLabel1.setIcon(new ImageIcon(ruta));
            jLabel7.setText(ruta);
        }

    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        jLabel13.setLocation(200, 550);
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        jLabel13.setLocation(210, 560);
    }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MousePressed
        jLabel13.setLocation(210, 560);
    }//GEN-LAST:event_jLabel13MousePressed

    private void jLabel13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseReleased
        jLabel13.setLocation(200, 550);
    }//GEN-LAST:event_jLabel13MouseReleased

    private void jTextField7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField7MouseClicked
        jTextField6.setText(null);
    }//GEN-LAST:event_jTextField7MouseClicked

    private void jTextField7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyTyped
        jTextField7.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                trs.setRowFilter(RowFilter.regexFilter(jTextField7.getText(), 0));
            }
        });

        trs = new TableRowSorter(modelo);
        jTable1.setRowSorter(trs);
    }//GEN-LAST:event_jTextField7KeyTyped

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        int row;
        row = seleccionado.getMinSelectionIndex();
        this.eliminarElemento(row);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jTextField12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField12MouseClicked
        jTextField12.setText(null);
    }//GEN-LAST:event_jTextField12MouseClicked

    private void jTextField13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField13MouseClicked
        jTextField13.setText(null);
    }//GEN-LAST:event_jTextField13MouseClicked

    private void jTextField14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField14MouseClicked
        jTextField14.setText(null);
    }//GEN-LAST:event_jTextField14MouseClicked

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        jTextField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                trs.setRowFilter(RowFilter.regexFilter(jTextField1.getText(), 7));
            }
        });

        trs = new TableRowSorter(modelo);
        jTable1.setRowSorter(trs);
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField11MouseClicked
        jTextField11.setText(null);
    }//GEN-LAST:event_jTextField11MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
