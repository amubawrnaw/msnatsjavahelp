public abstract class Person{
	
	public Person(Name n, int id){
		setName(n);
		IDnum = 1;
		setID(id);
	
	}
	
	public Person(Name n){
		this(n,1);
		
	}
	
	public void setID(int id){
		if(id <= 0)
		System.out.println("ID should be positive");
		else IDnum = id;
	}
	
	public void setName(Name n){
		name = n;
	}
	
	public int getID(){
		return IDnum;
	}
	
	public Name getName(){
		return name; 
	}
	public String toString()
	{
		return name.toString() + IDnum;
	}
	public abstract void performDuty();
	protected int IDnum;
	protected Name name;

}