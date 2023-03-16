/*
	@author KEYUR-VAMJA 
	@since 16-03-2023
	@ref DURGASOFT CORE-JAVA YT
*/
class Ep1 {
	public static void main(String[] args) {
        
        /*
            1. Java Identifiers are only a to z alphabets with upper or lower case or any digits and _ (Underscore) & $ (doller) only.
            2. Identifies should not starts with digits.
            3. Java Identifiers are case sensitive.
            4. There is not length limit in Java Identifiers.
            5. All predefined Java Class name & Interface names we can use as identifiers. even though it is validate but it's not a good programming practise because it's reduce readable of code and creates confusion.
        
            Ex:
            1. total_number :valid
            2. total# :invalid
            3. 123total :invalid
            4. ca$h :valid
            5. _$_$_$_$_$_$ :valid
            6. all@hands :invalid
            7. java2share :valid
            8. Integer :valid
            9. Int :valid
            10. int :invalid
        */
        
        int number = 10;
        int Number = 20;
        int NUMBER = 30;
        int ENUM = 20;
        int IF = 10;
        int ifs = 20;
        int String = 888888888;
        int Runnable = 20;
        
        System.out.println("number : "+ number + " Number : " + Number + " NUMBER : "+ NUMBER +" ENUM : " + ENUM + " IF : "+ IF + " ifs : "+ ifs + " String : " + String + " Runnable : "+ Runnable);
        
    }
}