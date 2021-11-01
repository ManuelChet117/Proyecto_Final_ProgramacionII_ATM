/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import DB.Conexion;
import codigo.fondoN;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.JOptionPane;
import static ventanas.contrasenaC.txtrecibi;
import static ventanas.menu.txtSald;


/**
 *
 * @author Manucho
 */
public class PagarEnerg extends javax.swing.JFrame {
     Conexion conec=new Conexion();
Connection conectar=conec.conectar();
    public double total; 
    public String textTotal;
    public double ret;
    public double rit;
 
    public String sal;
    public String sil;
    
    public String saldo;
    public String nombre;
    public double tot;
    
   

    
    
   
    
    /**
     * Creates new form Retirar
     */
    public PagarEnerg() {
        initComponents();
        transparencia();
        ocultar();
        setLocationRelativeTo(null);
        txtMonto.setBackground(new java.awt.Color(0,0,0,1));
        txtNomb.setBackground(new java.awt.Color(0,0,0,0));
       txtCuent.setBackground(new java.awt.Color(0,0,0,0));
        
        
    }
    
    public void transparencia(){
    bille5.setOpaque(false);
    bille5.setContentAreaFilled(false);
    bille5.setBorderPainted(false);
    
    bille10.setOpaque(false);
    bille10.setContentAreaFilled(false);
    bille10.setBorderPainted(false);
    
    bille20.setOpaque(false);
    bille20.setContentAreaFilled(false);
    bille20.setBorderPainted(false);
    
    bille50.setOpaque(false);
    bille50.setContentAreaFilled(false);
    bille50.setBorderPainted(false);
    
    bille100.setOpaque(false);
    bille100.setContentAreaFilled(false);
    bille100.setBorderPainted(false);
    
    bille200.setOpaque(false);
    bille200.setContentAreaFilled(false);
    bille200.setBorderPainted(false);
    
     btnBorrar.setOpaque(false);
    btnBorrar.setContentAreaFilled(false);
    btnBorrar.setBorderPainted(false);
    
    jButton1.setOpaque(false);
    jButton1.setContentAreaFilled(false);
    jButton1.setBorderPainted(false);
    
    jButton2.setOpaque(false);
    jButton2.setContentAreaFilled(false);
    jButton2.setBorderPainted(false);
    
    jButton4.setOpaque(false);
    jButton4.setContentAreaFilled(false);
    jButton4.setBorderPainted(false);
    
    jButton5.setOpaque(false);
    jButton5.setContentAreaFilled(false);
    jButton5.setBorderPainted(false);
   
 
  
    }
    
    void ConsultaSaldo(){
    String cuenta1 =txtCuent.getText();
    String cuenta2 = cuenta1;
    String sql="";
  
    try { 
        Statement stmt = conectar.createStatement();
        sql="SELECT saldo FROM pagos where cuenta='"+cuenta2+"'";
        ResultSet rs = stmt.executeQuery(sql);	
        if(rs.next()){
					
					saldo = rs.getString(1);
					
				} 
				//rs.close();
				//stmt.close();
				//conectar.close();
                               
    } catch (SQLException ex) {
        System.out.println(ex.toString());
    }
   txtSalN.setText(saldo);
    }
     void ConsultaNombre(){
    String cuenta1 =txtCuent.getText();
    String cuenta2 = cuenta1;
    String sql="";
  
    try { 
        Statement stmt = conectar.createStatement();
        sql="SELECT nombre FROM pagos where cuenta='"+cuenta2+"'";
        ResultSet rs = stmt.executeQuery(sql);	
        if(rs.next()){
					
					nombre = rs.getString(1);
					
				} 
				//rs.close();
				//stmt.close();
				//conectar.close();
                               
    } catch (SQLException ex) {
        System.out.println(ex.toString());
    }
   txtNomb.setText(nombre);
    }
    public void Suma(){
        sal=txtSalN.getText();
        ret=Double.parseDouble(sal);
        
        
       total = ret + total;
    }
    
    public void Resta(){
    sil=txtSald.getText();
        rit=Double.parseDouble(sil);
        
        
       tot = rit - total ;
    
    }
       void ocultar(){
    txtSalN.setVisible(false);
    BtA.setVisible(false);
    txtCuent.setVisible(false);
    jButton3.setVisible(false);
    } 
    
   public void ModificarDatos(){
       
       Resta();
       Suma();
       
        try {
        PreparedStatement pasar=conectar.prepareStatement("UPDATE pagos SET saldo='"+total+"' WHERE cuenta='"+txtCuent.getText()+"'");
        PreparedStatement pasar2=conectar.prepareStatement("UPDATE cuenta SET saldo='"+tot+"' WHERE cuenta='"+txtrecibi.getText()+"'");
        pasar.executeUpdate();
        pasar2.executeUpdate();
        JOptionPane.showMessageDialog(null, "Transacción Realizado con Éxito");
        menu m=new menu();
        m.setVisible(true);
        dispose();
        
        
    } catch (SQLException ex) {
        Logger.getLogger(crearC.class.getName()).log(Level.SEVERE, null, ex);
    }
 }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new fondoN(this);
        bille5 = new javax.swing.JButton();
        bille10 = new javax.swing.JButton();
        bille20 = new javax.swing.JButton();
        bille50 = new javax.swing.JButton();
        bille100 = new javax.swing.JButton();
        bille200 = new javax.swing.JButton();
        txtMonto = new javax.swing.JTextField();
        btnBorrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtCuent = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSalN = new javax.swing.JTextField();
        BtA = new javax.swing.JButton();
        txtNomb = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bille5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billetes/bi5.png"))); // NOI18N
        bille5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/billetes/bi5.png"))); // NOI18N
        bille5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/billetes/5p.png"))); // NOI18N
        bille5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bille5ActionPerformed(evt);
            }
        });
        jPanel1.add(bille5, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 184, 210, 80));

        bille10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billetes/bi10.png"))); // NOI18N
        bille10.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/billetes/bi10.png"))); // NOI18N
        bille10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/billetes/10p.png"))); // NOI18N
        bille10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bille10ActionPerformed(evt);
            }
        });
        jPanel1.add(bille10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 184, 210, 80));

        bille20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billetes/bi20.png"))); // NOI18N
        bille20.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/billetes/bi20.png"))); // NOI18N
        bille20.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/billetes/20p.png"))); // NOI18N
        bille20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bille20ActionPerformed(evt);
            }
        });
        jPanel1.add(bille20, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 276, 210, 80));

        bille50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billetes/bi50.png"))); // NOI18N
        bille50.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/billetes/bi50.png"))); // NOI18N
        bille50.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/billetes/50p.png"))); // NOI18N
        bille50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bille50ActionPerformed(evt);
            }
        });
        jPanel1.add(bille50, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 276, 210, 80));

        bille100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billetes/bi100.png"))); // NOI18N
        bille100.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/billetes/bi100.png"))); // NOI18N
        bille100.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/billetes/100p.png"))); // NOI18N
        bille100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bille100ActionPerformed(evt);
            }
        });
        jPanel1.add(bille100, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 368, 210, 80));

        bille200.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billetes/bi200.png"))); // NOI18N
        bille200.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/billetes/bi200.png"))); // NOI18N
        bille200.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/billetes/200p.png"))); // NOI18N
        bille200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bille200ActionPerformed(evt);
            }
        });
        jPanel1.add(bille200, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 368, 210, 80));

        txtMonto.setFont(new java.awt.Font("Bungee Inline", 1, 48)); // NOI18N
        txtMonto.setForeground(new java.awt.Color(23, 58, 98));
        txtMonto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMonto.setBorder(null);
        txtMonto.setFocusable(false);
        txtMonto.setOpaque(false);
        txtMonto.setRequestFocusEnabled(false);
        txtMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoActionPerformed(evt);
            }
        });
        jPanel1.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 332, 280, 57));

        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/basura.png"))); // NOI18N
        btnBorrar.setPreferredSize(new java.awt.Dimension(64, 64));
        btnBorrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/basura.png"))); // NOI18N
        btnBorrar.setRolloverEnabled(true);
        btnBorrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/BORRARp_1.png"))); // NOI18N
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(879, 325, -1, -1));

        jLabel1.setFont(new java.awt.Font("Bungee", 1, 72)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(23, 58, 98));
        jLabel1.setText("MONTO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bungee", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(33, 190, 231));
        jLabel2.setText("Seleccione el tipo ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 58, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/CANCELAR.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelarP.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 490, 111, 107));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ACEPTAR.png"))); // NOI18N
        jButton2.setPreferredSize(new java.awt.Dimension(77, 24));
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ACEPTAR.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ACEPTARp.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 490, 114, 110));

        txtCuent.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        txtCuent.setForeground(new java.awt.Color(255, 255, 255));
        txtCuent.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCuent.setBorder(null);
        txtCuent.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtCuent.setOpaque(false);
        txtCuent.setRequestFocusEnabled(false);
        txtCuent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCuentActionPerformed(evt);
            }
        });
        jPanel1.add(txtCuent, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 60, 20));

        jLabel3.setFont(new java.awt.Font("Bungee", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(15, 49, 87));
        jLabel3.setText("Seleccione Compañia electrica ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

        txtSalN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalNActionPerformed(evt);
            }
        });
        jPanel1.add(txtSalN, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 560, 56, -1));

        BtA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/USUARIO.png"))); // NOI18N
        BtA.setPreferredSize(new java.awt.Dimension(64, 64));
        BtA.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/USUARIO.png"))); // NOI18N
        BtA.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/USUARIOP.png"))); // NOI18N
        BtA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAActionPerformed(evt);
            }
        });
        jPanel1.add(BtA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 50, 40));

        txtNomb.setFont(new java.awt.Font("Bungee", 1, 18)); // NOI18N
        txtNomb.setForeground(new java.awt.Color(255, 255, 255));
        txtNomb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNomb.setBorder(null);
        txtNomb.setFocusable(false);
        txtNomb.setOpaque(false);
        txtNomb.setRequestFocusEnabled(false);
        txtNomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombActionPerformed(evt);
            }
        });
        jPanel1.add(txtNomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 286, 46));

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 477, 135, 77));

        jLabel4.setFont(new java.awt.Font("Bungee", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(33, 190, 231));
        jLabel4.setText("BILLETE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bungee", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(33, 190, 231));
        jLabel5.setText("de");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/barra.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 290, 10));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/barra.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 290, 10));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ENERGUATE.png"))); // NOI18N
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ENERGUATE.png"))); // NOI18N
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ENERGUATE-.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 140, 60));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/EEGSA.png"))); // NOI18N
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/EEGSA.png"))); // NOI18N
        jButton5.setRolloverEnabled(true);
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/EEGSA-.png"))); // NOI18N
        jButton5.setSelected(true);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 120, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 970, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bille5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bille5ActionPerformed
     total = total + 5; 
     mostrarSum();
     
    }//GEN-LAST:event_bille5ActionPerformed

    private void bille10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bille10ActionPerformed
    total = total + 10;
    mostrarSum();
    }//GEN-LAST:event_bille10ActionPerformed

    private void bille20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bille20ActionPerformed
    total = total + 20;     
    mostrarSum();
    }//GEN-LAST:event_bille20ActionPerformed

    private void bille50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bille50ActionPerformed
    total = total + 50;     
    mostrarSum();
    }//GEN-LAST:event_bille50ActionPerformed

    private void bille100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bille100ActionPerformed
    total = total + 100; 
    mostrarSum();
    }//GEN-LAST:event_bille100ActionPerformed

    private void bille200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bille200ActionPerformed
    total = total + 200;   
    mostrarSum();
    
    }//GEN-LAST:event_bille200ActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        total = 0;
        txtMonto.setText("");
        
        
        
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void txtMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int salida = JOptionPane.showConfirmDialog(null, "Desea cancelar la transacción");
        if (salida==0) {
            menuPagos salm = new menuPagos();
            salm.setVisible(true);
            dispose();
            total = 0;
            txtMonto.setText("");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
ModificarDatos();      
//ModificarDatos2();// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BtAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAActionPerformed
ConsultaSaldo();   
ConsultaNombre();
// TODO add your handling code here:
    }//GEN-LAST:event_BtAActionPerformed

    private void txtNombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     //ModificarDatos2();   // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtCuentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCuentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCuentActionPerformed

    private void txtSalNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalNActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
txtCuent.setText("9");   
BtA.doClick();


// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
txtCuent.setText("10");   
BtA.doClick();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(PagarEnerg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagarEnerg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagarEnerg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagarEnerg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagarEnerg().setVisible(true);
            }
        });
    }
    
    public void addBillete(String digito){
    //txtOpe.setText(txtOpe.getText() + digito);
    }

    public void mostrarSum(){
    System.out.println(total);
    textTotal = String.valueOf(total);
    txtMonto.setText("");
    txtMonto.setText(textTotal+ " Q");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtA;
    private javax.swing.JButton bille10;
    private javax.swing.JButton bille100;
    private javax.swing.JButton bille20;
    private javax.swing.JButton bille200;
    private javax.swing.JButton bille5;
    private javax.swing.JButton bille50;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCuent;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNomb;
    private javax.swing.JTextField txtSalN;
    // End of variables declaration//GEN-END:variables
}
