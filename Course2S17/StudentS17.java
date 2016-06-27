/** This class represents a model of a DLSU student 
 * @author: Nathalie Rose Lim-Cheng
 * @version: 1.0
*/
public class StudentS17
{
	/** This constructor will initialize the student 
	  * with deaful values.
	  */
	public StudentS17(){
		IDnum = 11500001;
		name = "Juan Dela Cruz";
		courseCodes = "XXXXXXX";
	}
	
	
	/** This constructor will initializes the IDnum and name of 
	  * the object based on the parameters.
	  *@param id new id number
	  *@param name new student name
	  */
	public StudentS17(int id, String name){
		//this(); //refers to the class name
		setID(id);
		setName(name);
	}
	
	
	//setter Methods
	/** This method assigns the parameter id only if
	  * the parameter is at least 8 digits.
	  * @param id the new id number for attribute IDnum
	  */
	public void setID(int id)
	{
		if (id >= 10000000 &&
			id <= 99999999)
			IDnum = id;
		else System.out.println("Invalid ID");
	}
	
	/** This method assigns the parameter as a new name for the student object
	  * 
	  * @param name is the new name for attribute name
	  */
	public void  setName(String stuName)
	{
		this.name = stuName; // this.xxx refers to the attributes
	}
	
	/** This method assigns the parameter as a new course for the student object
	  * 
	  * @param course is the new name for the attribute courseCodes
	  */
	
	public void setCourseCode(String course)
	{
		if(course.length() == 7)
			courseCodes = course;
//		else System.out.print("XXXXXXX");
		else System.out.print("Invalid Course Code");
	}
	
	//get methods
	/** This method returns the IDnum
	  * 
	  * @return IDnum of the student object
	  */
	public int getID()
	{
		return IDnum;
	}
	
	/** This method returns the name
	  * 
	  * @return name of the student object
	  */
	public String getName()
	{
		return name;
	}
	
	/** This method returns the Course Code
	  * 
	  * @return courseCodes of the student object
	  */
	public String getCourse()
	{
		return courseCodes;
	}
	
	private int 	IDnum;
	private String	name;	//Blank final - not initialized with a constant yet
	private String courseCodes;
}