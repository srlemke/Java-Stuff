
public class Principal {
	public static void main(String[] args) {
		
		Cadastros jogo = new Cadastros();
		
		jogo.addPs3("lala", "lele", "lili", true, false, false);
		jogo.addXbox("Mass Effect", "RPG", "Activision", false, true, "NTSC", 2);
		jogo.addPs3("lala", "lele", "lili", true, false, false);
		jogo.addPs3("lala", "lele", "lili", true, false, false);
		jogo.addPs3("lala", "lele", "lili", true, false, false);
		jogo.addPs3("lala", "lele", "lili", true, false, false);
		jogo.addXbox("Mass Effect", "RPG", "Activision", false, true, "NTSC", 2);
		jogo.addXbox("Mass Effect", "RPG", "Activision", false, true, "NTSC", 2);
		jogo.addXbox("Mass Effect", "RPG", "Activision", false, true, "NTSC", 2);
		
		System.out.println(jogo.listaProdutos());
		

	}

}
