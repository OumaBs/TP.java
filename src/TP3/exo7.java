package TP3;
import java.util.Scanner;
import java.util.Arrays;
public class exo7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Veuillez entrez la taille du tableau: ");
        int N=sc.nextInt();
        int[] T=new int[N];
        int sum=0;
        System.out.println("Veuillez remplir le tableau: ");
        for (int i=0;i<N;i++) {
            System.out.print("L'élément "+(i+1)+": ");
            T[i]=sc.nextInt();
            sum+=T[i];
        }
        System.out.println("\nLa somme des éléments: "+sum);
        double moyenne=(double) sum/N;
        System.out.println("La moyenne des éléments: "+moyenne);
        int[] TCopie= Arrays.copyOf(T,N);
        System.out.println("Tableau copié (T2): "+Arrays.toString(TCopie));
        Arrays.sort(T);
        System.out.println("Tableau trié par ordre croissant: "+Arrays.toString(T));
    }
}
