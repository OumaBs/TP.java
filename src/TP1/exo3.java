package TP1;
import java.util.Scanner;
public class exo3 {
        public static void main(String[] args) {
            System.out.print( "Entrez deux entiers: ");
            Scanner sc= new Scanner(System.in);
            int a= sc.nextInt();
            int b= sc.nextInt();
            sc.close();
            int c;
            c=a;
            a=b;
            b=c;
            System.out.println("La valeur de a est: "+a+"\nLa valeur de b est: "+b);
        }
}
