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
		char p1[] = {'I','t','a','l','i','a'};
		Algoritmos.inserePalavras(p1, 1);
	}
	
	public static int[] ValidPositionGenerator(char palavra[], char matriz[][]){
	
	int i = 0;
	int j = 0;
	int cont = 0;
	int validPosition[] = {0, 0};
	
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
	}

	public static int inserePalavras(char palavra[], int totalPalavras){

		char matriz[][] = Algoritmos.preencheMatriz();
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