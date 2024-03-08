package TP12;
import java.util.Scanner;
public class exo5 {
    public static void main(String[] args) {
        int buts[][]=new int[22][2];
        int num=0,sum=0,sansbut=0,max=0;
        System.out.println("- Joueur N° : Nbr de buts");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<22;i++){
            buts[i][0]=i;
            System.out.print("- Joueur N°"+(buts[i][0]+1)+": ");
            buts[i][1]=sc.nextInt();
            sum+=buts[i][1];
            if(buts[i][1]>max) {
                max=buts[i][1];
                num=i+1;
            }
            if(buts[i][1]==0)
                sansbut++;
        }
        System.out.println("\n+ Le buteur : Jouer N°"+num);
        System.out.println("+ Le nombre total des buts: "+sum);
        System.out.println("+ Le nombre des joueurs qui n'on pas marqué: "+sansbut);
    }
}
