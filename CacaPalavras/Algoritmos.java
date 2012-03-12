import java.util.Random;

public class Algoritmos {

	public static char [][] preencheMatriz(){

		char matriz[][] = new char [10][20];
		int i,j;
		for(i=0; i<10; i++){
			for(j=0; j<20; j++){
				matriz[i][j] = '*';
			}
		}

		return matriz;
	}

	public static void palavras(){
		char matriz[][] = Algoritmos.preencheMatriz();
		char p1[] = {'I','t','a','l','i','a'};
		char p2[] = {'B','r','a','s','i','l'};
		char p3[] = {'H','o','l','a','n','d','a'};
		Algoritmos.inserePalavras(p1, 1, matriz);
		Algoritmos.inserePalavras(p2, 2, matriz);
		Algoritmos.inserePalavras(p3, 2, matriz);
	}
	
	public static int[] ValidPositionGenerator(char palavra[], char matriz[][]){
	
	int i = 0;
	int j = 0;
	int cont = 0;
	int validPosition[] = {0, 0};
	int alignment = 1; // <- Teste
	
	if(alignment == 1){ //If he wants a 1-horizontal alignment
		while(cont != palavra.length){
			Random randomGenerator = new Random();
			j = randomGenerator.nextInt(20 - palavra.length);
			i = randomGenerator.nextInt(10);
		
			validPosition[0] = i;
			validPosition[1] = j;

				for (int k = 0; k < palavra.length; k++){
					if((matriz[i][j++]) == '*'){
						cont++;
					}else{
						cont = 0;
					}
				}
		}
		return validPosition;
		
	}else{ //If he wants a 2-vertical alignment
		while(cont != palavra.length){
			Random randomGenerator = new Random();
			j = randomGenerator.nextInt(20 - palavra.length);
			i = randomGenerator.nextInt(10);
			validPosition[0] = i;
			validPosition[1] = j;

				for (int k = 0; k < palavra.length; k++){
					if((matriz[i++][j]) == '*'){
						cont++;
					}else{
						cont = 0;
					}
				}
			}
			return validPosition;
		}
}

	public static int inserePalavras(char palavra[], int totalPalavras, char [][]matriz){
		
		int validPosition[] = ValidPositionGenerator(palavra, matriz);
		
		
		int i = validPosition[0];
		int j = validPosition[1];

			for(int k = 0; k < palavra.length; k++){
					matriz[i][j++] = palavra[k];
					if (k == palavra.length){
						break;
						};
					}
			
		Algoritmos.mostraMatriz(matriz);
		System.out.println();
		System.out.println();
		System.out.println();
		return 0;	
	}

	
	public static void mostraMatriz(char matriz[][]){

		for(int i=0; i<10; i++){
			for(int j=0; j<20; j++){
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
	}
}