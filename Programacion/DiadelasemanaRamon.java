public class DiadelasemanaRamon {

    
        public static String getDay(int dia, int mes, int any){

        int ym, yp, d, ay, a = 0;
        int m[] = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        
        String nomDia[] = {"Diumenge", "Dilluns", "Dimarts", "Dimecres", "Dibous", "Viernes", "Sábado"};
        
        ym = any % 100;
        yp = ym / 4;
        ay = any / 100;
        a = 3 - (ay % 4);
        a = 2 * a;
        if ((ym % 4 == 0) && (mes == 2)){
            d = ((dia + m[mes - 1] + ym + yp + a - 1) % 7);
        }else {
            d = (dia + m[mes - 1] + ym + yp + a) % 7;
        }
        return nomDia[d];

    }

    public static void myError(String msg) {
        System.out.println("ERROR:" + msg);
        System.exit(1);
    }

    public static int myInteger

    public static boolean bonaData(int dia, int mes, int any){

        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}

        if (any <= 0) myError("Invalid year");
        if (mes < 1 || mes > 12) myError("Invalid month");
        if (mes != 2) {
            if (dia < 1 || dia > diasMes[mes -1] myError("Invalid day"));
        }
        return true;
    }

    public static void main(String[] args) {
        int dia = Integer.parseInt(args[0]);
        int mes = Integer.parseInt(args[1]);
        int any = Integer.parseInt(args[2]);
        
        if (bonaData(dia, mes, any) == true)
            System.out.println(getDay(dia, mes, any));
        
    }
    
}
