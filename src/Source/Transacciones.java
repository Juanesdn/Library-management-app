/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juanes
 */
public class Transacciones extends javax.swing.JFrame {

    /**
     * Creates new form Transacciones
     */
    
    public static boolean nuevoDato = true;
    String col[] = {"Nombre", "ISBN", "Precio", "Tipo", "Editorial", "Autor", "Estado", "Edad", "Transaccion", "Traslado"};
    String Datos[] = new String[50];
    DefaultTableModel modelo = new DefaultTableModel(col, 0);
    DefaultTableModel modeloBaja = new DefaultTableModel(col, 0);
    
    String caracteres = "1234567890";
    
            
    public Transacciones() {
        initComponents();
        
        tablaLibros.setModel(modelo);
        tabla_bajas.setModel(modeloBaja);
        
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
        btn_añadirTexto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_añadirEditorial = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_añadirAutor = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaLibros = new javax.swing.JTable();
        volver = new javax.swing.JLabel();
        btn_actualizarTabla = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_eliminarTexto = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_bajas = new javax.swing.JTable();
        btn_darBaja = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(97, 212, 195));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_añadirTexto.setBackground(new java.awt.Color(255, 255, 255));
        btn_añadirTexto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_añadirTextoMouseClicked(evt);
            }
        });
        btn_añadirTexto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingresar un nuevo texto");
        btn_añadirTexto.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        jPanel1.add(btn_añadirTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 170, 40));

        btn_añadirEditorial.setBackground(new java.awt.Color(255, 255, 255));
        btn_añadirEditorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_añadirEditorialMouseClicked(evt);
            }
        });
        btn_añadirEditorial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ingresar nueva editorial");
        btn_añadirEditorial.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        jPanel1.add(btn_añadirEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 170, 40));

        btn_añadirAutor.setBackground(new java.awt.Color(255, 255, 255));
        btn_añadirAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_añadirAutorMouseClicked(evt);
            }
        });
        btn_añadirAutor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ingresar nuevo autor");
        btn_añadirAutor.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 20));

        jPanel1.add(btn_añadirAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 170, 40));

        tablaLibros.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaLibros);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 970, 260));

        volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Back_64px.png"))); // NOI18N
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverMouseClicked(evt);
            }
        });
        jPanel1.add(volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 60, 50));

        btn_actualizarTabla.setBackground(new java.awt.Color(255, 255, 255));
        btn_actualizarTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_actualizarTablaMouseClicked(evt);
            }
        });
        btn_actualizarTabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Actualizar tabla");
        btn_actualizarTabla.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 20));

        jPanel1.add(btn_actualizarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 170, 40));

        btn_eliminarTexto.setBackground(new java.awt.Color(204, 204, 204));
        btn_eliminarTexto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliminarTextoMouseClicked(evt);
            }
        });
        btn_eliminarTexto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Eliminar texto");
        btn_eliminarTexto.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 20));

        jPanel1.add(btn_eliminarTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 170, 40));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setText("Textos");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

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
        jScrollPane2.setViewportView(tabla_bajas);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 970, 280));

        btn_darBaja.setBackground(new java.awt.Color(204, 204, 204));
        btn_darBaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_darBajaMouseClicked(evt);
            }
        });
        btn_darBaja.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Dar de baja todo");
        btn_darBaja.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 20));

        jPanel1.add(btn_darBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 170, 40));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel8.setText("Sugerencias para dar de baja");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_añadirTextoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_añadirTextoMouseClicked
        // TODO add your handling code here:
        AñadirTexto añadir = new AñadirTexto();
        añadir.setVisible(true);
        añadir.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btn_añadirTextoMouseClicked

    private void btn_añadirEditorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_añadirEditorialMouseClicked
        // TODO add your handling code here:    
        StringBuilder cod = new StringBuilder();
        Random rnd = new Random();
        while (cod.length() < 5) {
            int index = (int) (rnd.nextFloat() * caracteres.length());
            cod.append(caracteres.charAt(index));
        }
        
        String codigo = cod.toString();
        
        variables.nombre_editorial[variables.cont_editorial] = JOptionPane.showInputDialog("Digite el nombre de la editorial");
        variables.codigo_editorial[variables.cont_editorial] = codigo;
        variables.cont_editorial++;
    }//GEN-LAST:event_btn_añadirEditorialMouseClicked

    private void btn_añadirAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_añadirAutorMouseClicked
        // TODO add your handling code here:
        StringBuilder cod = new StringBuilder();
        Random rnd = new Random();
        while (cod.length() < 5) {
            int index = (int) (rnd.nextFloat() * caracteres.length());
            cod.append(caracteres.charAt(index));
        }
        
        String codigo = cod.toString();
        
        variables.nombre_autor[variables.cont_autores] = JOptionPane.showInputDialog("Digite el nombre del autor");
        variables.codigo_autor[variables.cont_autores] = codigo;
        variables.cont_autores++;
    }//GEN-LAST:event_btn_añadirAutorMouseClicked

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked
        // TODO add your handling code here:
        home menu = new home();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_volverMouseClicked

    private void btn_actualizarTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_actualizarTablaMouseClicked
        // TODO add your handling code here:
        if (nuevoDato){
            for (int i = 0; i < variables.cont_texto; i++) {
            String nombre = variables.nombre_texto[i];
            Double precio = variables.precio_texto[i];
            String tipoTexto = variables.tipo_texto[i];
            String edit = variables.editorial[i];
            String aut = variables.autor[i];
            String estadoTexto = variables.estado[i];
            int edad = variables.edad_texto[i];
            String tipoTransaccion = variables.tipo_transaccion[i];
            String trasladar = variables.traslado[i];
            String isbn = variables.codigo_isbn[i];
            
            Object[] datos = {nombre, isbn, precio, tipoTexto, edit, aut, estadoTexto, edad, tipoTransaccion, trasladar};
            
            modelo.addRow(datos);
            nuevoDato = false;
            
            if (estadoTexto.equals("Dañado") && edad >= 20){
                modeloBaja.addRow(datos);
                variables.pos_textoBaja[variables.cont_bajas] = i;
                variables.cont_bajas++;
            }
            
            }
        }
    }//GEN-LAST:event_btn_actualizarTablaMouseClicked

    private void btn_eliminarTextoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarTextoMouseClicked
        // TODO add your handling code here:
        
        int filaSeleccionada = tablaLibros.getSelectedRow();
        String aux;
        

        if (filaSeleccionada >= 0){
          int result = JOptionPane.showConfirmDialog(null, "Estas seguro de eliminar este libro?", null, JOptionPane.YES_NO_OPTION);
           if (result == JOptionPane.YES_OPTION){
               modelo.removeRow(filaSeleccionada);
               variables.cont_texto--;           
               for (int i = filaSeleccionada; i < variables.cont_texto; i++) {
                   aux = variables.nombre_texto[i+1];
                   variables.nombre_texto[i] = variables.nombre_texto[i+1]; 
               }
           }
        }else {
            JOptionPane.showMessageDialog(this, "Fila no seleccionada");
        }
    }//GEN-LAST:event_btn_eliminarTextoMouseClicked

    private void btn_darBajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_darBajaMouseClicked
        // TODO add your handling code here:
        
        int result = JOptionPane.showConfirmDialog(null, "Estas seguro de dar todo de baja?", null, JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION){
            for (int i = 0; i < variables.cont_bajas; i++) {
                
                variables.nombre_texto_baja[i] = tablaLibros.getValueAt(variables.pos_textoBaja[i], 0).toString();
                variables.codigo_isbn_baja[i] = tablaLibros.getValueAt(variables.pos_textoBaja[i], 1).toString();
                variables.precio_texto_baja[i] = (Double) tablaLibros.getValueAt(variables.pos_textoBaja[i], 2);
                variables.tipo_texto_baja[i] = tablaLibros.getValueAt(variables.pos_textoBaja[i], 3).toString();
                variables.editorial_baja[i] = tablaLibros.getValueAt(variables.pos_textoBaja[i], 4).toString();
                variables.autor_baja[i] = tablaLibros.getValueAt(variables.pos_textoBaja[i], 5).toString();
                variables.estado_baja[i] = tablaLibros.getValueAt(variables.pos_textoBaja[i], 6).toString();
                variables.edad_baja[i] = (int) tablaLibros.getValueAt(variables.pos_textoBaja[i], 7);
                
                switch (variables.tipo_texto_baja[i]) {
                    case "Libro":
                        variables.cant_libros--;
                        break;
                    case "Revista":
                        variables.cant_revistas--;
                        break;
                    case "Monografia":
                        variables.cant_monografias--;
                        break;
                    default:
                        break;
                }
                
                modeloBaja.removeRow(i);
                modelo.removeRow(variables.pos_textoBaja[i]);
                variables.cont_texto--;
                
                
            }
        }
        
    }//GEN-LAST:event_btn_darBajaMouseClicked

    
    
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
            java.util.logging.Logger.getLogger(Transacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transacciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_actualizarTabla;
    private javax.swing.JPanel btn_añadirAutor;
    private javax.swing.JPanel btn_añadirEditorial;
    private javax.swing.JPanel btn_añadirTexto;
    private javax.swing.JPanel btn_darBaja;
    private javax.swing.JPanel btn_eliminarTexto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaLibros;
    private javax.swing.JTable tabla_bajas;
    private javax.swing.JLabel volver;
    // End of variables declaration//GEN-END:variables
}
