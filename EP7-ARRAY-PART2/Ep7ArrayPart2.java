/*
    @author KEYUR-VAMJA 
    @since 22-03-2023
    @ref DURGASOFT CORE-JAVA YT
*/
public class Ep7ArrayPart2 {

    public static void main(String[] args){
        /*
        *
        # ARRAY::MULTI-DIMENSIONAL ARRAY
            ->  In java, 2D Array not implemented by using matrix style SUN People followed array of arrays approach for multi-dimensional array creation. the main advantage of these approach is memory utilization will be improved.
                Ex. :-
                    a). int[][] x = new int[2][];
                        x[0] = new int[2];
                        x[1] = new int[3];

                    b). int[][][] x = new [2][][];
                        x[0] = new int[3][];
                        x[0][0] = new int[1];
                        x[0][1] = new int[2];
                        x[0][2] = new int[3];
                        x[1] = new int[2][2];

            ->  Which of the following array declaration is valid?
                a). int[] a = new int[]; invalid
                b). int[] a = new int[3]; valid
                c). int[][] a = new int[][]; invalid
                d). int[][] a = new int[3][]; valid
                e). int[][] a = new int[][4]; invalid
                f). int[][] a = new int[3][4]; valid
                g). int[][][] a = new int[3][4][5]; valid
                h). int[][][] a = new int[3][4][]; valid
                i). int[][][] a = new int[3][][5]; invalid
                j). int[][][] a = new int[][4][5]; invalid

            ->  Array initialization.
            ->  By default every element initialized with default values.
                int[] x = new int[3];

            ->  whenever we are trying to print any refrence variable internally toString() will be called which is implemented by default to return that string in the following form. className@hascodeInHexaDecimalForm
        *
        *
        * */

        //example 1
        int[] x = new int[3];
        System.out.println(x); // OUTPUT:: [I@251a69d7
        System.out.println(x[0]); // OUTPUT::O

        //example 2
        int[][] x2D = new int[2][3];
        System.out.println(x2D); // OUTPUT:: [[I@7344699f
        System.out.println(x2D[0]); // OUTPUT:: [I@6b95977
        System.out.println(x2D[0][0]); // OUTPUT:: 0

        //example 3
        // if we are tring to perform any operation then we will get RunTimeException called java.lang.NullPointerException.
        int[][] x2D2 = new int[2][];
        System.out.println(x2D2); // OUTPUT:: [[I@7e9e5f8a
        System.out.println(x2D2[0]); // OUTPUT:: null
        // System.out.println(x2D2[0][0]); // OUTPUT:: RE:: java.lang.NullPointerException

        //example 4
        // in array every elements are by default set default values. if we are not setisfied with that values then we can override this values with our customised values.
        // -> if we are tring to access array element with out of range index either (+ve/-ve) values then we will ge RunTimeException saying ArrayIndexOutOfBoundException.
        int[] arr = new int[3];
        arr[0] = 123;
        arr[1] = 3;
        arr[2] = 45;
        // arr[3] = 13; //RE:: ArrayIndexOutOfBoundException 
        // arr[-3] = 654; //RE:: ArrayIndexOutOfBoundException
        // arr[2.5] = 13; //CE:: possible loss of precision found double required int.

    }
}