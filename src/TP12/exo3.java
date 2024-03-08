package TP12;
import java.util.Scanner;
public class exo3 {
    public static void main(String[] args) {
        System.out.print("Entrez un entier n: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int sum=0;
        for(int i=1;i<n;i++)
            if(n%i==0)
                sum+=i;
        if(sum==n)
            System.out.println("Le nombre "+n+" est parfait.");
        else
            System.out.println("Le nombre "+n+" n'est pas parfait.");
    }
}
