public class Fecha {

    public static String getDay(int dia, int mes, int any) {
        
    int ym, yp, d, ay, a = 0;
    int by = 20;
    /*int y[] = new int[]{6, 4, 2, 0};*/
    int m[] = new int[]{0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
    
    String nomDia[] = {"Diumenge", "Dilluns", "Dimarts", "Dimecres", "Dijous", "Divendres", "Disabte"};
    
    ym = any % 100;
    yp = ym / 4;
    ay = any / 100;
    a = 3 - (ay % 4);
    a = 2 * a;
    if ((ym % 4 == 0) && (mes == 2)) {
        d = (dia + m[mes - 1] + ym + yp + a - 1) % 7;
    } else {
        d = (dia + m[mes - 1] + ym + yp + a) % 7;
    }
    return nomDia[d];
}
public static void main(String[] args) {

    int dia = Integer.parseInt(args[0]);
    int mes = Integer.parseInt(args[1]);
    int any = Integer.parseInt(args[2]);
    
    System.out.println(getDay(dia, mes, any));
    
    
      }
    
}