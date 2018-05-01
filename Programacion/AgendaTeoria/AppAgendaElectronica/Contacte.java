public class Contacte {

    //  Propietats
    private String nom;
    private String telefon;
    private String correu;

    //  Constructors
    public Contacte(String nom, String telefon, String correu) {
        this.nom = nom;
        this.telefon = telefon;
        this.correu = correu;
    }

    //  Metodes
    public void imprimirContacte() {
        System.out.println("Nom: " + this.nom);
        System.out.println("Telèfon: " + this.telefon);
        System.out.println("Correu: " + this.correu);
    }

    public String getNom() {
        return nom;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getCorreu() {
        return correu;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void setCorreu(String correu) {
        this.correu = correu;
    }
    
}