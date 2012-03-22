import java.util.Random;

public class Principal extends Console {

	public static void main(String[] args) {
		Algoritmos.recebePalavras();
	}
	//---------------------------------------------------------------------------------------1-----
	public static int orientacao(){
		Random randomGenerator = new Random();
		int tmp = randomGenerator.nextInt(2);
		//System.out.println("Orientacao: " + tmp);//TESTE
		return tmp;
	}
	//--------------------------------------------------------------------------------------------
	public static int inverte(){
		Random randomGenerator = new Random();
		int tmp = randomGenerator.nextInt(2);
		//System.out.println("Inverte: " + tmp);//TESTE
		System.out.println();
		return tmp;
	}
}