package Exo4;
public class Article {
    private String référence;
    private String désignation;
    private double prixHT;
    private static double tauxTVA;
    public Article() {
    }
    public Article(String référence, String désignation, double prixHT) {
        this.référence = référence;
        this.désignation = désignation;
        this.prixHT = prixHT;
    }
    public Article(String référence, String désignation, double prixHT, double tauxTVA) {
        this.référence = référence;
        this.désignation = désignation;
        this.prixHT = prixHT;
        this.tauxTVA = tauxTVA;
    }
    public Article(Article article) {
        this.référence = article.référence;
        this.désignation = article.désignation;
        this.prixHT = article.prixHT;
        this.tauxTVA = article.tauxTVA;
    }
    public String getRéférence() {
        return référence;
    }
    public void setRéférence(String référence) {
        this.référence = référence;
    }
    public String getDésignation() {
        return désignation;
    }
    public void setDésignation(String désignation) {
        this.désignation = désignation;
    }
    public double getPrixHT() {
        return prixHT;
    }
    public void setPrixHT(double prixHT) {
        this.prixHT = prixHT;
    }
    public static double getTauxTVA() {
        return tauxTVA;
    }
    public static void setTauxTVA(double tauxTVA) {
        Article.tauxTVA = tauxTVA;
    }
    public double calculerPrixTTC() {
        return prixHT + (prixHT * tauxTVA / 100);
    }
    public void afficherArticle() {
        System.out.println("Référence: " + référence);
        System.out.println("Désignation: " + désignation);
        System.out.println("Prix HT: " + prixHT);
        System.out.println("Taux TVA: " + tauxTVA);
        System.out.println("Prix TTC: " + calculerPrixTTC());
    }
    public static void main(String[] args) {
        Article.setTauxTVA(20);
        Article article1 = new Article("REF123", "Article 1", 100);
        Article article2 = new Article("REF456", "Article 2", 150, 10);
        Article article3 = new Article(article1);
        System.out.println("Article 1:");
        article1.afficherArticle();
        System.out.println("\nArticle 2:");
        article2.afficherArticle();
        System.out.println("\nArticle 3 (copie de l'article 1):");
        article3.afficherArticle();
    }
}