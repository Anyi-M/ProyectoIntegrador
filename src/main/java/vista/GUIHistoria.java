/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.event.ActionListener;

/**
 *
 * @author Anyeli Caraanza R
 */
public class GUIHistoria extends javax.swing.JFrame {

    /**
     * Creates new form GUIHistoria
     */
    public GUIHistoria() {
        initComponents();
    }
    public void escuchar (ActionListener controlador) {
        botonsalirhistoria.addActionListener(controlador);
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonsalirhistoria = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonsalirhistoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonsalirbueno.jpg"))); // NOI18N
        botonsalirhistoria.setActionCommand("salirhistoria");
        botonsalirhistoria.setBorderPainted(false);
        botonsalirhistoria.setContentAreaFilled(false);
        getContentPane().add(botonsalirhistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 610, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/HISTORIA ACTUALIADA.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 2010, 880));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonsalirhistoria;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
