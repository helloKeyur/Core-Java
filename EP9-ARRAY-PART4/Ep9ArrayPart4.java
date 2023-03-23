/*
	@author KEYUR-VAMJA 
	@since 23-03-2023
	@ref DURGASOFT CORE-JAVA YT
*/
import java.util.Arrays;
import java.util.stream.Stream;

class Ep9ArrayPart4{

	private static final String SEPRATOR = "\n---------------------------------------\n";

	public static void main(String[] args){
		/*
		
		#	Element level promotions are not applicable at array level.
			-> char element can be promoted to int type. where as char[] can not be promoted to int[];
		*/

		int[] i = {1, 2, 3, 4, 5};
		char[] c = {'a', 'b', 'c', 'd', 'e'};

		int[] i1 = i;
		// int[] i2 = c; // CE:: incompatible types: char[] cannot be converted to int[].

		System.out.println(i);
		System.out.println(c);
		System.out.println(i1);
		// System.out.println(i2);

		/*
		# 	which of the following promotion performed automatically.
				a).	char to int :valid
				b). char[] to int[] :invalid
				c). int to double  :valid
				d). int[] to double[] :invalid
				e). float to int :invalid
				f). float[] to int[] :invalid
				g). String to Object :valid
				h). String[] to Object[] :valid

			=>	in the case of object type arrays child class type array can be promoted to parent class type array.

		*/

		String[] str = {"keyur", "vamja", "patel"};
		Object[] obj = str;

		System.out.println(str);
		System.out.println(obj);

		Integer[] i3 = {0, 5, 6, 76};
		Number[] n = i3;

		System.out.println(n);
		System.out.println(i3);

		/*
		#	whenever we are assigning one array to another array internal elements wan't be copied just ref variable will be resigned.
			Ex. :-	int[] a = {10, 20, 30, 40, 50};
					int[] b = {60, 70};

					a = b;
					b = a; 
		*/

		int[] a = {10, 20, 30, 40, 50};
		int[] b = {60, 70};

		System.out.println(SEPRATOR);

		System.out.println("a@hashCode before:: " + a);
		System.out.println("a before:: " + Arrays.toString(a));
		a = b; 
		System.out.println("a@hashCode after:: " + a);	
		System.out.println("a after:: " + Arrays.toString(a));

		System.out.println(SEPRATOR);
		
		System.out.println("b@hashCode before:: " + b);
		System.out.println("b before:: " + Arrays.toString(b));
		b = a; 
		System.out.println("b@hashCode after:: " + b);	
		System.out.println("b@hashCode after:: " + Arrays.toString(b));

		System.out.println(SEPRATOR);
		// Arrays.stream(a).forEach(System.out::println);

		/*
		#	Whenever we are assigning one array to another array the dimensions should be match.
			Ex. :-
				=> in the place of one dimensional int[] array we should provide one dimensional array only. if we are trying to provide any other dimension then we will get compile time error.

				int[][] a = new int[3][];
				a[0] = new int[3][4]; // invalid, CE: incompitable types found: int[][] required: int[].
				a[0] = 10; // invalid, CE: incompitible type found: int required int[].
				a[0] = new int[4]; // valid.

			=> whenever we are assign one array to another array both dimensions & types must be matched. but sizes are not required to match.
		
		*/

		
	}
}