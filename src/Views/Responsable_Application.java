/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import javax.swing.JFrame;

/**
 *
 * @author ramba
 */
public class Responsable_Application extends javax.swing.JFrame {

    /**
     * Creates new form Responsable_Application
     */
    public Responsable_Application() {
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

        butDeconnexion = new java.awt.Button();
        labTitreManageur = new javax.swing.JLabel();
        menuApplication = new javax.swing.JMenuBar();
        menuFichier = new javax.swing.JMenu();
        menuQuitter = new javax.swing.JMenuItem();
        menuModeles = new javax.swing.JMenu();
        menuMachines = new javax.swing.JMenu();
        menuSeuils = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        butDeconnexion.setBackground(new java.awt.Color(255, 153, 0));
        butDeconnexion.setLabel("Déconnexion");
        butDeconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDeconnexionActionPerformed(evt);
            }
        });

        labTitreManageur.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTitreManageur.setText("Manageur production");

        menuFichier.setText("Fichier");

        menuQuitter.setText("Quitter");
        menuQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuQuitterActionPerformed(evt);
            }
        });
        menuFichier.add(menuQuitter);

        menuApplication.add(menuFichier);

        menuModeles.setText("Modèles");
        menuModeles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuModelesMouseClicked(evt);
            }
        });
        menuApplication.add(menuModeles);

        menuMachines.setText("Machines");
        menuMachines.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMachinesMouseClicked(evt);
            }
        });
        menuApplication.add(menuMachines);

        menuSeuils.setText("Seuils");
        menuSeuils.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSeuilsMouseClicked(evt);
            }
        });
        menuApplication.add(menuSeuils);

        setJMenuBar(menuApplication);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(butDeconnexion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(labTitreManageur, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(468, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labTitreManageur, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 603, Short.MAX_VALUE)
                .addComponent(butDeconnexion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butDeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDeconnexionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butDeconnexionActionPerformed

    private void menuMachinesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMachinesMouseClicked
        // TODO add your handling code here:
        new Responsable_Application_Machines().setVisible(true);
    }//GEN-LAST:event_menuMachinesMouseClicked

    private void menuSeuilsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSeuilsMouseClicked
        // TODO add your handling code here:
        new Responsable_Application_Seuils().setVisible(true);
    }//GEN-LAST:event_menuSeuilsMouseClicked

    private void menuModelesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuModelesMouseClicked
        // TODO add your handling code here:
        new Responsable_Application_Modeles().setVisible(true);
    }//GEN-LAST:event_menuModelesMouseClicked

    private void menuQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuQuitterActionPerformed
        // TODO add your handling code here:
          this.setVisible(false);
        System.out.println("test test test");                                            
    }//GEN-LAST:event_menuQuitterActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button butDeconnexion;
    private javax.swing.JLabel labTitreManageur;
    private javax.swing.JMenuBar menuApplication;
    private javax.swing.JMenu menuFichier;
    private javax.swing.JMenu menuMachines;
    private javax.swing.JMenu menuModeles;
    private javax.swing.JMenuItem menuQuitter;
    private javax.swing.JMenu menuSeuils;
    // End of variables declaration//GEN-END:variables
}
