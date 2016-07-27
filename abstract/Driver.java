import java.util.*;
public class Driver
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Person> pl = new ArrayList<Person>();
		String ln,fn;
		char c;
		int input, id;
		do{
			System.out.println("\tEnter First Name: ");
			fn = sc.nextLine();
			sc.next();
			
			System.out.println("\tEnter Last Name: ");
			ln = sc.nextLine();
			sc.next();
			
			System.out.println("\tEnter MI: ");
			c = sc.next().charAt(0);
					
			System.out.println("\tEnter ID number: ");
			id = sc.nextInt();
			
			System.out.println("\tAre you a :\n\t[1]Student\n\t[2]Teacher");
			input = sc.nextInt();
			if (input == 1)
			{
				Student s = new Student(id, new Name(ln,fn,c));
				pl.add((Person) s);
			}
			else if (input == 2)
			{
				Teacher t = new Teacher(new Name(ln,fn,c), id);
				pl.add((Person) t);
			}
			
			
			
			
			System.out.println("\tWould you like to create another person?\n\t[1] Yes\n\t[2] No");
		}while(sc.nextInt()!=2);
	}
}