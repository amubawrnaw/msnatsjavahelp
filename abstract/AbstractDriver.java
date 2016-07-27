import java.util.*;


public class AbstractDriver
{
	public static void main(String[] args)
	{
		ArrayList<Person> peeps = new ArrayList<Person>();
		
		String[] list = {"dab","gab","lab","hab"};
		Name n = new Name("Bornales","Amiel James",'B');
		
		peeps.add (new Student(11510714,n));
		
		peeps.add (new Teacher (new Name("help","me",'x'), 9512345, list));
	}
}