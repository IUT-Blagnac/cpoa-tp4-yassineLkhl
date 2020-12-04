package applicationBanque.src.action;

import java.util.Scanner;

import applicationBanque.src.banque.AgenceBancaire;
import applicationBanque.src.banque.Compte;

public class ActionVoirCompteProprio {
    private String stringCode;
    private String message;
    private AgenceBancaire ag;

    public ActionVoirCompteProprio(AgenceBancaire agence){
        this.stringCode = "p";
        this.message = "voir les comptes d'un propriétaire (par son nom)";
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
        System.out.print("Propri�taire -> ");
		String nom = lect.next();
        Compte[] c = ag.getComptesDe(nom);
        for (int i = 0; i < c.length; i++){
            c[i].afficher();
        }
        lect.close();
    }
}
