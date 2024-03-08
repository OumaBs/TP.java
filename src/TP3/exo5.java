package TP3;

import java.util.Scanner;

public class exo5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Veuillez saisir la taille du tableau: ");
        int N=sc.nextInt();
        int[] T=new int[N];
        for(int i=0;i<T.length;i++){
            System.out.print("T["+(i+1)+"]=");
            T[i] = sc.nextInt();
        }
        sc.close();
    }
}
