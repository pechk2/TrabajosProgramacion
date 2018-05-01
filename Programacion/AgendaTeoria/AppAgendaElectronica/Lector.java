import java.util.Scanner;

public class Lector {

    public static Scanner sc = new Scanner(System.in);

    public static int llegirEnter() {
        return sc.nextInt();
    }

    public static char llegirChar() {
        return sc.nextLine().charAt(0);
    }

    public static String llegirString() {
        return sc.nextLine();
    }
    
}