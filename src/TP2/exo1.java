package TP2;
import java.util.Scanner;
public class exo1 {
    public static void main(String[] args) {
        System.out.print("Veuillez entrer le nombre des entiers N: ");
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int i=1,sum=0,p=1;
      /*  while(i<N){
            i++;
            System.out.print("Entrer l'entier: " +i);
            int m=sc.nextInt();
            sum+=m;
            p*=m;
        }
        sc.close();
        System.out.println("La somme est : "+sum+"\nLa moyenne est :" +(sum/N)+"\nLe produit est : "+p);
do {
    i++;
    System.out.print("Veuillez entrer l'entier: "+i);
    int m=sc.nextInt();
    sum+=m;
    p*=m;
}while(i<N);
        sc.close();
        System.out.println("La somme est : "+sum+"\nLa moyenne est: "+(sum/n)+"\nLe produit est: "+p);*/
        for(i=1;i<=N;i++){
            System.out.print("Veuillez entrer l'entier: "+i);
            int m=sc.nextInt();
            sum+=m;
            p*=m;
        }
        sc.close();
        System.out.println("La somme est: "+sum+"\nLa moyenne est : "+(sum/N)+"\nLe produit est: "+p);
    }
}
