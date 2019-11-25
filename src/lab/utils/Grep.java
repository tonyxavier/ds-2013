package lab.utils;

public class Grep {

private int n,m;

private String text_file_string= new String("This is the input text12345 which will be the comapred6tto match string will for matches not for wil or for where only for wills");
private String match_string=new String("the");


Grep()
{
n=text_file_string.length();
m=match_string.length();
}

public void getMatches()
{
char[] text_file=new char[n];
text_file_string.getChars(0, n, text_file, 0);
char[] match_str=new char[m];
match_string.getChars(0, m, match_str, 0);
int cntr=0;

for (int i=0,j=0; i<=n-m;i++)
{
 cntr++;
	if(text_file[i]==match_str[0])
	{
		for(j=0;j<m;j++ )
		{
		cntr++;
			if(text_file[i+j]!=match_str[j])
				break;
		}
		if(j==m)
		{
			System.out.println("Match found at"+ (i+1));
		}
	}
	
	
}
System.out.println("Total chars:"+n);
System.out.println("Total itrs:"+cntr);

	
}


	

}
