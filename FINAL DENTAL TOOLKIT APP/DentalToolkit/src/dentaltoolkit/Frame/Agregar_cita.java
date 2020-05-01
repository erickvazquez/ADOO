/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dentaltoolkit.Frame;

import Controlador.Paciente;
import java.awt.GridBagConstraints;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Agregar_cita extends javax.swing.JPanel {

    DefaultTableModel modelo;
    ListSelectionModel seleccionado;
    TableRowSorter trs;
    ArrayList<String> datos = new ArrayList<String>();
    public ArrayList<Paciente> ARR;
    public Agregar_cita() throws SQLException {
        initComponents();
        jComboBox1.addItem("Erick");
        jComboBox1.addItem("Alejandro");
        jComboBox1.addItem("Miguel");
        jComboBox1.addItem("Eric");
        modelo = (DefaultTableModel)jTable1.getModel();
        seleccionado = jTable1.getSelectionModel();
        modelo.addColumn("PACIENTE");
        modelo.addColumn("RAZON DE CITA");
        modelo.addColumn("HORA INICIO");
        modelo.addColumn("HORA FIN");
        modelo.addColumn("DIA");
        llenarbox();
    }
    
    public void llenarbox() throws SQLException{
        Paciente C = new Paciente();
        ARR = C.ObtenerPacientes();
        List<String> ls = new ArrayList<String>();
        for(int i =0;i<ARR.size();i++){
            ls.add(ARR.get(i).Nombre+" "+ARR.get(i).Apellidos);
        }
        jComboBox1.setModel(new DefaultComboBoxModel(ls.toArray()));
    }
    
    public void llenarTabla(String nombre, String causa, String horaInicio, String horaFin, String dia){
        
        String[] datos ={nombre,causa,horaInicio,horaFin,dia};
        modelo.addRow(datos);
    }
    public void eliminarElemento(int row){
        datos.clear();
         datos.add(0, "\nNombre del paciente: " + (String)modelo.getValueAt(row, 0));
         datos.add(1, "\nRazon de la cita: " + (String)modelo.getValueAt(row, 1));
         datos.add(2, "\nHora de inicio: " + (String)modelo.getValueAt(row, 2));
         datos.add(3, "\nHora estimada de fin: " + (String)modelo.getValueAt(row, 3));
         datos.add(4, "\nDia" + (String)modelo.getValueAt(row, 4));
        if(JOptionPane.showConfirmDialog(this, "SEGURO QUE DESEA ELIMINAR LA CITA CON LOS SIGUIENTES DATOS: " + datos, "ELIMINAR CITA", JOptionPane.YES_NO_OPTION) == 0){
        modelo.removeRow(row);
        }
        
    }
    public void modificarElemento(int row) throws ParseException{
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        int index = 0;
        String[] horaInicio;
        String[] horaFin;
        jTextArea1.setText((String)modelo.getValueAt(row, 1));
        for(int i = 0; i < jComboBox1.getItemCount(); i++){
            if(modelo.getValueAt(row, 0).equals(jComboBox1.getItemAt(i))){
                index = i;
            }
        }
        jComboBox1.setSelectedIndex(index);
        horaInicio = ((String)modelo.getValueAt(row, 2)).split(":");
        horaFin = ((String)modelo.getValueAt(row, 3)).split(":");
        jTextField4.setText(horaInicio[0]);
         jTextField5.setText(horaInicio[1]);
         jTextField2.setText(horaFin[1]);
         jTextField3.setText(horaFin[0]);
         jCalendar1.setDate(dateFormat.parse((String)modelo.getValueAt(row, 4)));
         modelo.removeRow(row);
         
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinField1 = new com.toedter.components.JSpinField();
        jPanel1 = new javax.swing.JPanel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jCalendar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 430, 220));

        jLabel1.setText("MOTIVO DE LA CITA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jComboBox1MousePressed(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 270, 30));

        jLabel2.setText("PACIENTE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 270, -1));

        jLabel3.setText("SELECCIONA DÍA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, -1, -1));

        jButton3.setText("ACEPTAR");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 670, 100, 40));

        jLabel4.setText("HORA FIN(estimada)");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        jLabel5.setText("HORA DE INICIO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, -1));

        jTextField2.setForeground(new java.awt.Color(153, 153, 153));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("MM");
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, 60, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 1270, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setText("CITA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText(":");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 10, 30));

        jTextField3.setForeground(new java.awt.Color(153, 153, 153));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("HH");
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 60, 30));

        jTextField4.setForeground(new java.awt.Color(153, 153, 153));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("HH");
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 60, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText(":");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 10, 30));

        jTextField5.setForeground(new java.awt.Color(153, 153, 153));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("MM");
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 60, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 780, 330));

        jButton1.setText("ELIMINAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 630, 110, 50));

        jLabel9.setText("BUSCAR POR FECHA");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 550, -1, -1));

        jLabel10.setText("BUSCAR POR NOMBRE");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, -1, -1));

        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 540, 240, 40));

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
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 480, 240, 40));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 100, 610));

        jButton2.setText("MODIFICAR");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 630, 110, 50));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 740));
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        jTextField4.setText(null);
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
        jTextField5.setText(null);
    }//GEN-LAST:event_jTextField5MouseClicked

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        jTextField3.setText(null);
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        jTextField2.setText(null);
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        //String startDateString = dateFormat.format(jCalendar1.getDayChooser()); 
         datos.add(0, (String)jComboBox1.getSelectedItem());
         datos.add(1, jTextArea1.getText());
         datos.add(2, jTextField4.getText() + ":" +jTextField5.getText());
         datos.add(3, jTextField3.getText() + ":" +jTextField2.getText());
         datos.add(4, dateFormat.format(jCalendar1.getDate()));
         if((jTextField4.getText().equals( jTextField3.getText()) && jTextField5.getText().equals(jTextField2.getText())) || (Integer.parseInt(jTextField4.getText()) > Integer.parseInt(jTextField3.getText())) || ( jTextField4.getText().equals( jTextField3.getText())&& Integer.parseInt(jTextField5.getText()) > Integer.parseInt(jTextField2.getText())) || Integer.parseInt(jTextField4.getText()) > 24 || Integer.parseInt(jTextField3.getText()) > 24 || Integer.parseInt(jTextField5.getText()) > 60 || Integer.parseInt(jTextField2.getText()) > 60){
             JOptionPane.showMessageDialog(this, "HORARIO MAL INGRESADO");
             return;
         }
         else{
             System.out.println(jTable1.getRowCount());
             for(int i = 0; i < jTable1.getRowCount(); i++){ 
                 if(modelo.getValueAt(i, 4).equals(datos.get(4)) && datos.get(2).equals( modelo.getValueAt(i, 2))){
                     JOptionPane.showMessageDialog(this, "HORA OCUPADA");
                     return;
                 }
             }
             this.llenarTabla(datos.get(0), datos.get(1), datos.get(2), datos.get(3), datos.get(4));
             JOptionPane.showMessageDialog(null, "Cita agregada");
         }
         ///////////////////////////////////////////////////////
         jTextArea1.setText(null);
         jTextField4.setText("HH");
         jTextField5.setText("MM");
         jTextField2.setText("HH");
         jTextField3.setText("MM");
         jComboBox1.setSelectedItem(null);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int row;
        row = seleccionado.getMinSelectionIndex();
        this.eliminarElemento(row);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        
        jTextField1.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(KeyEvent ke){
                trs.setRowFilter(RowFilter.regexFilter(jTextField1.getText(), 4));
            }
        });
        
        trs = new TableRowSorter(modelo);
        jTable1.setRowSorter(trs);
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6MouseClicked
        jTextField1.setText(null);
    }//GEN-LAST:event_jTextField6MouseClicked

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
       jTextField6.setText(null);
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyTyped
        jTextField6.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased(KeyEvent ke){
                trs.setRowFilter(RowFilter.regexFilter(jTextField6.getText(), 0));
            }
        });
        
        trs = new TableRowSorter(modelo);
        jTable1.setRowSorter(trs);
    }//GEN-LAST:event_jTextField6KeyTyped

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        int row;
        row = seleccionado.getMinSelectionIndex();
        try {
            this.modificarElemento(row);
        } catch (ParseException ex) {
            Logger.getLogger(Agregar_cita.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jComboBox1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MousePressed
        try {
            llenarbox();
        } catch (SQLException ex) {
            Logger.getLogger(Agregar_cita.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_jComboBox1MousePressed

     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private com.toedter.components.JSpinField jSpinField1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
