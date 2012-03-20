import java.util.Random;

public class Principal extends Console {

	public static void main(String[] args) {
		
		int acertos = 0;
		char matriz[][] = new char [10][20];
		matriz = Algoritmos.recebePalavras();
		Algoritmos.mostraMatriz(matriz);

		do{
			int orientacao = Console.readInt("Qual a orietação da palavra? 1-Horizontal 2-Vertical");
			int linha = Console.readInt("Em qual linha está a palavra?");
			int coluna = Console.readInt("Em qual coluna está a palavra?");
			int comprimento = Console.readInt("Quantas letras tem a palavra?");
			if (Algoritmos.verificadorDeAcerto(orientacao, linha, coluna, comprimento, matriz)){
				acertos++;
			}
		}while(acertos != 8); //Só termina quando acertar as 8.
		
		System.out.println("Fim");
	}
	//---------------------------------------------------------------------------------------1-----
	public static int orientacao(){
		Random randomGenerator = new Random();
		int tmp = randomGenerator.nextInt(2);
		System.out.println("Orientacao: " + tmp);
		return tmp;
	}
	//--------------------------------------------------------------------------------------------
	public static int inverte(){
		Random randomGenerator = new Random();
		int tmp = randomGenerator.nextInt(2);
		System.out.println("Inverte: " + tmp);
		return tmp;
	}
}