
public class Chair extends Teacher implements Manager,Researcher
{
	public Chair(Name n, int id, String dept, String[] a)
	{
		super(n,id, a);
		manage(dept);
	}
	public void manage(String dept)
	{
		this.dept = dept;
	}
	public void research()
	{
		if(area != null)
			System.out.println("Risertsing " + area[0]);
	}
	protected String dept;
}