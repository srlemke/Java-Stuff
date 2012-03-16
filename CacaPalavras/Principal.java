import java.util.Random;

public class Principal extends Console {
	
	public static void main(String[] args) {
		char lala[] = {'T','e','s','t','e'};
		System.out.println("teste tem: " + lala.length + " letras");
		Algoritmos.recebePalavras();
	}

	//--------------------------------------------------------------------------------------------
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