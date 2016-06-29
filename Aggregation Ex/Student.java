/**This class represents the Student details
  *@author: Amiel Bornales and Giselle Nodalo
  *Date created: June 28 2016
  */

public class Student{

	public Student(Name stName, int idNum){
		this.sName = stName;
		this.IDnum = idNum;
	}
	
	//Setters for Student
	/**This method will receives the array list
	  *of courses to be assigned to the student
	  *@param sName is the student name
	  */
	public void setCourses(CourseInfo[] Courses){
		courses = Courses;
	}
	
	//Getters for Student
	/**This method will get the course the student 
	  *is assigned to.
	  *@return courses
      */
	public CourseInfo[] getCourse(){
		return this.courses;
	}
	
	/**This method will get the name entered for the
	  *student.
	  *@return sName
	  */
	public Name getName(){
		return sName;
	}  
	
	/**This method will get the ID number assigned
	  *to the student.
	  *@return IDnum
	  */
	public int getID(){
		return IDnum;
	}
	
	private final Name sName;
	private final int IDnum;
	private CourseInfo[] courses;
}