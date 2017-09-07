package outil;

import java.util.GregorianCalendar;
import java.util.Locale;

public class DateFR extends GregorianCalendar
{
	 private static final long serialVersionUID = 6702380525074717039L;

	 /**
	  *  modification de la m�thode toString() pour afficher la date sous le format
	  *  Mardi 05 Octobre 199 13h38mm21s340
	  */
	 public String toString( )

	 {  	    	
		 String jour= premierlettreMaj(getDisplayName(DAY_OF_WEEK, LONG, Locale.FRANCE ));     // traitement pour mettre la premi�re lettre du mois
		 //  et la premi�re lettre du jour de la semaine en majuscule.
		 String mois= premierlettreMaj(getDisplayName(MONTH, LONG, Locale.FRANCE ));

		 String milles = String.valueOf(get(MILLISECOND));
		 milles = milles.substring(0, 2);	


		 String expression=  jour + " " + get(DAY_OF_MONTH)  +" " + mois + " " + (get(YEAR))  + " " + get(HOUR_OF_DAY) + "h" + get(MINUTE)
		 + "mm" + get(SECOND) + "s" + milles;    	

		 return expression;
	 }

	 /**
	  * la m�thode re�oit un string, et elle met la premi�re lettre du mot en majuscule
	  * @param nom String 
	  * @return  le m�me String avec le premi�re lettre mise en majuscule
	  */

	 private String premierlettreMaj(String nom )
	 {			
		 char a= nom.charAt(0);
		 String ab= a +"";
		 ab.toUpperCase();
		 nom= nom.substring(1, nom.length());	    	
		 return ab.toUpperCase()+ nom;	    	 
	 }

}

