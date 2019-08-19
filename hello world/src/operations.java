public class operations {
	private int a,b;
	private char operacao;
	
	public operations(int a, int b, char operacao){
		setB(b);
		setA(a);
		setOperacao(operacao);
		
		System.out.print("Operation Constructor called\n");
		}
		
	public void setB(int b) {
		this.b = b;
	}

	public void setOperacao(char operacao) {
		this.operacao = operacao;
	}


	public void setA(int a) {
		this.a = a;
	}
	
	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}
	
	public char getOperacao() {
		return operacao;
	}
	
	public void result(){
		System.out.print("operations result function called\n");
		
		switch (operacao) {
		case '+':
			System.out.println(a + " + " + b + " = " + (a + b));
			break;

		case '-':
			System.out.println(a + " - " + b + " = " + (a - b));
			break;	
			
		case '*':
			System.out.println(a + " * " + b + " = " + (a * b));
			break;	
			
		case '/':
			System.out.println(a + " / " + b + " = " + (a / b));
			break;	
		default:
			System.out.println(operacao + "is Invalidovna");
		}
	}	
}
