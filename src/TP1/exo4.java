package TP1;
import java.util.Scanner;
public class exo4 {
        public static void main(String[] args) {
            System.out.print( "Entrez un réel et un entier: ");
            Scanner sc= new Scanner(System.in);
            double x = sc.nextDouble();
            int n = sc.nextInt();
            sc.close();
            System.out.println("x à la puissance n: "+Math.pow(x,n));
        }
}
