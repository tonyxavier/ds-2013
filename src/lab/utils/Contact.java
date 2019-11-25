package lab.utils;

public class Contact {
String firstname;
String lastname;
String number;
String SRCH; //Valid values - F-firstname, L -lastname, B- both first & last, A-All names and number
	
public void show()
{
	System.out.println(firstname.concat(" ").concat(lastname).concat(" ").concat(number) );
	
}
}

