package Exo1;
public class Rectangle {
    private double longueur;
    private double largeur;
    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }
    public double getLongueur() {
        return longueur;
    }
    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }
    public double getLargeur() {
        return largeur;
    }
    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }
    public double calculerPerimetre() {
        return 2 * (longueur + largeur);
    }
    public double calculerAire() {
        return longueur * largeur;
    }
    public boolean estCarre() {
        return longueur == largeur;
    }
    public void afficherRectangle() {
        System.out.println("Longueur : " + longueur + " - Largeur : " + largeur + " - Périmètre : " + calculerPerimetre() + " - Aire : " + calculerAire() + " - " + (estCarre() ? "Il s'agit d'un carré" : "Il ne s'agit pas d'un carré"));
    }
    public static void main(String[] args) {
        Rectangle monRectangle = new Rectangle(5, 5);
        monRectangle.afficherRectangle();
    }
}
