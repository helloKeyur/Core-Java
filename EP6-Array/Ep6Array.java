/*
	@author KEYUR-VAMJA 
	@since 21-03-2023
	@ref DURGASOFT CORE-JAVA YT
*/
class Ep6Array{
	public static void main(String[] args){
		/**
		*
		
		# ARRAYS
			->	An array is indexed collection of fixed number of homogenus data elements.
			->	Arrays are fixed in size.
			->	Arrays accept only homogenus data.
			-> 	The main advantage of array, we can represent huge numbers of values by using single variable. so that readabiliy of code will be improved.
			->	The main disadvantage of array is fixed in size. once we create an array there is no chance of increaseing or decreasing size based on our requirements. hence array's concept we should know size in advance, which may not possible always.
			->	Array declaration.
				i). 1D array declaration.
					a).	int[] x; recommanded, because name is clearly seprated from type.
					b).	int x[];
					c).	int []x;

					at the time of declaration, we can't specify size. otherwise we will get compile time error.
						int[6] x; invalid.
						int[] x; valid.

				ii). 2D array declaration.
					a).	int[][] x; valid.
					b).	int [][]x; valid.
					c). int x[][]; valid.
					d). int[] x[]; valid.
					e). int[] []x; valid.
					f). int []x[]; valid.
			
			->	Which of the following are valid?
				a). int[] a,b; valid, both are 1D array.
				b). int[] a[],b; valid, a is 2D array. & b is 1D array.
				c). int[] a[],b[]; valid, both are 2D array.
				d). int[] []a,b; valid, both are 2D array, space between variable name and datatype is ignored so both are 2D array.
				e). int[] []a,b[]; valid, a is 2D array, b is 3D Array.
				f). int[] []a,[]b; invalid. only first variable can be declare prefix as []. it will give CE: 
					-> if we want to specify dimention before the variable that fecility is applicable only for 1st variable in a declartion. if we are trying to apply for remaining variable we will get compile time error.
		
				
				iii) 3D array Declaration
					a). int[][][] a;
					b). int [][][]a;
					c). int a[][][];
					d). int[] [][]a;
					e). int[] a[][];
					f). int[] []a[];
					g). int[][] []a;
					h). int[][] a[];
					i). int [][]a[];
					j). int []a[][];

					these all are valid for 3D Decalartion.


		# Array Creation.
			->	every array in java is an object only, hence we can create arrays. by using new operator.
				Ex. :-
					int[] a = new int[3];
			-> 	for every array type corrosponding class are availble. and these class is part of java lanagauge, and not available to the programmer level.
		
			=>	int[] -> [I
			=>	int[][] -> [[I
			=>  double[] -> [D
			=>  short[] -> [S
			=>  byte[] -> [B
			=>  long[] -> [J
			=>  boolean[] -> [Z
		* */

		int[] i = new int[6];
		System.out.println(i.getClass().getName()); // [I

		int[][] i2 = new int[6][3];	
		System.out.println(i2.getClass().getName()); // [[I

		int[][][] i3 = new int[6][3][2];	
		System.out.println(i3.getClass().getName()); // [[[I

		byte[] b = new byte[6];
		System.out.println(b.getClass().getName()); // [B

		long[] l = new long[6];	
		System.out.println(l.getClass().getName()); // [J
		
		boolean[] bl = new boolean[6];		
		System.out.println(bl.getClass().getName()); // [Z

		/*

		->	at the time of array creation compulsory we should specify the size.otherwise we will get complie time error.
				int[] x = new int[]; invalid.
				int[] x = new int[6]; valid.
				int[] x = new int[0]; valid. it is liggle to have an array with size zero in java.
				int[] x = new int[-2]; invalid.RunTimeException: java.lang.NegativeArraySizeException 
		
		-> 	to specify array size allowed datatyps is byte, short, int, char. if we are trying to specify any other type then we will get compile time error.
				a). int[] x = new int[10]; valid.
				b). int[] x = new int['a']; valid. char to int is possible.
				byte b = 10;
				c). int[] x = new int[b]; valid. byte to int is possible.
				short s = 20;
				d). int[] x = new short[s]; valid, short to int is possible.
				e). int[] x = new int[10L]; invalid. long is not possible as int. CE: possible loss of precision found long required int.

		->	the maximum allowed array size in java, is 2147483647. which is a maximum value of int Data Type.
				a). int[] i = new int[2147483647]; // valid, RE: java.lang.OutOfMemoryError: Requested array size exceeds VM limit.
				b). int[] i = new int[2147483648]; // invalid, CE: integer number too large.

				even in the first case we make a run time exception if sufficient heap memory not available.
		*/
		
		int[] x = new int[2147483647];
		System.out.println(x);// java.lang.NegativeArraySizeException
	}
}