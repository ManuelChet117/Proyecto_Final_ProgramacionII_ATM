
package ventanas;
import codigo.fondo4;
import ventanas.contrasenaC;


/**
 *
 * @author Manucho
 */
public class numeroC extends javax.swing.JFrame {

   
    public numeroC() {
        initComponents();
        transparenciaboton();
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        this.setTitle("MER CAJERO AUTOMATICO");
        
        txtCuenta.setBackground(new java.awt.Color(0,0,0,0));
    }
    
    public void transparenciaboton(){
    btncerrar.setOpaque(false);
    btncerrar.setContentAreaFilled(false);
    btncerrar.setBorderPainted(false);
    
    btnmini.setOpaque(false);
    btnmini.setContentAreaFilled(false);
    btnmini.setBorderPainted(false);
  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new fondo4(this);
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        btncerrar = new javax.swing.JButton();
        btnmini = new javax.swing.JButton();
        txtCuenta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/siguiente.png"))); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/siguiente.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/siguientep.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Bungee", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(64, 224, 246));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1azul.png"))); // NOI18N
        jButton2.setText("1");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/btn1.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/azulp.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Bungee", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(64, 224, 246));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1azul.png"))); // NOI18N
        jButton3.setText("2");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/btn1.png"))); // NOI18N
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/azulp.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Bungee", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(64, 224, 246));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1azul.png"))); // NOI18N
        jButton4.setText("3");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/btn1.png"))); // NOI18N
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/azulp.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Bungee", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(64, 224, 246));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1azul.png"))); // NOI18N
        jButton5.setText("4");
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/btn1.png"))); // NOI18N
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/azulp.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Bungee", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(64, 224, 246));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1azul.png"))); // NOI18N
        jButton6.setText("5");
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/btn1.png"))); // NOI18N
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/azulp.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Bungee", 1, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(64, 224, 246));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1azul.png"))); // NOI18N
        jButton8.setText("6");
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/btn1.png"))); // NOI18N
        jButton8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/azulp.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Bungee", 1, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(64, 224, 246));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1azul.png"))); // NOI18N
        jButton9.setText("7");
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/btn1.png"))); // NOI18N
        jButton9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/azulp.png"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Bungee", 1, 24)); // NOI18N
        jButton10.setForeground(new java.awt.Color(64, 224, 246));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1azul.png"))); // NOI18N
        jButton10.setText("8");
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton10.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/btn1.png"))); // NOI18N
        jButton10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/azulp.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Bungee", 1, 24)); // NOI18N
        jButton11.setForeground(new java.awt.Color(64, 224, 246));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1azul.png"))); // NOI18N
        jButton11.setText("9");
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton11.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/btn1.png"))); // NOI18N
        jButton11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/azulp.png"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Bungee", 1, 24)); // NOI18N
        jButton12.setForeground(new java.awt.Color(64, 224, 246));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1azul.png"))); // NOI18N
        jButton12.setText("0");
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setPreferredSize(new java.awt.Dimension(60, 60));
        jButton12.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/btn1.png"))); // NOI18N
        jButton12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/azulp.png"))); // NOI18N
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/borrarp.png"))); // NOI18N
        jButton13.setBorderPainted(false);
        jButton13.setContentAreaFilled(false);
        jButton13.setPreferredSize(new java.awt.Dimension(64, 64));
        jButton13.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/borrarp.png"))); // NOI18N
        jButton13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/borrarpp.png"))); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/regresars.png"))); // NOI18N
        jButton14.setPreferredSize(new java.awt.Dimension(80, 80));
        jButton14.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/regresars.png"))); // NOI18N
        jButton14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/regresar.png"))); // NOI18N
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        btncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cerrar.png"))); // NOI18N
        btncerrar.setBorder(null);
        btncerrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cerrar.png"))); // NOI18N
        btncerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cerrarp.png"))); // NOI18N
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });

        btnmini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/minimizar.png"))); // NOI18N
        btnmini.setBorder(null);
        btnmini.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/minimizar.png"))); // NOI18N
        btnmini.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/minimizarp.png"))); // NOI18N
        btnmini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnminiActionPerformed(evt);
            }
        });

        txtCuenta.setFont(new java.awt.Font("Bungee", 1, 24)); // NOI18N
        txtCuenta.setForeground(new java.awt.Color(15, 48, 89));
        txtCuenta.setBorder(null);
        txtCuenta.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnmini)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btncerrar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btncerrar)
                    .addComponent(btnmini))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                        .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(223, 223, 223))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        addNumber("6");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
      String texto =txtCuenta.getText().substring(0,txtCuenta.getText().length()-1);
        txtCuenta.setText(texto);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        addNumber("4");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        addNumber("1");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        addNumber("2");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        addNumber("3");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        addNumber("5");        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        addNumber("7");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        addNumber("8");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        addNumber("9");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        addNumber("0");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        contrasenaC abrir1 = new contrasenaC();
        abrir1.txtrecibi.setText(txtCuenta.getText());
      
       // contrasenaC abrir1 = new contrasenaC();
        abrir1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        inicio abriri = new inicio();
        abriri.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btncerrarActionPerformed

    private void btnminiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnminiActionPerformed
        setExtendedState(ICONIFIED);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnminiActionPerformed

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
            java.util.logging.Logger.getLogger(contrasenaC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(contrasenaC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(contrasenaC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(contrasenaC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new contrasenaC().setVisible(true);
            }
        });
    }
    
    public void addNumber (String digitoo){
    txtCuenta.setText(txtCuenta.getText()+digitoo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btnmini;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCuenta;
    // End of variables declaration//GEN-END:variables
}
