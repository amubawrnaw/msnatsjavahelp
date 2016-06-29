/**This class represents the Teacher details
  *@author: Amiel Bornales and Giselle Nodalo
  *Date created: June 28 2016
  */
  
public class Teacher
{
	public Teacher(int IDnum){
		this.idNum = IDnum;
	}
	
	//Setter Method
	/**This method will set the name of the
	  *teacher.
	  *@param first is the first name of the teacher
	  */
	public boolean setName(String first, String last, char midI){
		if((first != null && last != null) && midI != '\0'){
			tName.setFname(first);
			tName.setLname(last);
			tName.setMI(midI);
			return true;
		}
		else{
			System.out.println("Invalid Teacher Name. Enter a Valid Name");
			return false;
		}
	}
	
	/**This method will get the area of expertise
	  *of the teacher.
	  *@param expertise is the String
	  *@return true 
	  */
	public boolean setAOE(String[] expertise){
		if(expertise != null){
			areaOfExpertise = expertise;
			return true;
		}
		else{
			System.out.println("No Area of Expertise entered. Enter an Area.");
			return false;
		}
	}
	
	//Getter methods for Teacher
	/**This method will return the area of 
	  *expertise of the teacher
	  *@return areaOfExpertise
	  */
	public String[] getAOE(){
		return areaOfExpertise;
	}
	
	/**This method will return the name of
	  * the teacher
	  *@return the string of the complete name
	  */
	public String getName(){
		return tName.getLname() + ", " + tName.getFname() + " " + tName.getMI();
	}
	
	private Name tName;
	private final int idNum;
	private String[] areaOfExpertise;
}