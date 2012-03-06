import java.util.Random;

public class Algoritmos {
	

	public static void preenche_tela(){
		char matriz[][] = new char [10][20];
		char p1[] = {'I','t','a','l','i','a'};
		int i,j,h;
		int tot = 6;

		for(i=0; i<10; i++){
			for(j=0; j<20; j++){
				matriz[i][j] = '*';
			}
		}
		
		i = 0;
		tot = 6;
		
		Random randomGenerator = new Random();
	    j = randomGenerator.nextInt(20);
	    i = randomGenerator.nextInt(10);
		
		if (tot > 0){ //Palavras já adicionadas
			if(matriz[i][j] == '*'){
				if(j <= 14 ){
					for(h = 0; h < 6; h++)
						matriz[i][h] = p1[h];
				}

			}
		}
		for(i=0; i<10; i++){
			for(j=0; j<20; j++){
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
	}
}