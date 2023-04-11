public class Cryptomonnaie{
    private String nom;
    private double valeurDeJeton; // Imaginons en euros

    public Cryptomonnaie(String nom, double valeurDeJeton){
        this.nom = nom;
        this.valeurDeJeton = valeurDeJeton;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getValeurDeJeton() {
        return valeurDeJeton;
    }

    public void setValeurDeJeton(double valeurDeJeton) {
        this.valeurDeJeton = valeurDeJeton;
    }
}