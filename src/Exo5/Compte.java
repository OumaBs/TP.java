package Exo5;
public class Compte {
    private final int numéroCompte;
    private double solde;
    private static int nombreComptes = 0;
    private final Client propriétaire;
    public Compte(Client propriétaire) {
        this.propriétaire = propriétaire;
        this.solde = 0;
        this.numéroCompte = ++nombreComptes;
    }
    public int getNuméroCompte() {
        return numéroCompte;
    }
    public double getSolde() {
        return solde;
    }
    public Client getPropriétaire() {
        return propriétaire;
    }
    public void créditer(double montant) {
        solde += montant;
    }
    public void débiter(double montant) {
        if (montant <= solde) {
            solde -= montant;
        } else {
            System.out.println("Solde insuffisant.");
        }
    }
    public void résumé() {
        System.out.println("Numéro de compte: "+numéroCompte);
        propriétaire.afficher();
        System.out.println("Solde: "+solde);
    }
    public static int nombreComptes() {
        return nombreComptes;
    }
}