package Exo2;
public class Complexes{
    private double partieReelle;
    private double partieImaginaire;
    public Complexes(){
        this.partieReelle = 0;
        this.partieImaginaire = 0;
    }
    public Complexes(double partieReelle, double partieImaginaire) {
        this.partieReelle = partieReelle;
        this.partieImaginaire = partieImaginaire;
    }
    public double getPartieReelle() {
        return partieReelle;
    }
    public void setPartieReelle(double partieReelle) {
        this.partieReelle = partieReelle;
    }
    public double getPartieImaginaire() {
        return partieImaginaire;
    }
    public void setPartieImaginaire(double partieImaginaire) {
        this.partieImaginaire = partieImaginaire;
    }
    public Complexes plus(Complexes autreComplexe) {
        double nouvellePartieReelle = this.partieReelle + autreComplexe.partieReelle;
        double nouvellePartieImaginaire = this.partieImaginaire + autreComplexe.partieImaginaire;
        return new Complexes(nouvellePartieReelle, nouvellePartieImaginaire);
    }
    public Complexes moins(Complexes autreComplexe) {
        double nouvellePartieReelle = this.partieReelle - autreComplexe.partieReelle;
        double nouvellePartieImaginaire = this.partieImaginaire - autreComplexe.partieImaginaire;
        return new Complexes(nouvellePartieReelle, nouvellePartieImaginaire);
    }
    public void afficher() {
        System.out.println(partieReelle+ " + ("+partieImaginaire+") i");
    }
    public static void main(String[] args) {
        Complexes a = new Complexes(3, 2);
        Complexes b = new Complexes(1, 5);
        Complexes somme = a.plus(b);
        Complexes difference = a.moins(b);
        System.out.print("a = ");
        a.afficher();
        System.out.print("b = ");
        b.afficher();
        System.out.print("La somme de a et b = ");
        somme.afficher();
        System.out.print("La différence de a et b = ");
        difference.afficher();
    }
}