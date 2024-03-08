package TP2;
import java.util.Scanner;
public class exo2 {
    public static void main(String[] args) {
        System.out.print("Veuillez entrer deux entiers naturels: ");
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int N=sc.nextInt();
        int p=1;
        for (int i =1;i<=N;i++) {
            p*=X;
        }
        System.out.print("La valeur de X^N est: "+p);
    }
}
