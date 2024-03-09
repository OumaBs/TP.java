package TP2;
import java.util.Scanner;
public class exo6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Entrez un entier positif N: ");
        int N=sc.nextInt();
        sc.close();
        /*System.out.println("Ce programme teste si un nombre est premier ou pas");
        boolean p=true;
        if (N<=1){
            p=false;
        }
        else {
            for (int i=2;i<= Math.sqrt(N);i++) {
                if (N%i==0){
                    p=false;
                    break;
                }
            }
        }
        if (p)
            System.out.println("Le nombre "+N+" est un nombre premier");
        else
            System.out.println("Le nombre "+N+" n'est pas un nombre premier");*/
       System.out.println("Ce programme teste tous les nombres entre 1 et N");
       System.out.println("La liste des nombres premiers entre 1 et "+N+": ");
        for (int i=2;i<=N;i++) {
            boolean p=true;
            if(i<=1)
                p=false;
            else {
                for (int j=2;j<=Math.sqrt(i);j++) {
                    if (i%j==0){
                        p=false;
                        break;
                    }
                }
            }
            if (p)
                System.out.print(i+" ");
        }
    }
}
