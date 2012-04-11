
public class Xbox extends Jogos {

	private boolean kinect;
	private String regiao;
	private int qtd; //Quantidade de Dvd's
	
	public Xbox(String nome, String estilo, String produtora, boolean exclusivo, boolean kinect, String regiao, int qtd) {
		super(nome, estilo, produtora, exclusivo);
	
	setKinect(kinect);
	setRegiao(regiao);
	setQtd(qtd);
	}
	
	public boolean isKinect() {
		return kinect;
	}

	public void setKinect(boolean kinect) {
		this.kinect = kinect;
	}
	
	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

public String toString(){
		return super.toString() + "Kinect compativel? " + kinect + "\n" + "Regiao: " + regiao + "\n" + "DVD's: " + qtd;
	}
}
	
