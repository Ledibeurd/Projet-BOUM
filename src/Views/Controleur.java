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
public class Controleur extends javax.swing.JFrame {

    /**
     * Creates new form Controleur
     */
    public Controleur() {
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

        lbNumLot = new javax.swing.JLabel();
        comNumLot = new javax.swing.JComboBox<>();
        lbMesureHT = new javax.swing.JLabel();
        lbMesureHL = new javax.swing.JLabel();
        lbMesureBT = new javax.swing.JLabel();
        lbMesureBL = new javax.swing.JLabel();
        tfMesureHT = new javax.swing.JFormattedTextField();
        tfMesureHL = new javax.swing.JFormattedTextField();
        tfMesureBL = new javax.swing.JFormattedTextField();
        tfMesureBT = new javax.swing.JFormattedTextField();
        butRebut = new javax.swing.JButton();
        butValider = new javax.swing.JButton();
        butDeconnexion = new java.awt.Button();
        butFinLot = new javax.swing.JButton();
        panCategorie = new java.awt.Panel();
        panCreationPiece = new java.awt.Panel();
        tfIdentification = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbNumLot.setText("Numéro du lot à contrôler :");

        lbMesureHT.setText("Mesure HT");

        lbMesureHL.setText("Mesure HL");

        lbMesureBT.setText("Mesure BT");

        lbMesureBL.setText("Mesure BL");

        butRebut.setBackground(new java.awt.Color(255, 0, 51));
        butRebut.setText("Rebut");

        butValider.setBackground(new java.awt.Color(0, 204, 0));
        butValider.setText("Valider");

        butDeconnexion.setBackground(new java.awt.Color(255, 153, 0));
        butDeconnexion.setLabel("Déconnexion");
        butDeconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDeconnexionActionPerformed(evt);
            }
        });

        butFinLot.setText("Fin lot");

        javax.swing.GroupLayout panCategorieLayout = new javax.swing.GroupLayout(panCategorie);
        panCategorie.setLayout(panCategorieLayout);
        panCategorieLayout.setHorizontalGroup(
            panCategorieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 271, Short.MAX_VALUE)
        );
        panCategorieLayout.setVerticalGroup(
            panCategorieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panCreationPieceLayout = new javax.swing.GroupLayout(panCreationPiece);
        panCreationPiece.setLayout(panCreationPieceLayout);
        panCreationPieceLayout.setHorizontalGroup(
            panCreationPieceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
        );
        panCreationPieceLayout.setVerticalGroup(
            panCreationPieceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(butDeconnexion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butFinLot, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(287, 287, 287))
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbNumLot)
                        .addGap(39, 39, 39)
                        .addComponent(comNumLot, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(butRebut)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbMesureHT)
                                    .addComponent(lbMesureHL))
                                .addGap(336, 336, 336)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfMesureHT, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfMesureHL, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(38, 38, 38)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbMesureBT)
                            .addComponent(lbMesureBL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfMesureBT, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(tfMesureBL)))
                    .addComponent(butValider))
                .addGap(159, 159, 159)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panCreationPiece, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(tfIdentification, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbNumLot)
                                    .addComponent(comNumLot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(125, 125, 125)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbMesureHT)
                                    .addComponent(lbMesureBT)
                                    .addComponent(tfMesureHT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfMesureBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbMesureBL)
                                    .addComponent(lbMesureHL)
                                    .addComponent(tfMesureHL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfMesureBL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addComponent(panCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butRebut)
                            .addComponent(butValider)))
                    .addComponent(panCreationPiece, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126)
                .addComponent(butFinLot, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(butDeconnexion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(tfIdentification, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butDeconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDeconnexionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_butDeconnexionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button butDeconnexion;
    private javax.swing.JButton butFinLot;
    private javax.swing.JButton butRebut;
    private javax.swing.JButton butValider;
    private javax.swing.JComboBox<String> comNumLot;
    private javax.swing.JLabel lbMesureBL;
    private javax.swing.JLabel lbMesureBT;
    private javax.swing.JLabel lbMesureHL;
    private javax.swing.JLabel lbMesureHT;
    private javax.swing.JLabel lbNumLot;
    private java.awt.Panel panCategorie;
    private java.awt.Panel panCreationPiece;
    private java.awt.TextField tfIdentification;
    private javax.swing.JFormattedTextField tfMesureBL;
    private javax.swing.JFormattedTextField tfMesureBT;
    private javax.swing.JFormattedTextField tfMesureHL;
    private javax.swing.JFormattedTextField tfMesureHT;
    // End of variables declaration//GEN-END:variables
}