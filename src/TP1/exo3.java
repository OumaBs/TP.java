package TP1;
import java.util.Scanner;
public class exo3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Entrez le nom du point: ");
        char nom=sc.next().charAt(0);
        System.out.print("Entrez l'abscisse du point: ");
        double abscisse=sc.nextDouble();
        Point point =new Point(nom, abscisse);
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

