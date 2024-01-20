package controles;

public class Main extends javax.swing.JFrame {
    private boolean habilitado = true;
    public Main() {
        initComponents();
        setSize(400,400);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(18, 19, 46, 17);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(158, 16, 215, 23);

        jLabel2.setText("Edad");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(18, 48, 31, 17);

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(18, 0, 60, 1));
        getContentPane().add(jSpinner1);
        jSpinner1.setBounds(158, 45, 215, 23);

        jLabel3.setText("Genero");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(18, 82, 42, 17);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Masculino");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(158, 80, 82, 21);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Femenino");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(246, 80, 79, 21);

        jLabel4.setText("Aficiones");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(18, 121, 53, 17);

        jCheckBox1.setText("Leer");
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(158, 119, 48, 21);

        jCheckBox2.setText("Ir al cine");
        getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(218, 119, 72, 21);

        jLabel5.setText("Estado civil");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(18, 146, 68, 17);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione su estado civil...", "Soltero", "Casado", "Viudo", "Divorciado" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(160, 146, 219, 23);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 230, 361, 130);

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(310, 200, 74, 23);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(20, 180, 370, 10);

        jToggleButton1.setText("inhabilitar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(210, 200, 90, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
      if (habilitado){
             jToggleButton1.setText("habilitar");
             habilitado = false;
        }
        else{
            jToggleButton1.setText("inhabilitar");
            habilitado = true;
        }
        jTextArea1.setEnabled(habilitado);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String texto = "Te llamas : " + jTextField1.getText()+ "\n";
       texto += "Tienes " + jSpinner1.getValue() + " años\n";
       if (jRadioButton1.isSelected()){
          texto += "Tu Genero es  : Masculino\n";  
       } else
       {
          texto += "Tu Genero es  : Femenino\n";  
       }
       if (jCheckBox1.isSelected()){
          texto += "Tines el hobby de  : Leer\n"; 
       }
       
       if (jCheckBox2.isSelected()){
          texto += "Tines el hobby de  : Ir al cine\n"; 
       }
       texto += "Tu estado civil es " + 
                jComboBox1.getSelectedItem().toString();   
       jTextArea1.append(texto);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
