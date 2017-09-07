package Entity;

/**
 * Cette classe définit le modéle d'un piston, et pour un modéle donné
 * elle initialise ses attributs de classe qui sont le label(String), le 
 * diamétre(double), et l'etat du modéle(boolean).
 * Cette classe posséde les méthodes suivante:
 * boolean getEtat()    : dit si le modéle a servit en production.
 * double getDiametre() : donne le diamétre de modéle.
 * String getNom()      : donne le Label du modéle.
 * 
 * @author ADMIN
 */

public class Modele {
    
    
    /**
     * attribut de la Classe Modéle
     */ 
    private String m_sNom;              // Label du modéle, qui est unique.
    private double m_nDiam;            //  Diamètre du piston pour ce type de modéle.
    private boolean m_bEtat;          //   Renseigne si ce modéle a servit en production.
    
    
    
    public Modele()
    {
     }
    
    
    public Modele(String nom, int diametre)
    {
        m_sNom=nom;
        m_nDiam=diametre;
    }
    
    public Modele(String nom, int diametre, boolean etat)
    {
        m_sNom=nom;
        m_nDiam=diametre;
        m_bEtat=etat;
    }
    /**
     * Cette méthode donne le label d'un modéle de piston, ce modéle est String
     * d'au plus 6 caractères ahpanumérique.
     * @return  c'est un String qui renseigne sur le modéle du piston.
     */
    public String getNom()
    {
        return  m_sNom; 
    }
     /**
     * Cette méthode donne le diamètre pour ce modéle de piston, ce diamètre est
     * une double superieur à 1 et inferieur à 6 ( valeurs prises au hasard)
     * @return le diamétre pour le modèle de cette objet c'est un double. 
     */
     public double getDiametre()
    {
        return  m_nDiam; 
    }
      /**
     * Cette méthode donne l'etat de ce modéle de piston. pour savoir le modéle
     * a servit en production, et si c'est le cas, empecher qu'on puisse le
     * détruire.
     * @return s'il a déjà été utilisé pour fabriquer un piston, la valeur de
     * retour sera à 1, sinon 0.
     */
      public boolean getEtat()
    {
        return  m_bEtat; 
    }
     
      @Override
    public String toString() {
        return "Modele {" + " Label = " + m_sNom + ", Diametre = " + m_nDiam + 
               " , Etat = " + m_bEtat +"'}'";
    }  
}
