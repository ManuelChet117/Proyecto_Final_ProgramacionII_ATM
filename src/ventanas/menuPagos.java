/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import codigo.fondo3;
import DB.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static ventanas.contrasenaC.txtrecibi;

/**
 *
 * @author Manucho
 */
public class menuPagos extends javax.swing.JFrame {
  String saldo = null;
    Conexion conec=new Conexion();
    Connection conectar=conec.conectar();
    public String nombre;
    
     
    /**
     * Creates new form menu
     */
    public menuPagos() {
        initComponents();
        ocultar();
        transparenciaboton();
        this.setResizable(false);
        this.setLocationRelativeTo(this);
        this.setTitle("MER CAJERO AUTOMATICO");
        BtAuto.doClick();
        txtNombre.setBackground(new java.awt.Color(0,0,0,0));
        
    }
    
    public void transparenciaboton(){
    btncerrar.setOpaque(false);
    btncerrar.setContentAreaFilled(false);
    btncerrar.setBorderPainted(false);
    
    btnmini.setOpaque(false);
    btnmini.setContentAreaFilled(false);
    btnmini.setBorderPainted(false);
    
    jButton3.setOpaque(false);
    jButton3.setContentAreaFilled(false);
    jButton3.setBorderPainted(false);
    
    jButton2.setOpaque(false);
    jButton2.setContentAreaFilled(false);
    jButton2.setBorderPainted(false);
    
    jButton1.setOpaque(false);
    jButton1.setContentAreaFilled(false);
    jButton1.setBorderPainted(false);
    
    btnConsultar.setOpaque(false);
    btnConsultar.setContentAreaFilled(false);
    btnConsultar.setBorderPainted(false);
    
    
  
    }
    void ocultar(){
    txtSald.setVisible(false);
    BtAuto.setVisible(false);
    }
      void ConsultaNombre(){
    String cuenta1 =txtrecibi.getText();
    String cuenta2 = cuenta1;
    String sql="";
  
    try { 
        Statement stmt = conectar.createStatement();
        sql="SELECT nombre FROM cuenta where cuenta='"+cuenta2+"'";
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
   txtNombre.setText(nombre);
    }
    void ConsultaSaldo(){
    String cuenta1 =txtrecibi.getText();
    String cuenta2 = cuenta1;
    String sql="";
  
    try { 
        Statement stmt = conectar.createStatement();
        sql="SELECT saldo FROM cuenta where cuenta='"+cuenta2+"'";
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
   txtSald.setText(saldo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new fondo3(this);
        btncerrar = new javax.swing.JButton();
        btnmini = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        txtSald = new javax.swing.JTextField();
        BtAuto = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/btncerrarpeque??o.png"))); // NOI18N
        btncerrar.setBorder(null);
        btncerrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/btncerrarpeque??o.png"))); // NOI18N
        btncerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/btncerrarpeque??opr.png"))); // NOI18N
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, -1, -1));

        btnmini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/btnpeque??omi.png"))); // NOI18N
        btnmini.setBorder(null);
        btnmini.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/btnpeque??omi.png"))); // NOI18N
        btnmini.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/btnpeque??omipre.png"))); // NOI18N
        jPanel1.add(btnmini, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/universidad.png"))); // NOI18N
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setOpaque(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/universidad.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/universidad-.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 220, 103, 92));

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Donar.png"))); // NOI18N
        btnConsultar.setFocusPainted(false);
        btnConsultar.setFocusable(false);
        btnConsultar.setOpaque(false);
        btnConsultar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Donar.png"))); // NOI18N
        btnConsultar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Donar-.png"))); // NOI18N
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 104, 92));

        txtSald.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldActionPerformed(evt);
            }
        });
        jPanel1.add(txtSald, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 56, -1));

        BtAuto.setText("jButton2");
        BtAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAutoActionPerformed(evt);
            }
        });
        jPanel1.add(BtAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, 73, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Electricidad.png"))); // NOI18N
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.setOpaque(false);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Electricidad.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Electricidad-.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 100, 92));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Telefonia.png"))); // NOI18N
        jButton3.setFocusPainted(false);
        jButton3.setFocusable(false);
        jButton3.setOpaque(false);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Telefonia.png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Telefonia-.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 103, 92));

        txtNombre.setFont(new java.awt.Font("Bungee", 0, 24)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombre.setBorder(null);
        txtNombre.setFocusable(false);
        txtNombre.setOpaque(false);
        txtNombre.setRequestFocusEnabled(false);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 290, 51));

        jLabel1.setFont(new java.awt.Font("Bungee", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(16, 49, 90));
        jLabel1.setText("Telefonia");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Bungee", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(16, 49, 90));
        jLabel2.setText("energia Electrica");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bungee", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(16, 49, 90));
        jLabel3.setText("UnIVERSIDADES");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bungee", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(16, 49, 90));
        jLabel4.setText("dONACIONES Y APORTES");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, -1, -1));

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/regresars.png"))); // NOI18N
        jButton12.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton12.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/regresars.png"))); // NOI18N
        jButton12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/regresar.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btncerrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PagarU PU = new PagarU();
        PU.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
 PagarDon PD = new PagarDon();
        PD.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void txtSaldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldActionPerformed
        
    }//GEN-LAST:event_txtSaldActionPerformed

    private void BtAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAutoActionPerformed
ConsultaSaldo();  
ConsultaNombre();
// TODO add your handling code here:
    }//GEN-LAST:event_BtAutoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   PagarEnerg PE = new PagarEnerg();
        PE.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        PagarTel pt = new PagarTel();
        pt.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        menu men = new menu();
        men.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton12ActionPerformed

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
            java.util.logging.Logger.getLogger(menuPagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPagos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAuto;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btnmini;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNombre;
    public static javax.swing.JTextField txtSald;
    // End of variables declaration//GEN-END:variables
}
