package TP3;
import java.util.Scanner;
public class exo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Le nombre d’éléments du tableau est 10: ");
        int[] T=new int[10];
        for(int i=0;i<T.length;i++){
            System.out.print("T["+(i+1)+"]= ");
            T[i] = sc.nextInt();
        }

    }
}
