package TP1;
import java.util.Scanner;
public class exo2 {
        public static void main(String[] args) {
            System.out.print( "Entrez le rayon: ");
            Scanner sc= new Scanner(System.in);
            int r= sc.nextInt();
            sc.close();
            System.out.println("La surface est: "+(Math.PI*Math.pow(r,2))+"\nLe périmètre est: "+(Math.PI*r));
        }
}
