public class Main {

	public static void main(String[] args) {
		operations Operations = new operations(10, 5, '+');
		Operations.result();
		
		triangle triangulo = new triangle();
		triangulo.printTriangle();
		
		System.out.println("from main, setting 10 fo array size");
		//arrays Array = new arrays(10);
		
		Lists lists = new Lists();
	}
}