/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.awt.CardLayout;

<<<<<<< HEAD

=======
/**
 *
 * @author YEISON ANDRES MARIN
 */
>>>>>>> 5a9f9df (Primer commit: subir aplicación Java con Oracle)
public class MenuPrincipalForm extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipalForm
     */
    
  
    public MenuPrincipalForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonIniciarSesion = new javax.swing.JButton();
        jButtonRegistrarse = new javax.swing.JButton();
        jButtonOpcionesAdministrador = new javax.swing.JButton();
        jButtonX = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Sistema multinivel");

        jButtonIniciarSesion.setText("Iniciar sesion");
        jButtonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarSesionActionPerformed(evt);
            }
        });

        jButtonRegistrarse.setText("Registrarse");
        jButtonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarseActionPerformed(evt);
            }
        });

        jButtonOpcionesAdministrador.setText("Opciones de administrador");
        jButtonOpcionesAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpcionesAdministradorActionPerformed(evt);
            }
        });

        jButtonX.setText("X");
        jButtonX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonRegistrarse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonIniciarSesion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(129, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonX))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonOpcionesAdministrador)
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButtonX))
                .addGap(41, 41, 41)
                .addComponent(jButtonIniciarSesion)
                .addGap(62, 62, 62)
                .addComponent(jButtonRegistrarse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jButtonOpcionesAdministrador)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
 
    private void jButtonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarSesionActionPerformed
       
         // Crear y mostrar la ventana de Login
        LoginForm loginForm = new LoginForm(); // Crea una instancia del formulario de login
        loginForm.setVisible(true);  // Muestra la ventana de login

        // Si deseas que el formulario principal se cierre cuando se abre el login:
        setVisible(false);  // Esto ocultará el formulario actual (menuPrincipalForm)
        dispose();  // Si quieres liberar recursos y cerrar la ventana actual completamente
        
        
        
        
        
    }//GEN-LAST:event_jButtonIniciarSesionActionPerformed

    private void jButtonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarseActionPerformed
        
        
          // Crear y mostrar la ventana de Login
        RegistrarVendedorForm registra = new RegistrarVendedorForm(); // Crea una instancia del formulario de login
        registra.setVisible(true);  // Muestra la ventana de login

        // Si deseas que el formulario principal se cierre cuando se abre el login:
        setVisible(false);  // Esto ocultará el formulario actual (menuPrincipalForm)
        dispose();  //
        
        
    }//GEN-LAST:event_jButtonRegistrarseActionPerformed

    private void jButtonOpcionesAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpcionesAdministradorActionPerformed
       
        
        
        
        AdministradorOpciones admin = new AdministradorOpciones();// Crea una instancia del formulario de login
        admin.setVisible(true);  // Muestra la ventana de login

        // Si deseas que el formulario principal se cierre cuando se abre el login:
        setVisible(false);  // Esto ocultará el formulario actual (menuPrincipalForm)
        dispose();  // Si quieres liberar recursos y cerrar la ventana actual completamente
        
        
        
        
        
    }//GEN-LAST:event_jButtonOpcionesAdministradorActionPerformed

    private void jButtonXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXActionPerformed
        
        
        // Confirmación antes de salir
    int opcion = javax.swing.JOptionPane.showConfirmDialog(this,
            "¿Estás seguro de que deseas cerrar esta ventana?",
            "Confirmar cierre",
            javax.swing.JOptionPane.YES_NO_OPTION,
            javax.swing.JOptionPane.QUESTION_MESSAGE);

    // Si el usuario confirma, cerrar la ventana
    if (opcion == javax.swing.JOptionPane.YES_OPTION) {
        this.dispose(); // Cierra la ventana actual
    }
        
        
        
    }//GEN-LAST:event_jButtonXActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipalForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIniciarSesion;
    private javax.swing.JButton jButtonOpcionesAdministrador;
    private javax.swing.JButton jButtonRegistrarse;
    private javax.swing.JButton jButtonX;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
