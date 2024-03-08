package TP2;
import java.util.Scanner;
public class exo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un entier positif N: ");
        int N = sc.nextInt();
        sc.close();
        boolean a = true;
        if (N <= 1) {
            a = false;
        } else {
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    a = false;
                    break;
                }
            }
        }
        if (a) {
            System.out.println(N + " est un nombre premier.");
        } else
            System.out.println(N + " n'est pas un nombre premier.");
       /* System.out.println("Liste des nombres premiers entre 1 et " + N + " :");
        for (int i=2;i<=N;i++) {
            boolean a=true;
            if(i<=1){
                a = false;
            }
            else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        a = false;
                        break;
                    }
                }
            }
            if (a)
                System.out.print(i + " ");
        }*/
    }
}
