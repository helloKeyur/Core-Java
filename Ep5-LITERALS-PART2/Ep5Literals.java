/*
    @author KEYUR-VAMJA 
    @since 21-03-2023
    @ref DURGASOFT CORE-JAVA YT
*/
public class Ep5Literals {

    public static void main(String[] args){
        /*

        # CHAR LITERALS (4 way to define char literals)
            ->  1). char literal in single quote.
                Ex. :-
                    a). char ch = 'a'; valid
                    b). char ch = a; invalid, compiler is treat as variable, CE: cannot find symbol symbol: variable a location char EpLiterals.
                    c). char ch = "a"; invalid, compiler treat as string, CE: incompatible type found java.lang.String required char.
                    d). char ch = 'ab'; invalid, CE: unclosed character literal. not a java Statement.

            ->  2). We can specify char literal as integral literals which represent unicode value of that character. that integral literal can be, specify as decimal, octal or hexa-decimal form. but allowed range is 0 to 65535.

                Ex. :-
                    a). char ch = 0xFace; valid
                    b). char ch = 0777; valid
                    c). char ch = 65535; valid
                    d). char ch = 65536; invalid, possible lossy precision, found int required char.

            ->  3). We can represent char literal in unicode representation, which is nothing but '\u0061'; where X is 4 digit hexa-decimal numbers.

                Ex. :-
                    a). char ch = '\u0061'; valid, OUTPUT :: a

            ->  4). Every escape character is a valid char literal. there is 8 escape char in JAVA.

                => \n -> New Line.
                => \t -> Horizontal Tab.
                => \r -> carriage return.
                => \b -> back space character.
                => \f -> form feed
                => \` -> single quote
                => \" -> double quote
                => \\ -> back slash character.

                Ex. :-
                    a). char ch = '\n';  valid
                    b). char ch = '\t'; valid
                    c). char ch = '\m'; invalid, CE: illegal escape character.
        
        -> Examples. :-
            a). char ch = 65536; invalid, invalid range
            b). char ch = 0xBeer; invalid, invalid symbol
            c). char ch = \uface; invalid, single qoute is missing 
            d). char ch = '\ubeef'; valid
            e). char ch = '\m'; invalid
            f). char ch = '\iface'; invalid
        * */

        char ch = '\u0061';
        System.out.println(ch);

        /**
         * 

        # STRING LITERAL
            ->  it is not primitive Types. any sequce of characters within double qoutes is treated as String literals.

            Ex. :- 
                String str = "keyur";

        =>  in Java 1.7 version, enhancements with respect to literals.
            a). binary literals
                ->  for integral data types until 1.6 version we can specify literal value in the following ways.
                    decimal form, octal form, hexa-decimal form
                ->  but 1.7 onward version we can specify values even in binery forms. allowed digits are 0 and 1. literal values should be prefixed with (0b/0B)
                    Ex. :-
                        int x = 0b1111; OUTPUT::15
        
        =>  Useage of _ (underscore) in numeric literal from java 1.7 version onward. we can use _ (underscore) symbols. between digits of numeric literals.
            -> main advantage of this approch is readability of the code is improved.
            Ex. :-
                double d = 123456.7890;
                double d = 1_23_456.7_8_9_0;
                double d = 123_456.7_8_9;

            -> at the time of compilation this _ will be removed automatically hence, after comilation the above line will become double d = 123456.7890;
            -> we can use _ only between digits, if we are use anywhere else we will get compile time error.
                Ex. :-
                    a) double d = _1_23_456.7_8_9; invalid
                    b) double d = 1_23_456_.7_8_9; invalid
                    c) double d = 1_23_456.7_8_9_; invalid
                    
        
        # SCOPE OF LITERALS TO ASSIGN LOWER TO HIGHER.

            ->  byte > short > int > long > float > double;
            ->  char > int > long > float > double;

            -> 8 byte long value we can assign to 4 byte float variable because, both are following diffrent memory represeentation interanally. 
                Ex. :-
                    float f = 10L; OUTPUT::10.0

            -> char and short both having 2 byte. but we can not assign short to char. because char is 16 bit represent value. but in short only 15 bit represente values, 1 bit is resevered for signed.
            -> char don't consider negetive value.
        **/

        int str = 0B1111; // 15
        System.out.println(str);

        float f = 10l; // 10.0
        System.out.println(f);

        double d = 1_23_456.7_89;
        System.out.println(d); // 123456.789
    }
}
