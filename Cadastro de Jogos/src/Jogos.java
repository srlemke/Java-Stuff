
public class Jogos {
	private String nome;
	private String estilo;
	private String produtora;
	private boolean exclusivo;
	
	public Jogos(String nome, String estilo, String produtora, boolean exclusivo){
		setNome(nome);
		setEstilo(estilo);
		setProdutora(produtora);
		setExclusivo(exclusivo);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public String getProdutora() {
		return produtora;
	}

	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}

	public boolean isExclusivo() {
		return exclusivo;
	}

	public void setExclusivo(boolean exclusivo) {
		this.exclusivo = exclusivo;
	}
	
	public String toString(){
		return "Nome: " + nome + "\n" + "Estilo: " + estilo + "\n" + "Produtora: " + produtora + "\n" + "Exclusivo? " + exclusivo + "\n"; 
	}
}
		

