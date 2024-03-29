/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juanes
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    
    String col[] = {"Nombre", "ISBN", "Precio", "Tipo", "Editorial", "Autor", "Estado", "Edad"};
    DefaultTableModel modelo = new DefaultTableModel(col, 0);

    
    public Registro() {
        initComponents();
        
        txt_cantTextos.setText(String.valueOf(variables.cont_texto));
        txt_cantLibros.setText(String.valueOf(variables.cant_libros));
        txt_cantRevistas.setText(String.valueOf(variables.cant_revistas));
        txt_cantMonografias.setText(String.valueOf(variables.cant_monografias));
        txt_cantBajas.setText(String.valueOf(variables.cont_bajas));
        txt_cantPrestamos.setText(String.valueOf(variables.cont_prestamos));
        
        tabla_bajas.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        volver1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_cantTextos = new javax.swing.JLabel();
        txt_cantLibros = new javax.swing.JLabel();
        txt_cantRevistas = new javax.swing.JLabel();
        txt_cantMonografias = new javax.swing.JLabel();
        txt_cantPrestamos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_bajas = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txt_cantBajas = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(97, 212, 195));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        volver1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Back_64px.png"))); // NOI18N
        volver1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volver1MouseClicked(evt);
            }
        });
        jPanel1.add(volver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 60, 50));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Cantidad total de textos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Cantidad de libros");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Cantidad de revistas");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("Cantidad de prestamos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, -1, -1));
        jPanel1.add(txt_cantTextos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));
        jPanel1.add(txt_cantLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));
        jPanel1.add(txt_cantRevistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));
        jPanel1.add(txt_cantMonografias, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 0, 0));
        jPanel1.add(txt_cantPrestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, 0));

        tabla_bajas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla_bajas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(424, 120, 500, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel9.setText("Textos dados de baja");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, -1, 40));
        jPanel1.add(txt_cantBajas, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, -1, 40));

        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Actualizar tabla");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 6, 130, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 170, 30));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setText("Cantidad de monografias");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volver1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volver1MouseClicked
        // TODO add your handling code here:
        home menu = new home();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_volver1MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
        for (int i = 0; i < variables.cont_bajas; i++) {
            String nombre = variables.nombre_texto_baja[i];
            Double precio = variables.precio_texto_baja[i];
            String tipoTexto = variables.tipo_texto_baja[i];
            String edit = variables.editorial_baja[i];
            String aut = variables.autor_baja[i];
            String estadoTexto = variables.estado_baja[i];
            String isbn = variables.codigo_isbn_baja[i];
            int edad = variables.edad_baja[i];
            
            Object[] datos = {nombre, isbn, precio, tipoTexto, edit, aut, estadoTexto, edad};
            
            modelo.addRow(datos);
        }
    }//GEN-LAST:event_jPanel2MouseClicked

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_bajas;
    private javax.swing.JLabel txt_cantBajas;
    private javax.swing.JLabel txt_cantLibros;
    private javax.swing.JLabel txt_cantMonografias;
    private javax.swing.JLabel txt_cantPrestamos;
    private javax.swing.JLabel txt_cantRevistas;
    private javax.swing.JLabel txt_cantTextos;
    private javax.swing.JLabel volver1;
    // End of variables declaration//GEN-END:variables
}
