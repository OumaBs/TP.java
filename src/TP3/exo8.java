package TP3;
import java.util.Arrays;
import java.util.Scanner;
public class exo8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Veuillez saisir la taille du tableau: ");
        int N=sc.nextInt();
        int[] T=new int[N];
        System.out.println("Veuillez remplir le tableau: ");
        for (int i=0;i<N;i++) {
            System.out.print("L'élément "+(i+1)+": ");
            T[i]=sc.nextInt();
        }
        System.out.println("\nAffichage du tableau: ");
        System.out.println(Arrays.toString(T));
        int Ecart = 0;
        for (int i=0;i<N-1;i++) {
            for (int j=i+1;j<N;j++) {
                int ecart=Math.abs(T[i]-T[j]);
                if (ecart>Ecart) {
                    Ecart=ecart;
                }
            }
        }
        System.out.println("\nLe plus grand écart dans le tableau est: "+Ecart);
    }
}
