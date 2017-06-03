
package Locale;

import java.util.Locale;

public class Locales
{
	public static void main(String[] args)
	{
	  Locale[] locales = Locale.getAvailableLocales();
	  for(int i = 0; i < locales.length; i++)
	  {
	  String language = locales[i].getLanguage();
	  String country = locales[i].getCountry();
	  String locale_name = locales[i].getDisplayName();
	  System.out.println(i + ": " + language + ", " + country + ", " + locale_name);
	   }
	 }
}