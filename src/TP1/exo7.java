package TP1;
import java.util.Scanner;
public class exo7 {
    public static void main(String[] args) {
        System.out.print("Entrez la valeur de a,b et c: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.close();
        double dis = Math.pow(b, 2) - 4 * a * c;
        if (a == 0)
            System.out.println("Ce n'est pas une équation du second degré.");
        else if (dis > 0) {
            double racine = Math.sqrt(dis);
            double sol1 = (-b + racine) / (2 * a);
            double sol2 = (-b - racine) / (2 * a);
            System.out.println("L'équation a deux solutions réelles distinctes: x1= " + sol1 + "et x2= " + sol2);
        } else if (dis == 0) {
            double sol = -b / (2 * a);
            System.out.println("L'équation a une solution réelle double : x= " + sol);
        } else
            System.out.println("L'équation n'a pas de solution réelle.");
    }
}
