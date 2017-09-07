/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Tools.OutilConnexion;
import entity.Employe;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author ramba
 */
public class Manageur_Identification {
    private Manageur_Identification (){
        
    }
    public static Employe chercherEmployé(String nom, String prenom)
    {
        Employe Emp = null;
        Connection co = OutilConnexion.getInstance();
            try
            {
                Statement s = co.createStatement();
                ResultSet rs = s.executeQuery("select * from pilote where NomPilote = '"+nom+"' and PrenomPilote = '"+prenom+"'");
                if (rs.next())
                {
                   Emp = new Employe(rs.getInt(1),rs.getString(2), rs.getString(3),rs.getBoolean(4));
                   
                }
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        
        return Emp;
    }
    /*
    public static boolean creerPilote(Pilote p)
    {
        String nom = p.getNom();
        String prenom = p.getPrenom();
        boolean ok = false;
        if ( nom != null && prenom != null && !nom.trim().isEmpty() && !prenom.trim().isEmpty())
        {
            Connection co = OutilConnexion.getInstance();
            try
            {
                Statement s = co.createStatement();
                s.executeUpdate("Insert into Pilote VALUES('"+nom+"','"+prenom+"')");
                ok = true;
            }
            catch(Exception ex)
            {
                ok = false;
            }
        }
        
        return ok;
    }
    */
    
}
