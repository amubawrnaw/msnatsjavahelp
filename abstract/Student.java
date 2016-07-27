import java.util.Scanner;
import java.util.ArrayList;

/** This class represents a model of a DLSU
  * student.
  * @author Nathalie Rose Lim-Cheng
  * @version 1.0
  */
public class Student extends Person
{
   public Student(int id, Name name)
   {
	   super(name, id);
   }
 
   /** This method returns the ID number attribute
     * @return id number of the student object
	 */
   public int getID()
   {
	   return IDnum;
   }
   
   /** This method returns the name of the student.
     * @return name of the student object
     */   
   public Name getName()
   {
	   return name;
   }

   public ArrayList<CourseInfo> getEnrolledCourses()
   {
	   return enrolIn;
   }
   
   public boolean enrol(CourseInfo course)
   {
	   if (countUnitsEnrolled() + course.getUnits() <= 18) {
	      enrolIn.add(course);
          return true;		   
	   }
	   else {
		   System.out.println("Enrolling not allowed.. will exceed 18 units");
		   return false;
	   }
   }
   
   private double countUnitsEnrolled()
   {   double total = 0;
       if (!enrolIn.isEmpty())
	     for (int i = 0; i < enrolIn.size(); i++ )
			 total += enrolIn.get(i).getUnits();
		
	   return total;
   }/*
   private String toString()
   {	   
	   return super.toString() + enrolIn.size();
   }*/
   public void performDuty()
   {
	   System.out.println("Studying...");
   }

   private ArrayList<CourseInfo> enrolIn;
}