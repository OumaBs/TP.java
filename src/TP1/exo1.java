package TP1;
class Personne {
    private String cin;
    private String nom;
    private String prenom;
    private String email;
    private int age;

    public Personne(String cin, String nom, String prenom, String email, int age) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.age = age;
    }
    public void initialiser(String cin, String nom, String prenom, String email, int age) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.age = age;
    }
    public void afficherPersonne() {
        System.out.println("CIN : " + cin);
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Email : " + email);
        System.out.println("Age : " + age);
    }
}
public class exo1{
    public static void main(String[] args) {
        Personne personne1 = new Personne("123456789", "Doe", "John", "john.doe@example.com", 30);
        personne1.afficherPersonne();
    }
}
