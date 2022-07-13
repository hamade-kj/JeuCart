package Cart;

import java.util.Collections;

public class Paque extends Main {
	
	//Ramplou bih carte vih 40 carte 
	
	public void Remplir() {
		  for(Couleur couleur:Couleur.values()) {
			     for(Valeur valeur:Valeur.values()) {
			    	   Carte carte = new Carte(couleur,valeur);
			    	   AjoutCart(carte);
			     }
		  }
	}
	
	//nbatro bih carte nkhal6oh
	
	public void PatriCart() {
		Collections.shuffle(main);
	}
}
