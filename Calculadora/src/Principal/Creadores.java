/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author Ninbus
 */
public class Creadores extends javax.swing.JFrame {

    /**
     * Creates new form Creadores
     */
    public Creadores() {
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

        PanelSecundario = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCreadores = new javax.swing.JTextArea();
        LabelFotoCreadores = new javax.swing.JLabel();
        btnCreadoresFoto = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(350, 150));
        setResizable(false);

        PanelSecundario.setBackground(new java.awt.Color(255, 255, 255));

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ExitIcon.png"))); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        txtCreadores.setColumns(20);
        txtCreadores.setRows(5);
        jScrollPane1.setViewportView(txtCreadores);

        LabelFotoCreadores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnCreadoresFoto.setBackground(new java.awt.Color(0, 204, 204));
        btnCreadoresFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CREADORES.png"))); // NOI18N
        btnCreadoresFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreadoresFotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelSecundarioLayout = new javax.swing.GroupLayout(PanelSecundario);
        PanelSecundario.setLayout(PanelSecundarioLayout);
        PanelSecundarioLayout.setHorizontalGroup(
            PanelSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSecundarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(PanelSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCreadoresFoto)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSecundarioLayout.createSequentialGroup()
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)))
                .addGap(21, 21, 21))
            .addComponent(LabelFotoCreadores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelSecundarioLayout.setVerticalGroup(
            PanelSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSecundarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelSecundarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelSecundarioLayout.createSequentialGroup()
                        .addComponent(btnCreadoresFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(LabelFotoCreadores, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelSecundario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Calculadora selcam = new Calculadora();
        selcam.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnCreadoresFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreadoresFotoActionPerformed
        if(btnCreadoresFoto.isSelected()==true){
            String path = "/Imagenes/CREADORES.png";
            URL url = this.getClass().getResource(path);
            ImageIcon icon = new ImageIcon(url);
            LabelFotoCreadores.setIcon(icon);
        }else{
            URL url = this.getClass().getResource("/Imagenes/blanco.png");
            ImageIcon icon = new ImageIcon(url);
            LabelFotoCreadores.setIcon(icon);
        }
    }//GEN-LAST:event_btnCreadoresFotoActionPerformed

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
            java.util.logging.Logger.getLogger(Creadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Creadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Creadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Creadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Creadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelFotoCreadores;
    public static javax.swing.JPanel PanelSecundario;
    private javax.swing.JButton btnAtras;
    private javax.swing.JToggleButton btnCreadoresFoto;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextArea txtCreadores;
    // End of variables declaration//GEN-END:variables
}
