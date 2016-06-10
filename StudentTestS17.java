import java.util.Scanner;

public class StudentTestS17
{
	public static void main (String[] args)
	{
		StudentsS17 s = new StudentsS17 ();
		Scanner sc  = new Scanner (System.in);
		
		int temp;
		System.out.println("Enter ID: ");
		temp = sc.nextInt();
		s.setID(temp);
		
		sc.nextLine();
		
		System.out.println("Enter Name: ");
		s.setName(sc.nextLine());
		
		System.out.println("Hello Student "+ s.getID() + ": " + s.getName());
		
		System.out.println("Enter Course Code : ");
		sc.nextLine();
		
		s.checkThing(sc.next());
		System.out.println(s.OtherThing());
		
		sc.close();
		s=null;
	}
}