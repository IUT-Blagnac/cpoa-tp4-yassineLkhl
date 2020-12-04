package applicationBanque.src.action;

import java.util.Scanner;

import applicationBanque.src.banque.AgenceBancaire;
import applicationBanque.src.banque.Compte;
import applicationBanque.src.banque.exception.CompteException;

public class ActionRetirerCompte {
    private String stringCode;
    private String message;
    private AgenceBancaire ag;

    public ActionRetirerCompte(AgenceBancaire agence) {
        this.stringCode = "r";
        this.message = "Retirer de l'argent sur un compte";
        this.ag = agence;
    }

    public String getStringCode() {
        return this.stringCode;
    }

    public String getMessage() {
        return this.message;
    }

    public void execute() {
        Scanner lect = new Scanner(System.in);
        System.out.print("Num compte -> ");
        String numero = lect.next();
        System.out.print("Montant � retirer -> ");
        Double montant = lect.nextDouble();
        lect.close();
        Compte c = ag.getCompte(numero);
        try {
            c.retirer(montant);
        } catch (CompteException e) {
            e.printStackTrace();
        }
    }
}
