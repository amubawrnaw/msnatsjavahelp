/** This class represents a model of a course and 
  * it's information
  *@author: Amiel Bornales and Giselle Nodalo S17B
  *Date created: June 27, 2016
  */

public class CourseInfo
{
	
	public CourseInfo()
	{
		courseCode = "OBJECTP";
		courseTitle = "OBJECT-ORIENTED PROGRAMMING WITH JAVA";
		units = 3.0;
		acadYear = "2015-2016";
		termOffered = 3;
		
	}
	
	//Setter Methods for CourseInfo
	/** This method sets the Course Code for a given 
	  * Course Code
	  *@param cCode  is the code from user input
	  * @ returns true if valid course code. False otherwise
	  */
	
	public boolean setCode(String cCode){
		if(cCode.length() == 7){
			this.courseCode = cCode;
			return true;
		}	
		else{ //false
			System.out.println("Invalid Course Code. Please Re-Enter.");
			return false;
		}
	}
	
	/** This method sets the Course Title of the Course 
	  * code. 
	  *@param cName is the Course Title from user input
	  *@return true if Course Title is entered. False otherwise
	  */
	
	public boolean setCname(String cName){
		if(cName.length() > 0){
			this.courseTitle = cName; 
			return true;
		}
		else{
			System.out.println("Please Enter a Course Title. Please Re-Enter");
			return false;
		}
		
	}
	
	/** This method sets the Units of the CourseInfo
	  *@param units is the Units set from user input
	  *@return true if units is valid. False otherwise.
	  */
	public boolean setUnits(double units){
		if(units == 0.5 || units == 1.0 ||
		   units == 2.0 || units == 3.0 ||
		   units == 4.0){
			   
			   this.units = units;
			   return true;
		}
		else{
			System.out.println("Invalid Units Entered");
			System.out.println("Valid Units: 0.5, 1.0, 2.0, 3.0, 4.0");
			return false;
		}
	}
	
	/**This method sets the starting Academic Year for 
	  *the course.
	  *@param AcadYear is the Academic year for the course
	  *@return true if is valid. False otherwise
	  */
	public boolean setAcadYr(String AcadYear){
		
		if(acadYear.length() == 9){
			this.acadYear = AcadYear;
			return true;
		}
		else{
			System.out.println("Invalid Academic Year.");
			System.out.println("Re-Enter Academic Year. Ex: 2015-2016");
			return false;
		}
	}  
	
	/**This method will set the term the course is offered information
	  *@param term is the term number from user input
	  *@return true if term is valid. False if otherwise.
	  */

	public boolean setTerm(int term){
		if(term >= 1 && term <= 3){
			this.termOffered = term;
			return true;
		}
		else{
			System.out.println("Invalid Term.");
			System.out.println("Re-Enter Term. Valid Entries1, 2 or 3.");
			return false; 
		}
	}
	
	//Getters for CourseInfo
	
	/**This method will return the value of the Course Code
	  *@return CourseCode for a course
	  */
	public String getCode(){
		return courseCode;
	}
	
	/**This method will return the Course Title Assigned 
	  *to the course code
	  *@return CourseTitle of a course
	  */
	public String getCname(){
		return courseTitle;
	}
	
	/**This method will return the units assigned to the course
	  *@return Units of the course
	  */
	public double getUnits(){
		return this.units;
	}
	
	/**This method will return the Academic Year assigned for the 
	  *course.
	  *@return acadYear of the course
	  */
	public String getAcadYr(){
		return this.acadYear;
	} 
	
	/**This method will return the Academic Term the 
	  *course is offered in.
	  *@return termOffered of the course
	  */
	public int getTerm(){
		return termOffered;
	}
	
	private String courseCode;
	private String courseTitle;
	private double units;
	private String acadYear;
	private int termOffered;
	
}