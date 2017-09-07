/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rendus;

import Entity.Modele;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author ADMIN
 */
public class RenduModele implements ListCellRenderer<Modele> {
    
    private JLabel lab;
    
    @Override
    public Component getListCellRendererComponent(JList<? extends Modele> list, Modele value, int index, boolean isSelected, boolean cellHasFocus)
     {
        lab = new JLabel(value.getNom()+ " " +value.getDiametre() );
    
        lab.setOpaque(true);   
        
        if ( index%2==0)
        {
            lab.setBackground(Color.PINK);
        }
        else
        {
            lab.setBackground(Color.CYAN);
        }
        if ( cellHasFocus)
        {
            lab.setBackground(Color.GREEN);
                  
        }
       
        return lab;
    }  

}
