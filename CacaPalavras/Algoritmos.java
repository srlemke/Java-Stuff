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

//--------------------------------------------------------------------------------------------
	public static void recebePalavras(){
		//1 = Horizontal //2 = Vertical : !!10 letras Max!!
		
		char matriz[][] = Algoritmos.preencheMatriz(); //Enche de *
		
		for (int i = 0; i < 6; i++){
			
		}
		
		char p1[] = {'L','u','x','e','m','b','u','r','g','0'};
		//char p2[] = {'P','a','q','u','i','s','t','a','o'};
		//char p3[] = {'H','o','l','a','n','d','a'};
		//char p4[] = {'I','t','a','l','i','a'};
		//char p5[] = {'B','r','a','s','i','l'};
		//char p6[] = {'G','r','e','c','i','a'};
		//char p7[] = {'I','t','a','l','i','a'};
		//char p8[] = {'I','t','a','l','i','a'};
		//char p9[] = {'I','t','a','l','i','a'};
		//char p10[] = {'I','t','a','l','i','a'};
		
		//Palavra, contador de palavras e matriz//
		System.out.println(Algoritmos.inversorDePalavras(p1));
		
		Algoritmos.inserePalavras(p1, 1, matriz);
		/*Algoritmos.inserePalavras(p2, 2, matriz);
		Algoritmos.inserePalavras(p3, 3, matriz);
		Algoritmos.inserePalavras(p4, 4, matriz);
		Algoritmos.inserePalavras(p5, 5, matriz);
		Algoritmos.inserePalavras(p6, 6, matriz);
		Algoritmos.inserePalavras(p7, 6, matriz);
		Algoritmos.inserePalavras(p8, 6, matriz);
		Algoritmos.inserePalavras(p9, 6, matriz);
		Algoritmos.inserePalavras(p10, 6, matriz);*/
		
		Algoritmos.mostraMatriz(matriz);
	}

//--------------------------------------------------------------------------------------------	
	public static char[] inversorDePalavras(char []palavra){ //Esta bosta nao funciona, ver depois.
		
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
	public static int[] ValidPositionGenerator(char palavra[], char matriz[][]){
	
	int i = 0;
	int j = 0;
	int cont = 0;
	//1 = Horizontal //2 = Vertical
	int validPosition[] = {0, 0, 2}; // A posicao 2 é o tipo de alinhamento e deverá ser perguntado
	
	//Horizontal ou vertical
	validPosition[2] = Principal.orientacao();
	
	//Palavra invertida ou nao: 1 - Inverte
	if(Principal.inverte() == 1){
		palavra = Algoritmos.inversorDePalavras(palavra);
		System.out.println(Algoritmos.inversorDePalavras(palavra));
	}
	
	if(validPosition[2] == 1){ //If he wants a 1-horizontal alignment
		while(cont != palavra.length){
			Random randomGenerator = new Random();
			
			i = randomGenerator.nextInt(10); //Alguma das 10 linhas
			j = randomGenerator.nextInt(21 - palavra.length);
			
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
			
			i = randomGenerator.nextInt(11 - palavra.length); //Altura
			
			//Random com 0 parece não funcionar.
			if(palavra.length == 10){
				i = 0; //Linha zero, já que a palavra vai preencher uma linha vertical inteira//
			}
			///////////////
			
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
	public static char inserePalavras(char palavra[], int totalPalavras, char [][]matriz){
		
		int validPosition[] = ValidPositionGenerator(palavra, matriz);
		
		int i = validPosition[0];
		int j = validPosition[1];
		//1 = Horizontal //2 = Vertical
		int orientacao =  validPosition[2];

		if(orientacao == 1){
			for(int k = 0; k < palavra.length; k++){
					matriz[i][j++] = palavra[k];
					if (k == palavra.length){
						break;
						};
					}
		}else{
				if(orientacao == 2){
					for(int k = 0; k < palavra.length; k++){
						matriz[i++][j] = palavra[k];
							if (k == palavra.length){
								break;
							};
					}
				}
		}
			
		//Depois de inserir uma palavra imprimos Roger
		//Algoritmos.mostraMatriz(matriz); 
		System.out.println("Roger that, cap!");
		System.out.println();
		
		return 0;
	}

//--------------------------------------------------------------------------------------------
	//Só imprime a matriz que receber
	public static void mostraMatriz(char matriz[][]){
		
		
System.out.println("Eis a bosta preenchida, ainda sem o lixo:");
		for(int i=0; i<10; i++){
			for(int j=0; j<20; j++){
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
	}
}
