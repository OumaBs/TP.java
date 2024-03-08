package TP1;
import java.util.Scanner;
public class exo1 {
        public static void main(String[] args) {
            System.out.print( "Entrez deux entiers: ");
            Scanner l= new Scanner(System.in);
            int a= l.nextInt();
            int b= l.nextInt();
            l.close();
            System.out.println("\nLa somme est: "+(a+b)+"\nLa différence est: "+(a-b)+"\nLe produit est: "+(a*b));
            if (b==0)
                System.out.println("Impossible de calculer le quotient");
            else
                System.out.println("le quotient est: "+(a/b));
        }
}
