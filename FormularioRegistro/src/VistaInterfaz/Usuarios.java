
package VistaInterfaz;

import Modelos.Datos;

/**
 *
 * @author Charly Cimino
 */
public class Usuarios extends javax.swing.JFrame {

    /**
     * Creates new form Usuarios
     */
    public Usuarios() {
        initComponents();
        this.setLocationRelativeTo(this);
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
        jblTituloUsuario = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnVerTitulo = new javax.swing.JButton();
        btnOcultarTitulo = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnUserIrInicio = new javax.swing.JMenuItem();
        btnUserIrRegistro = new javax.swing.JMenuItem();
        btnUserIrInicioSesion = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jblTituloUsuario.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jblTituloUsuario.setText("Usuarios");

        btnAtras.setBackground(new java.awt.Color(204, 204, 204));
        btnAtras.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/atras.png"))); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnVerTitulo.setBackground(new java.awt.Color(204, 204, 204));
        btnVerTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVerTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ojoAbierto.png"))); // NOI18N
        btnVerTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerTituloActionPerformed(evt);
            }
        });

        btnOcultarTitulo.setBackground(new java.awt.Color(204, 204, 204));
        btnOcultarTitulo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnOcultarTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ojoCerrado.png"))); // NOI18N
        btnOcultarTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcultarTituloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(381, 381, 381)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jblTituloUsuario)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnVerTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnOcultarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(348, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnAtras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addComponent(jblTituloUsuario)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVerTitulo)
                    .addComponent(btnOcultarTitulo))
                .addGap(269, 269, 269))
        );

        jMenu1.setText("Inicio");

        btnUserIrInicio.setText("Ir a Inicio");
        btnUserIrInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserIrInicioActionPerformed(evt);
            }
        });
        jMenu1.add(btnUserIrInicio);

        btnUserIrRegistro.setText("Ir a registro");
        btnUserIrRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserIrRegistroActionPerformed(evt);
            }
        });
        jMenu1.add(btnUserIrRegistro);

        btnUserIrInicioSesion.setText("Ir a inicio sesion");
        btnUserIrInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserIrInicioSesionActionPerformed(evt);
            }
        });
        jMenu1.add(btnUserIrInicioSesion);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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

    private void btnUserIrInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserIrInicioActionPerformed
        Datos.getStart().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUserIrInicioActionPerformed

    private void btnUserIrRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserIrRegistroActionPerformed
        Datos.getRegistro().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUserIrRegistroActionPerformed

    private void btnUserIrInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserIrInicioSesionActionPerformed
        Datos.getLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUserIrInicioSesionActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Datos.getLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnVerTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerTituloActionPerformed
        jblTituloUsuario.setVisible(true);
    }//GEN-LAST:event_btnVerTituloActionPerformed

    private void btnOcultarTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOcultarTituloActionPerformed
        jblTituloUsuario.setVisible(false);
    }//GEN-LAST:event_btnOcultarTituloActionPerformed

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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnOcultarTitulo;
    private javax.swing.JMenuItem btnUserIrInicio;
    private javax.swing.JMenuItem btnUserIrInicioSesion;
    private javax.swing.JMenuItem btnUserIrRegistro;
    private javax.swing.JButton btnVerTitulo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jblTituloUsuario;
    // End of variables declaration//GEN-END:variables
}
