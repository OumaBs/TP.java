package Exo5;
public class TestCompte {
    public static void main(String[] args) {
        Client client1 = new Client("XX00000", "BS", "Ahmad", "0123456789");
        Compte compte1 = new Compte(client1);
        Compte compte2 = new Compte(client1);
        compte1.créditer(500);
        compte1.débiter(200);
        compte2.créditer(1000);
        System.out.println("Résumé du compte 1: ");
        compte1.résumé();
        System.out.println("Résumé du compte 2: ");
        compte2.résumé();
        System.out.println("Nombre de comptes créés: "+Compte.nombreComptes());
    }
}