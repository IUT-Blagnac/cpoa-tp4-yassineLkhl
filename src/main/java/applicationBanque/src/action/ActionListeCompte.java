package applicationBanque.src.action;

import applicationBanque.src.banque.AgenceBancaire;

public class ActionListeCompte implements Action{
    private String stringCode;
    private String message;
    private AgenceBancaire ag;

    public ActionListeCompte(AgenceBancaire agence){
        this.stringCode = "l";
        this.message = "Liste des comptes de l'agence";
        this.ag = agence;
    }

    @Override
    public String actionMessage() {
        return this.message;

    }

    @Override
    public String actionCode() {
        return this.stringCode;

    }

    @Override
    public void execute(AgenceBancaire ag) throws Exception {
        ag.afficher();
    }
}

