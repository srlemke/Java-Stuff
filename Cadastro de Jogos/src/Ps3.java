
public class Ps3 extends Jogos {
	
	private boolean move; //Suporte ao PS move?
	private boolean download;// Download de graça da PSN?
	
	public Ps3(String nome, String estilo, String produtora, boolean exclusivo, boolean move, boolean download) {
		super(nome, estilo, produtora, exclusivo);
		
		setMove(move);
		setDownload(download);
	}

	public boolean isMove() {
		return move;
	}

	public void setMove(boolean move) {
		this.move = move;
	}

	public boolean isDownload() {
		return download;
	}

	public void setDownload(boolean download) {
		this.download = download;
	}
	
	public String toString(){
		return super.toString() + "Suporte a PS Move? " + move + "\n" + "Download Free na PSN? " + download + "\n";
	}
}
