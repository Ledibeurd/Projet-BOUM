package Models;

import dao.ManagerApplication;
import javax.swing.AbstractListModel;
import Entity.Modele;
import java.util.ArrayList;

/**
 *
 * @author developpeur
 */
public class ListModel extends AbstractListModel<Modele> {
     ArrayList<Modele> liste = ManagerApplication.listModel();
    @Override
    
    public int getSize() {
        return liste.size();
    }

    public void refresh ()
    {
        liste = ManagerApplication.listModel();
        fireContentsChanged(liste, 0, 0);
    }
    @Override
    public Modele getElementAt(int index) {
        return liste.get(index);
    }
    
    
    
}
