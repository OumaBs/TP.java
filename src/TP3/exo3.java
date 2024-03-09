package TP3;
import java.util.Arrays;
import java.util.Scanner;
public class exo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] T;
        int N;
        do{
            System.out.print("Veuillez saisir la taille du tableau (entre 10 et 50): ");
            N=sc.nextInt();
        }while(N<10||N>50);
        T=new int[N];
        for(int i=0;i<T.length;i++){
            System.out.print("T["+(i+1)+"]=");
            T[i] = sc.nextInt();}
        System.out.println();
        System.out.println("Les éléments du tableau sont: ");
        System.out.println(Arrays.toString(T));
        sc.close();
    }
}
