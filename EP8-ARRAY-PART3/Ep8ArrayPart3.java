/*
	@author KEYUR-VAMJA 
	@since 22-03-2023
	@ref DURGASOFT CORE-JAVA YT
*/
class Ep8ArrayPart3{
	public static void main(String[] args){
		/*
		
		# ARRAY DECLARATION, CREATION AND INITAILIZE IN ONE LINE.
			->	We can declare, create and initalize array in a single line shortcut representation.
				Ex. :-
					a) int[] a = {9,99,65,43,5};
					b) char[] c = {'r','w','d','s','e','w'};
					c) String[] s = {"Apple", "Samsung", "OnePlus", "Oppo", "Vivo", "MI", "Nokia"};
		*/
		int[] a = {9,99,65,43,5};
		char[] c = {'r','w','d','s','e','w'};
		String[] s = {"Apple", "Samsung", "OnePlus", "Oppo", "Vivo", "MI", "Nokia"};

		System.out.println(a); // [I@251a69d7
		System.out.println(c); // rwdsew
		System.out.println(s); // [Ljava.lang.String;@7344699f

		/*

		#	WE CAN EXTEND THIS SHORTCUT EVEN FOR MULTIDIMENSIONAL ARRAY ALSO.
			Ex. :-
				a) int[][] x = { {1,2,4}, {4,3,1}, {6,5,8}};
		*/
		int[][] x = { {1,2,4}, {4,3,1}, {6,5,8}};
		System.out.println(x);// [[I@6b95977
		System.out.println(x[0]);// [I@7e9e5f8a
		System.out.println(x[0][1]);// 2

		/* which one is valid */
		int[][][] x1 = { {{10, 20, 30}, {40, 50, 60}}, {{70, 80}, {90, 100, 110}}};
		System.out.println(x1[0][1][2]); // 60
		System.out.println(x1[1][0][1]); // 80
		// System.out.println(x1[2][0][0]); // RE:: ArrayIndexOutOfBoundException
		// System.out.println(x1[1][2][0]); // RE:: ArrayIndexOutOfBoundException
		System.out.println(x1[1][1][1]); // 100
		// System.out.println(x1[2][1][0]); // RE:: ArrayIndexOutOfBoundException

		// -> if we use this shortcut complsary all activity in a single line.
		int[] x2 = {2,3,4};

		// -> if we are divide into multiple line then we are geting compiletime error.
		// int[] x;
		// x = {4,5,6};


		/*

		# length vs lenth()
			->	length is final variable applicable for arrays. length variable represents a size of the array. 
				Ex. :-
					int[] i = new int[6];
					// System.out.println(i.length()); // invalid, CE:: cannot find symbol symbol: method length() location: class int[]
					System.out.println(i.length); // valid

				Ex. :-
					String[] s = "keyur";
					// System.out.println(s.length); // invalid, CE: cannot find symbol symbol: variable length location: class java.lang.String
					System.out.println(s.length()); // 5

			-> 	length() is final method applicable for String objects. length method returns number of char present in the string.
			->	length variable is applicable for arrays but not for String Objects where as length is applicable for String objects. but not for arrays.

				Ex. :-
					String[] str = {"a", "aa", "aaa"};
					System.out.println(s.length); valid, OUTPUT::3
					System.out.println(s.length()); invalid, CE:: cannot find sysbol symbol: method length() location: class java.lang.String[]
					System.out.println(s[0].length); invalid, CE:: cannot find symbol symbol: variable length location: class java.lang.String
					System.out.println(s[0].length()); valid, OUTPUt:: 1

			-> in multi-dementional length variable represents only base size but not total size.
				Ex. :-
					int[][] x = new int[6][3];
					System.out.println(x.length); // valid, OUTPUT:: 6
					System.out.println(x[0].length); // valid, OUTPUT:: 3

			-> THERE IS NO DIRECT WAY TO SPECIFY THE TOTAL LENGTH OF MULTI-DEMENTIONAL ARRAY. BUT INDIRECTLY WE CAN FIND AS FOLLOWS.
				Ex. :-
					x[0].length + x[1].length + x[2].length + ... + x[n].length;
		*/

		/*

		# ANONYMOUS ARRAY
			-> 	Sometimes we can declare an array without name, such type of nameless array are called anonymous arrays.
			-> 	The main purpose of anonymous array is just for instant use. (1 time useage).
			-> 	we can create anonymous array as follows.
					new int[]{10, 20, 30, 40};

			->	while creating anonymous array we cant specify the size otherwise, we will get compile time error.
					new int[]{1, 2, 3, 5}; // valid
					new int[3]{1, 2, 3}; invalid

			-> 	we can create multi-dimensional array also.
					new int[][]{{1,2,4}, {5,6,7,8}};
			
			->	based on our requirent we can give the name for anonymous array then it no longer annonymous.
					int[] x = new int[]{1, 2, 3, 4};

			=> 	in above examples just to call some method we required an array but after completing some method call we are not using that array any more, hence for this one time reqirement anonymous array is the best choise.	


		#	ARRAY ELEMENT ASSIGNMENTS.
			=> int[] x = new int[5];
					
					a). in the case of premitive type arrays, as array elements we can provide anytype which can be implicitly promoted type to declared type.
						int[] x = new int[5];
						x[0] = 1;
						x[1] = 'a';
						short s = 3;
						x[2] = s;
						byte b = 2;
						x[3] = b;
						x[4] = 2L; // invalid, CE: possible loss of precision found long required int.

					b). in the case of float type arrays, the allowed datatypes are byte, short, char, int, long.
						float[] f = new float[6];

					c). in the case of object type array as array elements we can provide either declared type objects or its child class objects.
						Object[] obj = new Object[10];
						obj[0] = new Object(); // valid
						obj[1] = new String("HELLO"); // valid
						obj[2] = new Integer(10); // valid
						
						Number[] n = new Number[10];
						n[0] = new Byte(2);
						n[1] = new Short(34);
						n[3] = new Integer(3);
						n[4] = new Long(45);
						n[5] = new String("hello"); // invalid, CE:: incompitable type found: java.lang.String required java.lang.Number.

					d). for interface type array as array elements it's implementation class objects are allowed.
						Runnable[] r = new Runnable[10];
						r[0] = new Thread();
						r[1] = new String("hello");
		*/

		Number[] n = new Number[10];
		n[0] = Integer.valueOf(3);
		n[1] = Long.valueOf(45);
		n[2] = Double.valueOf(3.4);
		System.out.println(n);
	}
}