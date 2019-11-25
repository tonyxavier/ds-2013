package lab.utils;

public class RegEx {
	private int n,m;

	private String text_file_string= new String("This is the themfgmrk input text12345 which will thefgasdhjr be the comapred6tto match string will for matches not for wil or for where only for wills~");
	private String match_string=new String("the*r");


	RegEx()
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
	int k=0;
	
		
	
	for (int i=0,j=0; i<=n-m;i++)
	{
	 
		if(text_file[i]==match_str[0])
		{
			
			for(j=0,k=0;j<m;j++ )
			{
			
		
			if(match_str[j]=='*')
			{	
				while(text_file[i+j+k]!=' ' && text_file[i+j]!=' '&& text_file[i+j+k]!='~' && text_file[i+j+k]!=match_str[j+1])
				{
					k++;
				}
			    
			}	
			else
			{	
				if(k==0)
				{
			      if(text_file[i+j]!=match_str[j])
				   break;
				}
			     else
			     {
			    	 if(text_file[i+j+k-1]!=match_str[j])
						   break;
			     }
			    	  
			}
			
			
			
		}
			if(j==m)
			{
				System.out.println("Mathc found at"+ (i+1));
			}
			
		}
		
	
			

	}
}
}
