public class triangle {

	
	public triangle(){
		System.out.println("triangle contructor called");
		
	}

	public void printTriangle(){
		int height = 6;
		
		for (int i=0; i<=height; i++){ for (int x=height; x > i; x--){
				System.out.print(' ');
			}
		for (int k=0; k < (2 * i ); k++){
			System.out.print('*');
		}

		System.out.println();
		}

	}
}
