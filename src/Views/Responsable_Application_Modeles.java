/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

/**
 *
 * @author ramba
 */
public class Responsable_Application_Modeles extends javax.swing.JFrame {

    /**
     * Creates new form Responsable_Application_Modeles
     */
    public Responsable_Application_Modeles() {
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

        labTitreManageur = new javax.swing.JLabel();
        tabManageurModeles = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        butDeconnexion = new java.awt.Button();
        butSupprimerModele = new javax.swing.JButton();
        butAjouterModele = new javax.swing.JButton();
        tfModeleSupprimer = new javax.swing.JFormattedTextField();
        tfModeleAjouter = new javax.swing.JFormattedTextField();
        lbModele = new javax.swing.JLabel();
        menuApplication = new javax.swing.JMenuBar();
        menuFichier = new javax.swing.JMenu();
        menuModeles = new javax.swing.JMenu();
        menuMachines = new javax.swing.JMenu();
        menuSeuils = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        labTitreManageur.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTitreManageur.setText("Manageur production");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Modele"
            }
        ));
        tabManageurModeles.setViewportView(jTable1);

        butDeconnexion.setBackground(new java.awt.Color(255, 153, 0));
        butDeconnexion.setLabel("Déconnexion");
        butDeconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDeconnexionActionPerformed(evt);
            }
        });

        butSupprimerModele.setForeground(new java.awt.Color(255, 0, 51));
        butSupprimerModele.setText("Supprimer");

        butAjouterModele.setForeground(new java.awt.Color(51, 204, 0));
        butAjouterModele.setText("Ajouter");

        lbModele.setText("Modele");

        menuFichier.setText("Fichier");
        menuApplication.add(menuFichier);

        menuModeles.setText("Modèles");
        menuApplication.add(menuModeles);

        menuMachines.setText("Machines");
        menuApplication.add(menuMachines);

        menuSeuils.setText("Seuils");
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
                        .addGap(255, 255, 255)
                        .addComponent(labTitreManageur, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(tabManageurModeles, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(lbModele, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(butSupprimerModele, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfModeleSupprimer))
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(butAjouterModele, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfModeleAjouter))))
                .addContainerGap(404, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(labTitreManageur, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(tabManageurModeles, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butSupprimerModele)
                    .addComponent(butAjouterModele))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfModeleSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfModeleAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbModele))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addComponent(butDeconnexion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butDeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDeconnexionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butDeconnexionActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butAjouterModele;
    private java.awt.Button butDeconnexion;
    private javax.swing.JButton butSupprimerModele;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labTitreManageur;
    private javax.swing.JLabel lbModele;
    private javax.swing.JMenuBar menuApplication;
    private javax.swing.JMenu menuFichier;
    private javax.swing.JMenu menuMachines;
    private javax.swing.JMenu menuModeles;
    private javax.swing.JMenu menuSeuils;
    private javax.swing.JScrollPane tabManageurModeles;
    private javax.swing.JFormattedTextField tfModeleAjouter;
    private javax.swing.JFormattedTextField tfModeleSupprimer;
    // End of variables declaration//GEN-END:variables
}