package applicationBanque.src.action;

import java.util.Scanner;

import applicationBanque.src.banque.AgenceBancaire;
import applicationBanque.src.banque.Compte;

public class ActionVoirCompte {
    private String stringCode;
    private String message;
    private AgenceBancaire ag;

    public ActionVoirCompte(AgenceBancaire agence){
        this.stringCode = "v";
        this.message = "Voir un compte (par son numéro)";
        this.ag = agence;
    }

    public String getStringCode(){
        return this.stringCode;
    }

    public String getMessage(){
        return this.message;
    }

    public void execute(){
        Scanner lect = new Scanner ( System.in );
        System.out.print("Num compte -> ");
		String numero = lect.next();
		Compte c = ag.getCompte(numero);
		if (c==null) {
			System.out.println("Compte inexistant ...");
		} else {
			c.afficher();
        }
        lect.close();
    }
}
