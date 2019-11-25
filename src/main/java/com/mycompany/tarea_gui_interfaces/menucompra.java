
package com.mycompany.tarea_gui_interfaces;

import java.awt.Image;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;


public class menucompra extends javax.swing.JDialog {

    
    private DefaultListModel dfl_nombre=new DefaultListModel();
    Queue <Producto> micola=null;
    
    
    public menucompra(java.awt.Frame parent, boolean modal) {                
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Comprar producto");
        //this.setIconImage(new ImageIcon(getClass().getResource("D:\\Descargas\\salir.png")).getImage());
        
        //jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/yahoo_1.gif")));
        //jbotonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png")));
        
//        Producto miProducto=new Producto();
//        
//        micola=miProducto.llenarlista();
//        
//        for (Producto producto : micola) {
//            dfl_nombre.addElement(producto.getNombre());
//        }
//        
//        jlistPrductos.setModel(dfl_nombre);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngCaterogia = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnrgZapatos = new javax.swing.JRadioButton();
        jcomTalla = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnRadPantalon = new javax.swing.JRadioButton();
        btnrgCamisas = new javax.swing.JRadioButton();
        jcomMaculino = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCompar = new javax.swing.JButton();
        btntituloProducto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlistPrductos = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btngCaterogia.add(btnrgZapatos);
        btnrgZapatos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnrgZapatos.setText("Zapatos");
        btnrgZapatos.setToolTipText("Seleccione para mostrar productos relacionador con Zapatos");
        btnrgZapatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnrgZapatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 277, -1, -1));

        jcomTalla.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcomTalla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));
        jcomTalla.setToolTipText("Seleccione una talla");
        jcomTalla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jcomTalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 87, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Talla");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 90, -1));

        btngCaterogia.add(btnRadPantalon);
        btnRadPantalon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRadPantalon.setText("Pantalones");
        btnRadPantalon.setToolTipText("Seleccione para mostrar productos relacionador con pantalones");
        btnRadPantalon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnRadPantalon, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 224, -1, -1));

        btngCaterogia.add(btnrgCamisas);
        btnrgCamisas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnrgCamisas.setText("Camisas");
        btnrgCamisas.setToolTipText("Seleccione para mostrar productos relacionador con camisas");
        btnrgCamisas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(btnrgCamisas, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 172, -1, -1));

        jcomMaculino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcomMaculino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Masculino", "Femenino" }));
        jcomMaculino.setToolTipText("Seleccione un sexo");
        jcomMaculino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jcomMaculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 204, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sexo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 86, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Categoria");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 122, 110, -1));

        btnCompar.setBackground(new java.awt.Color(255, 255, 255));
        btnCompar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCompar.setForeground(new java.awt.Color(0, 153, 0));
        btnCompar.setText("COMPRAR");
        btnCompar.setToolTipText("Oprima para comprar el producto");
        btnCompar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 0), 2));
        btnCompar.setContentAreaFilled(false);
        btnCompar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompar.setOpaque(true);
        jPanel1.add(btnCompar, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 320, 245, 59));

        btntituloProducto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btntituloProducto.setForeground(new java.awt.Color(0, 204, 0));
        btntituloProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btntituloProducto.setText("Productos ");
        jPanel1.add(btntituloProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 268, -1));

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("COMPRAR ROPA");

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\Descargas\\volver.png")); // NOI18N
        jLabel5.setToolTipText("Oprima para volver a la interfaz de inicio");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon("D:\\Descargas\\salir.png")); // NOI18N
        jLabel7.setToolTipText("Oprima pra cerrar el programa");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(6, 6, 6))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 779, -1));

        jlistPrductos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlistPrductos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Producto1", "Producto2", "Producto3", "Producto4", "Producto5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jlistPrductos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jlistPrductos.setToolTipText("Seleccione un producto ");
        jlistPrductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlistPrductos.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        jScrollPane1.setViewportView(jlistPrductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 260, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    
  
       
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompar;
    private javax.swing.JRadioButton btnRadPantalon;
    private javax.swing.ButtonGroup btngCaterogia;
    private javax.swing.JRadioButton btnrgCamisas;
    private javax.swing.JRadioButton btnrgZapatos;
    private javax.swing.JLabel btntituloProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcomMaculino;
    private javax.swing.JComboBox<String> jcomTalla;
    private javax.swing.JList<String> jlistPrductos;
    // End of variables declaration//GEN-END:variables

    private void setIcon(Image image) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
