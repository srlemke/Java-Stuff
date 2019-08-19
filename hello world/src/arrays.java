import java.lang.reflect.Array;
import java.util.Arrays;

public class arrays {
	int size;

	public arrays(int size){
		System.out.println("arrays contructor called");
		
		setSize(size);
		int[][] a = new int[4][4];
		matriz(a);
		//printArraySize(a);
		//a = populateArray(a);
		//compareArrays(a);
		//printArrayContet(a);
		//a = Manipulate_ArrayContenet(a);
		//printArrayContet(a);
		//a = bubblesort(a);
		//printArrayContet(a);
		//a = MakeAllOdd(a);
		//mirrorArrays();
		}
		
	public void matriz(int[][] a){ 
		System.out.println("matrix function called!");
		System.out.println(a.length);
		for (int i = 0; i < a.length; i++){
			for (int x = 0; x < a.length; x++){
				a[i][x] = 1;
			}
		}
		
		for (int i = 0; a.length < 4; i++){
			System.out.println();
			for (int x = 0; x < a.length; x++){
				System.out.print(a[i][x]);
			}
		}
	}
	
	public int[] populateArray(int[] array){
		System.out.println("populate array function called!");
		for (int i = 0; i < array.length; i++){
			array[i] = i+1;
		}
		return array;
	}
	
	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}
	
	public void printArraySize(int[] array){
		System.out.println("printarraysize function called! Array lenght: " + array.length);
	}
	
	public int[] Manipulate_ArrayContenet(int[] array){
		System.out.println("manipulate array function called!");
		array[4] = 99;
		return array;
	}
	
	public int[] MakeAllOdd(int[] array){
		System.out.println("makeallodd function called!");
		for (int x : array){
			System.out.println(array[x]);
		}

		return array;
	}
	
	public int[] bubblesort(int[] array){
		System.out.println("bublesort function called!");
		
		for(int i = 0; i < array.length-1; i++){
			if(array[i] > array[i+1]){
				int swap = array[i];
				array[i] = array[i+1];
				array[i+1] = swap;
				i = 0;
			}
		}
		printArrayContet(array);
		return array;
	}
	
	public void compareArrays(int[] array){
		
		int[] arrayb = new int[10];
		arrayb = populateArray(arrayb);
		
		arrayb[1] = 9; //lets make the arrays not equal//
		
		if (Arrays.equals(array, arrayb)){
			System.out.println("Arrays Equal");
		}else{
			System.out.println("Arrays not Equal");
		}
	}
	
	public void mirrorArrays(){
		
		int[] arrayb = new int[10];
		arrayb = populateArray(arrayb);
		System.out.println("mirror array called!");
		
		Array.setInt(arrayb, 0 , 99);
		System.out.println(Array.getInt(arrayb, 0));
		
		System.out.println(Array.getLength(arrayb));
		System.out.println(arrayb.length);
	}
	
	public void RemoveAndResizeArray(){
		
	}
	
	public void printArrayContet(int[] array){
		System.out.println("printarray function called!");
		for (int x : array){
			System.out.println(x);
		}
	}

}
