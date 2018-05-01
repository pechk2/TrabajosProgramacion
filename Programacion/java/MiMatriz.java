public class MiMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] miMatriz = new int[4][4];
		int c = 0;
		int d = 0;
		for(int i = 0; i <= 3; i++){
			d += 1;
			System.out.print(d);
			for (int j = 0; j < 4; j++) {
				c += 2;
			miMatriz[i][j] = c;
			if (c < 10) {
				System.out.print("  " + miMatriz[i][j] + " ");
				
			}else {
				System.out.print(" " + miMatriz[i][j] + " ");
				
			}
			
			
			
			
			
		
			
}System.out.println();
}

	}
}


