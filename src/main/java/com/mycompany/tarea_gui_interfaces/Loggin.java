
package com.mycompany.tarea_gui_interfaces;

import javax.swing.JOptionPane;

public class Loggin extends javax.swing.JFrame {
   
    public Loggin() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Inicio se sesion");
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        panelpricipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbltitulo = new javax.swing.JLabel();
        lbltitulologueo = new javax.swing.JLabel();
        lblNombreusuario = new javax.swing.JLabel();
        txtnombredeusuario = new javax.swing.JTextField();
        lblcontraseña = new javax.swing.JLabel();
        txtcontraseño = new javax.swing.JTextField();
        Ayuda = new javax.swing.JLabel();
        lblRecuperar_contraseña = new javax.swing.JLabel();
        btnINGRESAR = new javax.swing.JButton();
        lblCrearCuenta = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jButton1.setText("jButton1");

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelpricipal.setBackground(new java.awt.Color(255, 255, 255));
        panelpricipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelpricipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));

        lbltitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbltitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitulo.setText("BIENVENIDO A TU ESTILO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbltitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        panelpricipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 662, -1));

        lbltitulologueo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbltitulologueo.setForeground(new java.awt.Color(0, 204, 0));
        lbltitulologueo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltitulologueo.setText("Ingresa a Tu Estilo");
        panelpricipal.add(lbltitulologueo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 615, -1));

        lblNombreusuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombreusuario.setForeground(new java.awt.Color(0, 204, 0));
        lblNombreusuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombreusuario.setText("Nombre de Usuario(*)");
        panelpricipal.add(lblNombreusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 174, -1, 25));

        txtnombredeusuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtnombredeusuario.setToolTipText("Ingrese su nombre de usuario(a-z/A-Z/1-9)");
        panelpricipal.add(txtnombredeusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 174, 315, 32));

        lblcontraseña.setBackground(new java.awt.Color(255, 255, 255));
        lblcontraseña.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcontraseña.setForeground(new java.awt.Color(0, 204, 0));
        lblcontraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcontraseña.setText("Contraseña(*)");
        panelpricipal.add(lblcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 224, 115, 28));

        txtcontraseño.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtcontraseño.setToolTipText("Ingrese una Contraseña (a-a/A-Z/1-9)");
        txtcontraseño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontraseñoActionPerformed(evt);
            }
        });
        panelpricipal.add(txtcontraseño, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 224, 315, 32));

        Ayuda.setBackground(new java.awt.Color(102, 102, 255));
        Ayuda.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        Ayuda.setForeground(new java.awt.Color(102, 102, 255));
        Ayuda.setText("?");
        Ayuda.setToolTipText("Presione para obtener ayuda en el inicio de sesion");
        Ayuda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ayuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AyudaMouseClicked(evt);
            }
        });
        panelpricipal.add(Ayuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 117, 21, -1));

        lblRecuperar_contraseña.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        lblRecuperar_contraseña.setForeground(new java.awt.Color(51, 102, 255));
        lblRecuperar_contraseña.setText("¿Recuperar contrseña?");
        lblRecuperar_contraseña.setToolTipText("Oprima para Recuperar contraseña");
        lblRecuperar_contraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRecuperar_contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRecuperar_contraseñaMouseClicked(evt);
            }
        });
        lblRecuperar_contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lblRecuperar_contraseñaKeyTyped(evt);
            }
        });
        panelpricipal.add(lblRecuperar_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 262, 139, -1));

        btnINGRESAR.setBackground(new java.awt.Color(0, 153, 0));
        btnINGRESAR.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnINGRESAR.setForeground(new java.awt.Color(255, 255, 255));
        btnINGRESAR.setText("INGRESAR");
        btnINGRESAR.setToolTipText("Oprima para ingrezar  al sistema");
        btnINGRESAR.setContentAreaFilled(false);
        btnINGRESAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnINGRESAR.setOpaque(true);
        btnINGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnINGRESARActionPerformed(evt);
            }
        });
        panelpricipal.add(btnINGRESAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 294, 140, 40));

        lblCrearCuenta.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblCrearCuenta.setForeground(new java.awt.Color(0, 153, 0));
        lblCrearCuenta.setText("Crear cuenta");
        lblCrearCuenta.setToolTipText("Oprima para crear una nueva cuenta");
        lblCrearCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelpricipal.add(lblCrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 160, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelpricipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelpricipal, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcontraseñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontraseñoActionPerformed
        
    }//GEN-LAST:event_txtcontraseñoActionPerformed

    private void btnINGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnINGRESARActionPerformed
        // TODO add your handling code here:
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                menucompra dialog = new menucompra(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        //System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_btnINGRESARActionPerformed

    private void AyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AyudaMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"En esta aplicacion usted va a poder loggearse ingresando sus credenciales,"
                + "\n Nombre de usuario y Contraseña, una vez haya llenado los campos obligatorios(*) usted deberá presionar el boton ingresar."
                + "\n En el caso de olvidar la contraseña podra recuperarla oprimiendo la opcion \" ¿recuperar contraseña?\" "
                + "\n En el caso de no estar registrado usted podra crear una cuenta opromiendo la opcion \" Crear cuenta \" ");
                    
    }//GEN-LAST:event_AyudaMouseClicked

    private void lblRecuperar_contraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblRecuperar_contraseñaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_lblRecuperar_contraseñaKeyTyped

    private void lblRecuperar_contraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRecuperar_contraseñaMouseClicked
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                recuperarContraseña dialog = new recuperarContraseña(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        //System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_lblRecuperar_contraseñaMouseClicked

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
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loggin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ayuda;
    private javax.swing.JButton btnINGRESAR;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblCrearCuenta;
    private javax.swing.JLabel lblNombreusuario;
    private javax.swing.JLabel lblRecuperar_contraseña;
    private javax.swing.JLabel lblcontraseña;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JLabel lbltitulologueo;
    private javax.swing.JPanel panelpricipal;
    private javax.swing.JTextField txtcontraseño;
    private javax.swing.JTextField txtnombredeusuario;
    // End of variables declaration//GEN-END:variables
}
