/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

/**
 *
 * @author ADMIN
 */
public class Verification {

    /**
     *
     * @param ateste
     * @return
     */
    public static boolean estNumeric(String ateste) {
        boolean numeric = false;
        if (ateste != null) {
            try 
            {
                 Float.parseFloat(ateste);
                 numeric = true;
            } 
            catch (Exception e) 
            {                
            }
        }
        return numeric;
    }

    /**
     *
     * @param ateste
     * @return
     */
    public static boolean estString(String ateste) {
        boolean prenom = false;
        if (ateste != null) {
            prenom = ateste.matches("^[\\p{Alnum} -]+$");
        }
        return prenom;
    }

    /**
     *
     * @param ateste
     * @return
     */
    public static boolean estfloat(String ateste) {
        boolean numeric = false;
        if (ateste != null) {
            numeric = ateste.matches("^[\\p{Digit} .]+$");
        }
        return numeric;
    }

}
