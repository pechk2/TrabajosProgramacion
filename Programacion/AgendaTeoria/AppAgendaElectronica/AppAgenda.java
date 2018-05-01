public class AppAgenda {

    public static void main(String[] args) {

        char opcio;
        Llibreta llibreta = new Llibreta();
        imprimirMenu();
        while ((opcio = Lector.llegirChar()) != 's') {
            switch (opcio) {
                case 'a':   //  Afegir contacte
                    llibreta.afegirContacte();
                    break;
                case 'l':   //  Llistar contactes
                    llibreta.llistarContactes();
                    break;
                case 'c':   //  Cercar contacte
                    Contacte contacte = llibreta.cercarContacte();
                    if (contacte == null) System.out.println("\n\nContacte no trobat");
                    else { System.out.println("\n");contacte.imprimirContacte(); }
                    break;
                case 's':   //  Sortir
                    break;
                default:
                    System.out.println("Opció inválida.");
                    break;
            }
            imprimirMenu();
        }

    }

    private static void imprimirMenu() {
        System.out.println("\n\n¿Que vols fer?");
        System.out.println("(a) Afegir contacte");
        System.out.println("(l) Llistar contactes");
        System.out.println("(c) Cercar contacte");
        System.out.println("(s) Sortir");
    }

}