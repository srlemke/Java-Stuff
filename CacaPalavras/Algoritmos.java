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
	public static void recebePalavras(){
		//1 = Horizontal //2 = Vertical : !!10 letras Max!!

		char matriz[][] = Algoritmos.preencheMatriz(); //Recebo uma matriz cheia de *
		//Um monte de testes
		char p1[] = {'L','u','x','e','m','b','u','r','g','o'};
		char p2[] = {'P','a','q','u','i','s','t','a','o'};
		char p3[] = {'I','t','a','l','i','a'};
		char p4[] = {'B','r','a','s','i','l'};
		char p5[] = {'H','o','l','a','n','d','a'};
		char p6[] = {'G','r','e','c','i','a'};
		char p7[] = {'I','t','a','l','i','a'};
		char p8[] = {'I','t','a','l','i','a'};
		/*char p9[] = {'I','t','a','l','i','a'};
		char p10[] = {'I','t','a','l','i','a'};
		char p1[] = {'L','u','x','e','m','b','u','r','g','0','L','u','x','e','m','b','u','r','g','0'};
		char p2[] = {'L','u','x','e','m','b','u','r','g','0','L','u','x','e','m','b','u','r','g','0'};
		char p3[] = {'L','u','x','e','m','b','u','r','g','0','L','u','x','e','m','b','u','r','g','0'};
		char p4[] = {'L','u','x','e','m','b','u','r','g','0','L','u','x','e','m','b','u','r','g','0'};
		char p5[] = {'L','u','x','e','m','b','u','r','g','0','L','u','x','e','m','b','u','r','g','0'};
		char p6[] = {'L','u','x','e','m','b','u','r','g','0','L','u','x','e','m','b','u','r','g','0'};
		char p7[] = {'L','u','x','e','m','b','u','r','g','0','L','u','x','e','m','b','u','r','g','0'};
		char p8[] = {'L','u','x','e','m','b','u','r','g','0','L','u','x','e','m','b','u','r','g','0'};
		char p9[] = {'L','u','x','e','m','b','u','r','g','0','L','u','x','e','m','b','u','r','g','0'};
		char p10[] = {'L','u','x','e','m','b','u','r','g','0','L','u','x','e','m','b','u','r','g','0'};
		char p10[] = {'L','u','x','e','m','b','u','r','g','0','L','u','x','e','m','b','u','r','g','0','a'};
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

		//Palavra, contador de palavras e matriz//
		Algoritmos.inserePalavras(p1, matriz);
		Algoritmos.inserePalavras(p2, matriz);
		Algoritmos.inserePalavras(p3, matriz);
		Algoritmos.inserePalavras(p4, matriz);
		Algoritmos.inserePalavras(p5, matriz);
		Algoritmos.inserePalavras(p6, matriz);
		Algoritmos.inserePalavras(p7, matriz);
		Algoritmos.inserePalavras(p8, matriz);
		/*Algoritmos.inserePalavras(p9, 9, matriz);
		Algoritmos.inserePalavras(p10, 10, matriz);
		Algoritmos.inserePalavras(p11, 11, matriz);
		Algoritmos.inserePalavras(p12, 12, matriz);
		Algoritmos.inserePalavras(p13, 13, matriz);
		Algoritmos.inserePalavras(p14, 14, matriz);
		Algoritmos.inserePalavras(p15, 15, matriz);
		Algoritmos.inserePalavras(p16, 16, matriz);
		Algoritmos.inserePalavras(p17, 17, matriz);
		Algoritmos.inserePalavras(p18, 18, matriz);
		Algoritmos.inserePalavras(p19, 19, matriz);
		Algoritmos.inserePalavras(p20, 20, matriz);
		Algoritmos.inserePalavras(p21, 21, matriz);*/
		Algoritmos.mostraMatriz(matriz);
	}

	//--------------------------------------------------------------------------------------------	
	public static char[] inversorDePalavras(char []palavra){ //Não funcionando direito

		int len = palavra.length;
		char[] temporario = new char[len];  
		char[] resultado = new char[len];  

		for (int i = 0; i < len; i++) {  
			temporario[i] = palavra[i];
		}  

		for (int j = 0; j < len; j++) {  
			resultado[j] = temporario[len - 1 - j];  
		}  
		return resultado;
	}

	//--------------------------------------------------------------------------------------------	
	public static int []geradorDePosicaoValida(char palavra[], char matriz[][]){

		int i = 0;
		int j = 0;
		int cont = 0;
		//1 = Horizontal //2 = Vertical
		int validPosition[] = {0, 0, 0};

		//Horizontal ou vertical:
		validPosition[2] = Principal.orientacao();

		if(validPosition[2] == 1){ //Horizontal
			Random randomGenerator = new Random();
			
			while(cont != palavra.length){

				i = randomGenerator.nextInt(10); //Alguma das 10 linhas
				j = randomGenerator.nextInt(20 - palavra.length); //Comprimento da linha menos tam da palavra

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
		
		}else{ //Vertical
			Random randomGenerator = new Random();
			
			while(cont != palavra.length){
				i = randomGenerator.nextInt(11 - palavra.length); //Altura ps. Tive que colocar palavra +1 
				//porque senão o random dava pau ao ter que gerar um random de 0 (10 - tamanho da palavra). Mesmo caso acima.
				j = randomGenerator.nextInt(20); //Alguma coluna até 20

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

	//--------------------------------------------------------------------------------------------
	public static char inserePalavras(char palavra[], char [][]matriz){

		int validPosition[] = Algoritmos.geradorDePosicaoValida(palavra, matriz); //Receberei um i, j e orientação válidos
		int i = validPosition[0];
		int j = validPosition[1];
		//1 = Horizontal //2 = Vertical
		int orientacao =  validPosition[2];

		//Bloco de inversão//////
		if(Principal.inverte() == 1){ //Inverte?
			palavra = Algoritmos.inversorDePalavras(palavra);
		}
		///Fim do bloco de inversao///

		if(orientacao == 1){
			for(int k = 0; k < palavra.length; k++){
				matriz[i][j++] = palavra[k];
				if (k == palavra.length){
					//break;
					return 0;
				}
			}
		}else{
				for(int k = 0; k < palavra.length; k++){
					matriz[i++][j] = palavra[k];
					if (k == palavra.length){
						//break;
						return 0;
					}
				}
		}
		return 0;
	}

	//--------------------------------------------------------------------------------------------
	//Só imprime a matriz que receber
	public static void mostraMatriz(char matriz[][]){
		System.out.println("Tabuleiro preenchido, ainda sem caracteres aleatórios:");
		System.out.println();
		for(int i=0; i<10; i++){
			for(int j=0; j<20; j++){
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
	}
}