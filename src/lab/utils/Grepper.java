package lab.utils;

public class Grepper {
	public static void main(String params[])
	{
		String text_file_string= new String("This is the input text12345 which will be the comapred6tto match string will for matches not for wil or for where only for wills");
		String match_string=new String("the");
		TonyGreps tonygrep =new TonyGreps();
		tonygrep.getMatches(text_file_string,match_string);
		
		System.out.println("Results for OLD algo");
		Grep grep =new Grep();
		grep.getMatches();
		
		System.out.println("Results for RegEx");
		RegEx regex= new RegEx();
		regex.getMatches();
		
		
String a="Ea";
String b="FB";
System.out.println(""+a.equals(b));


	}

}
