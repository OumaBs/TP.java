package TP1;
import java.util.Scanner;
public class exo2{
    private char nom;
    private double abscisse;
    public exo2(char nom, double abscisse) {
        this.nom=nom;
        this.abscisse=abscisse;
    }
    public void initialiser(exo2 point) {
        this.nom=point.getNom();
        this.abscisse=point.getAbscisse();
    }
    public void affiche() {
        System.out.println("Point "+nom+" : Abscisse = "+abscisse);
    }
    public void translate(double translation) {
        abscisse += translation;
    }
    public char getNom() {
        return nom;
    }
    public double getAbscisse() {
        return abscisse;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Entrez le nom du point : ");
        char nom=sc.next().charAt(0);
        System.out.print("Entrez l'abscisse du point : ");
        double abscisse=sc.nextDouble();
        exo2 point = new exo2(nom,abscisse);
        System.out.println("Avant translation :");
        point.affiche();
        System.out.print("Entrez la valeur de translation : ");
        double translation=sc.nextDouble();
        point.translate(translation);
        System.out.println("Après translation :");
        point.affiche();
        sc.close();
    }
}

