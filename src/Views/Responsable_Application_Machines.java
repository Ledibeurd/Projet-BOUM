/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Entity.Modele;
import Models.ListModel;
import Models.ListPresse;
import dao.ManagerApplication;
import entity.Machine;
import java.awt.List;
import static java.util.Collections.list;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import outils.Messages;
import Tools.Verification;

/**
 *
 * @author ramba
 */
public class Responsable_Application_Machines extends javax.swing.JFrame {

     private Verification verif;
    
    /**
     * Creates new form Responsable_Application_Machines
     */
    public Responsable_Application_Machines() {
        initComponents();
        this.setTitle("Responsable Application");
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
        butSupprimerModele = new javax.swing.JButton();
        butAjouterPresse = new javax.swing.JButton();
        lbModele = new javax.swing.JLabel();
        textLabel = new javax.swing.JFormattedTextField();
        textLabel2 = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        listPresse = new javax.swing.JList<>();
        menuApplication = new javax.swing.JMenuBar();
        menuFichier = new javax.swing.JMenu();
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
        labTitreManageur.setText("Responsable Production - Gestion Machines");

        butSupprimerModele.setForeground(new java.awt.Color(255, 0, 51));
        butSupprimerModele.setText("Supprimer");
        butSupprimerModele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSupprimerModeleActionPerformed(evt);
            }
        });

        butAjouterPresse.setForeground(new java.awt.Color(51, 204, 0));
        butAjouterPresse.setText("Ajouter");
        butAjouterPresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAjouterPresseActionPerformed(evt);
            }
        });

        lbModele.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbModele.setText("Modele");

        textLabel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textLabel2ActionPerformed(evt);
            }
        });

        listPresse.setModel(new ListPresse());
        listPresse.setCellRenderer(new rendus.RenduPresse());
        listPresse.addListSelectionListener(new EcouteListPresse());
        jScrollPane2.setViewportView(listPresse);

        menuFichier.setText("Fichier");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(labTitreManageur, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(lbModele, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(butAjouterPresse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(butSupprimerModele, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(265, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labTitreManageur, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butSupprimerModele)
                    .addComponent(butAjouterPresse))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbModele, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                .addComponent(butDeconnexion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butDeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDeconnexionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butDeconnexionActionPerformed

    private void menuSeuilsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSeuilsMouseClicked
        // TODO add your handling code here:
        new Responsable_Application_Seuils().setVisible(true);
    }//GEN-LAST:event_menuSeuilsMouseClicked

    private void menuMachinesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMachinesMouseClicked
        // TODO add your handling code here:
        new Responsable_Application_Machines().setVisible(true);
    }//GEN-LAST:event_menuMachinesMouseClicked

    private void menuModelesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuModelesMouseClicked
        // TODO add your handling code here:
        new Responsable_Application_Modeles().setVisible(true);
    }//GEN-LAST:event_menuModelesMouseClicked

    private void butAjouterPresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAjouterPresseActionPerformed
        // TODO add your handling code here:
        String label = textLabel.getText(); 
        
         if (!  Verification.estString(label))  
        {        
            Messages.warning (this, "Nom presse incorrect");
            textLabel.setText("");
        }
         else  if (! Verification.estNumeric(label) )
            Messages.warning (this, "Nom presse incorrect");
         else
        {
            
            if (ManagerApplication.creerPresse(label)) 
            {
                Messages.info (this, ManagerApplication.getMessage());
                ManagerApplication.listPresse();
                System.out.println("ok");
                ListPresse p = (ListPresse) listPresse.getModel();
                p.refresh();
    
            } 
            else
            {
                Messages.erreur (this, ManagerApplication.getMessage());                                                 ;
            }
            
            //label.setText("");
            
        }
         
    }      
         
           private class EcouteListPresse implements ListSelectionListener {

        @Override
        public void valueChanged(ListSelectionEvent e) {
            int index = e.getFirstIndex();
            Machine m = listPresse.getSelectedValue();
            
        }


    }//GEN-LAST:event_butAjouterPresseActionPerformed

    private void butSupprimerModeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSupprimerModeleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butSupprimerModeleActionPerformed

    private void textLabel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textLabel2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textLabel2ActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAjouterPresse;
    private java.awt.Button butDeconnexion;
    private javax.swing.JButton butSupprimerModele;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labTitreManageur;
    private javax.swing.JLabel lbModele;
    private javax.swing.JList<Machine> listPresse;
    private javax.swing.JMenuBar menuApplication;
    private javax.swing.JMenu menuFichier;
    private javax.swing.JMenu menuMachines;
    private javax.swing.JMenu menuModeles;
    private javax.swing.JMenu menuSeuils;
    private javax.swing.JFormattedTextField textLabel;
    private javax.swing.JFormattedTextField textLabel2;
    // End of variables declaration//GEN-END:variables
}
