package TP1;
public class exo1{
    private String CIN;
    private String nom;
    private String prenom;
    private String email;
    private int age;
    public exo1(String CIN,String nom,String prenom,String email,int age) {
        this.CIN = CIN;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.age = age;
    }
    public void initialiser(String CIN, String nom, String prenom, String email, int age) {
        this.CIN = CIN;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.age = age;
    }
    public void afficherPersonne() {
        System.out.println("CIN: " + CIN);
        System.out.println("Nom: " + nom);
        System.out.println("Prénom: " + prenom);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        exo1 personne1 = new exo1("XX12345","Ahmad","BS","BS.Ahmad@example.com",20);
        personne1.afficherPersonne();
    }
}
