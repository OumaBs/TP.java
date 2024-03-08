package TP2;
import java.util.Scanner;
public class exo3 {
    public static void main(String[] args) {
        System.out.print("Entrer un entier positif N (différent de 0): ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        float sum = 0;
        for (int i=1;i<=N;i++) {
            sum+=1.0f/i;
        }
        System.out.print("La somme est : "+sum);
    }
}
