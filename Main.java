package Cart;

import java.util.ArrayList;

public class Main {
      //varaibles 
	
	  protected ArrayList<Carte> main = new ArrayList<>();
	  
	  //Ajout une cart a la main
	  
	  public void AjoutCart(Carte carte) {
		  main.add(carte);
	  }
	  
	  //Jouer une carte
	  
	  public void JoueCarte(Carte carte , Main AuterMain) {
		    AuterMain.AjoutCart(carte);
		    main.remove(carte);
	  }
	  
	  //vider une main
	  
	  public void ViderCarte() {
		  main.clear();
	  }
	  
	  //Savoir le nmbr de cart exsite dans une main
	  
	  public int NombrCarte(Carte carte) {
		  return main.size();
	  }
	  //Savoir si une main contient une couleur
	 
	  public boolean ColorsExsit(Couleur couleur) {
		  boolean exsite=false;
		 for(Carte c:main) {
			  if(c.getCouleur().getNom().equals(couleur)) {
				    return true;
			  }
		 }
		  return exsite;
	  }
	 
	  //permet de recupere la Main
	  
	  public ArrayList<Carte> getMain() {
		return main;
	}
	  //affichage de carte
	  public void Affichage() {
		  System.out.println(main);
	  }
}
