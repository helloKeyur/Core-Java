/*
    @author KEYUR-VAMJA 
    @since 21-03-2023
    @ref DURGASOFT CORE-JAVA YT
*/
public class Ep4Literals {

    public static void main(String[] args){
        /*
        # LITERALS
            ->  Any constant value which can we assign to the variable is called a literal.
            ->  by default every integral literal is of int type. but we can specify explicitly as long type by suffixed with (l/L).
            ->  Programmer can write in any form like Decimal, Octal or Hexa-Decimal Values. But JVM always print as Decimal format.
                ex:- int x = 10;
                    *int is Data Type/Keyword;
                    *x is Variable Name/identifiers;
                    *10 is Constant Value/literals.

        # How many types of literals we can assign for Integral Data Types?
            a). Decimal Literals (Based 10)
                int x = 10; // => 0 to 9;

            b). Octal Form Literals (Based 8) - literal should be prefixed with 0.
                ->  int x = 0100; // [ (1 * (8^2)) + (0 * (8^1)) + (0 * (8^0)) ] = 64 // => 0 to 7;
                ->  it allowed only 0 to 7.

                    Ex.:-
                        a). int x = 0786; invalid -> CE: integer number too large.
                        b). int x = 0777; valid // [ (7 * (8^2)) + (7 * (8^1)) + (7 * (8^0)) ] = 448 + 56 + 7 = OUTPUT will be :: 511

            c). Hexa Form Literals (Based 16) - literal value should be prefixed with 0X or 0x (Case insensitive);
                ->  int x = 0x110; // [(16^2) + (16^1) + (16^0)] = 272 // => 0 to 9 & a to f;
                ->  it allowed only 0 to 9 & a to f.

                    Ex. :-
                        a). int x = 0xBeef; valid
                        b). int x = 0xFace; valid
                        c). int x = 0xBeer; invalid CE: ';' expected.

        # by default every integral literal is of int type. but we can specify explicitly as long type by suffixed with (l/L).
            ->  Ex. :-
                    a). int x = 10; valid
                    b). long l = 10L; valid
                    c). int x = 10L; invalid, CE: possible loss precision found long required int.
                    d). long l = 10; valid, but value is int because 4 byte and long is 8 byte.

        => there is not direct-way to specify byte and short explicit, But indirectly we can specify whenever we are assigning integral literal to the byte variable & it values with the range of byte then compiler will be treats it automatically as byte literal. similarly short literal also.
            ->  Ex. :-
                    a). byte b = 10; valid
                    b). byte b = 127; valid
                    c). byte b = 128; invalid, CE: possible loss of precision found int required byte;
                    d). short s = 32767; valid
                    e). short s = 32768; invalid, CE: possible loss of precision found int required short.


        * */

        int x = 10;
        System.out.println("DECIMAL LITERALS : X = "+ x);

        int y = 0777; // [ (1 * (8^2)) + (0 * (8^1)) + (0 * (8^0)) ] = 64 + 0 + 0 = 64
        System.out.println("OCTAL LITERALS : Y = "+ y);

        int z = 0x110; // [ (1 * (16^2)) + (1 * (16^1)) + (0 * (16^0)) ] = 256 + 16 + 0 = 272
        System.out.println("HEXA DECIMAL LITERALS : Z = "+ z);

        int z1 = 0x900; // [(16^2) + (16^1) + (16^0)] = 272
        System.out.println("HEXA DECIMAL LITERALS : Z1 = "+ z1);

        /*

        #   FLOATING POINT LITERALS.
            ->  By default every floating point literals is of Double Type. we can't assign directly to the float variable. but we can specify floating point literal as float type, by suffixed with (f/F).
            ->  we can define explicitly floating point literal as double type by suffixed with (d/D). ofcource this convention is not required.
            ->  Ex. :-
                    a). float f = 123.456; invalid, CE: possible loss precision found double required float.
                    b). float f = 123.456f; valid
                    c). double d = 123.456; valid
                    d). double d = 1123.456d; valid
                    e). float f = 123.456d; invalid CE: possible loss of precision found double required float.

            ->  we can specify floating point literals only in decimal form & we can't specify in octal & hexa-decimal forms.
                Ex. :-
                    a). double d = 123.456; valid
                    b). double d = 0123.456; valid, but not octal form.
                    c). double d = 0x123.456; invalid, CE: malformed floating point literals.

            ->  We can assign integral literal directly to floating point variables and that integral literals can be specified either in Decimal, Octal or Hexa-decimal forms.
            ->  if we set integral literal value to floating point data types variable that is okey but JVM write it as float value only.
                Ex. :-
                    a). double d = 0786; invalid, because it treats as integral but octal integral does not contain 8 digit. CE: integer number too large.
                    b). double d = 0xFace; valid, treat as integral, and it is valid.
                    c). double d = 0786.0; valid, because treat as floating point literals.
                    d). double d = 0xFace.0; invalid, because treat as floating point literals & floating point literals doesn't support hexa-decimal forms.
                    e). double d = 10; valid
                    f). double d = 0777; valid, treat as integral literal with valid digits.

                    double d = 10;
                    OUTPUT:: 10.0

            -> We can't assign floating point literals to integral literals.
                -> Ex. :-
                    a). double d = 10; valid
                    b). int x = 10.0; invalid, possible loss of precision found: double required: int.

            -> We can specify floating point literals even in exponential form (Signed annotation).
                Ex. :-
                    a). double d = 1.2e3; valid, OUTPUT::1200.0
                        1.2e3 = 1.2 * (10^3) = 1.2 * 1000 = 1200.0
                    b). float f = 1.2e3; invalid, possible loss precision, found double required float.
                    c). float f = 1.2e3F; valid.
        * */

        /*
        *

        # BOOLEAN LITERALS
            ->  boolean b = true; valid
            ->  boolean b = 0; invalid, CE: incompatible types fount int required: boolean.
            ->  boolean b = True; invalid, CE: cannot find symbol symbol: variable True location : class Ep4Literals
            ->  boolean b = "true"; invalid, CE: incompatible types found java.lang.String required boolean.
        * */
    }
}
