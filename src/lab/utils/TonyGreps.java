package lab.utils;

public class TonyGreps {
	
	
	public void getMatches(String text_file_string, String match_string )
	{
    int n,m;
    n=text_file_string.length();
	m=match_string.length();
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
			if (text_file[i+m-1]==match_str[m-1])
			{
			for(j=0;j<m;j++ )
			{
				cntr++;
				
				if(text_file[i+j]!=match_str[j])
					break;
			}
			if(j==m)
			{
				System.out.println("Mathc found at"+ (i+1));
				i=i+m;
			}
			}
		}
		
		
	}

}
}