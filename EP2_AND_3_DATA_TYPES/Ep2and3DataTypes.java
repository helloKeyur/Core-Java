/*
	@author KEYUR-VAMJA 
	@since 20-03-2023
	@ref DURGASOFT CORE-JAVA YT
*/
class Ep2and3DataTypes{

	private static final String SEPRATOR = "=========================================================================";

	public static void main(String[] args){
		/*

        # JAVA IS STRONGLY TYPED LANGUAGE.
            ->  In Java, every variable & every expression has some type.
            -> each & every datatype is clearly defined.
            -> every assignment should be checked by compiler for type compatibility.
            because of above reasons we can conclude java language is strongly typed programming language.

        # JAVA IS 100% or Pure OOPS PROGRAMMING LANGUAGE YES OR NO ?
            -> NO. Java is not considered as pure object-oriented programming language because several OOP's features are not satisfied by JAVA. (like:- Operator Overloading, Multiple inheritance etc...)
            more over, we are depending on primitive datatype Which are non-objects, So Java is not pure Object-Oriented Programming Language.

        # PRIMITIVE DATA TYPES (8) IN JAVA.
            i). Numeric Data Types (Signed Type Data Types)
                a). Integral Data Types
                    ->  byte
                    ->  short
                    ->  int
                    ->  long

                b). Floating Point Data Types
                    ->  float
                    ->  double

            ii). Non-Numeric Data Types
                    ->  char
                    ->  boolean

            => except char & boolean Data Types remaining data types are Signed Data Types. because we can represent it as positive (+ve) & (-ve) numbers.
            => null is a default value for object reference, and we can't apply it for primitives Data Type. if we are trying to use for primitive then we will get compile time error.
                ex:- char c = null; invalid. -> incompatible types found : <nullable> required: char.

            Summary:
                Java Primitive Data Types,
                    a). byte
                        ->  Size: 1 byte
                        ->  Range: (-2[7]) to (+2[7]-1) => -128 to +127
                        ->  Wrapper Class: Byte
                        ->  Default Value: 0
                    b). short
                        ->  Size: 2 byte
                        ->  Range: (-2[15]) to (+2[15]-1) => -32768 to +32767
                        ->  Wrapper Class: Short
                        ->  Default Value: 0
                    c). int
                        ->  Size: 4 byte
                        ->  Range: (-2[31]) to (+2[31]-1) => -2147483648 to +2147483647
                        ->  Wrapper Class: Short
                        ->  Default Value: 0
                    d). long
                        ->  Size: 8 byte
                        ->  Range: (-2[63]) to (+2[63]-1)
                        ->  Wrapper Class: Long
                        ->  Default Value: 0
                    e). float
                        ->  Size: 4 byte
                        ->  Range: -3.4e38 to +3.4e38
                        ->  Wrapper Class: Float
                        ->  Default Value: 0.0
                    f). double
                        ->  Size: 8 byte
                        ->  Range: -1.7e38 to +1.7e38
                        ->  Wrapper Class: Double
                        ->  Default Value: 0.0
                    g). boolean
                        ->  Size: NA
                        ->  Range: NA
                        ->  Wrapper Class: Boolean
                        ->  Default Value: false
                    g). char
                        ->  Size: 2 byte
                        ->  Range: 0 to 65535
                        ->  Wrapper Class: Character
                        ->  Default Value: 0 (Represent Space char)
        * */

        // all the below data types byte, short, int & long mint for representing Integral values. if we want to represent floating point values then we should go for floating point Data Types. [Numeric Data Types]
        aboutByteDataType(); // byte
        aboutShortDataType(); // short
        aboutIntDataType(); // int
        aboutLongDataType(); // long

        // all the below Data Types are is float & double. [Numeric Data Types]
        aboutFloatDataType(); // float
        aboutDoubleDataType(); // double

        // All the below Data Types are Non-numeric Data Types.
        aboutBooleanDataType(); // boolean
        aboutCharDataType(); // char
    }

    public static void aboutByteDataType(){
        /*
        # BYTE
            ->  Default Value: 0
            ->  Size: 1 byte : (8 bit)
            ->  Max Value: +127
            ->  Min Value: -128
            ->  Range: -128 to +127

            => The most significant text is sign bits.
                a). 0 (+Ve Number)
                b). 1 (-Ve Number)

            => (+Ve) Positive number will be represented in directly in memory.
            => (-Ve) Negative number is represents in 2's compliment.

            Ex. :-
                byte b = 10; valid
                byte b = 127; valid
                byte b = 128; invalid -> possible loss of precision found int required byte.
                byte b = 10.5; invalid -> possible loss of precision found double required byte.
                byte b = true; invalid -> incompatible types found boolean required byte.
                byte b = "keyur"; invalid -> incompatible types found java.lang.String required byte.

            => byte is the best choice if we want's to handle data in terms of Streams either from the file or from the network. (File & Network supported form is the byte)
                -> there are two types of Streams. 1) Character Stream 2)byte Stream
                -> file gives byte[] (byte array).
        * */

        byte b = 124;
        System.out.println(SEPRATOR);
        System.out.println(b);
        System.out.println(SEPRATOR);
    }

    public static void aboutShortDataType(){
        /*

        # SHORT
            ->  Default Value: 0
            ->  Short is the most rarly used Data Type in java.
            ->  Size: 2 bytes [16 bits]
            ->  Range: (-2[15]) to (+2[15] - 1)
                     :  -32768 to +32767

            Ex. :-
                short s = 32767; valid
                short s = 32768; invalid -> possible lossy conversion found int required short.
                short s = 10.5; invalid -> possible lossy conversion found double required short.
                short s = true; invalid -> incompatible types found boolean required short.

           => Short data type is the best suitable for 16-bit processor like 8085. but this processors are completely out-dated and hence corresponding short data type is also outdated Data Type;
        * */

        short s = 32767;
        System.out.println(SEPRATOR);
        System.out.println(s);
        System.out.println(SEPRATOR);
    }

    public static void aboutIntDataType(){
        /*

        # INT
            ->  Default Value: 0
            ->  Size: 4 bytes [32 bits]
            ->  Range: (-2[31]) to (+2[31] - 1)
                    [-2147483648 to +2147483647]

            => The most commonly used Data Types is int.

            Ex. :-
                int i = 2147483674; valid
                int i = 2147483648; invalid -> integer number too large
                int i = 2147483648L; invalid -> incompatible types: possible lossy conversion from long to int
                int i = true; invalid -> incomaptible types: boolean cannot be converted to int
        * */

        int i = 25;
        System.out.println(SEPRATOR);
        System.out.println(i);
        System.out.println(SEPRATOR);
    }

    public static void aboutLongDataType(){
        /*

        # LONG
            ->  Default Value: 0L
            ->  Size:-   8 bytes [64 bits]
            ->  Range:-  (-2[63]) to (+2[63]-1)

            => Sometimes, int may not enough to hold big values then we should go for long Data Type.

            Ex:-
                a). The amount of distance travelled by light in 1000 days, to hold this value int may not enough we should go for long Data Type.
                       long l = 186000 * 60 * 60 * 24 * 1000;

                b). The numbers of characters present in a big file may exceed int range. hence the return type of length() method is long but not int.
                    long l = f.length();
        * */

        long l = 16070400000000L;
        System.out.println(SEPRATOR);
        System.out.println(l);
        System.out.println(SEPRATOR);
    }

    public static void aboutFloatDataType(){
        /*

        # FLOAT
            ->  Default Value: 0.0f
            -> if we want 5 to 6 decimal place of accuracy then we should go for float.
            -> float follows single precision.
            -> Size: 4 byte [32 bits]
            -> Range: (-3.4e38) to (+3.4e38)
        *  */

        float f = 2.3363636f;
        System.out.println(SEPRATOR);
        System.out.println(f);
        System.out.println(SEPRATOR);
    }

    public static void aboutDoubleDataType(){
        /*

        # DOUBLE
            ->  Default Value: 0.0d
            -> if we want 14 to 15 decimal place of accuracy then we should go for double.
            -> double follows double precision.
            -> Size: 8 byte [64 bits]
            -> Range: (-1.7e38) to (+1.7e38)
         *  */

        double d = 284854.3363636454545d;
        System.out.println(SEPRATOR);
        System.out.println(d);
        System.out.println(SEPRATOR);
    }

    public static void aboutBooleanDataType(){
        /*

        # BOOLEAN
            ->  Default Value: false
            ->  Size: Not-Applicable [ virtual machine dependent ]
            ->  Range: Not-Applicable [ allowed values are true/false ]

            Ex. :-
                boolean b = true; valid
                boolean b = 0; incompatible types: int cannot be converted to boolean.
                boolean b = True; cannot find symbol \n symbol:   variable True \n location: class Ep2and3DataTypes
                boolean b = "True"; incompatible types: java.lang.String cannot be converted to boolean.


                int x = 0;

                if(x){ sout(x); } else { sout("NA"); }; invalid, incompatible type found: int required boolean. [invalid in Java, But in old language like c & cpp it is valid.]
                while(x){ sout(x); }; invalid, incompatible type found: int required boolean. [invalid in Java, But in old language like c & cpp it is valid.]
        * */

        boolean b = true;
        System.out.println(SEPRATOR);
        System.out.println(b);
        System.out.println(SEPRATOR);
    }

    public static void aboutCharDataType(){
        /*

        # CHAR
            -> Size:- 2 bytes [16 bits]

            => In Java, char Size is 2 byte but in C & CPP Size of char is 1 byte (8 bits). Because Java is Unicode based & C or CPP is ASCII Code based.

            => In old languages (like C/CPP) are ASCII Code based. and the number different allowed ASCII Code char are <= 256. to represent this 256 char 8 bits are enough. hence the size of char in Old Languages is 1 bit.
            => But Java is Unicode Based & the number of different unicodes are > 256 & <= 65536 to represent this many characters 8 bit may not enough. compulsory we should go for 16 bits. hence the size of char in Java is 2 bytes (16 bits). Range 0 to 65535.

            Ex. :-
                char c = 'c'; valid
                char c = "c"; invalid, incompatible types: java.lang.String cannot be converted to char
                char c = 'ch'; invalid, unclosed character literal
        * */

        char c = 'c';
        System.out.println(SEPRATOR);
        System.out.println(c);
        System.out.println(SEPRATOR);
    }
}