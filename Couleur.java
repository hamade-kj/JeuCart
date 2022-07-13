package Cart;

public enum Couleur {
    DHAB("Dhab"),
    KOPASS("Kopass"),
    SYOUF("Syouf"),
    GRA3("Gar3");
	
	private final String nom;
	

	private Couleur(String nom) {
		this.nom = nom ;
	}
	public String getNom() {
		return nom;
	}
}