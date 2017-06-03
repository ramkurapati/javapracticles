package CharacterMethods;

public class CharacterMethods {
	public static void main(String[] args)
	{
		char aChar3 = ' ';
		char aChar2 = 'd';
		char aChar  = 'D';

		System.out.println(Character.isDigit (aChar));        // returns false
		System.out.println(Character.isLetter(aChar));        // returns true
		System.out.println(Character.isLetterOrDigit(aChar)); // returns true
		System.out.println(Character.isLowerCase(aChar2));     // returns false
		System.out.println(Character.isUpperCase(aChar));     // returns true
		System.out.println(Character.isSpaceChar(aChar3));

		
		char aChar4 = 'æ';
		char aChar5 = 'A';
		int type2 = Character.getType(aChar5);
		int type = Character.getType(aChar5);

		if(type2 == Character.LOWERCASE_LETTER)
		{ 
			System.out.println("lowercase letter"); 
		}
		if(type == Character.UPPERCASE_LETTER) 
		{ 
			System.out.println("uppercase letter"); 
		}

		char aChar9 = 'A';
		int  anInt = aChar9;

		Boolean isDefined = Character.isDefined(anInt);
		System.out.println("is defined  "+isDefined); 
		
	}

}
