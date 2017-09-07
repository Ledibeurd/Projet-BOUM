/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entity.Modele;
import dao.ManagerApplication;
import entity.Machine;
import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author rambaud
 */
public class ListPresse extends AbstractListModel {
    ArrayList<Machine> list = ManagerApplication.listPresse();

    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public Object getElementAt(int index) {
        return list.get(index);
    }
    
     public void refresh ()
    {
        list = ManagerApplication.listPresse();
        fireContentsChanged(list, 0, 0);
    }
    
     
}
