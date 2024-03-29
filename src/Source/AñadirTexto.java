/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Juanes
 */
public class AñadirTexto extends javax.swing.JFrame {

    /**
     * Creates new form AñadirTexto
     */
    
    // Variables Globales
    public static String[] estado_libro;
    
    String current;
    String codLibro;
    String codGrupo;
    String codEditorial;
    Random rnd = new Random();
    Transacciones trans = new Transacciones();
             
    public AñadirTexto() {
        initComponents();
       
        
        estado_libro = new String[]{"Dañado", "Normal", "Perfecto"};
        
        // Grupo de radio buttons
        ButtonGroup textos = new ButtonGroup();
        textos.add(radbtn_libro);
        textos.add(radbtn_revista);
        textos.add(radbtn_monografia);
        
        ButtonGroup transaccion = new ButtonGroup();
        transaccion.add(radbtn_compra);
        transaccion.add(radbtn_donacion);
        transaccion.add(radbtn_canjeo);
        
        
        comboBox_editoriales.setModel(new DefaultComboBoxModel(variables.nombre_editorial));
        comboBox_autores.setModel(new DefaultComboBoxModel(variables.nombre_autor));
        comboBox_estadoLibro.setModel(new DefaultComboBoxModel(estado_libro));
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
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_nombreTexto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        radbtn_monografia = new javax.swing.JRadioButton();
        radbtn_libro = new javax.swing.JRadioButton();
        radbtn_revista = new javax.swing.JRadioButton();
        comboBox_editoriales = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboBox_autores = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        comboBox_estadoLibro = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        spinner_edadLibro = new javax.swing.JSpinner();
        checkBox_traslado = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        radbtn_compra = new javax.swing.JRadioButton();
        radbtn_donacion = new javax.swing.JRadioButton();
        radbtn_canjeo = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txt_precioTexto = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btn_salir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(97, 212, 195));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre del texto:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 190, -1));

        txt_nombreTexto.setBackground(new java.awt.Color(97, 212, 195));
        txt_nombreTexto.setBorder(null);
        jPanel1.add(txt_nombreTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 190, 30));

        jLabel2.setText("Tipo de texto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 90, -1));

        radbtn_monografia.setText("Monografía");
        jPanel1.add(radbtn_monografia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        radbtn_libro.setText("Libro");
        jPanel1.add(radbtn_libro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        radbtn_revista.setText("Revista");
        jPanel1.add(radbtn_revista, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        comboBox_editoriales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(comboBox_editoriales, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel3.setText("Seleccione una editorial");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel4.setText("Seleccione un autor");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        comboBox_autores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(comboBox_autores, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        jLabel5.setText("Estado del libro");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        comboBox_estadoLibro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(comboBox_estadoLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        jLabel6.setText("Edad del libro");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));
        jPanel1.add(spinner_edadLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 60, -1));

        checkBox_traslado.setText("A trasladar (Marcar si el libro será trasladado)");
        jPanel1.add(checkBox_traslado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 650, 330, 20));

        jLabel7.setText("Tipo de transaccion");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, -1, -1));

        radbtn_compra.setText("Compra");
        jPanel1.add(radbtn_compra, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, -1, -1));

        radbtn_donacion.setText("Donacion");
        jPanel1.add(radbtn_donacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, -1, -1));

        radbtn_canjeo.setText("Canjeo");
        jPanel1.add(radbtn_canjeo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, -1, -1));

        jLabel8.setText("Precio del texto");
        jLabel8.setToolTipText("");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 620, 150, -1));

        txt_precioTexto.setBackground(new java.awt.Color(97, 212, 195));
        txt_precioTexto.setBorder(null);
        jPanel1.add(txt_precioTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 600, 160, 20));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Guardar");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 630, 130, 40));

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Multiply_32px.png"))); // NOI18N
        btn_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_salirMouseClicked(evt);
            }
        });
        jPanel1.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:  
        String caracteres = "1234567890";
        StringBuilder cod = new StringBuilder();
        boolean encontrado = true;
        String codigo = "";
        String codigoEditorial = "";
        String generado = "";
       
        int k = 0;
        int sum = 0;
        int pos = 10;
        int num = 0;
        
        if (txt_nombreTexto.getText().equals("") || txt_precioTexto.getText().equals("") || comboBox_autores.getSelectedItem() == null || comboBox_editoriales.getSelectedItem() == null || comboBox_estadoLibro.getSelectedItem() == null  ) {
            JOptionPane.showMessageDialog(this, "Faltan algunos campos por llenar");
        }else {
            
            variables.nombre_texto[variables.cont_texto] = txt_nombreTexto.getText();
            variables.precio_texto[variables.cont_texto] = Double.parseDouble(txt_precioTexto.getText());
            
            if (radbtn_libro.isSelected()){
                variables.tipo_texto[variables.cont_texto] = "Libro";
                variables.codigo_grupo[variables.cont_texto] = "0";
                variables.cant_libros++;
                codGrupo = "0";
                
            }else if (radbtn_revista.isSelected()){
                variables.tipo_texto[variables.cont_texto] = "Revista";
                variables.codigo_grupo[variables.cont_texto] = "1";
                variables.cant_revistas++;
                codGrupo = "1";
                
            }else if (radbtn_monografia.isSelected()){
                variables.tipo_texto[variables.cont_texto] = "Monografia";
                variables.codigo_grupo[variables.cont_texto] = "2";
                variables.cant_monografias++;
                codGrupo = "2";
                
            }
            
            variables.editorial[variables.cont_texto] = String.valueOf(comboBox_editoriales.getSelectedItem());
            current = variables.editorial[variables.cont_texto];
            variables.autor[variables.cont_texto] = String.valueOf(comboBox_autores.getSelectedItem());
            variables.estado[variables.cont_texto] = String.valueOf(comboBox_estadoLibro.getSelectedItem());
            variables.edad_texto[variables.cont_texto] = ((Integer) spinner_edadLibro.getValue());
            
            if (radbtn_compra.isSelected()){
                variables.tipo_transaccion[variables.cont_texto] = "Compra";
                
            }else if (radbtn_donacion.isSelected()){
                variables.tipo_transaccion[variables.cont_texto] = "Donacion";
                
            }else if (radbtn_canjeo.isSelected()){
                variables.tipo_transaccion[variables.cont_texto] = "Canjeo";
                
            }
            
            if (checkBox_traslado.isSelected()){
                variables.traslado[variables.cont_texto] = "A trasladar";
            }else {
                variables.traslado[variables.cont_texto] = "No trasladar";
            }
            
            while (cod.length() < 3) {
                int index = (int) (rnd.nextFloat() * caracteres.length());
                cod.append(caracteres.charAt(index));
            }
            generado = cod.toString();
            
            codLibro = generado;
            variables.codigo_libro[variables.cont_texto] = codLibro;
            
            
            for (int i = 0; i < variables.cont_editorial ; i++) {
                if (variables.nombre_editorial[i].equals(current)){
                codigoEditorial = variables.codigo_editorial[i];
                }
            }
            
            sum = Integer.parseInt(variables.codigo_grupo[variables.cont_texto]) * pos;
            pos--;
        
            for (int i = 0; i < variables.cont_editorial; i++) {
                sum = sum + (pos * codigoEditorial.charAt(i));
                pos--;
            }
        
            for (int i = 0; i < variables.cont_editorial; i++) {
                sum = sum + (pos * codigoEditorial.charAt(i));
                pos--;
            }
        
            while (encontrado){
                if ((((sum + k) % 11) == 0)){
                    encontrado = false;
                    codigo = codGrupo +  codigoEditorial + codLibro + String.valueOf(k);
                }else{
                    k++;
                }
            }
            
            variables.codigo_isbn[variables.cont_texto] = codigo;
            
            variables.cont_texto++;
            
            this.dispose();
            
            trans.setVisible(true);
            
            Transacciones.nuevoDato = true;
        }
    }//GEN-LAST:event_jPanel2MouseClicked

    private void btn_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseClicked
        // TODO add your handling code here:
        trans.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_salirMouseClicked

    
    
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
            java.util.logging.Logger.getLogger(AñadirTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AñadirTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AñadirTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AñadirTexto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AñadirTexto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_salir;
    private javax.swing.JCheckBox checkBox_traslado;
    private javax.swing.JComboBox<String> comboBox_autores;
    private javax.swing.JComboBox<String> comboBox_editoriales;
    private javax.swing.JComboBox<String> comboBox_estadoLibro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton radbtn_canjeo;
    private javax.swing.JRadioButton radbtn_compra;
    private javax.swing.JRadioButton radbtn_donacion;
    private javax.swing.JRadioButton radbtn_libro;
    private javax.swing.JRadioButton radbtn_monografia;
    private javax.swing.JRadioButton radbtn_revista;
    private javax.swing.JSpinner spinner_edadLibro;
    private javax.swing.JTextField txt_nombreTexto;
    private javax.swing.JTextField txt_precioTexto;
    // End of variables declaration//GEN-END:variables
}
