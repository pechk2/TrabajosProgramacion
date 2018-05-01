public class Reinas {
	final static int REINAS = 256;
	static int[] x = new int[REINAS];
	static boolean[] a = new boolean[REINAS];
	static boolean[] b = new boolean[2 * REINAS - 1];
	static boolean[] c = new boolean[2 * REINAS - 1];
	static int reinas;

	static void ensayar(int i) {
		int j, k;

		for (j = 0; j < reinas; j++) {
			if (a[j] && b[i + j] && c[i - j + reinas - 1]) {
				x[i] = j;
				a[j] = b[i + j] = c[i - j + reinas - 1] = false;
				if (i < reinas - 1) {
					ensayar(i + 1);
				} else {
					for (k = 0; k < reinas; k++) {
						System.out.format("%4d", x[k]);
					}
					System.out.println();
				}
				a[j] = b[i + j] = c[i - j + reinas - 1] = true;
			}
		}
	}

	public static void main(String[] args) {
		int i;
		reinas = Integer.parseInt(args[0]);

        for (i = 0; i < reinas; i++) {
        	a[i] = true;
        }
        for (i = 0; i < (reinas << 1) - 1 ; i++ ) {
        	b[i] = c[i] = true;
        }
        ensayar(0);

/*
		if (args.length > 1) {
			System.out.println("USO: java Reinas <num>");
			System.exit();
		}

		reinas = 8;
		if (args.length == 1) {
			reinas = int.parseint(args[0]);
		}
*/
	}
}