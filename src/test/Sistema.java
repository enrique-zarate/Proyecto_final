/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.*;

/**
 *
 * @author Mathias Ciancio - CO6607
 */
public class Sistema extends javax.swing.JFrame {
    
    /**
     * Creates new form Sistema
     */
    public Sistema() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        mnubarMenu = new javax.swing.JMenuBar();
        mnuArchivo = new javax.swing.JMenu();
        mniSalir = new javax.swing.JMenuItem();
        mnuMantenimiento = new javax.swing.JMenu();
        mnuMEvento = new javax.swing.JMenu();
        mniEACiudad = new javax.swing.JMenuItem();
        mniEAEvento = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuConsulta = new javax.swing.JMenu();
        mniCEvento = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 720));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 699, Short.MAX_VALUE)
        );

        mnuArchivo.setText("Archivo");

        mniSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        mniSalir.setText("Salir");
        mnuArchivo.add(mniSalir);

        mnubarMenu.add(mnuArchivo);

        mnuMantenimiento.setText("Mantenimiento");

        mnuMEvento.setText("Evento");

        mniEACiudad.setText("Cargar Ciudad");
        mniEACiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEACiudadActionPerformed(evt);
            }
        });
        mnuMEvento.add(mniEACiudad);

        mniEAEvento.setText("Nuevo Evento");
        mniEAEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEAEventoActionPerformed(evt);
            }
        });
        mnuMEvento.add(mniEAEvento);

        mnuMantenimiento.add(mnuMEvento);

        jMenuItem1.setText("Ponencia");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuMantenimiento.add(jMenuItem1);

        mnubarMenu.add(mnuMantenimiento);

        mnuConsulta.setText("Consulta");

        mniCEvento.setText("Evento");
        mnuConsulta.add(mniCEvento);

        mnubarMenu.add(mnuConsulta);

        setJMenuBar(mnubarMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniEAEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEAEventoActionPerformed
        ManteEvento mostrarVentana = new ManteEvento();
        escritorio.add(mostrarVentana);
        mostrarVentana.setVisible(true);
    }//GEN-LAST:event_mniEAEventoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        MantePonencia mostrarVentana = new MantePonencia();
        escritorio.add(mostrarVentana);
        mostrarVentana.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void mniEACiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEACiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniEACiudadActionPerformed

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
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mniCEvento;
    private javax.swing.JMenuItem mniEACiudad;
    private javax.swing.JMenuItem mniEAEvento;
    private javax.swing.JMenuItem mniSalir;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenu mnuConsulta;
    private javax.swing.JMenu mnuMEvento;
    private javax.swing.JMenu mnuMantenimiento;
    private javax.swing.JMenuBar mnubarMenu;
    // End of variables declaration//GEN-END:variables
}