/**This class is the Section Information of a course
  *@author: Amiel Bornales and Giselle Nodalo S17B
  *Date Created: June 27, 2016
  */
  
public class Section
{
	
	public Section(){
		this.section = "S17B";
		this.room = "G302B";
	}
	
	//Setter methods for Section
	/**This method sets the Course for the section
	  *@param courss is the 
	  */
	public void setCourse(CourseInfo course){
		cInfo = course;
	}
	
	/**This method sets the room for the course
	  *@param Room is the Room the course is assigned to.
	  */
	public boolean setRoom(String Room){
		if(Room.length() >= 4 && Room.length() <= 6){
			room = Room;
			return true;
		}
		else{
			System.out.println("Invalid Room.");
			System.out.print(" Enter a valid Room");
			return false;
		}
	}
	
	/**This method sets the section for the course
	  *@param Section is the section assigned to the course
	  */
	  
	public boolean setSect(String Section){
		if(Section.length() > 2 && Section.length() <= 4){
			this.section = Section;
			return true;
		}
		else{
			System.out.println("Invalid Section. Please enter a valid section");
			return false;
		}
	}
	
	/**This method receives an ArrayList of students
	  *to assign to the student
	  *@param Students enrolling into the section
	  */
	public void setStudents(Student[] Students){
		this.students = Students;
	} 
	
	//Getter Methods for Section
	/**This method course information assigned to the
	  *section.
	  *@return cInfo
	  */
	public CourseInfo getCinfo(){
		return cInfo;
	}
	
	/**This method returns the room assigned to the 
	  *course and section
	  *@return Room
	  */
	public String getRoom(){
		return this.room;
	}
	
	/**This method returns the section assigned to
	  *the course.
	  *@return section
	  */
	public String getSect(){
		return this.section;
	}	
	
	/**This method returns the professor assigned
	  *to the course and section.
	  *@return prof
	  */
	public Teacher getProf(){
		return prof;
	}
	
	/**This method returns the array list of students
	  *@return students
	  */
	public Student[] getStudents(){
		return this.students;
	}
	
	private CourseInfo cInfo;
	private String room;
	private String section;
	private Teacher prof;
	private Student[] students; 
}