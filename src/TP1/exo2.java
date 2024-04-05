package TP1;
class Point {
    private char nom;
    private double abscisse;
    public Point(char nom, double abscisse) {
        this.nom = nom;
        this.abscisse = abscisse;
    }
    public Point(Point point) {
        this.nom = point.nom;
        this.abscisse = point.abscisse;
    }
    public void affiche() {
        System.out.println("Point "+nom+": Abscisse = " + abscisse);
    }
    public void translate(double valeur) {
        abscisse += valeur;
    }
    public char getNom() {
        return nom;
    }
    public void setNom(char nom) {
        this.nom = nom;
    }
    public double getAbscisse() {
        return abscisse;
    }
    public void setAbscisse(double abscisse) {
        this.abscisse = abscisse;
    }
}
public class exo2{
    public static void main(String[] args) {
        // Création d'un point
        Point point1=new Point('A', 3.5);
        System.out.println("Caractéristiques du point avant translation :");
        point1.affiche();
        point1.translate(2.0);
        System.out.println("Caractéristiques du point après translation :");
        point1.affiche();
    }
}