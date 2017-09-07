/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import Entity.Modele;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Tools.OutilConnexion;
import entity.Machine;

/**
 *
 * @author ADMIN
 */
public class ManagerApplication {  
   
     private ManagerApplication()
      {
         
      }
     private static String message = "";
     /**
      * Cette fonction va interroger la base de donnee pour savoir si
 le modele existe déjà, aprés vérification des paramètres en
 entrée, elle le rajoutera à la table Modele dans la base de donnée, en 
 fournissant son label, son diamétre, et mettre l'état utilisation à faux.
      * @param modele c'est le nom du Modele, c'est un String d'au plus 6 caractères 
 entrés au clavier par le responsable de l'atelier.
      * @param diametre c'est un double, entrez par le responsable d'atelier, ce double
      * doit être positif pour être valide.
      * @return une booleen, si le modéle a été créé, il sera à vrai sinon à faux
      */
    public static boolean creerModele(String modele, float diametre) {

        int code;
        boolean ok = false;

      if (( modele != null && !modele.trim().isEmpty()&& diametre > 0 ))
                 
        { Connection co = OutilConnexion.getInstance();
            try
            {
             // constitution de la requête d'appel à la procedure stockée creerModele
               CallableStatement cs= co.prepareCall( "{?=call creerModele(?,?,?)}");
               
               // la veleur du premier paramétre 
               cs.setString(2, modele);         
               
               // la veleur du deuxieme paramétre 
                cs.setDouble(3, diametre );
             
             // description de la valeur de retour de la procédure (1)
               cs.registerOutParameter (1, java.sql.Types.INTEGER ); 
              
             // description du paramètre en sortie(4)  
               cs.registerOutParameter (4, java.sql.Types.VARCHAR  );              
              
               cs.executeUpdate ();
                
               code=cs.getInt(1);
               if(code==0)
               {
                   ok=true;
               }
               System.out.println(" le code de retour : " + code + " message " + cs.getString(4)) ;
               setMessage (cs.getString(4) );
               cs.close();
               co.close();              
               
            }
            catch(SQLException ex)
            {
                // ceci permet d'écrire l'exception onterceptée
                ex.printStackTrace();
            }
        
   
    }
         return ok ;
    }  
    
     /**
      * Cette fonction va interroger la base de donnee pour savoir si
 le modele existe, si c'est le cas, et aprés vérification des paramètres en
 entrée, et si l'état utilisation est à faux, elle le supprimera de la table Modele.
      * @param modele c'est le nom du Modele, c'est un String d'au plus 6 caractères 
 entrés au clavier par le responsable de l'atelier.
      * @return une booleen, si le modéle a été supprimé, il sera à vrai sinon à faux
      */
      
    public static boolean supprimerModele(String modele) {
      
      int code;
      boolean ok = false;
      
        if ( modele != null && !modele.trim().isEmpty() )
                 
        { Connection co = OutilConnexion.getInstance();
            try
            {
             // constitution de la requête d'appel à la procedure stockée creerModele
               CallableStatement cs= co.prepareCall( "{?=supprimerModele(modele,?)}");
             
             // description de la valeur de retour de la procédure 
               cs.registerOutParameter (1,java.sql .Types .INTEGER ); 
              
               cs.registerOutParameter (3,java.sql .Types.VARCHAR  );
  
               cs.execute  (); 
               
               code=cs.getInt(1);
              if (code ==0) 
              {
                  // modele supprimer
                  ok=true;
              }
              else
              {
                    // le modele n'a pas pu être supprimé 
              }
            }
            catch(SQLException ex)
            {
                ok = false;
            }
        }
          
       return ok;
    }
    
    
        /**
      * Cette fonction va interroger la base de donnee pour savoir si
 la presse n'existe pas déjà, sinon elle, aprés vérification des paramètres en
 entrée, elle la rajoutera dans la table Machine dans la base de donnée, en 
 fournissant son label, et en mettant l'état utilisation à faux.
      * @param presse c'est le label de la machine, c'est un String d'au plus 6 caractères 
      * entrés au clavier par le responsable de l'atelier.
      * @return une booleen, si la machine a été créé, il sera à vrai sinon à faux
      */
    public static boolean creerPresse(String presse) {
        
      int code;
      boolean ok = false;     
      
      if (( presse != null && !presse.trim().isEmpty()))
                 
        { Connection co = OutilConnexion.getInstance();
            try
            {
             // constitution de la requête d'appel à la procedure stockée creerModele
               CallableStatement cs= co.prepareCall( "{?=creerPresse(?,?)}");
               
               // la veleur du premier paramétre 
               cs.setString(2, presse);         

             // description de la valeur de retour de la procédure 
               cs.registerOutParameter (1,java.sql .Types .INTEGER ); 
              
               cs.registerOutParameter (3,java.sql .Types.VARCHAR  );
  
               cs.execute  (); 
               
               code=cs.getInt(1);
              if (code ==0) 
              {
                  // modele supprimer
                  ok=true;
              }
              else
              {
                    // le modele n'a pas pu être supprimé 
              }
            }
            catch(SQLException ex)
            {
                ok = false;
            }
        }
          
       return ok;
    }
    
    
        /**
      * Cette fonction va interroger la base de donnee pour savoir si
 la presse n'existe pas déjà, sinon elle, aprés vérification des paramètres en
 entrée, elle la rajoutera dans la table Machine dans la base de donnée, en 
 fournissant son label, et en mettant l'état utilisation à faux.
      * @param presse c'est le label de la machine, c'est un String d'au plus 6 caractères 
      * entrés au clavier par le responsable de l'atelier.
      * @return une booleen, si la machine a été créé, il sera à vrai sinon à faux
      */
    public static boolean supprimerPresse(String presse) {
 
      int code;
      boolean ok = false;
      
      if ( presse != null && !presse.trim().isEmpty())
                 
           { Connection co = OutilConnexion.getInstance();
            try
            {
             // constitution de la requête d'appel à la procedure stockée creerModele
               CallableStatement cs= co.prepareCall( "{?=supprimerPresse(presse,?)}");
             
             // description de la valeur de retour de la procédure 
               cs.registerOutParameter (1,java.sql .Types .INTEGER ); 
              
               cs.registerOutParameter (3,java.sql .Types.VARCHAR  );
  
               cs.execute  (); 
               
               code=cs.getInt(1);
              if (code ==0) 
              {
                  // modele supprimer
                  ok=true;
              }
              else
              {
                    // le modele n'a pas pu être supprimé 
              }
            }
            catch(SQLException ex)
            {
                ok = false;
            }
        }
          
       return ok;
    }    
    
      public static ArrayList<Machine> listPresse()
    {
       ArrayList<Machine> liste = new ArrayList(); 
       Connection co = OutilConnexion.getInstance();
            try
            {
                Statement s = co.createStatement();
                ResultSet rs = s.executeQuery("select * from Machine");
                while (rs.next())
                {
                   Machine m = new Machine(rs.getString(1));
                   liste.add(m);
                }
            }
            catch(SQLException ex)
            {
                liste = null;
            }
       
       return liste;
    }
      
      public static ArrayList<Modele> listModel()
    {
       ArrayList<Modele> liste = new ArrayList(); 
       Connection co = OutilConnexion.getInstance();
            try
            {
                Statement s = co.createStatement();
                ResultSet rs = s.executeQuery("select * from Modele");
                while (rs.next())
                {
                   Modele p = new Modele(rs.getString(1),rs.getInt(2), rs.getBoolean(3));
                   liste.add(p);
                }
            }
            catch(SQLException ex)
            {
                liste = null;
            }
       
       return liste;
    }
      
      
      
  
      
      

    /**
     * @return the message
     */
    public static String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public static void setMessage(String message) {
        ManagerApplication.message = message;
    }
    
}