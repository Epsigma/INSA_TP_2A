package tp_git;

import java.util.ArrayList;
import java.util.List;

public class System_hospitalier {
	
	private List<Requête> listRequetes;

	public System_hospitalier(List<Requête> listRequetes) {
		super();
		this.listRequetes = listRequetes;
	}

	public System_hospitalier() {
		super();
		listRequetes = new ArrayList<>();
	}

	public List<Requête> getListRequetes() {
		return listRequetes;
	}

	public void setListRequetes(List<Requête> listRequetes) {
		this.listRequetes = listRequetes;
	}
	
	public void recevoirRequete(Requête requete) {
		listRequetes.add(requete);
		String analyse =  analyserRequete(requete);
		String comparaisonDonnees = comparerDonnes();
		System.out.println(analyse);
		System.out.println(comparaisonDonnees);
	}
	
	private String analyserRequete(Requête requête) {
		// Analyser la requête
		return "requête analysée";
	//Le rôle de cette méthode est d'analyser les requêtes envoyées au système hospitalier.
	}
	
	private String comparerDonnes() {
		// Comparaison des données
		return "Cluster trouvé";
	//Le rôle de cette méthode est de comparer les données enregistrées dans sa base de donnée, pour éventuellement en déduire l'apparition d'un cluster épidémique.	
}

}
