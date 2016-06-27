/** This class represents a model of a course.
  * 
  * @author Nathalie Rose Lim-Cheng
  * @version 1.0
  */
public class Course2S17
{
   /** This default constructor initializes the course 
     * code to "OBJECTP", the section to "S11", the 
     * room to "G302A", and the units to 3.0.
     *
     * The implementation of this constructor is to
     * invoke the constructor Course(String code).
     */	 
   public Course2S17()
   {
      this("OBJECTP");
	  System.out.println("Back in Default Constructor...");
   }
   
   public Course2S17(String code)
   {
      this(code, "S11");
	  System.out.println("Back in 2nd Constructor...");
   }

   public Course2S17(String code, String block)
   {
      this(code, block, "G302A");
	  System.out.println("Back in 3rd Constructor...");
   }
   
   public Course2S17(String code, String room,
                 double units)
   {
	   //System.out.println("In 4th Constructor...");
	   setCode("OBJECTP");
       setCode(code);
	   setRoom(room);
	   setSection("S11");

	   if (units == 0.5 || units == 1.0 ||
	       units == 2.0 || units == 3.0 ||
		   units == 4.0)
   	     this.units = units;
	   else this.units = 3.0;
	   
	   /* Alternative solution:
	   if (isValidUnits(units))
		   this.units = units;
	   else this.units = 3.0;
	   */
	   
	   classlist = null;
	   faculty = null;
   }
   
   public Course2S17(String code, String block, 
                 String room)
   {
       this(code, room, 3.0);
	   //System.out.println("Back in 5th Constructor...");		   
	   setSection(block);
   }
   
   /** This method updates the course code only if the
     * parameter is exactly 7 characters.
	 *
	 * @param code the new course code
	 */
   public void setCode(String code)
   {
       if (code.length() == 7)
	      courseCode = code;
	   else System.out.println("Invalid course code");	  
   }
   
   /** This method updates the room only if the
     * parameterhas at least 1 character.
	 *
	 * @param room the new room
	 */
   public void setRoom(String room)
   {
	   if (room.length() > 0)
		   this.room = room;
	   else System.out.println("Invalid room");
   }
   
   public void setSection(String block)
   {
	   if (block.length() > 0)
		   section = block;
	   else System.out.println("Invalid section");
   }  
   
   /** This method returns the room.
     *
	 * @return the room attribute of the course object
     */   
   public String getRoom()
   {
	   return room;
   }
   
   public double getUnits()
   {
	   return units;
   }
   
   public String getSection()
   {
	   return section;
   }
   
   public String getCode()
   {
	   return courseCode;
   }

   /** This method returns the String equivalent of
     * the state of the course object.   
	 *
	 * @return the String equivalent of the contents of
	 *         of the course object
	 */
   public String toString()
   {
	   return courseCode + " " + section +
	          " " + getRoom() + " " + 
			  getUnits();
   }
   
   /** This method returns true if this course has the same
     * course code and section as that in the parameter c.
	 * Otherwise, the method returns false.
	 *
	 * @param c the course to be compared to
	 * @return the boolean result of comparing if the 
	 *       course code and the section of this course and
	 *       the parameter course are the same
	 */
   public boolean isSame(Course2S17 c)
   {
	   return (courseCode.equalsIgnoreCase(c.getCode()) &&
	           section.equalsIgnoreCase(c.section));
   }
   
   public boolean addStudent(StudentS17 s)
   {
	   int i;
	   
	   if (isInClass(s.getName()) == false) {
		   if (classlist == null){
			   classlist = new StudentS17[45];
               for (i = 0; i<classlist.length; i++)		       
			      classlist[i] = null;
			  
			   classlist[0] = s;
			   return true;
		   }
		   else if (classlist[classlist.length - 1] 
		             == null) {
			    // sure that there is at least 1 space left	
                i = 0;
                while (classlist[i] != null)
                   i++;
			    classlist[i] = s;
				return true;
		   }
		   else {
			   System.out.println("Class is full");
			   return false;
		   }	   
	   }
	   else {
		   System.out.println("Student is already in the class");
		   return false;
	   }	   
   }
   
   public StudentS17[] getClasslist()
   {
	   return classlist;
   }
   
   public boolean isInClass(String name)
   {
	   if (classlist == null)
		   return false;
	   else {
           int i = 0;
           boolean found = false;
           while (i < classlist.length && classlist[i] != null &&
		          !found)
              if (classlist[i].getName().equalsIgnoreCase(name))
                found = true;
              else i++;	

           return found;			  
	   }
   }
   
   public void assignFaculty(TeacherS17 t)
   {
	   faculty = t;
   }
   
   public TeacherS17 getFaculty()
   {
	   return faculty;
   }
   
   /** This method will only be used within the object to 
     * determine if the parameter units is a valid value.
	 *
	 * @param units the value to check for validity
	 * @return boolean result signifying that units is one
	 *         of the possible acceptable values: 0.5, 1.0,
	 *         2.0, 3.0, or 4.0
	 */
   private boolean isValidUnits(double units)
   {
	   return (units == 0.5 || units == 1.0 ||
	           units == 2.0 || units == 3.0 ||
		       units == 4.0);
   }
				 
   private String courseCode;
   private String section;
   private String room;
   private final double units;
   private StudentS17[] classlist;
   private TeacherS17 faculty;
   
   protected void finalize()
   {
	   System.out.println("Destroying " + toString());
   }
  
}