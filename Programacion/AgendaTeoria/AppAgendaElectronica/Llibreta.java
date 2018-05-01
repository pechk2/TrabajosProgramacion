public class Llibreta {

    //  Constants
    private final int MAX_CONTACTES = 20;

    //  Propietats
    private int numContactes;
    private Contacte[] contactes;

    //  Constructors
    public Llibreta() { //  Inicialitzam les propietats
        this.numContactes = 0;
        this.contactes = new Contacte[MAX_CONTACTES];
    }

    // Mètodes
    public void afegirContacte() {
        if (this.numContactes == MAX_CONTACTES) {
            System.out.println("\n\nLlibreta plena");
        } else {
            for (int i = 0; i < this.contactes.length; i++) {
                // Quan trobem un lloc on posar el contacte
                if (this.contactes[i] == null) {
                    // Demanam les dades les dades
                    System.out.println("\n\nIntrodueix el nom del contacte:");
                    String nom = Lector.llegirString();
                    System.out.println("Introdueix el telèfon del contacte:");
                    String telefon = Lector.llegirString();
                    System.out.println("Introdueix el correu del contacte:");
                    String correu = Lector.llegirString();

                    // Cream l'instancia del contacte
                    Contacte contacte = new Contacte(nom, telefon, correu);

                    //  Afegir l'instancia
                    this.contactes[i] = contacte;
                    this.numContactes++;
                    System.out.println("\n\nAfegit");
                    break;
                }
            }
        }
    }

    public void llistarContactes() {
        if (this.numContactes == 0) {
            System.out.println("\nLa llista es buida\n");
        } else {
            System.out.println("");
            for (int i = 0; i < this.contactes.length; i++) {
                if (this.contactes[i] != null) {
                    System.out.println("**********************************************");
                    this.contactes[i].imprimirContacte();
                    System.out.println("**********************************************");
                }
            }
            System.out.println("");
        }
    }

    public Contacte cercarContacte() {
        System.out.println("Introdueix el nom del contacte que vols cercar:");
        String nom = Lector.llegirString();
        for (int i = 0; i < this.contactes.length; i++) {
            if (this.contactes[i] != null && this.contactes[i].getNom().equals(nom)) {
                return this.contactes[i];
            }
        }
        return null;
    }

}