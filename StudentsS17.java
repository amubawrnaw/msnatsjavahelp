/** This  class represents a model of a DLSU student
  *@author Yes
  *@Version 123
  */

public class StudentsS17
{
	/**This method assigns the parameter id only if the parameter is atleast 8 digits.
	  *@param id the new id number for 
	  */
	  
	public StudentsS17()
	{
		IDnum = 11510001;
		name = "Ice Cream";
		courseCodes = "XXXXXXX";
	}	
	public void setID(int id)
	{
		if (id>=10000000 && id <= 99999999)
			IDnum = id;
		else System.out.println("Invalid ID");
	}
	/** This method is yes*/
	public void setName ( String name )
	{
		this.name = name;
	}
	/**yessssssssss*/
	public int getID()
	{
		return IDnum;
	}
	/**yesplspldasda
	  *@return uesjuasd
	*/
	public String getName()
	{
		return name;
	}
	
	public void checkThing (String yes)
	{
		if (yes.length() == 7)
			courseCodes = yes;
	}
	
	public String OtherThing ()
	{
		return courseCodes;
	}
	
	private int IDnum;
	private String name;
	private String courseCodes;
}