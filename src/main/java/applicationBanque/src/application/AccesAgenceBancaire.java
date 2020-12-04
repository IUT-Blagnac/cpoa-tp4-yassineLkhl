package applicationBanque.src.application;


import applicationBanque.src.banque.AgenceBancaire;
import applicationBanque.src.banque.Compte;
import applicationBanque.src.banque.exception.ABCompteDejaExistantException;
import applicationBanque.src.banque.exception.ABCompteNullException;

public class AccesAgenceBancaire {
	
	private AccesAgenceBancaire () {}
	
	public static AgenceBancaire getAgenceBancaire () {
		
		// To be done : load it from file
		// Not yet implemented, just a stub
		
		AgenceBancaire ag = new AgenceBancaire("CAISSE ECUREUIL", "PIBRAC");
		
		try {
			ag.addCompte(new Compte("010101", "Durand"));
			ag.addCompte(new Compte("010102", "Durand"));
			
			ag.addCompte(new Compte("050501", "Leon"));
			ag.addCompte(new Compte("050502", "Leon"));
			ag.addCompte(new Compte("050503", "Leon"));
			
			ag.addCompte(new Compte("090904", "Zeste"));
			ag.addCompte(new Compte("090905", "Zeste"));
			
		} catch (ABCompteNullException | ABCompteDejaExistantException e) {
			throw new RuntimeException();
		}
		return ag;
	}

	public static void saveAgenceBancaire (AgenceBancaire a) {
		
		// To be done : load it from file
		// Not yet implemented
		
		throw new UnsupportedOperationException();
	}
}
