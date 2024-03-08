package TP12;
import java.util.Scanner;
public class exo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un entier positif n: ");
        int n=sc.nextInt();
        System.out.print("Les diviseurs de "+n+" sont: ");
        int count= 0;
        int sum= 0;
        for (int i=1;i<=n;i++) {
            if (n%i==0) {
                System.out.print(i+" ");
                count++;
                sum+= i;
            }
        }
        System.out.println("\nLe nombre de diviseurs de "+n+" est : "+count);
        System.out.println("La somme des diviseurs de "+n+" est : "+sum);
    }
}
