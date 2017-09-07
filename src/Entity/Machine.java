package entity;

/**
 * Cette classe définit une machine, une machne est initialise par ses attributs 
 * de classe qui sont le label(String), et l'etat du modéle(boolean).
 * Cette classe posséde les méthodes suivante:
 * boolean getEtat()    : dit si le modéle a servit en production.
 * double getDiametre() : donne le diamétre de modéle.
 * String getNom()      : donne le Label du modéle.
 * 
 * @author ADMIN
 */

public class Machine {
    
    enum fonctionnement{libere, occcupé, panne}   // trois états pris par la
                                                 //  machine au cours de 
                                                //  la production    
    private fonctionnement m_Etat;    // donne l'etat en cours de la machine   
    
    /**
     * attribut de la classe Machine
     */
    private String m_Libelle;         // label unique pour chaque machine.
    private int m_Numero;             //  numéro unique pour chaque machine.
    private boolean m_Utilisee ;      //   Si la machine a produit des pistons. 
     
    /**
     * Constructeur 
     * @param label 
     */
    public Machine(String label){ 
        m_Utilisee = false;
        m_Libelle = label;
}
    
////////////////////////////////////////////////////////////////////////////

/**
 * 
 * Les getteurs de la classe Machine sont :
 * fonctionnement getEtat()
 * String getLibelle()
 *  int getNum()
 */
    
    /**
     * Cette méthode fournit l'etat de la presse attachée à cette
     * object courant.
     * @return une enuméré qui peut prendre comme valeur
     * {libere, occcupé, panne} 
     */
    public fonctionnement getEtat()
    {
        return m_Etat;
    }     
    
    
    /**
     * Cette méthode fournit le label de la presse attachée à cette
     * object courant.
     * @return un String, qui est unique et qui est alphanumérique
     */
     public String getLibelle()
    {
        return m_Libelle;
    } 
     
     
     /**
      * Cette méthode fournit le numéro de la presse attachée à cet
      * object courant.
      * @return un entier positif.
      */
     public int getNum()
    {
        return m_Numero;
    }    
    
  
    /////////////////////////////////////////////////////////////// 
     
    /**
 * 
 * Les setters de la classe Machine sont :
 fonctionnement getEtat()
 String setLibelle()
 setEtat(fonctionnement etat)
  int setNum()
 */ 
     
     
     
     public void setEtat(fonctionnement etat)
    {
        m_Etat = etat;
    } 
     
      public void setLibelle(String label)
    {
        m_Libelle = label;
    } 
      
      public void setNum(int num)
    {
        m_Numero = num;
    }   
      
     public String toString() {
        return "Machine{" + "Label = " + m_Libelle + ", Numero = " + m_Numero + 
                ", Etat = " + m_Etat +'}';
    }    
}
