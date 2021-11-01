package ventanas;

import DB.Conexion;
import codigo.fondoN;
import java.sql.*;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Edwin FISA
 */
public class crearC extends javax.swing.JFrame {
 Conexion conec=new Conexion();
Connection conectar=conec.conectar();
   
    public crearC() {
        initComponents();
        transparencia();
          this.setResizable(false);
        this.setLocationRelativeTo(this);
        this.setTitle("MER CAJERO AUTOMATICO");
        Mostrar("");
        TxNoC.setBackground(new java.awt.Color(0,0,0,0));
        TxNomb.setBackground(new java.awt.Color(0,0,0,0));
        TxPass.setBackground(new java.awt.Color(0,0,0,0));
        TxSald.setBackground(new java.awt.Color(0,0,0,0));
    }
    
    public void transparencia(){
    BtGuardar.setOpaque(false);
    BtGuardar.setContentAreaFilled(false);
    BtGuardar.setBorderPainted(false);
    
    BtBorrar.setOpaque(false);
    BtBorrar.setContentAreaFilled(false);
    BtBorrar.setBorderPainted(false);
    
    BtModifi.setOpaque(false);
    BtModifi.setContentAreaFilled(false);
    BtModifi.setBorderPainted(false);
    
    
    }





void Guardar (){
 String idcuenta=null,cuenta=TxNoC.getText(), nombre=TxNomb.getText(),pass=TxPass.getText(),saldo=TxSald.getText();
     String Sql="INSERT INTO cuenta() VALUES(?, ?, ?, ?, ?)";
    try {
        Statement set=conectar.createStatement();
        ResultSet resultado=set.executeQuery("SELECT*FROM cuenta WHERE cuenta LIKE'"+TxNoC.getText()+"'");
        if(resultado.next()){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null,"Usuario ya existe");
            TxNoC.requestFocus();
        }else if(TxNoC.getText().isEmpty()){
             getToolkit().beep();
            JOptionPane.showMessageDialog(null,"Identidad Obligatoria");
            TxNoC.requestFocus();
        }else{
            PreparedStatement pasar =conectar.prepareStatement(Sql);
            pasar.setString(1, idcuenta);
            pasar.setString(2, cuenta);
            pasar.setString(3, nombre);
            pasar.setString(4, pass);
            pasar.setString(5, saldo);
            pasar.executeUpdate();
            JOptionPane.showMessageDialog(null,"Registro Exitoso");
        }
        } catch (SQLException ex) {
        Logger.getLogger(crearC.class.getName()).log(Level.SEVERE, null, ex);
    }
}

void Mostrar(String nombre){
DefaultTableModel modelo=new DefaultTableModel();
modelo.addColumn("idcuenta");
modelo.addColumn("cuenta");
modelo.addColumn("nombre");
modelo.addColumn("pass");
modelo.addColumn("saldo");
Tabla.setModel(modelo);
String sql="";
if(nombre.equals("")){
sql="SELECT*FROM cuenta";
}else{
    sql="SELECT*FROM cuenta where nombre like'%"+nombre+"%'";
}
String cuentas[]=new String[5];
  Statement set;
    try {
        set = conectar.createStatement(); 
        ResultSet resul=set.executeQuery(sql);
        while(resul.next()){
            cuentas[0]=resul.getString(1);
              cuentas[1]=resul.getString(2);
                cuentas[2]=resul.getString(3);  
                cuentas[3]=resul.getString(4);
                  cuentas[4]=resul.getString(5);
                  modelo.addRow(cuentas);
                  
                
        }
        Tabla.setModel(modelo);
    } catch (SQLException ex) {
        Logger.getLogger(crearC.class.getName()).log(Level.SEVERE, null, ex);
    }
}
void Modificar(){
     int fila=Tabla.getSelectedRow();
     if(fila>=0){
         TxNoC.setText(Tabla.getValueAt(fila,1).toString());
          TxNomb.setText(Tabla.getValueAt(fila,2).toString());
           TxPass.setText(Tabla.getValueAt(fila,3).toString());
            TxSald.setText(Tabla.getValueAt(fila,4).toString());
            
     }else{
         JOptionPane.showMessageDialog(null,"Seleccione fila");
     }
 }
 public void ModificarDatos(){
    try {
        PreparedStatement pasar=conectar.prepareStatement("UPDATE cuenta SET cuenta='"+TxNoC.getText()+"',nombre='"+TxNomb.getText()+"',pass='"+TxPass.getText()
                +"',saldo='"+TxSald.getText()+"' WHERE cuenta='"+TxNoC.getText()+"'");
        pasar.executeUpdate();
        Mostrar("");
        
    } catch (SQLException ex) {
        Logger.getLogger(crearC.class.getName()).log(Level.SEVERE, null, ex);
    }
 }
public void Borrar(){
    int fila=Tabla.getSelectedRow();
    String cuenta=Tabla.getValueAt(fila,1).toString();
    int n=JOptionPane.showConfirmDialog(null,"Desea eliminar registro","Registro",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
    if(n==JOptionPane.YES_NO_OPTION){
    try {
            PreparedStatement borrar=conectar.prepareStatement("DELETE FROM cuenta WHERE cuenta='"+cuenta+"'");
        borrar.executeUpdate();
        Mostrar("");
    } catch (SQLException ex) {
        Logger.getLogger(crearC.class.getName()).log(Level.SEVERE, null, ex);
    }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new fondoN(this);
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TxNoC = new javax.swing.JTextField();
        TxPass = new javax.swing.JTextField();
        TxSald = new javax.swing.JTextField();
        TxNomb = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        BtGuardar = new javax.swing.JButton();
        BtBorrar = new javax.swing.JButton();
        BtModifi = new javax.swing.JButton();
        BtSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        TxBuscar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setForeground(new java.awt.Color(26, 61, 101));

        jLabel2.setFont(new java.awt.Font("Bungee", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(64, 224, 246));
        jLabel2.setText("Numero de Cuenta");

        jLabel1.setFont(new java.awt.Font("Bungee", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(64, 224, 246));
        jLabel1.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Bungee", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(64, 224, 246));
        jLabel3.setText("contraseña");

        jLabel4.setFont(new java.awt.Font("Bungee", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(64, 224, 246));
        jLabel4.setText("Saldo");

        TxNoC.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        TxNoC.setForeground(new java.awt.Color(255, 255, 255));
        TxNoC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxNoC.setBorder(null);
        TxNoC.setOpaque(false);
        TxNoC.setRequestFocusEnabled(false);
        TxNoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxNoCActionPerformed(evt);
            }
        });

        TxPass.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        TxPass.setForeground(new java.awt.Color(255, 255, 255));
        TxPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxPass.setBorder(null);
        TxPass.setOpaque(false);

        TxSald.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        TxSald.setForeground(new java.awt.Color(255, 255, 255));
        TxSald.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxSald.setBorder(null);
        TxSald.setOpaque(false);

        TxNomb.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        TxNomb.setForeground(new java.awt.Color(255, 255, 255));
        TxNomb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxNomb.setBorder(null);
        TxNomb.setOpaque(false);

        Tabla.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabla);

        BtGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar-el-archivo.png"))); // NOI18N
        BtGuardar.setPreferredSize(new java.awt.Dimension(64, 64));
        BtGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar-el-archivo.png"))); // NOI18N
        BtGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardarP.png"))); // NOI18N
        BtGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtGuardarActionPerformed(evt);
            }
        });

        BtBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar (1).png"))); // NOI18N
        BtBorrar.setPreferredSize(new java.awt.Dimension(64, 64));
        BtBorrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar (1).png"))); // NOI18N
        BtBorrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminarp.png"))); // NOI18N
        BtBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBorrarActionPerformed(evt);
            }
        });

        BtModifi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/transferencia-de-datos.png"))); // NOI18N
        BtModifi.setPreferredSize(new java.awt.Dimension(64, 64));
        BtModifi.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/transferencia-de-datos.png"))); // NOI18N
        BtModifi.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/transferirP.png"))); // NOI18N
        BtModifi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtModifiActionPerformed(evt);
            }
        });

        BtSalir.setText("Salir");
        BtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalirActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        TxBuscar.setFont(new java.awt.Font("Bungee", 1, 14)); // NOI18N
        TxBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxBuscarKeyReleased(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/encontrar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TxBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(TxBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jLabel6.setFont(new java.awt.Font("Bungee", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(26, 61, 101));
        jLabel6.setText("cUENTAS");

        jLabel7.setFont(new java.awt.Font("Bungee", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(64, 224, 246));
        jLabel7.setText("REGISTRO DE ");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/barra.png"))); // NOI18N
        jLabel12.setPreferredSize(new java.awt.Dimension(380, 2));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/barra.png"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/barra.png"))); // NOI18N
        jLabel14.setPreferredSize(new java.awt.Dimension(380, 2));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/barra.png"))); // NOI18N
        jLabel15.setPreferredSize(new java.awt.Dimension(380, 2));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/barra.png"))); // NOI18N
        jLabel16.setPreferredSize(new java.awt.Dimension(380, 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))))
                        .addGap(111, 111, 111)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(TxPass, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE))
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(TxSald, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(TxNoC, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxNomb, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 52, Short.MAX_VALUE))
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(BtBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(BtModifi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(229, 229, 229)
                        .addComponent(BtSalir)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(253, 253, 253))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(TxNoC, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2))
                                .addGap(13, 13, 13)
                                .addComponent(TxNomb, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)))
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(TxPass, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel3)))
                        .addGap(1, 1, 1)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxSald, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel13)))
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtModifi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtSalir)
                        .addGap(19, 19, 19))))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 860, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxBuscarKeyReleased
        Mostrar(TxBuscar.getText());
    }//GEN-LAST:event_TxBuscarKeyReleased

    private void BtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalirActionPerformed
dispose();
    }//GEN-LAST:event_BtSalirActionPerformed

    private void BtModifiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtModifiActionPerformed
        ModificarDatos();
    }//GEN-LAST:event_BtModifiActionPerformed

    private void BtBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBorrarActionPerformed
        Borrar();
    }//GEN-LAST:event_BtBorrarActionPerformed

    private void BtGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtGuardarActionPerformed
        Guardar();
        Mostrar("");
        TxNoC.setText("");
        TxNomb.setText("");
        TxPass.setText("");
        TxSald.setText("");
    }//GEN-LAST:event_BtGuardarActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        Modificar();
    }//GEN-LAST:event_TablaMouseClicked

    private void TxNoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxNoCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxNoCActionPerformed

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
            java.util.logging.Logger.getLogger(crearC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crearC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crearC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crearC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crearC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtBorrar;
    private javax.swing.JButton BtGuardar;
    private javax.swing.JButton BtModifi;
    private javax.swing.JButton BtSalir;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField TxBuscar;
    private javax.swing.JTextField TxNoC;
    private javax.swing.JTextField TxNomb;
    private javax.swing.JTextField TxPass;
    private javax.swing.JTextField TxSald;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
