
public class Principal extends Console {

	public static void main(String[] args) {
		Algoritmos.recebePalavras();
	}
	
//--------------------------------------------------------------------------------------------
	public static int orientacao(){

		int orientacao;

		do{
			System.out.println("Qual orientação deseja para a palavra?");
			orientacao = Console.readInt("1 - Horizontal 2-Vertical.");
			if (orientacao != 1 && orientacao != 2){
				System.out.println("Numero invalido, seu burro(a).");
				System.out.println();
			}
		}while(orientacao != 1 && orientacao != 2);

		return orientacao;

	}
//--------------------------------------------------------------------------------------------
	public static int inverte(){
		int inverte;
		do{
			System.out.println("Inverter a palavra?");
			inverte = Console.readInt("1-Sim 2-Nao.");
			System.out.println();
			if (inverte != 1 && inverte != 2){
				System.out.println("Numero invalido, seu burro(a).");
				System.out.println();
			}
		}while(inverte != 1 && inverte != 2);
		return inverte;	
	}
}