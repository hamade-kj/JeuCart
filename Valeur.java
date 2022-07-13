package Cart;

public enum Valeur {
     LAS("Las",1),
     DOS("Dos",2),
     TRESS("Tress",3),
     QUATRO("Quatro",4),
     CINQO("Cinqo",5),
     SIX("Six",6),
     SEPT("Sept",7),
     SOTA("Sota",10),
     KABAL("Kabal",11),
     RAY("Ray",12);
	
	private final String nom ; 
	private final int valeur ;
	
	private Valeur(String nom , int valeur) {
	   this.nom = nom ;
	   this.valeur = valeur;
	}
	public String getNom() {
		return nom;
	}
	public int getValeur() {
		return valeur;
	}
}

