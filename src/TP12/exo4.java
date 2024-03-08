package TP12;
import java.util.Scanner;
public class exo4 {
    public static void main(String[] args) {
        System.out.print("Entrez deux entier n et m: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.close();
        int sum1=0,sum2=0;
        for(int i=2;i<n;i++)
            if(n%i==0)
                sum1+=i;
        for(int j=2;j<m;j++)
            if(m%j==0)
                sum2+=j;
        if((sum1==m)&&(sum2==n))
            System.out.println("Les deux entiers "+n+" et "+m+" sont qualifiés amis");
        else
            System.out.println("Les deux nombres ne sont pas amis");
    }
}
