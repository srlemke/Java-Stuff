import java.util.Random;

public class Algoritmos {
	//Só enxe de *//
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

	//--------------------------------------------------------------------------------------------
	public static char[][] recebePalavras(){
		//1 = Horizontal //2 = Vertical : !!10 letras Max ou explode a matriz na vertical!!
		char matriz[][] = Algoritmos.preencheMatriz(); //Recebo uma matriz cheia de *
		char p1[] = {'L','u','x','e','m','b','u','r','g','o'};
		char p2[] = {'P','a','q','u','i','s','t','a','o'};
		char p3[] = {'I','t','a','l','i','a'};
		char p4[] = {'B','r','a','s','i','l'};
		char p5[] = {'H','o','l','a','n','d','a'};
		char p6[] = {'J','a','p','a','o'};
		char p7[] = {'I','n','g','l','a','t','e','r','a'};
		char p8[] = {'S','u','r','i','n','a','m','e'};

		//testes de estouro e correções de matriz//
		//char p9[] = {'I','t','a','l','i','a'};
		//char p10[] = {'I','t','a','l','i','a'};
		/*char p1[] = {'L','u','x','e','m','b','u','r','g','o','L','u','x','e','m','b','u','r','g','o'};
		char p2[] = {'L','u','x','e','m','b','u','r','g','o','L','u','x','e','m','b','u','r','g','o'};
		char p3[] = {'L','u','x','e','m','b','u','r','g','o','L','u','x','e','m','b','u','r','g','o'};
		char p4[] = {'L','u','x','e','m','b','u','r','g','o','L','u','x','e','m','b','u','r','g','o'};
		char p5[] = {'L','u','x','e','m','b','u','r','g','o','L','u','x','e','m','b','u','r','g','o'};
		char p6[] = {'L','u','x','e','m','b','u','r','g','o','L','u','x','e','m','b','u','r','g','o'};
		char p7[] = {'L','u','x','e','m','b','u','r','g','o','L','u','x','e','m','b','u','r','g','o'};
		char p8[] = {'L','u','x','e','m','b','u','r','g','0','L','u','x','e','m','b','u','r','g','0'};
		char p9[] = {'L','u','x','e','m','b','u','r','g','0','L','u','x','e','m','b','u','r','g','0'};
		char p10[] = {'L','u','x','e','m','b','u','r','g','0','L','u','x','e','m','b','u','r','g','0'};
		char p11[] = {'L','u','x','e','m','b','u','r','g','0','L','u','x','e','m','b','u','r','g','0'};
		char p1[] = {'L','u','x','e','m','b','u','r','g','0'};
		char p1[] = {'L','u','x','e','m','b','u','r','g','0'};
		char p2[] = {'L','u','x','e','m','b','u','r','g','0'};
		char p3[] = {'L','u','x','e','m','b','u','r','g','0'};
		char p4[] = {'L','u','x','e','m','b','u','r','g','0'};
		char p5[] = {'L','u','x','e','m','b','u','r','g','0'};
		char p6[] = {'L','u','x','e','m','b','u','r','g','0'};
		char p7[] = {'L','u','x','e','m','b','u','r','g','0'};
		char p8[] = {'L','u','x','e','m','b','u','r','g','0'};
		char p9[] = {'L','u','x','e','m','b','u','r','g','0'};
		char p10[] = {'L','u','x','e','m','b','u','r','g','0'};
		char p11[] = {'L','u','x','e','m','b','u','r','g','0'};
		char p12[] = {'L','u','x','e','m','b','u','r','g','0'};
		char p13[] = {'L','u','x','e','m','b','u','r','g','0'};
		char p14[] = {'L','u','x','e','m','b','u','r','g','0'};
		char p15[] = {'L','u','x','e','m','b','u','r','g','0'};
		char p16[] = {'L','u','x','e','m','b','u','r','g','0'};
		char p17[] = {'L','u','x','e','m','b','u','r','g','0'};
		char p18[] = {'L','u','x','e','m','b','u','r','g','0'};
		char p19[] = {'L','u','x','e','m','b','u','r','g','0'};
		char p20[] = {'L','u','x','e','m','b','u','r','g','0'};
		char p21[] = {'L','u','x','e','m','b','u','r','g','0'};*/

		Algoritmos.inserePalavras(p1, matriz);
		Algoritmos.inserePalavras(p2, matriz);
		Algoritmos.inserePalavras(p3, matriz);
		Algoritmos.inserePalavras(p4, matriz);
		Algoritmos.inserePalavras(p5, matriz);
		Algoritmos.inserePalavras(p6, matriz);
		Algoritmos.inserePalavras(p7, matriz);
		Algoritmos.inserePalavras(p8, matriz);
		/*Algoritmos.inserePalavras(p9,  matriz);
		Algoritmos.inserePalavras(p10, matriz);
		Algoritmos.inserePalavras(p11, matriz);
		Algoritmos.inserePalavras(p12, matriz);
		Algoritmos.inserePalavras(p13, matriz);
		Algoritmos.inserePalavras(p14, matriz);
		Algoritmos.inserePalavras(p15, matriz);
		Algoritmos.inserePalavras(p16, matriz);
		Algoritmos.inserePalavras(p17, matriz);
		Algoritmos.inserePalavras(p18, matriz);
		Algoritmos.inserePalavras(p19, matriz);
		Algoritmos.inserePalavras(p20, matriz);
		Algoritmos.inserePalavras(p21, matriz);*/
		return matriz;
	}

	//--------------------------------------------------------------------------------------------
	public static boolean verificadorDeAcerto(int orientacao, int linha, int coluna, int comprimento, char matriz[][]){

		int i;
		int cont = 0;

		if(orientacao == 1){ //1 para horizontal
			for(i = coluna; i < comprimento + coluna; i++){
				if(matriz[linha][i] != '*'){
					System.out.println("Letra acertada: " + matriz[linha][i]); //teste
					matriz[linha][i] = 'X'; //teste
					cont++;
				}

				if(cont == comprimento){
					Algoritmos.mostraMatriz(matriz);
					return true;
					//System.out.println("Ganhou");//teste
				}
			}
		}else{ //Vertical
			for(i = linha; i < comprimento + linha; i++){
				if(matriz[i][coluna] != '*'){
					System.out.println("Letra acertada: " + matriz[i][coluna]); //teste
					matriz[i][coluna] = 'X'; //teste
					cont++;
				}

				if(cont == comprimento){
					Algoritmos.mostraMatriz(matriz);
					return true;
				}
			}
		}
		System.out.println();
		Algoritmos.mostraMatriz(matriz);
		return false;
	}

	//--------------------------------------------------------------------------------------------	
	public static char[] inversorDePalavras(char palavra[]){

		int len = palavra.length;
		char[] temporario = new char[len];  
		char[] resultado = new char[len];
		int i,j;

		for (i = 0; i < len; i++) {  
			temporario[i] = palavra[i];
		}  

		for (j = 0; j < len; j++) {  
			resultado[j] = temporario[len - 1 - j];  
		}  
		return resultado;
	}

	//--------------------------------------------------------------------------------------------	
	public static int []geradorDePosicaoValida(char palavra[], char matriz[][]){

		int i, j, k;
		int cont = 0;
		//1 = Horizontal //2 = Vertical
		int validPosition[] = {0, 0, 0};

		//Horizontal ou vertical:
		validPosition[2] = Principal.orientacao();
		Random randomGenerator = new Random();

		if(validPosition[2] == 1){ //Horizontal
			while(cont != palavra.length){
				i = randomGenerator.nextInt(10); //Alguma das 10 linhas
				j = randomGenerator.nextInt(21 - palavra.length); //Comprimento da linha menos tam da palavra

				validPosition[0] = i;
				validPosition[1] = j;

				for (k = 0; k < palavra.length; k++){
					if((matriz[i][j++]) == '*'){
						cont++;
					}else{
						cont = 0;
					}
				}
			}
			return validPosition;

		}else{ //Vertical
			while(cont != palavra.length){
				if(palavra.length < 10 ){
					i = randomGenerator.nextInt(11 - palavra.length);
				}else{
					i = 0;
				}

				j = randomGenerator.nextInt(20); //Alguma coluna até 20
				validPosition[0] = i;
				validPosition[1] = j;

				for (k = 0; k < palavra.length; k++){
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

	//--------------------------------------------------------------------------------------------
	public static void inserePalavras(char palavra[], char [][]matriz){

		int validPosition[] = Algoritmos.geradorDePosicaoValida(palavra, matriz); //Receberei um i, j e orientação válidos
		int i = validPosition[0];
		int j = validPosition[1];
		int k;
		//1 = Horizontal //2 = Vertical
		int orientacao =  validPosition[2];

		//Bloco de inversão//////
		if(Principal.inverte() == 1){ //Inverte?
			palavra = Algoritmos.inversorDePalavras(palavra);
		}
		///Fim do bloco de inversao///

		if(orientacao == 1){
			for(k = 0; k < palavra.length; k++){
				matriz[i][j++] = palavra[k];
			}
		}else{
			for(k = 0; k < palavra.length; k++){
				matriz[i++][j] = palavra[k];
			}
		}
	}

	//--------------------------------------------------------------------------------------------
	//Só imprime a matriz que receber -- Falta adicionar a parte de enxer de letras random aonde tem *//
	public static void mostraMatriz(char matriz[][]){
		int i,j;
		
		Random r = new Random();
		
		for(i = 0; i < 10; i++){
			for(j = 0; j < 20; j++){
				if (matriz[i][j] == '*'){
					char randomChar = (char) (97 + r.nextInt(25));
					matriz[i][j] = randomChar;
				}
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
	}
}