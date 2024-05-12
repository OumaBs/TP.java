package Exo3;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Employé {
    private int matricule;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private Date dateEmbauche;
    private double salaire;
    public Employé(int matricule, String nom, String prenom, Date dateNaissance, Date dateEmbauche, double salaire) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.dateEmbauche = dateEmbauche;
        this.salaire = salaire;
    }
    public int getMatricule() {
        return matricule;
    }
    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public Date getDateNaissance() {
        return dateNaissance;
    }
    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
    public Date getDateEmbauche() {
        return dateEmbauche;
    }
    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }
    public double getSalaire() {
        return salaire;
    }
    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
    public int age() {
        Date now = new Date();
        long diffInMillis = now.getTime() - dateNaissance.getTime();
        long ageInMillis = diffInMillis / (1000L * 60 * 60 * 24 * 365);
        return (int) ageInMillis;
    }
    public int anciennete() {
        Date now = new Date();
        long diffInMillis = now.getTime() - dateEmbauche.getTime();
        long ancienneteInMillis = diffInMillis / (1000L * 60 * 60 * 24 * 365);
        return (int) ancienneteInMillis;
    }
    public void augmentationDuSalaire() {
        int anciennete = anciennete();
        if (anciennete < 5) {
            salaire *= 1.02;
        } else if (anciennete < 10) {
            salaire *= 1.05;
        } else {
            salaire *= 1.10;
        }
    }
    public void afficherEmploye() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("- Matricule: " + matricule);
        System.out.println("- Nom complet: " + nom + " " + prenom);
        System.out.println("- Date de naissance: " + dateFormat.format(dateNaissance));
        System.out.println("- Date d'embauche: " + dateFormat.format(dateEmbauche));
        System.out.println("- Salaire: " + salaire);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le matricule: ");
        int matricule = scanner.nextInt();
        System.out.print("Entrez le nom: ");
        String nom = scanner.next();
        System.out.print("Entrez le prénom: ");
        String prenom = scanner.next();
        System.out.print("Entrez la date de naissance (jj/mm/aaaa): ");
        String dateNaissanceStr = scanner.next();
        Date dateNaissance = null;
        try {
            dateNaissance = new SimpleDateFormat("dd/MM/yyyy").parse(dateNaissanceStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.print("Entrez la date d'embauche (jj/mm/aaaa): ");
        String dateEmbaucheStr = scanner.next();
        Date dateEmbauche = null;
        try {
            dateEmbauche = new SimpleDateFormat("dd/MM/yyyy").parse(dateEmbaucheStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.print("Entrez le salaire: ");
        double salaire = scanner.nextDouble();
        Employé employe = new Employé(matricule, nom, prenom, dateNaissance, dateEmbauche, salaire);
        employe.afficherEmploye();
        employe.augmentationDuSalaire();
        System.out.print("- Salaire après augmentation: " + employe.getSalaire());
        System.out.print("\n");
        scanner.close();
    }
}
