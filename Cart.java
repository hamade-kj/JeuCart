package Cart;

public class Carte {
   private Couleur couleur;
   private Valeur valeur;
   private boolean etat;
   
   public Carte(Couleur couleur , Valeur valeur) {
	 this.couleur = couleur;
	 this.valeur = valeur;
	 etat = false;
  }
   public Couleur getCouleur() {
	return couleur;
  }
   public Valeur getValeur() {
	return valeur;
  }
   public boolean isAffiche() {
	    return etat;
   }
   public void Retourne() {
	   etat = !etat;
   }
   
    @Override
    	public String toString() {
    	    if(etat) {
    	    	return valeur.getNom() + " dyal " + couleur.getNom();
    	    }
    	    else {
    	    	return "le cart sur wjhe ygl3 emh chn3revlh ene ";
    	    }
    	}
}