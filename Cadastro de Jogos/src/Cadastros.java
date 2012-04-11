import java.util.Vector;
public class Cadastros {
	
	//Variaveis
	private Vector<Jogos> cadastrados;
	
	//Método contrutor
	public Cadastros(){
		cadastrados = new Vector<Jogos>();
	}
	
	public void addXbox(String nome, String estilo, String produtora, boolean exclusivo, boolean kinect, String regiao, int qtd){
		Xbox a = new Xbox(nome, estilo, produtora, exclusivo, kinect, regiao, qtd );
		cadastrados.add(a);
		}
		
	public void addPs3(String nome, String estilo, String produtora, boolean exclusivo, boolean move, boolean download){
		Ps3 b = new Ps3(nome, estilo, produtora, exclusivo, move, download);
		cadastrados.add(b);
	}
	
	public String listaProdutos(){
		//String aux = "";
		 String auxXbox = "Xbox:\n";
		 String auxPs3 = "PS3: \n\n\n\n\n\n\n"; 
		
		for(Jogos d : cadastrados){
			if(d instanceof Xbox ){
				auxXbox += d + "\n :)) \n";
			}else{
				auxPs3 += d + "\n :)) \n";
			}
			
		}
		return auxXbox + auxPs3;
	}
	
	//public void ConsultaXbox(String nome){
		
	//}
}
