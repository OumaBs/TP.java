package TP1;
import java.util.Scanner;
public class exo6 {
    public static void main(String[] args) {
        System.out.printf("Veuillez entrer deux nombres a et b: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        sc.close();
        if (a == 0) {
            if (b == 0)
                System.out.println("L'équation est indéterminée: elle admet une infinité de solutions.");
            else
                System.out.println("L'équation est impossible: elle n'a pas de solution.");
        }
        else{
            double x=-b/a;
            System.out.println("L'équation a une solution unique: x= " +x);
        }
    }
}
