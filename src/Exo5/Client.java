package Exo5;
public class Client {
    private String CIN;
    private String nom;
    private String prénom;
    private String téléphone;
    public Client(String CIN, String nom, String prénom, String téléphone) {
        this.CIN = CIN;
        this.nom = nom;
        this.prénom = prénom;
        this.téléphone = téléphone;
    }
    public String getCIN() {
        return CIN;
    }
    public void setCIN(String CIN) {
        this.CIN = CIN;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrénom() {
        return prénom;
    }
    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }
    public String getTéléphone() {
        return téléphone;
    }
    public void setTéléphone(String téléphone) {
        this.téléphone = téléphone;
    }
    public void afficher() {
        System.out.println("CIN: "+CIN);
        System.out.println("Nom: "+nom);
        System.out.println("Prénom: "+prénom);
        System.out.println("Téléphone: "+téléphone);
    }
}