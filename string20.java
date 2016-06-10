//Coded by : Amiel James Bornales
import java.util.Scanner;
public class string20
{
	public static void main (String[] args)
	{
		int i,k,sum ;
		int[] keys = new int[26];
		String[] words = new String[20];
		char key;
		String temp;
		Scanner sc = new Scanner (System.in);
		for (i=0;i<20;i++)
		{
			System.out.println("Enter word #" + (i + 1) + ": ");
			words[i]=sc.next();
			words[i]=words[i].toLowerCase();
		}
		for(i=0,key='a';i<26;i++,key++)
		{
			sum = 0;
			for (k=0;k<20;k++)
			{
				if (key == words[k].charAt(0))
					sum++;
			}
			keys[i]=sum;
		}
		for(i=0,key='A';i<26;i++,key++)
			System.out.println("Number of " + key + ": " + keys[i]);
		System.out.println();
		
		for (i = 0; i < 20 ; i++)
		{
			for (k = i + 1 ; k < 20; k++)
			{
				if (words[i].compareToIgnoreCase(words[k])>0)
				{
					temp=words[k];
					words[k]=words[i];
					words[i]=temp;
				}
			}
		}
		for (i=0;i<20;i++)
			System.out.println(words[i]);	
	}
}





























