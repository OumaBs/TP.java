package TP12;
import java.util.Scanner;
public class exo6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Entrez votre poids en kg: ");
        double poids = sc.nextDouble();
        System.out.print("Entrez votre taille en m: ");
        double taille = sc.nextDouble();
        System.out.print("Entrez votre sexe (F pour femme, H pour homme): ");
        sc.nextLine();
        String sexe = sc.nextLine();
        sc.close();
        double imc=poids/(Math.pow(taille,2));
        System.out.println("\nVotre IMC est: "+imc);
        if (sexe.equals("F")) {
            if (imc < 19)
                System.out.println("Maigreur");
            else if (imc >= 19 && imc <= 24)
                System.out.println("Poids normal");
            else if (imc >= 24 && imc <= 30)
                System.out.println("Surcharge pondérale");
            else if (imc >= 30 && imc <= 40)
                System.out.println("Adiposité");
            else
                System.out.println("Obésité");
        }
        else if (sexe.equals("H")) {
            if (imc < 20)
                System.out.println("Maigreur");
            else if (imc >= 20 && imc <= 25)
                System.out.println("Poids normal");
            else if (imc >= 25 && imc <= 30)
                System.out.println("Surcharge pondérale");
            else if (imc >= 30 && imc <= 40)
                System.out.println("Adiposité");
            else
                System.out.println("Obésité");
        }
        else
            System.out.println("Sexe non reconnu.");
    }
}
