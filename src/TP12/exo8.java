package TP12;
import java.util.Scanner;
public class exo8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Entrez votre âge: ");
        int age= sc.nextInt();
        System.out.print("Entrez votre sexe (F pour femme, H pour homme): ");
        sc.nextLine();
        String sexe = sc.nextLine();
        sc.close();
        if((sexe.equals("H") && age > 20) || (sexe.equals("F") && age > 18 && age < 35))
            System.out.println("\nVous devez payer l'impôt.");
        else
            System.out.println("\nVous n'êtes pas concerné(e)s pour payer l'impôt.");
    }
}
