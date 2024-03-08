package TP1;
import java.util.Scanner;
public class exo8 {
    public static void main(String[] args) {
        System.out.print("Entrez deux entiers a et b: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        int pgcd=1;
        for(int i=1;i<=a && i<=b;i++) {
            if(a%i==0 && b%i==0)
                pgcd=i;
        }
        System.out.println("Le PGCD de "+a+" et "+b+" est: "+pgcd);
    }
}
