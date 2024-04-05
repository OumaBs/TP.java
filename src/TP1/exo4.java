package TP1;
import java.util.Scanner;
class Livre{
    private String titre;
    private String auteur;
    private int nbPages;
    private double prix;
    private boolean prixFixe;
    public Livre(String titre,String auteur,int nbPages) {
        this.titre=titre;
        this.auteur=auteur;
        this.nbPages=nbPages;
        this.prix=-1;
        this.prixFixe=false;
    }
    public Livre(String titre, String auteur, int nbPages, double prix) {
        this(titre, auteur, nbPages);
        this.setPrix(prix);
    }
    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre=titre;
    }
    public String getAuteur(){
        return auteur;
    }
    public void setAuteur(String auteur){
        this.auteur=auteur;
    }
    public int getNbPages(){
        return nbPages;
    }
    public void setNbPages(int nbPages){
        this.nbPages=nbPages;
    }
    public double getPrix(){
        return prix;
    }
    public void setPrix(double prix){
        if (!prixFixe){
            if (prix>=0){
                this.prix=prix;
                this.prixFixe=true;
            }
            else{
                System.out.println("Erreur: Le prix ne peut pas être négatif.");
            }
        }
        else{
            System.out.println("Erreur: Le prix a déjà été fixé et ne peut pas être modifié.");
        }
    }
    public boolean prixFixe(){
        return prixFixe;
    }
    public String toString(){
        if (prixFixe) {
            return "Titre: "+titre+",Auteur: "+auteur+",Nombre de pages: "+nbPages+",Prix: "+(prix == -1 ? "Prix pas encore donné":prix);
        }
        else{
            return "Titre: "+titre+",Auteur: "+auteur+",Nombre de pages: "+nbPages+",Prix: Prix pas encore donné";
        }
    }
    public int compare(Livre autreLivre) {
        if (this.nbPages==autreLivre.nbPages) {
            return 0;
        }
        else if (this.nbPages>autreLivre.nbPages) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
class Etagere {
    private final Livre[] livres;
    private final int capacite;
    private int nombreLivres;
    public Etagere(int capacite){
        this.capacite=capacite;
        this.livres=new Livre[capacite];
        this.nombreLivres=0;
    }
    public int getCapacite(){
        return capacite;
    }
    public int getNombreLivres(){
        return nombreLivres;
    }
    public void ajouter(Livre livre) {
        if (nombreLivres<capacite) {
            livres[nombreLivres++]=livre;
            System.out.println("Livre ajouté avec succès !");
        }
        else {
            System.out.println("L'étagère est pleine: Impossible d'ajouter un nouveau livre.");
        }
    }
    public Livre getLivre(int position){
        if (position>0 && position<=nombreLivres) {
            return livres[position-1];
        }
        else {
            System.out.println("Position invalide.");
            return null;
        }
    }
    public int chercherLivre(String titre, String auteur) {
        for (int i=0;i<nombreLivres;i++) {
            if (livres[i].getTitre().equals(titre) && livres[i].getAuteur().equals(auteur)) {
                return i + 1;
            }
        }
        return 0;
    }
    public void supprimerLivre(int position){
        if (position>0 && position<=nombreLivres) {
            for (int i = position - 1; i < nombreLivres - 1; i++) {
                livres[i] = livres[i + 1];
            }
            livres[nombreLivres - 1] = null;
            nombreLivres--;
            System.out.println("Livre supprimé avec succès!");
        } else{
            System.out.println("Position invalide.");
        }
    }
}
public class exo4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Etagere etagere=new Etagere(5);
        int choix;
        do {
            System.out.println("Menu:");
            System.out.println("1. Ajouter un livre");
            System.out.println("2. Affichage des livres présentées dans l'étagère");
            System.out.println("3. Comparer deux livres sur leur nombre de pages");
            System.out.println("4. Chercher un livre");
            System.out.println("5. Récupérer un livre");
            System.out.println("6. Supprimer un livre");
            System.out.println("0. Quitter");
            System.out.print("Votre choix: ");
            choix=sc.nextInt();
            sc.nextLine();
            switch (choix){
                case 1:
                    System.out.println("Ajout de livres à l'étagère: ");
                    System.out.println("Livres sur l'étagère: ");
                    System.out.print("Veuillez entrer le nombre de livre(s) à enregistrer(max 5): ");
                    int n=sc.nextInt();
                    sc.nextLine();
                    for (int i=0;i<n;i++){
                        System.out.print("Entrez le titre du livre: ");//On suppose que l'utilisateur saisit un titre correct
                        String titre = sc.nextLine();
                        System.out.print("Entrez l'auteur du livre: ");
                        String auteur = sc.nextLine();
                        System.out.print("Entrez le nombre de pages du livre: ");
                        int nbPages = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Entrez le prix du livre (-1 si non défini): ");
                        double prix=sc.nextDouble();
                        sc.nextLine();
                        Livre livre;
                        if (prix == -1){
                            livre = new Livre(titre, auteur, nbPages);
                        }
                        else{
                            livre = new Livre(titre, auteur, nbPages, prix);
                        }
                        etagere.ajouter(livre);
                    }
                    break;
                case 2:
                    for (int i=0;i<etagere.getNombreLivres();i++) {
                        System.out.println("-Livre "+(i+1)+": ");
                        System.out.println(etagere.getLivre(i + 1));
                    }
                    break;
                case 3:
                    System.out.print("Entrez la position du premier livre à comparer: ");
                    int positionLivre1=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Entrez la position du deuxième livre à comparer: ");
                    int positionLivre2=sc.nextInt();
                    sc.nextLine();
                    Livre livre1=etagere.getLivre(positionLivre1);
                    Livre livre2=etagere.getLivre(positionLivre2);
                    if (livre1 != null && livre2 != null) {
                        int Comparaison=livre1.compare(livre2);
                        if (Comparaison == 0) {
                            System.out.println("Les deux livres ont le même nombre de pages.");
                        }
                        else if(Comparaison > 0){
                            System.out.println("Le livre "+positionLivre1+" a plus de pages que le livre " + positionLivre2 + ".");
                        }
                        else {
                            System.out.println("Le livre "+positionLivre1+" a moins de pages que le livre " + positionLivre2 + ".");
                        }
                    }
                    else {
                        System.out.println("Position invalide : l'un des livres n'existe pas dans l'étagère.");
                    }
                    break;
                case 4:
                    System.out.print("Entrez le titre du livre que vous recherchez: ");
                    String titreRecherche=sc.nextLine();
                    System.out.print("Entrez l'auteur du livre que vous recherchez: ");
                    String auteurRecherche=sc.nextLine();
                    Livre livreTemp = new Livre("", "", 0);
                    livreTemp.setTitre(titreRecherche);
                    livreTemp.setAuteur(auteurRecherche);
                    int positionLivre = etagere.chercherLivre(livreTemp.getTitre(), livreTemp.getAuteur());
                    if (positionLivre != 0) {
                        System.out.println("Le livre \"" + titreRecherche + "\" de l'auteur \"" + auteurRecherche + "\" se trouve à la position : " + positionLivre);
                    } else {
                        System.out.println("Le livre \"" + titreRecherche + "\" de l'auteur \"" + auteurRecherche + "\" n'a pas été trouvé sur l'étagère.");
                    }
                    break;
                case 5:
                    System.out.print("Entrez la position du livre que vous souhaitez récupérer : ");
                    int position=sc.nextInt();
                    sc.nextLine();
                    Livre livreRecupere=etagere.getLivre(position);
                    if (livreRecupere != null) {
                        System.out.println("Informations sur le livre récupéré :");
                        System.out.println("-Titre: " +livreRecupere.getTitre());
                        System.out.println("-Auteur: " +livreRecupere.getAuteur());
                        System.out.println("-Nombre de pages: "+livreRecupere.getNbPages());
                        System.out.println("-Prix: "+(livreRecupere.getPrix() == -1 ? "Prix pas encore donné" : livreRecupere.getPrix()));
                    }
                    else {
                        System.out.println("Aucun livre trouvé à la position spécifiée.");
                    }
                    break;
                case 6:
                    System.out.println("Entrez la position du livre à supprimer: ");
                    int positionSuppression=sc.nextInt();
                    etagere.supprimerLivre(positionSuppression);
                    System.out.println("Livres sur l'étagère après suppression: ");
                    for (int i=0;i<etagere.getNombreLivres();i++) {
                        System.out.println(etagere.getLivre(i + 1));
                    }
                    break;
                case 0:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez choisir à nouveau.");
            }
        } while (choix != 0);
        sc.close();
    }
}