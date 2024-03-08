package TP2;
import java.util.Scanner;
public class exo5 {
    public static void main(String[] args) {
        System.out.printf("Veuillez entrer un entier n: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int i=1,m=1;
        while(i<=n){
            m*=i;
            i++;
        }
        System.out.println("La factorielle de "+n+" est: "+m);
        /*if(n==0)
            System.out.println("La factorielle de 0 est: 1");
        else if(n>0){
            int i,m=1;
            for (i=1;i<=n;i++) {
                m *= i;
            }
            System.out.println("La factorielle de "+n+" est: "+m);
        }
        else
            System.out.println("Il faut etre un nombre positif");*/
    }
}
