/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazg1;

import javax.swing.JOptionPane;

/**
 *
 * @author Wilson
 */
public class REGISTRO extends javax.swing.JFrame {

    /**
     * Creates new form REGISTRO
     */
    public REGISTRO() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("REGISTRO DE ALUMNOS");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtcedula = new javax.swing.JTextField();
        txtcarrera = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        txtciclo = new javax.swing.JTextField();
        btnenviar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jcMousePanel2 = new jcMousePanel.jcMousePanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jcMousePanel1.setColor1(new java.awt.Color(204, 204, 255));
        jcMousePanel1.setColor2(new java.awt.Color(255, 255, 255));
        jcMousePanel1.setdarker(false);
        jcMousePanel1.setModo(3);
        jcMousePanel1.setVisibleLogo(false);
        jcMousePanel1.setLayout(null);

        txtnombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jcMousePanel1.add(txtnombre);
        txtnombre.setBounds(350, 110, 220, 30);

        txtapellido.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jcMousePanel1.add(txtapellido);
        txtapellido.setBounds(350, 160, 220, 30);

        txtcedula.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedulaActionPerformed(evt);
            }
        });
        jcMousePanel1.add(txtcedula);
        txtcedula.setBounds(350, 260, 220, 30);

        txtcarrera.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jcMousePanel1.add(txtcarrera);
        txtcarrera.setBounds(350, 210, 220, 30);

        txtcorreo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jcMousePanel1.add(txtcorreo);
        txtcorreo.setBounds(350, 310, 220, 30);

        txtciclo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jcMousePanel1.add(txtciclo);
        txtciclo.setBounds(350, 360, 220, 30);

        btnenviar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnenviar.setText("ENVIAR");
        btnenviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenviarActionPerformed(evt);
            }
        });
        jcMousePanel1.add(btnenviar);
        btnenviar.setBounds(280, 430, 83, 25);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("NOMBRE");
        jcMousePanel1.add(jLabel2);
        jLabel2.setBounds(190, 110, 52, 15);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("APELLIDO");
        jcMousePanel1.add(jLabel1);
        jLabel1.setBounds(190, 160, 61, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("CEDULA");
        jcMousePanel1.add(jLabel3);
        jLabel3.setBounds(190, 270, 48, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("CARRERA");
        jcMousePanel1.add(jLabel4);
        jLabel4.setBounds(190, 220, 60, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("CORREO");
        jcMousePanel1.add(jLabel5);
        jLabel5.setBounds(190, 320, 51, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("CICLO");
        jcMousePanel1.add(jLabel6);
        jLabel6.setBounds(190, 370, 37, 15);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("PROGRAMACION ORIENTADA A OBJETOS");
        jcMousePanel1.add(jLabel7);
        jLabel7.setBounds(282, 27, 297, 17);

        jcMousePanel2.setdarker(false);
        jcMousePanel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/uidelogo.png"))); // NOI18N
        jcMousePanel2.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/image/uidelogo.png"))); // NOI18N
        jcMousePanel2.setVisibleLogo(false);

        javax.swing.GroupLayout jcMousePanel2Layout = new javax.swing.GroupLayout(jcMousePanel2);
        jcMousePanel2.setLayout(jcMousePanel2Layout);
        jcMousePanel2Layout.setHorizontalGroup(
            jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 144, Short.MAX_VALUE)
        );
        jcMousePanel2Layout.setVerticalGroup(
            jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 125, Short.MAX_VALUE)
        );

        jcMousePanel1.add(jcMousePanel2);
        jcMousePanel2.setBounds(10, 11, 144, 125);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jcMousePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnenviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenviarActionPerformed
        // TODO add your handling code here:
        
          try{
           int n = Integer.parseInt(this.txtcedula.getText().toString());
           int m = Integer.parseInt(this.txtciclo.getText().toString());
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Los campos de texto cédula y ciclo son incorrectos");
            this.txtcedula.setText(null);
            this.txtciclo.setText(null);
            return;
          
        }
          
        DATOS ObjForm = new DATOS();
        ObjForm.setVisible(true);
      
        
        DATOS.lblnombre.setText(txtnombre.getText());
        DATOS.lblapellido.setText(txtapellido.getText());
        DATOS.lblcedula.setText(txtcedula.getText());
        DATOS.lblcarrera.setText(txtcarrera.getText());
        DATOS.lblcorreo.setText(txtcorreo.getText());
        DATOS.lblciclo.setText(txtciclo.getText());
        
        
        
    }//GEN-LAST:event_btnenviarActionPerformed

    private void txtcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulaActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_txtcedulaActionPerformed

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
            java.util.logging.Logger.getLogger(REGISTRO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REGISTRO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REGISTRO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REGISTRO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REGISTRO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnenviar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private jcMousePanel.jcMousePanel jcMousePanel2;
    public static javax.swing.JTextField txtapellido;
    public static javax.swing.JTextField txtcarrera;
    public static javax.swing.JTextField txtcedula;
    public static javax.swing.JTextField txtciclo;
    public static javax.swing.JTextField txtcorreo;
    public static javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
