package TP3;
import java.util.Arrays;
import java.util.Scanner;
public class exo4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N;
        do{
            System.out.print("Veuillez saisir la taille du tableau (entre 10 et 50): ");
            N=sc.nextInt();
        }while (N<10||N>50);
        int[] T=new int[N];
        for(int i=0;i<T.length;i++){
            System.out.print("T["+(i+1)+"]= ");
            T[i] = sc.nextInt();}
        System.out.println("Le tableau initial: ");
        System.out.println(Arrays.toString(T));
        System.out.println();
        int M = 0;
        for (int i = 0; i < N; i++) {
            if (T[i] != 5) {
                T[M] = T[i];
                M++;
            }
        }
        System.out.println("Le tableau après suppression des occurrences de 5: ");
        for (int i=0;i<M;i++) {
            System.out.print(T[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
