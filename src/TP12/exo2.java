package TP12;
import java.util.Scanner;
public class exo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Entrez l'heure et les minutes: ");
        int h=sc.nextInt();
        int min=sc.nextInt();
        sc.close();
        min++;
        if(min==60) {
            min=0;
            h++;
            if(h==24) {
                h=0;
            }
        }
        System.out.println("Dans une minute, il sera "+h+" heure(s) "+min+" minutes.");
    }
}
