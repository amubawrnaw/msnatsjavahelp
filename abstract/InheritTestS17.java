public class InheritTestS17
{
	public static void main(String[] args)
	{
		Name n = new Name("Bornales","Amiel James",'B');
		Student s = new Student(11510714,n);
		Teacher t = new Teacher(new Name("dab", "xd", 'c'), 12345678);
		Person p = new Person (new Name("asd","asd",'d'), 12322323);
		
		System.out.println("\n" + s.getName().toString() + " is: ");
		if (s instanceof Person)
			System.out.println("a Person");
		
		if (s instanceof Student)
			System.out.println("a Student");
		
		if (s instanceof Teacher)
			System.out.println("a Teacher");
			
	}
}