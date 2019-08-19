import java.util.ArrayList;
import java.util.List;

public class Lists {

	int x;
	int[] y;
	String la = "lala";
	char ko = 'c';
	int inteiro = 1234567890;
	float floato = 1;
	double duplo = 123456789.0;

	public Lists(){
		
		System.out.println("Lists constructor called, creating a list of triangles: ");

		List<triangle> lista = new ArrayList<triangle>();

		triangle x = new triangle();

		for(int i=0; i<10;i++){
			lista.add(x);
		}
		
		for (triangle i : lista){
			i.printTriangle();
		}
		
	};
}