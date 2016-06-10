import java.util.Scanner;

public class courseTest
{
	public static void main(String[] args)
	{
		int i,j;
		Scanner sc = new Scanner(System.in);
		course[] c = new course[5];
		String cCode, room, section;
		double units;
		
		for (i=1;i<5;i++)
		{
			switch(i)
			{
				case 1:
						System.out.println("Enter the class code: ");
						c[i].assignVal1(sc.next());
						break;
				case 2:
						System.out.println("Enter the class code and room code: ");
						c[i].assignVal2(sc.next(),sc.next());
						break;
				case 3:
						System.out.println("Enter the class code, room code, and section: ");
						c[i].assignVal3(sc.next(),sc.next(),sc.next());
						break;
				case 4:
						System.out.println("Enter the class code, room code, section, and number of units: ");
						c[i].assignVal4(sc.next(),sc.next(),sc.next(),sc.nextInt());
						break;
			}
		}
		for (i=0;i<4;i++)
			System.out.println(c[i].retString());
		
		
	}
}