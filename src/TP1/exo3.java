package TP1;
import java.util.Scanner;
public class exo3{
    private final char nom;
    private double abscisse;
    public exo3(char nom,double abscisse) {
        this.nom=nom;
        this.abscisse=abscisse;
    }
    public void affiche() {
        System.out.println("Point "+nom+" : Abscisse = "+abscisse);
    }
    public void translate(double translation) {
        abscisse += translation;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Entrez le nom du point: ");
        char nom=sc.next().charAt(0);
        System.out.print("Entrez l'abscisse du point: ");
        double abscisse=sc.nextDouble();
        exo3 point =new exo3(nom, abscisse);
        System.out.println("Caractéristiques du point initial: ");
        point.affiche();
        System.out.print("Entrez la valeur de translation: ");
        double translation=sc.nextDouble();
        point.translate(translation);
        System.out.println("Caractéristiques du point après translation: ");
        point.affiche();
        sc.close();
    }
}

