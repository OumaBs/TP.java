package TP3;
import java.util.Scanner;
public class exo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N;
        do{
            System.out.print("Veuillez saisir la taille du tableau (la valeur ne doit pas être comprise entre 10 et 50): ");
            N=sc.nextInt();
            int[] T=new int[N];
            for(int i=0;i<T.length;i++){
                System.out.print("T["+(i+1)+"]=");
                T[i] = sc.nextInt();}
        }while (N<10||N>50);
        sc.close();
    }
}
