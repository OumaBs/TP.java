package TP3;
import java.util.Scanner;
public class exo6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Veuillez saisir la taille du tableau: ");
        int N=sc.nextInt();
        int[] T=new int[N];
        for(int i=0;i<T.length;i++){
            System.out.print("T["+(i+1)+"]= ");
            T[i] = sc.nextInt();
        }
        System.out.println("\nAffichage du tableau initial: ");
        for (int i=0;i<N;i++) {
            System.out.print(T[i] + " ");
        }
        System.out.println();
        int[] TP=new int[N];
        int[] TN=new int[N];
        int P=0,Ne=0;
        for (int i=0;i<N;i++) {
            if (T[i] > 0) {
                TP[P]=T[i];
                P++;
            }
            else if (T[i]<0) {
                TN[Ne] = T[i];
                Ne++;
            }
        }
        System.out.println("\nTableau des composantes positives (TP): ");
        for (int i=0;i<P;i++)
            System.out.println("T["+(i+1)+"]= "+TP[i]);
        System.out.println("\nTableau des composantes négatives (TN): ");
        for (int i=0;i<Ne;i++)
            System.out.println("T[" + (i + 1) + "]= " + TN[i]);
        sc.close();
    }
}
