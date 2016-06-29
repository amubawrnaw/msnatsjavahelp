/**The Name Class stores name for the students and teachers.
  *@author: Amiel Bornales and Giselle Nodalo
  *Date created: June 28, 2016.
  *Section: S17B
  */

public class Name
{
	public Name(){
		first_Name = "Gab";
		last_Name = "CHIU";
		mid_initial = 'A';
	}
	
	//Setter Methods for Name
	/**This method will set the First name of the
	  *teacher/student.
	  *@param fName is the first name
	  *@return true if first name is entered. False otherwise
	  */
	public boolean setFname(String fName){
		if(fName != null){
			this.first_Name = fName;
			return true;
		}
		else{
			System.out.print("No first name entered. ");
			System.out.println("Please enter a name.");
			return false;
		}
	}
	
	/**This method will set the last name of
	  *the teacher/student.
	  *@param lName is the last name
	  *@return true is last name is entered. False if otherwise.
	  */
	public boolean setLname(String lName){
		if(lName != null){
			this.last_Name = lName;
			return true;
		}
		else{
			System.out.print("No last name entered. ");
			System.out.println("Please enter a last name");
			return false; 
		}
	}
	
	/**This method sets the Middle Initial of the 
	  *teacher/student
	  *@param mi is the middle initial character
	  *@return true if a middle initial is entered
	  *or "-" is entered for no middle initial in name. 
	  *False if otherwise.
	  */
	public boolean setMI(char mi){
		if(mi != '\0' || mi == '-'){
			this.mid_initial = mi;
			return true;
		}
		else{
			System.out.println("No Middle Initial Entered.");
			System.out.println("Enter a middle inital or dash ( - ) if name has no middle inital.");
			return false; 
		}
	}
	
	//Getter methods for Name Class
	/**This method retrieves the entered first name
	  *@return first_Name entered.
	  */
	public String getFname(){
		return first_Name;
	}
	
	/**This method retrieves the entered last name
	  *@return last_Name entered.
	  */
	public String getLname(){
		return last_Name;
	}
	
	/**This method retrieves the entere middle initial
	*@return mid_initial
	*/
	public char getMI(){
		return mid_initial;
	}
	 
	private String first_Name;
	private String last_Name;
	private char mid_initial;
}